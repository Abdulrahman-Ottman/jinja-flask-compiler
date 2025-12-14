import antlr.grammar.flask.AntlrToExpression;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import antlr.grammar.flask.FlaskExprParser;
import antlr.grammar.flask.FlaskExprLexer;
import FlaskStatement.*;

public class Main {
    public static void main(String[] args) throws Exception {

        //        // Load the input file
//        String code = Files.readString(Paths.get("text.py"));
//
//        // Create lexer
//        FlaskExprLexer lexer = new FlaskExprLexer(CharStreams.fromString(code));
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//
//        // Create parser
//        FlaskExprParser parser = new FlaskExprParser(tokens);
//
//        // Parse using the top rule
//        ParseTree tree = parser.program();
//
// GUI viewer
//        org.antlr.v4.gui.Trees.inspect(tree, parser);


        String[] tests = {
                "1 + 2 * 3",
                "(1 + 2) * 3",
                "obj.method(10, x=20, \"hello\", flag=True)",
                "[1, 2, 3][1]",
                "user.name.upper()",
                "True.real",
                "(1 / 2).imag",
                "1 + 2.real",           // should FAIL
                "a * b(x)",             // should FAIL
                "{\"a\": 1, \"b\": 2}",
                "\"hello \\\"world\\\"\""
        };

        for (String code : tests) {
            System.out.println("Testing: " + code);
            System.out.println("=".repeat(60));
            try {
                Expression expr = parseExpression(code);
                System.out.println("SUCCESS");
                System.out.println("\nAST Tree:");
                printAstTree(expr, "", true);
                System.out.println("\nFlat: " + expr);
                System.out.println("-".repeat(60) + "\n");
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
                System.out.println("-".repeat(60) + "\n");
            }
        }
    }

    // Beautiful self-contained AST tree printer
    private static void printAstTree(Expression expr, String indent, boolean isLast) {
        String marker = isLast ? "└── " : "├── ";

        if (expr == null) {
            System.out.println(indent + marker + "null");
            return;
        }

        String name = expr.getClass().getSimpleName();
        name = name.replace("Expression", "").replace("FunctionCall", "Call");

        String info = "";
        if (expr instanceof Literal lit) {
            Object v = lit.value;
            if (v instanceof String s) {
                info = "(\"" + s.replace("\"", "\\\"") + "\")";
            } else if (v == Boolean.TRUE) info = "(True)";
            else if (v == Boolean.FALSE) info = "(False)";
            else if (v == null) info = "(None)";
            else info = "(" + v + ")";
        }
        else if (expr instanceof Name n)           info = "(\"" + n.id + "\")";
        else if (expr instanceof Attribute a)      info = "." + a.attribute;
        else if (expr instanceof Subscript)        info = "[...]";
        else if (expr instanceof BinaryOperation bo) info = " " + bo.op.symbol;
        else if (expr instanceof FunctionCall fc) {
            info = "(args=" + fc.args.size() +
                    (fc.kwargs.isEmpty() ? "" : ", kwargs=" + fc.kwargs.keySet()) + ")";
        }
        else if (expr instanceof ListExpr le)      info = "[" + le.expressions.size() + " items]";
        else if (expr instanceof DictExpr de)      info = "{" + de.pairs.size() + " items}";

        System.out.println(indent + marker + name + info);

// Get children
        java.util.List<Expression> children = new java.util.ArrayList<>();
        if (expr instanceof Attribute a)           children.add(a.object);
        else if (expr instanceof Subscript s)     children.addAll(java.util.List.of(s.value, s.index));
        else if (expr instanceof FunctionCall fc) {
            children.add(fc.called);
            children.addAll(fc.args);
            children.addAll(fc.kwargs.values());
        }
        else if (expr instanceof BinaryOperation bo) children.addAll(java.util.List.of(bo.left, bo.right));
        else if (expr instanceof ListExpr le)     children.addAll(le.expressions);
        else if (expr instanceof DictExpr de)      children.addAll(de.pairs.values());

        for (int i = 0; i < children.size(); i++) {
            boolean lastChild = (i == children.size() - 1);
            String newIndent = indent + (isLast ? "    " : "│   ");
            printAstTree(children.get(i), newIndent, lastChild);
        }
    }

    public static Expression parseExpression(String input) {
        CharStream stream = CharStreams.fromString(input);
        FlaskExprLexer lexer = new FlaskExprLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FlaskExprParser parser = new FlaskExprParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new RuntimeException("Syntax error at " + line + ":" + charPositionInLine + " — " + msg);
            }
        });

        ParseTree tree = parser.expr();
        return new AntlrToExpression().visit(tree);
    }
}
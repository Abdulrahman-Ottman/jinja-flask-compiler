package antlr.grammar.flask;

import FlaskStatement.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AntlrToExpression extends FlaskExprParserBaseVisitor<Expression> {
    @Override
    public Expression visitVar(FlaskExprParser.VarContext ctx) {
        return new Name(ctx.getStart().getLine(),ctx.NAME().getText());
    }

    @Override
    public Expression visitNumber(FlaskExprParser.NumberContext ctx) {
        String text = ctx.NUMBER().getText();
        return new Literal(ctx.getStart().getLine(),parseNumber(text));
    }

    @Override
    public Expression visitString(FlaskExprParser.StringContext ctx) {
        String text = ctx.STRING().getText();
        return new Literal(ctx.getStart().getLine(),text);
    }

    @Override
    public Expression visitTrueLit(FlaskExprParser.TrueLitContext ctx) {
        return Literal.trueLiteral(ctx.start.getLine());
    }

    @Override
    public Expression visitFalseLit(FlaskExprParser.FalseLitContext ctx) {
        return Literal.falseLiteral(ctx.start.getLine());
    }

    @Override
    public Expression visitNoneLit(FlaskExprParser.NoneLitContext ctx) {
        return Literal.noneLiteral(ctx.start.getLine());
    }



    @Override public Expression visitParens(FlaskExprParser.ParensContext ctx) { return visit(ctx.expr()); }


    @Override
    public Expression visitList(FlaskExprParser.ListContext ctx) {
        if (ctx.expr() == null || ctx.expr().isEmpty()) {
            return new ListExpr(ctx.getStart().getLine(),List.of());
        }
        List<Expression> elements = ctx.expr().stream()
                .map(this::visit)
                .toList();
        return new ListExpr(ctx.getStart().getLine(),elements);
    }

    @Override
    public Expression visitDict(FlaskExprParser.DictContext ctx) {
        if (ctx.STRING() == null || ctx.STRING().isEmpty()) {
            return new DictExpr(ctx.getStart().getLine(),Map.of());
        }

        Map<String, Expression> map = new LinkedHashMap<>();
        for (int i = 0; i < ctx.STRING().size(); i++) {
            String key = ctx.STRING(i).getText();
            Expression value = visit(ctx.expr(i));
            map.put(key, value);
        }
        return new DictExpr(ctx.getStart().getLine(),map);
    }
    @Override public Expression visitAttribute(FlaskExprParser.AttributeContext ctx) {
        Expression obj = visit(ctx.expr());
        requireParenthesesIfBinOp(obj, ctx, "attribute access");
        return new Attribute(ctx.getStart().getLine(),obj, ctx.NAME().getText());
    }

    @Override public Expression visitSubscript(FlaskExprParser.SubscriptContext ctx) {
        Expression target = visit(ctx.expr(0));
        requireParenthesesIfBinOp(target, ctx, "subscript");
        Expression index = visit(ctx.expr(1));
        return new Subscript(ctx.getStart().getLine(),target, index);
    }

    @Override
    public Expression visitMultiplication(FlaskExprParser.MultiplicationContext ctx) {
        Expression left  = visit(ctx.expr(0));
        Expression right = visit(ctx.expr(1));
        return binOp(ctx.getStart().getLine(),left, right, "*");
    }

    @Override
    public Expression visitDivision(FlaskExprParser.DivisionContext ctx) {
        Expression left  = visit(ctx.expr(0));
        Expression right = visit(ctx.expr(1));
        return binOp(ctx.getStart().getLine(),left, right, "/");
    }

    @Override
    public Expression visitAddition(FlaskExprParser.AdditionContext ctx) {
        Expression left  = visit(ctx.expr(0));
        Expression right = visit(ctx.expr(1));
        return binOp(ctx.getStart().getLine(),left, right, "+");
    }

    @Override
    public Expression visitSubtraction(FlaskExprParser.SubtractionContext ctx) {
        Expression left  = visit(ctx.expr(0));
        Expression right = visit(ctx.expr(1));
        return binOp(ctx.getStart().getLine(),left, right, "-");
    }

    @Override
    public Expression visitComparison(FlaskExprParser.ComparisonContext ctx) {
        Expression left  = visit(ctx.expr(0));
        Expression right = visit(ctx.expr(1));
        String opText = ctx.getChild(1).getText();  // >, <, >=, ==, etc.
        return binOp(ctx.getStart().getLine(),left, right, opText);
    }



    @Override
    public Expression visitFunctionCall(FlaskExprParser.FunctionCallContext ctx) {
        Expression called = visit(ctx.expr(0));
        requireParenthesesIfBinOp(called, ctx, "function call");

        List<Expression> args = new ArrayList<>();
        Map<String, Expression> kwargs = new LinkedHashMap<>();

        // Start after: expr(0)  LPAREN  ...
        // Index 0: expr(0)  (the function being called)
        // Index 1: LPAREN
        // Index 2+: arguments and commas (if any)
        // Last:    RPAREN
        int i = 2; // position after LPAREN
        int childCount = ctx.getChildCount();

        while (i < childCount - 1) { // stop before RPAREN
            ParseTree child = ctx.getChild(i);

            if (child.getText().equals(",")) {
                i++;
                continue;
            }

            // Case 1: Keyword argument → NAME = expr
            if (child instanceof TerminalNode nameNode
                    && nameNode.getSymbol().getType() == FlaskExprParser.NAME
                    && ctx.getChild(i + 1).getText().equals("=")
                    && ctx.getChild(i + 2) instanceof FlaskExprParser.ExprContext valueCtx) {

                String kwName = nameNode.getText();
                Expression value = visit(valueCtx);
                kwargs.put(kwName, value);

                i += 3; // skip NAME, =, expr
            }
            // Case 2: Positional argument → expr
            else if (child instanceof FlaskExprParser.ExprContext exprCtx) {
                args.add(visit(exprCtx));
                i++;
            }
            else {
                // Unexpected token — skip to avoid infinite loop
                i++;
            }
        }

        return new FunctionCall(ctx.getStart().getLine(),called, args, kwargs);
    }

    private static Object parseNumber(String text) {
        text = text.toLowerCase();
        if (text.startsWith("0x")) return Long.parseLong(text.substring(2), 16);
        if (text.startsWith("0b")) return Long.parseLong(text.substring(2), 2);
        if (text.startsWith("0o")) return Long.parseLong(text.substring(2), 8);

        if (text.contains(".") || text.contains("e") || text.contains("j")) {
            return Double.parseDouble(text);
        }

        try {
            return Integer.parseInt(text);
        } catch (Exception e) {
            try {
                return Long.parseLong(text);
            } catch (Exception e2) {
                return new java.math.BigInteger(text);
            }
        }
    }


    private void requireParenthesesIfBinOp(Expression expr, ParserRuleContext ctx, String operation) {
        if (ctx.getChild(0) instanceof FlaskExprParser.ParensContext) {
            return;
        }

        // Check the AST node
        if (expr instanceof BinaryOperation) {
            String source = ctx.getText();
            String leftText = ctx.getChild(0).getText();
            String hint = "(" + leftText + ")" + source.substring(leftText.length());

            throw new RuntimeException(
                    "SyntaxError: invalid syntax — " + operation + " requires parentheses after binary expression\n" +
                            "    " + source + "\n" +
                            "    Did you mean: " + hint + " ?"
            );
        }
    }

    private Expression binOp(int line, Expression left, Expression right, String opToken) {
        BinaryOperation.Operator op =
                BinaryOperation.Operator.fromToken(opToken);
        return new BinaryOperation(line, left, op, right);
    }

}



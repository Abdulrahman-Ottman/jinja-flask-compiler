import FlaskStatement.Statement;
import antlr.grammar.flask.FlaskExprLexer;
import antlr.grammar.flask.antlr.grammar.flask.ASTStatementsBuilderVisitor;
import antlr.grammar.flask.antlr.grammar.flask.FlaskExprParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        // Load the input file
        String code = Files.readString(Paths.get("text.py"));

        // Create lexer
        FlaskExprLexer lexer = new FlaskExprLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create parser
        FlaskExprParser parser = new FlaskExprParser(tokens);

        // Parse using the top rule
        ParseTree tree = parser.program();

        ASTStatementsBuilderVisitor visitor = new ASTStatementsBuilderVisitor();
        Object ast =  visitor.visitProgram((FlaskExprParser.ProgramContext) tree);
        System.out.println(ast);


// GUI viewer
        org.antlr.v4.gui.Trees.inspect(tree, parser);


    }
}

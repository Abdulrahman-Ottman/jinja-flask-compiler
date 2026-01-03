import ASTJinja2withHTMLandCSS.Jinja2Runner;
import SymbolsTable.SymbolsTable;
import antlr.grammar.flask.AntlrToExpression;
import antlr.grammar.flask.AntlrToProgram;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import antlr.grammar.flask.FlaskExprParser;
import antlr.grammar.flask.FlaskExprLexer;
import FlaskStatement.*;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {

        //        // Load the input file
        String code = Files.readString(Paths.get("Testing Project/FlaskTestingApp/app.py"));
//
//        // Create lexer
        FlaskExprLexer lexer = new FlaskExprLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

//        // Create parser
        FlaskExprParser parser = new FlaskExprParser(tokens);
//
//        // Parse using the top rule
        ParseTree tree = parser.program();

        AntlrToProgram programVisitor = new AntlrToProgram();
        Program program = (Program) programVisitor.visit(tree);
        SymbolsTable st = SymbolsTable.getFlaskInstance();
        st.printFlaskSymbols();
        System.out.println("=== AST ===");
        ASTPrettyPrinter.print(program);

        Jinja2Runner.runDefaultSuite(false);
    }

}
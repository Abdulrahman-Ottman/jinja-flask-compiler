import ASTJinja2withHTMLandCSS.Jinja2Runner;
import SymbolsTable.SymbolsTable;
import antlr.grammar.flask.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import FlaskStatement.*;
import org.antlr.v4.gui.Trees;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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
        Trees.inspect(tree, parser);
        SemanticAnalyzer analyzer = new SemanticAnalyzer();

        try {
            System.out.println("Running Semantic Analysis Checks...");
            analyzer.analyze(program.statements);
            System.out.println("Semantic Analysis Passed! Moving to Code Generation.");

            // 3. Hand clean AST down to Code Generator target engine safely!
            // codeGenerator.generate(completeAST);

        } catch (RuntimeException semanticException) {
            System.err.println("Compilation Failed due to Semantic Fault!");
            System.err.println(semanticException.getMessage());
            System.exit(1);
        }


        // 3. Invoke the PHP Code Generator
        PHPCodeGenerator generator = new PHPCodeGenerator();
        String fullyCompiledPhpSource = generator.generate(program.statements);

// 4. Dynamically target the user's Desktop folder
        String userHome = System.getProperty("user.home");
        Path desktopPath = Paths.get(userHome, "Desktop", "output.php");

        // 5. Save the compiled source code directly to the desktop
        try {
            Files.writeString(desktopPath, fullyCompiledPhpSource);
            System.out.println("Backend Compilation Successful!");
            System.out.println("File saved to your Desktop at: " + desktopPath.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Compilation Failed: Could not write the file to your Desktop.");
            e.printStackTrace();
        }
//        Jinja2Runner.runDefaultSuite(true);
    }

}
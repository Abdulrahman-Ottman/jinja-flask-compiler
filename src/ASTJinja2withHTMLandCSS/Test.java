package ASTJinja2withHTMLandCSS;

import ASTJinja2withHTMLandCSS.ASTNode;
import SymbolsTable.SymbolsTable;
import antlr.grammar.Jinja2withHTMLandCSS.gen.Jinja2withHTMLandCSSLexer;
import antlr.grammar.Jinja2withHTMLandCSS.gen.Jinja2withHTMLandCSSParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Test {

    public static void main(String[] args) throws Exception {
        String t1 = "Testing Project/FlaskTestingApp/templates/add_product.html";
        String t2 = "Testing Project/FlaskTestingApp/templates/index.html";
        String t3 = "Testing Project/FlaskTestingApp/templates/product.html";
        String Css = "Testing Project/FlaskTestingApp/static/style.css";
        SymbolsTable symbolsTable= SymbolsTable.getHtmlInstance();
        Map<String, Object> inner = new LinkedHashMap<>();
        inner.put("products","all the product");
        inner.put("product","like 1");
        inner.put("pr","test");
        symbolsTable.addHtmlSymbol("data_sent",inner);
        // Run for HTML/Jinja2
        System.out.println("--- Processing HTML/Jinja2 ---");
        runParser(t1);
        runParser(t2);
        runParser(t3);
        // Run for CSS
        System.out.println("\n--- Processing CSS ---");
        runParser(Css);
    }
    public static void runParser(String filePath) throws Exception {
        CharStream cs = fromFileName(filePath);
        Jinja2withHTMLandCSSLexer lexer = new Jinja2withHTMLandCSSLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Jinja2withHTMLandCSSParser parser = new Jinja2withHTMLandCSSParser(tokens);

        // This enters through the 'prog' rule
        ParseTree tree = parser.prog();

        BaseVisitor builder = new BaseVisitor();
        ASTNode root = builder.visit(tree);

        System.out.println("<<<<<< AST >>>>>>");
        root.print("");
        //org.antlr.v4.gui.Trees.inspect(tree,parser);
        if (!builder.semanticErrors.isEmpty()){
            for (String x : builder.semanticErrors) System.err.println(x);
        }
    }
}
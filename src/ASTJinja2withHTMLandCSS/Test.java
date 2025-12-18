package ASTJinja2withHTMLandCSS;

import ASTJinja2withHTMLandCSS.ASTNode;
import antlr.grammar.Jinja2withHTMLandCSS.gen.Jinja2withHTMLandCSSLexer;
import antlr.grammar.Jinja2withHTMLandCSS.gen.Jinja2withHTMLandCSSParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Test {

    public static void main(String[] args) throws IOException {
        String source = "Testing Project/FlaskTestingApp/templates/add_product.html";
        String souCss = "Testing Project/FlaskTestingApp/static/style.css";
        CharStream cs = fromFileName(souCss);
        Jinja2withHTMLandCSSLexer lexer = new Jinja2withHTMLandCSSLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        Jinja2withHTMLandCSSParser parser = new Jinja2withHTMLandCSSParser(token);
        ParseTree tree = parser.prog();

        BaseVisitor builder = new BaseVisitor();
        ASTNode root = builder.visit(tree);

        System.out.println("<<<<<< AST >>>>>>");
        root.print("");
        org.antlr.v4.gui.Trees.inspect(tree,parser);


    }
}
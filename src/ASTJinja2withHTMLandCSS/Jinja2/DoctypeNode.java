package ASTJinja2withHTMLandCSS.Jinja2;
import ASTJinja2withHTMLandCSS.*;

public class DoctypeNode extends ASTNode {
    public DoctypeNode(int line) {
        super("Doctype", line);
    }

    @Override
    public void print(String indent) {
        System.out.println(header(indent) + " <!DOCTYPE html>");
    }

}


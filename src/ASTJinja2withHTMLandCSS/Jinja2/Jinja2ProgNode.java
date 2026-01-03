package ASTJinja2withHTMLandCSS.Jinja2;
import ASTJinja2withHTMLandCSS.*;
import java.util.*;

public class Jinja2ProgNode extends ASTNode {
    private DoctypeNode doctype;
    private final List<ASTNode> elements = new ArrayList<>();

    public Jinja2ProgNode(int line) {
        super("Jinja2Prog", line);
    }

    public void setDoctype(DoctypeNode d) { this.doctype = d; }
    public void addElement(ASTNode e) { elements.add(e); }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName);
        if (doctype != null) doctype.print(indent + "  ");
        for (var e : elements) e.print(indent + "  ");
    }

}


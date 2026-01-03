package ASTJinja2withHTMLandCSS.CSS.Selectors;
import ASTJinja2withHTMLandCSS.CSS.CSSSelectorNode;

public class ElementSelectorNode extends CSSSelectorNode {

    private final CSSNameNode name;

    public ElementSelectorNode(int line, CSSNameNode name) {
        super("ElementSelector", line);
        this.name = name;
    }

    @Override
    public void print(String indent) {
        System.out.println(header(indent));
        name.print(indent + "  ");
    }
}

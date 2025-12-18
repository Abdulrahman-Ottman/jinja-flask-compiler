package ASTJinja2withHTMLandCSS.CSS;
import ASTJinja2withHTMLandCSS.ASTNode;

public class PseudoClassNode extends ASTNode {

    private final String name;

    public PseudoClassNode(int line, String name) {
        super("PseudoClass", line);
        this.name = name;
    }

    @Override
    public void print(String indent) {
        System.out.println(header(indent) + " :" + name);
    }
}

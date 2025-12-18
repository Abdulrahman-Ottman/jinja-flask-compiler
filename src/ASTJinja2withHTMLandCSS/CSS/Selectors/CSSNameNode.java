package ASTJinja2withHTMLandCSS.CSS.Selectors;
import ASTJinja2withHTMLandCSS.ASTNode;

public class CSSNameNode extends ASTNode {

    private final String name;

    public CSSNameNode(int line, String name) {
        super("CSSName", line);
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public void print(String indent) {
        System.out.println(indent + getClass().getSimpleName()
                + "(" + name + ") [line " + lineNumber + "]");
    }
}

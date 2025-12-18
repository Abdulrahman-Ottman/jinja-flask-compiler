package ASTJinja2withHTMLandCSS.CSS;
import ASTJinja2withHTMLandCSS.ASTNode;

public abstract class CSSValueAtomNode extends ASTNode {

    protected final String text;

    protected CSSValueAtomNode(String type, int line, String text) {
        super(type, line);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void print(String indent) {
        System.out.println(header(indent) + " \"" + text + "\"");
    }
}

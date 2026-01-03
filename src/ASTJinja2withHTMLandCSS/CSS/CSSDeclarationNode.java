package ASTJinja2withHTMLandCSS.CSS;
import ASTJinja2withHTMLandCSS.ASTNode;

public class CSSDeclarationNode extends ASTNode {

    private final CSSPropertyNameNode property;
    private final CSSValueNode value;

    public CSSDeclarationNode(int line, CSSPropertyNameNode property, CSSValueNode value) {
        super("CSSDeclaration", line);
        this.property = property;
        this.value = value;
    }

    @Override
    public void print(String indent) {
        System.out.println(header(indent));
        property.print(indent + "  ");
        value.print(indent + "  ");
    }
}

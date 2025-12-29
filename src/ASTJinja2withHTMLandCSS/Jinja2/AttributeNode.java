package ASTJinja2withHTMLandCSS.Jinja2;
import ASTJinja2withHTMLandCSS.ASTNode;

public class AttributeNode extends ASTNode {
    private final AttributeNameNode name;
    private final AttributeValueNode value;

    public AttributeNode(int line, AttributeNameNode name, AttributeValueNode value) {
        super("Attribute", line);
        this.name = name;
        this.value = value;
    }
    public String getName() { return name.getName(); }
    public String getValue() { return value.getValue(); }

    @Override
    public void print(String indent) {
        System.out.println(header(indent));
        name.print(indent + "  ");
        if (value != null) value.print(indent + "  ");
    }

}

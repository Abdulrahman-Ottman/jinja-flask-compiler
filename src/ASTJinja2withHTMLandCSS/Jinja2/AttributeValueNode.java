package ASTJinja2withHTMLandCSS.Jinja2;

import ASTJinja2withHTMLandCSS.ASTNode;

public class AttributeValueNode extends ASTNode {
    private final String value;

    public AttributeValueNode(int line, String value) {
        super("AttributeValue", line);
        this.value = value;
    }

    public String getValue() { return value; }

    @Override
    public void print(String indent) {
        System.out.println(indent + "AttrValue(" + value + ") [line " + lineNumber + "]");
    }

}

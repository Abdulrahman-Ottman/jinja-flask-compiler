package ASTJinja2withHTMLandCSS.Jinja2;

import ASTJinja2withHTMLandCSS.ASTNode;

public class VoidTagNameNode extends ASTNode {
    private final String name;

    public VoidTagNameNode(int line, String name) {
        super("VoidTagName", line);
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public void print(String indent) {
        String cls = getClass().getSimpleName();
        System.out.println(indent + cls + "(" + name + ") [line " + lineNumber + "]");
    }


}

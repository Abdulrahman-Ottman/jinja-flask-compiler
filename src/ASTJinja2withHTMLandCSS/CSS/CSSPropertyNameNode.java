package ASTJinja2withHTMLandCSS.CSS;

import ASTJinja2withHTMLandCSS.ASTNode;

public class CSSPropertyNameNode extends ASTNode {
    private final String name;

    public CSSPropertyNameNode(int line, String name) {
        super("CSSProperty", line);
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public void print(String indent) {
        String cls = getClass().getSimpleName();
        System.out.println(indent + cls + "(" + name + ") [line " + lineNumber + "]");
    }
}

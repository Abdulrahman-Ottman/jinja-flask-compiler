package ASTJinja2withHTMLandCSS.CSS.Selectors;

import ASTJinja2withHTMLandCSS.CSS.CSSSelectorNode;

public class ClassSelectorNode extends CSSSelectorNode {

    private final CSSNameNode className;

    public ClassSelectorNode(int line, CSSNameNode className) {
        super("ClassSelector", line);
        this.className = className;
    }

    @Override
    public void print(String indent) {
        System.out.println(header(indent));
        System.out.println(indent + "  .");
        className.print(indent + "    ");
    }
}

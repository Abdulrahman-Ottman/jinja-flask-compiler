package ASTJinja2withHTMLandCSS.CSS.Selectors;

import ASTJinja2withHTMLandCSS.CSS.CSSSelectorNode;

public class IdSelectorNode extends CSSSelectorNode {

    private final String id;

    public IdSelectorNode(int line, String id) {
        super("IdSelector", line);
        this.id = id;
    }

    @Override
    public void print(String indent) {
        System.out.println(header(indent) + " #" + id);
    }
}

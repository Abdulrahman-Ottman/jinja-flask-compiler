package ASTJinja2withHTMLandCSS.CSS.Selectors;

import ASTJinja2withHTMLandCSS.CSS.CSSSelectorNode;

public class CustomElementSelectorNode extends CSSSelectorNode {

    private final String name;

    public CustomElementSelectorNode(int line, String name) {
        super("CustomElementSelector", line);
        this.name = name;
    }

    @Override
    public void print(String indent) {
        System.out.println(header(indent) + " <" + name + ">");
    }
}

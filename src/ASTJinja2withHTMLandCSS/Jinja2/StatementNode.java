package ASTJinja2withHTMLandCSS.Jinja2;
import ASTJinja2withHTMLandCSS.ASTNode;

public class StatementNode extends ASTNode {
    private final String text;

    public StatementNode(int line, String text) {
        super("Statement", line);
        this.text = text;
    }

    @Override
    public void print(String indent) {
        System.out.println(header(indent) + " \"" + text + "\"");
    }

}


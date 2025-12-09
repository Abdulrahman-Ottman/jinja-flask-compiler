package ASTJinja2withHTMLandCSS.Jinja2;
import ASTJinja2withHTMLandCSS.*;

public class EndTagNode extends ASTNode {
    private final TagNameNode tagName;

    public EndTagNode(int line, TagNameNode tagName) {
        super("EndTag", line);
        this.tagName = tagName;
    }

    @Override
    public void print(String indent) {
        String tagClass = tagName.getClass().getSimpleName();
        System.out.println(header(indent) + " </" + tagName.getName() + ">  [" + tagClass + "]");
    }

}


package ASTJinja2withHTMLandCSS.Jinja2;
import java.util.*;
import ASTJinja2withHTMLandCSS.*;

public class StartTagNode extends ASTNode {
    private final TagNameNode tagName;
    private final List<AttributeNode> attributes = new ArrayList<>();

    public StartTagNode(int line, TagNameNode tagName) {
        super("StartTag", line);
        this.tagName = tagName;
    }

    public void addAttribute(AttributeNode a) { attributes.add(a); }

    @Override
    public void print(String indent) {
        String tagClass = tagName.getClass().getSimpleName();
        System.out.println(header(indent) + " <" + tagName.getName() + ">  [" + tagClass + "]");
        for (var a : attributes) a.print(indent + "  ");
    }

}

package ASTJinja2withHTMLandCSS.Jinja2;
import ASTJinja2withHTMLandCSS.ASTNode;

public class ExpressionNode extends ASTNode {
    private final MemberAccessNode member;

    public ExpressionNode(int line, MemberAccessNode member) {
        super("Expression", line);
        this.member = member;
    }

    @Override
    public void print(String indent) {
        System.out.println(header(indent));
        member.print(indent + "  ");
    }

}

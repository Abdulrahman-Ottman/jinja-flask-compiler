package ASTJinja2withHTMLandCSS.Jinja2;

import ASTJinja2withHTMLandCSS.ASTNode;

public class JinjaStatementNode extends ASTNode {
    private String content;

    public JinjaStatementNode(int line, String content) {
        super("JinjaStatement",line);
        this.content = content;
    }

    public String getContent() { return content; }

    @Override
    public void print(String indent) {
        System.out.println(header(indent) + content);
    }
}
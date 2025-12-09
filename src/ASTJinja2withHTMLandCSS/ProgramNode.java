package ASTJinja2withHTMLandCSS;

public class ProgramNode extends ASTNode {
    private final ASTNode root;

    public ProgramNode(int line, ASTNode root) {
        super("Program", line);
        this.root = root;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName);
        if (root != null) root.print(indent + "  ");
    }
}


package ASTJinja2withHTMLandCSS;

public abstract class ASTNode {
    protected String nodeName;
    protected int lineNumber;

    public ASTNode(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
    }

    protected String header(String indent) {
        return indent + " [line " + lineNumber + "] " + nodeName;
    }

    public abstract void print(String indent);
}



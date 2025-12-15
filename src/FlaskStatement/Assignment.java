package FlaskStatement;

public class Assignment extends Statement {
    private final Expression left;
    private final Expression right;

    public Assignment(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }


    @Override
    public String toString() {
        return left.toString() + "=" + right.toString();
    }
}

package FlaskStatement;

public class ReturnStatement extends Statement {
    private final Expression expression; // can be null

    public ReturnStatement(Expression expression) {
        this.expression = expression;
    }

    public boolean returnsValue() {
        return expression != null;
    }

    public Expression getExpression() {
        return expression;
    }
}


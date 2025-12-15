package FlaskStatement;

public class ExpressionStatement extends Statement{
private final Expression expression;


    public ExpressionStatement(Expression expression) {
        this.expression = expression;

    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return expression.toString();
    }
}

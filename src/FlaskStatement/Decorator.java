package FlaskStatement;

public class Decorator {
    private final Expression expression ;
    public Decorator(Expression expression) {
        this.expression = expression;
    }
    public Expression getExpression() {
        return expression;

    }
}

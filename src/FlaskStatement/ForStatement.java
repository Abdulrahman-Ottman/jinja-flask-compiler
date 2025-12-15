package FlaskStatement;

import java.util.List;

public class ForStatement extends Statement {
    private final Expression iterableExpression;
    private final String iteratorName;
    private final List<Statement> body;

    public ForStatement(Expression iterableExpression,
                        String iteratorName,
                        List<Statement> body) {
        this.iterableExpression = iterableExpression;
        this.iteratorName = iteratorName;
        this.body = body;
    }

    public Expression getIterableExpression() {
        return iterableExpression;
    }

    public String getIteratorName() {
        return iteratorName;
    }

    public List<Statement> getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Expression : " + iterableExpression.toString() +"\n iteratorName :"+iteratorName + "\n body:" + body.toString();
    }
}

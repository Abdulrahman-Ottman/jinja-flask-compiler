package FlaskStatement;

import java.util.List;

public class IfStatement extends Statement {
    private final Expression conditionExpression;
    private final List<Statement> body;
    private final List<Statement> elseBody;

    public IfStatement(Expression conditionExpression,
                       List<Statement> body,
                       List<Statement> elseBody) {
        this.conditionExpression = conditionExpression;
        this.body = body;
        this.elseBody = elseBody;
    }

    public Expression getConditionExpression() {
        return conditionExpression;
    }

    public List<Statement> getBody() {
        return body;
    }

    public List<Statement> getElseBody() {
        return elseBody;
    }
}

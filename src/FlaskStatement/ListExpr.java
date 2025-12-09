package FlaskStatement;

import java.util.List;
import java.util.Map;

public class ListExpr extends Expression{
    public List<Expression> expressions;

    public ListExpr(List<Expression> expressions){
        this.expressions=expressions;
    }


    @Override
    public String toString() {
        return expressions.toString();
    }
}

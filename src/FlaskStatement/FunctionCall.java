package FlaskStatement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class FunctionCall extends Expression{
    public  Expression called;
    public  List<Expression> args;
    public  Map<String, Expression> kwargs;

    public FunctionCall(Expression called,
                        List<Expression> args,
                        Map<String, Expression> kwargs) {
        this.called = called;
        this.args = Collections.unmodifiableList(args);
        this.kwargs = Collections.unmodifiableMap(kwargs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(called).append("(");
        boolean first = true;
        for (Expression arg : args) {
            if (!first) sb.append(", ");
            sb.append(arg);
            first = false;
        }
        for (var entry : kwargs.entrySet()) {
            if (!first) sb.append(", ");
            sb.append(entry.getKey()).append("=").append(entry.getValue());
            first = false;
        }
        sb.append(")");
        return sb.toString();
    }
}

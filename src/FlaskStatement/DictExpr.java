package FlaskStatement;

import java.util.Map;

public class DictExpr extends Expression{
    public Map<String,Expression> pairs;

    public DictExpr(Map<String, Expression> pairs) {
        this.pairs = pairs;
    }


    @Override
    public String toString() {
        return pairs.toString();
    }
}

package FlaskStatement;

public class Subscript extends Expression{
    public final Expression value;
    public final Expression index;

    public Subscript(Expression value, Expression index) {
        this.value = value;
        this.index = index;
    }

    @Override
    public String toString() {
        return value + "[" + index + "]";
    }
}

package FlaskStatement;

import FlaskStatement.Expression;

import java.util.Objects;

public class Literal extends Expression {
    public  Object value;  // null, Boolean, Integer, Long, Double, String

    public Literal(Object value) {
        this.value = value;
    }

    public boolean isNone()   { return value == null; }
    public boolean isTrue()   { return Boolean.TRUE.equals(value); }
    public boolean isFalse()  { return Boolean.FALSE.equals(value); }
    public boolean isString() { return value instanceof String; }
    public boolean isNumber() { return value instanceof Number; }

    @Override
    public String toString() {
        if (value == null) return "None";
        if (value instanceof String) return "\"" + value + "\"";
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Literal)) return false;
        return Objects.equals(value, ((Literal) o).value);
    }
}
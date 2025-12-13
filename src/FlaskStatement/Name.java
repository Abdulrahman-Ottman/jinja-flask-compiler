package FlaskStatement;

public class Name extends Expression{
    public String id;

    public Name(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}

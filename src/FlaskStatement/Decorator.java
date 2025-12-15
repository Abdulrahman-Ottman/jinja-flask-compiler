package FlaskStatement;

public class Decorator extends Statement{
    public  Expression expr;   // the expression after @ (e.g. @cache, @app.route("/"))

    public Decorator(Expression expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "@" + expr;
    }
}

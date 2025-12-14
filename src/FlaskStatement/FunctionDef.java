package FlaskStatement;

import java.util.List;

public class FunctionDef extends Statement {
    private final String name;
    private final List<String> parameters;
    private final List<Statement> body;
    private final List<Decorator> decorators;

    public FunctionDef(String name,
                       List<String> parameters,
                       List<Statement> body,
                       List<Decorator> decorators) {
        this.name = name;
        this.parameters = parameters;
        this.body = body;
        this.decorators = decorators;
    }

    public List<Decorator> getDecorators() {
        return decorators;
    }

    public String getName() {
        return name;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public List<Statement> getBody() {
        return body;
    }
}



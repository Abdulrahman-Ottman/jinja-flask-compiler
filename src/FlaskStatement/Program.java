package FlaskStatement;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public List<Statement> statements;

    public Program() {
        this.statements = new ArrayList<>();
    }

    public void addStatement(Statement stat){
        statements.add(stat);
    }

}

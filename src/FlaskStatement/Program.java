package FlaskStatement;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public List<Statement> statements;

    public Program(List<Statement> stmts) {
        this.statements = stmts;
    }

    public void addStatement(Statement stat){
        statements.add(stat);
    }



}

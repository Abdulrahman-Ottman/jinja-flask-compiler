package FlaskStatement;

import java.util.*;

public class ASTPrettyPrinter {

    public static void print(Program program) {
        StringBuilder sb = new StringBuilder();
        appendProgram(sb, program, "");
        System.out.println(sb.toString());
    }

    private static void appendProgram(StringBuilder sb, Program program, String prefix) {
        sb.append("Program\n");
        String childPrefix = prefix + "│   ";
        String lastPrefix  = prefix + "    ";
        List<Statement> stmts = program.statements;
        for (int i = 0; i < stmts.size(); i++) {
            boolean isLast = (i == stmts.size() - 1);
            sb.append(prefix);
            sb.append(isLast ? "└── " : "├── ");
            appendStatement(sb, stmts.get(i), isLast ? lastPrefix : childPrefix);
            sb.append("\n");
        }
    }

    private static void appendStatement(StringBuilder sb, Statement stmt, String prefix) {
        if (stmt instanceof ImportStatement imp) {
            sb.append("ImportStatement");
            sb.append("\n").append(prefix).append("├── package: ").append(String.join(".", imp.getPackageParts()));
            if (!imp.getImportedNames().isEmpty()) {
                sb.append("\n").append(prefix).append("└── imports: ").append(imp.getImportedNames());
            }
        }
        else if (stmt instanceof Assignment ass) {
            sb.append("Assignment");
            appendExpressionBlock(sb, prefix, ass.getLeft(), ass.getRight());
        }
        else if (stmt instanceof ReturnStatement ret) {
            sb.append("ReturnStatement");
            appendSingleExpression(sb, prefix, ret.getExpression());
        }
        else if (stmt instanceof ExpressionStatement exprStmt) {
            sb.append("ExpressionStatement");
            appendSingleExpression(sb, prefix, exprStmt.getExpression());
        }
        else if (stmt instanceof BreakStatement) {
            sb.append("BreakStatement");
        }
        else if (stmt instanceof ContinueStatement) {
            sb.append("ContinueStatement");
        }
        else if (stmt instanceof FunctionDef func) {
            sb.append("FunctionDef: ").append(func.getName());
            sb.append(" (params: ").append(func.getParameters()).append(")");
            if (func.getDecorators() != null && !func.getDecorators().isEmpty()) {
                sb.append("\n").append(prefix).append("└── Decorators:");
                for (int i = 0; i < func.getDecorators().size(); i++) {
                    boolean lastDec = i == func.getDecorators().size() - 1;
                    sb.append("\n").append(prefix).append(lastDec ? "    └── " : "    ├── ");
                    appendExpression(sb, func.getDecorators().get(i).expr, "");
                }
            }
            appendStatementList(sb, prefix, "Body", func.getBody());
        }
        else if (stmt instanceof IfStatement ifStmt) {
            sb.append("IfStatement");
            appendSingleExpression(sb, prefix + "├── ", ifStmt.getConditionExpression());
            appendStatementList(sb, prefix + "├── ", "Then", ifStmt.getBody());
            if (!ifStmt.getElseBody().isEmpty()) {
                appendStatementList(sb, prefix + "└── ", "Else", ifStmt.getElseBody());
            }
        }
        else if (stmt instanceof ForStatement forStmt) {
            sb.append("ForStatement: ").append(forStmt.getIteratorName() ).append(" in");
            appendSingleExpression(sb, prefix + "├── ", forStmt.getIterableExpression());
            appendStatementList(sb, prefix + "└── ", "Body", forStmt.getBody());
        }
        else {
            sb.append(stmt.getClass().getSimpleName());
        }
    }

    private static void appendStatementList(StringBuilder sb, String prefix, String label, List<Statement> body) {
        if (body.isEmpty()) return;
        sb.append("\n").append(prefix).append("└── ").append(label).append(":");
        String childPrefix = prefix + "    │   ";
        String lastPrefix  = prefix + "         ";
        for (int i = 0; i < body.size(); i++) {
            boolean last = i == body.size() - 1;
            sb.append("\n").append(prefix).append(last ? "    └── " : "    ├── ");
            appendStatement(sb, body.get(i), last ? lastPrefix : childPrefix);
        }
    }

    private static void appendExpressionBlock(StringBuilder sb, String prefix, Expression... exprs) {
        for (int i = 0; i < exprs.length; i++) {
            sb.append("\n").append(prefix);
            sb.append(i == exprs.length - 1 ? "└── " : "├── ");
            appendExpression(sb, exprs[i], prefix + (i == exprs.length - 1 ? "    " : "│   "));
            sb.append("\n");
        }
    }

    private static void appendSingleExpression(StringBuilder sb, String prefix, Expression expr) {
        sb.append("\n").append(prefix).append("└── ");
        appendExpression(sb, expr, prefix + "    ");
    }

    private static void appendExpression(StringBuilder sb, Expression expr, String prefix) {
        if (expr == null) {
            sb.append("<null>");
            return;
        }
        if (expr instanceof Name name) {
            sb.append("Name: ").append(name.id);
        }
        else if (expr instanceof Literal lit) {
            sb.append("Literal: ");
            if (lit.value == null) sb.append("None");
            else if (lit.value instanceof String s) sb.append('"').append(s).append('"');
            else sb.append(lit.value);
        }
        else if (expr instanceof ListExpr list) {
            sb.append("ListExpr");
            if (list.expressions.isEmpty()) {
                sb.append(" []");
                return;
            }
            String childPrefix = prefix + "│   ";
            String lastPrefix  = prefix + "    ";
            for (int i = 0; i < list.expressions.size(); i++) {
                boolean last = i == list.expressions.size() - 1;
                sb.append("\n").append(prefix).append(last ? "└── " : "├── ");
                appendExpression(sb, list.expressions.get(i), last ? lastPrefix : childPrefix);
            }
        }
        else if (expr instanceof DictExpr dict) {
            sb.append("DictExpr");
            if (dict.pairs.isEmpty()) {
                sb.append(" {}");
                return;
            }
            String childPrefix = prefix + "│   ";
            String lastPrefix  = prefix + "    ";
            int i = 0;
            for (Map.Entry<String, Expression> entry : dict.pairs.entrySet()) {
                boolean last = i == dict.pairs.size() - 1;
                sb.append("\n").append(prefix).append(last ? "└── " : "├── ");
                sb.append('"').append(entry.getKey()).append('"').append(" : ");
                appendExpression(sb, entry.getValue(), last ? lastPrefix : childPrefix);
                i++;
            }
        }
        else if (expr instanceof Attribute attr) {
            sb.append("Attribute: .").append(attr.attribute);
            sb.append("\n").append(prefix).append("└── object: ");
            appendExpression(sb, attr.object, prefix + "    ");
        }
        else if (expr instanceof Subscript sub) {
            sb.append("Subscript");
            sb.append("\n").append(prefix).append("├── target: ");
            appendExpression(sb, sub.value, prefix + "│   ");
            sb.append("\n").append(prefix).append("└── index: ");
            appendExpression(sb, sub.index, prefix + "    ");
        }
        else if (expr instanceof BinaryOperation bin) {
            sb.append("BinaryOperation: ").append(bin.op);
            sb.append("\n").append(prefix).append("├── left: ");
            appendExpression(sb, bin.left, prefix + "│   ");
            sb.append("\n").append(prefix).append("└── right: ");
            appendExpression(sb, bin.right, prefix + "    ");
        }
        else if (expr instanceof FunctionCall call) {
            sb.append("FunctionCall");
            sb.append("\n").append(prefix).append("├── callee: ");
            appendExpression(sb, call.called, prefix + "│   ");
            if (!call.args.isEmpty()) {
                sb.append("\n").append(prefix).append("├── positional args:");
                String argPrefix = prefix + "│   ";
                String lastArgPrefix = prefix + "    ";
                for (int i = 0; i < call.args.size(); i++) {
                    boolean last = i == call.args.size() - 1;
                    sb.append("\n").append(prefix).append(last ? "│   └── " : "│   ├── ");
                    appendExpression(sb, call.args.get(i), last ? lastArgPrefix : argPrefix);
                }
            }
            if (!call.kwargs.isEmpty()) {
                sb.append("\n").append(prefix).append("└── keyword args:");
                String kwPrefix = prefix + "    ";
                int i = 0;
                for (Map.Entry<String, Expression> kw : call.kwargs.entrySet()) {
                    boolean last = i == call.kwargs.size() - 1;
                    sb.append("\n").append(prefix).append(last ? "    └── " : "    ├── ");
                    sb.append(kw.getKey()).append(" = ");
                    appendExpression(sb, kw.getValue(), last ? kwPrefix : prefix + "    │   ");
                    i++;
                }
            }
        }
        else {
            sb.append(expr.getClass().getSimpleName());
            sb.append(" (").append(expr).append(")");
        }
    }
}
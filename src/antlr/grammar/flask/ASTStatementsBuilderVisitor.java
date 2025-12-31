package antlr.grammar.flask;

import FlaskStatement.*;


import java.util.ArrayList;
import java.util.List;

public class ASTStatementsBuilderVisitor  extends  FlaskExprParserBaseVisitor<Statement>{
    AntlrToExpression expressionVisitor = new AntlrToExpression();

    @Override
    public Statement visitImportstatement(FlaskExprParser.ImportstatementContext ctx) {
        List<String> packageParts = new ArrayList<>();
        packageParts.add(ctx.packageName().NAME(0).getText());
        for (int i = 1; i < ctx.packageName().NAME().size(); i++) {
            packageParts.add(ctx.packageName().NAME(i).getText());
        }
        List<String> importedName = new ArrayList<>();
        for (int i = 0; i < ctx.importList().NAME().size(); i++) {
            importedName.add(ctx.importList().NAME(i).getText());
        }

        return new ImportStatement(ctx.getStart().getLine(),packageParts, importedName);

    }

    @Override
    public Statement visitAssignment(FlaskExprParser.AssignmentContext ctx) {

        Expression left =  expressionVisitor.visit(ctx.expr(0));
        Expression right =  expressionVisitor.visit(ctx.expr(1));

        return new Assignment(ctx.getStart().getLine(),left, right);
    }


    @Override
    public Statement visitReturnStmt(FlaskExprParser.ReturnStmtContext ctx) {
        Expression expression = expressionVisitor.visit(ctx.expr());
        return new ReturnStatement(ctx.getStart().getLine(),expression);


    }


    @Override
    public Statement visitExprStmt(FlaskExprParser.ExprStmtContext ctx) {
        Expression expression = expressionVisitor.visit(ctx.expr());
        return new ExpressionStatement(ctx.getStart().getLine(),expression);
    }


    @Override
    public Statement visitBreak(FlaskExprParser.BreakContext ctx) {
        return new BreakStatement(ctx.getStart().getLine());
    }

    @Override
    public Statement visitContinue(FlaskExprParser.ContinueContext ctx) {
        return new ContinueStatement(ctx.getStart().getLine());
    }


    @Override
    public Statement visitFunctionDefstatementment(FlaskExprParser.FunctionDefstatementmentContext ctx) {

        List<Decorator> decorators = new ArrayList<>();
        for (var decCtx : ctx.decorator()) {
            decorators.add(visitDecorator(decCtx));
        }

        FunctionDef func = (FunctionDef) visitFunctionDef(ctx.functionDef());

        return new FunctionDef(ctx.getStart().getLine(),
                func.getName(),
                func.getParameters(),
                func.getBody(),
                decorators
        );
    }

    @Override
    public Statement visitFunctionDef(FlaskExprParser.FunctionDefContext ctx) {

        // 1) Name of function
        String name = ctx.NAME(0).getText();

        // 2) Parameters
        List<String> parameters = new ArrayList<>();
        for (int i = 1; i < ctx.NAME().size(); i++) {
            parameters.add(ctx.NAME(i).getText());
        }

        // 3) Body statements
        List<Statement> body = new ArrayList<>();
        for (var stmtCtx : ctx.statement()) {
            body.add((Statement) visit(stmtCtx));
        }

        return new FunctionDef(ctx.getStart().getLine(), name, parameters, body,null);
    }


    @Override
    public Statement visitIfstatement(FlaskExprParser.IfstatementContext ctx) {
        Expression condition = expressionVisitor.visit(ctx.expr());

        List<Statement> ifBody = new ArrayList<>();
        for (var stmtCtx : ctx.statement()) {
            ifBody.add((Statement) visit(stmtCtx));
        }

        List<Statement> elseBody = new ArrayList<>();
//        if (ctx.ELSE() != null) {
//            for (var stmtCtx : ctx.elseStatement().statement()) {
//                elseBody.add((Statement) visit(stmtCtx));
//            }
//        }

        return new IfStatement(ctx.getStart().getLine(),condition, ifBody, elseBody);
    }



    @Override
    public Statement visitForstatement(FlaskExprParser.ForstatementContext ctx) {

        String name = ctx.NAME().getText();
        Expression expression = expressionVisitor.visit(ctx.expr());

        List<Statement> body = new ArrayList<>();
        for(var statement : ctx.statement()){
            body.add((Statement) visit(statement));
        }

        return new  ForStatement(ctx.getStart().getLine(),expression,name,body);

    }

    @Override
    public Decorator visitDecorator(FlaskExprParser.DecoratorContext ctx) {
        Expression expr = expressionVisitor.visit(ctx.expr());
        return new Decorator(ctx.getStart().getLine(),expr);
    }

}



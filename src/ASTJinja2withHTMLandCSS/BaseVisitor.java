package ASTJinja2withHTMLandCSS;

import ASTJinja2withHTMLandCSS.*;
import ASTJinja2withHTMLandCSS.Jinja2.*;
import ASTJinja2withHTMLandCSS.Jinja2.Factory.*;
import antlr.grammar.Jinja2withHTMLandCSS.gen.Jinja2withHTMLandCSSParser;
import antlr.grammar.Jinja2withHTMLandCSS.gen.Jinja2withHTMLandCSSParserBaseVisitor;

public class BaseVisitor extends Jinja2withHTMLandCSSParserBaseVisitor<ASTNode> {
    @Override
    public ASTNode visitProg(Jinja2withHTMLandCSSParser.ProgContext ctx) {
        ASTNode root = visit(ctx.jinja2Prog());
        return new ProgramNode(ctx.start.getLine(), root);
    }

    @Override
    public ASTNode visitJinja2Prog(Jinja2withHTMLandCSSParser.Jinja2ProgContext ctx) {
        Jinja2ProgNode node = new Jinja2ProgNode(ctx.start.getLine());

        if (ctx.doctype() != null)
            node.setDoctype((DoctypeNode) visit(ctx.doctype()));

        for (var elem : ctx.htmlelement())
            node.addElement(visit(elem));

        return node;
    }

    @Override
    public ASTNode visitDoctype(Jinja2withHTMLandCSSParser.DoctypeContext ctx) {
        return new DoctypeNode(ctx.start.getLine());
    }

    @Override
    public ASTNode visitHtmlelement(Jinja2withHTMLandCSSParser.HtmlelementContext ctx) {
        if (ctx.openCloseTag() != null)
            return visit(ctx.openCloseTag());
        return visit(ctx.selfClosingTag());
    }

    @Override
    public ASTNode visitOpenCloseTag(Jinja2withHTMLandCSSParser.OpenCloseTagContext ctx) {
        StartTagNode start = (StartTagNode) visit(ctx.startTag());
        OpenCloseTagNode node = new OpenCloseTagNode(ctx.start.getLine(), start);

        for (var c : ctx.elementContent())
            node.addContent(visit(c));

        node.setEndTag((EndTagNode) visit(ctx.endTag()));
        return node;
    }

    @Override
    public ASTNode visitSelfClosingTag(Jinja2withHTMLandCSSParser.SelfClosingTagContext ctx) {
        VoidTagNameNode vtag = (VoidTagNameNode) visit(ctx.voidTagName());
        SelfClosingTagNode node = new SelfClosingTagNode(ctx.start.getLine(), vtag);

        for (var att : ctx.attribute())
            node.addAttribute((AttributeNode) visit(att));

        return node;
    }

    @Override
    public ASTNode visitStartTag(Jinja2withHTMLandCSSParser.StartTagContext ctx) {
        TagNameNode tn = (TagNameNode) visit(ctx.tagName());
        StartTagNode node = new StartTagNode(ctx.start.getLine(), tn);

        for (var att : ctx.attribute())
            node.addAttribute((AttributeNode) visit(att));

        return node;
    }

    @Override
    public ASTNode visitEndTag(Jinja2withHTMLandCSSParser.EndTagContext ctx) {
        TagNameNode tn = (TagNameNode) visit(ctx.tagName());
        return new EndTagNode(ctx.start.getLine(), tn);
    }

    @Override
    public ASTNode visitTagName(Jinja2withHTMLandCSSParser.TagNameContext ctx) {
        String name = ctx.getText().toLowerCase();
        return TagFactory.createTag(ctx.start.getLine(), name);
    }

    @Override
    public ASTNode visitVoidTagName(Jinja2withHTMLandCSSParser.VoidTagNameContext ctx) {
        String name = ctx.getText().toLowerCase();
        return TagFactory.createVoidTag(ctx.start.getLine(), name);
    }

    @Override
    public ASTNode visitAttribute(Jinja2withHTMLandCSSParser.AttributeContext ctx) {
        AttributeNameNode name = (AttributeNameNode) visit(ctx.attributeName());
        AttributeValueNode value = null;

        if (ctx.attributeValue() != null)
            value = (AttributeValueNode) visit(ctx.attributeValue());

        return new AttributeNode(ctx.start.getLine(), name, value);
    }

    @Override
    public ASTNode visitAttributeName(Jinja2withHTMLandCSSParser.AttributeNameContext ctx) {
        String name = ctx.getText().toLowerCase();
        return AttributeFactory.create(ctx.start.getLine(), name);
    }

    @Override
    public ASTNode visitAttributeValue(Jinja2withHTMLandCSSParser.AttributeValueContext ctx) {
        String raw = ctx.getText();
        String val = raw.replaceAll("^\"|\"$", "");
        return new AttributeValueNode(ctx.start.getLine(), val);
    }

    @Override
    public ASTNode visitElementContent(Jinja2withHTMLandCSSParser.ElementContentContext ctx) {
        if (ctx.statement() != null) return visit(ctx.statement());
        if (ctx.htmlelement() != null) return visit(ctx.htmlelement());
        if (ctx.expression() != null) return visit(ctx.expression());
        return visit(ctx.block());
    }

    @Override
    public ASTNode visitStatement(Jinja2withHTMLandCSSParser.StatementContext ctx) {
        return new StatementNode(ctx.start.getLine(), ctx.getText());
    }

    @Override
    public ASTNode visitExpression(Jinja2withHTMLandCSSParser.ExpressionContext ctx) {
        MemberAccessNode m = (MemberAccessNode) visit(ctx.memberAccess());
        return new ExpressionNode(ctx.start.getLine(), m);
    }

    @Override
    public ASTNode visitMemberAccess(Jinja2withHTMLandCSSParser.MemberAccessContext ctx) {
        MemberAccessNode node = new MemberAccessNode(ctx.start.getLine());
        node.addPart(ctx.IDDEFINER(0).getText());

        for (int i = 1; i < ctx.IDDEFINER().size(); i++)
            node.addPart(ctx.IDDEFINER(i).getText());

        return node;
    }

    @Override
    public ASTNode visitBlock(Jinja2withHTMLandCSSParser.BlockContext ctx) {
        BlockNode block = new BlockNode(
                ctx.start.getLine(),
                ctx.IDDEFINER(0).getText(),
                ctx.IDDEFINER(1).getText()
        );

        for (var c : ctx.elementContent())
            block.addContent(visit(c));

        return block;
    }


}


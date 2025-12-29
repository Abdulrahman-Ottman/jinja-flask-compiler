package ASTJinja2withHTMLandCSS;

import ASTJinja2withHTMLandCSS.*;
import ASTJinja2withHTMLandCSS.CSS.*;
import ASTJinja2withHTMLandCSS.CSS.Atoms.*;
import ASTJinja2withHTMLandCSS.CSS.Factory.CSSPropertyFactory;
import ASTJinja2withHTMLandCSS.CSS.Selectors.*;
import ASTJinja2withHTMLandCSS.Jinja2.*;
import ASTJinja2withHTMLandCSS.Jinja2.Factory.*;
import SymbolsTable.SymbolsTable;
import antlr.grammar.Jinja2withHTMLandCSS.gen.Jinja2withHTMLandCSSParserBaseVisitor;
import antlr.grammar.Jinja2withHTMLandCSS.gen.Jinja2withHTMLandCSSParser;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BaseVisitor extends Jinja2withHTMLandCSSParserBaseVisitor<ASTNode> {
    private final SymbolsTable htmlST = SymbolsTable.getHtmlInstance();
    public List<String> semanticErrors;
    public BaseVisitor() {
        this.semanticErrors = new ArrayList<>();
    }

    @Override
    public ASTNode visitJinja2(Jinja2withHTMLandCSSParser.Jinja2Context ctx) {
        ASTNode root = visit(ctx.jinja2Prog());
        return new ProgramNode(ctx.start.getLine(), root);
    }

    @Override
    public ASTNode visitCss(Jinja2withHTMLandCSSParser.CssContext ctx) {
        ASTNode root = visit(ctx.cssProg());
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
    public ASTNode visitOpenCloseTag(Jinja2withHTMLandCSSParser.OpenCloseTagContext ctx) {
        StartTagNode start = (StartTagNode) visit(ctx.startTag());
        OpenCloseTagNode node = new OpenCloseTagNode(ctx.start.getLine(), start);

        for (var c : ctx.elementContent()) {
            node.addContent(visit(c));
        }

        node.setEndTag((EndTagNode) visit(ctx.endTag()));
        return node;
    }

    @Override
    public ASTNode visitSelfClosingTag(Jinja2withHTMLandCSSParser.SelfClosingTagContext ctx) {
        VoidTagNameNode vtag = (VoidTagNameNode) visit(ctx.voidTagName());
        SelfClosingTagNode node = new SelfClosingTagNode(ctx.start.getLine(), vtag);

        for (var att : ctx.attribute()) {
            node.addAttribute((AttributeNode) visit(att));
        }

        return node;
    }

    @Override
    public ASTNode visitStartTag(Jinja2withHTMLandCSSParser.StartTagContext ctx) {
        TagNameNode tn = (TagNameNode) visit(ctx.tagName());
        StartTagNode node = new StartTagNode(ctx.start.getLine(), tn);

        for (var att : ctx.attribute()) {
            AttributeNode attrNode = (AttributeNode) visit(att);
            node.addAttribute(attrNode);

            String attrName = attrNode.getName();
            if (attrName.equals("id") || attrName.equals("class")) {
                Map<String, Object> details = new LinkedHashMap<>();
                details.put("type", attrName);
                details.put("line", ctx.start.getLine());
                htmlST.addHtmlSymbol(attrNode.getValue(), details);
            }
        }

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

    // Labeled Alternatives for attribute
    @Override
    public ASTNode visitFullAttr(Jinja2withHTMLandCSSParser.FullAttrContext ctx) {
        AttributeNameNode name = (AttributeNameNode) visit(ctx.attributeName());
        AttributeValueNode value = (AttributeValueNode) visit(ctx.attributeValue());
        return new AttributeNode(ctx.start.getLine(), name, value);
    }

    @Override
    public ASTNode visitBooleanAttr(Jinja2withHTMLandCSSParser.BooleanAttrContext ctx) {
        AttributeNameNode name = (AttributeNameNode) visit(ctx.attributeName());
        return new AttributeNode(ctx.start.getLine(), name, null);
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

    // Labeled Alternatives for elementContent
    @Override
    public ASTNode visitTextContent(Jinja2withHTMLandCSSParser.TextContentContext ctx) {
        return visit(ctx.statement());
    }

    @Override
    public ASTNode visitNestedElement(Jinja2withHTMLandCSSParser.NestedElementContext ctx) {
        return visit(ctx.htmlelement());
    }

    @Override
    public ASTNode visitJinjaExpression(Jinja2withHTMLandCSSParser.JinjaExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public ASTNode visitJinjaBlock(Jinja2withHTMLandCSSParser.JinjaBlockContext ctx) {
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
        String baseVar = ctx.IDDEFINER(0).getText();
        Map<String, Object> dataSent = htmlST.getHtmlSymbol("data_sent");
        if (!htmlST.getHtmlSymbol("data_sent").containsKey(baseVar)) {
            semanticErrors.add("Line " + ctx.start.getLine() +
                    ": Variable '" + baseVar + "' not found in data_sent.");
        }
        for (var id : ctx.IDDEFINER()) {
            node.addPart(id.getText());
        }
        return node;
    }

    @Override
    public ASTNode visitBlock(Jinja2withHTMLandCSSParser.BlockContext ctx) {
        String baseVar = ctx.IDDEFINER(1).getText();
        if (!htmlST.getHtmlSymbol("data_sent").containsKey(baseVar))
        {semanticErrors.add("Line " + ctx.start.getLine() + ": Variable '" + baseVar + "' not found in data_sent.");}
        BlockNode block = new BlockNode(
                ctx.start.getLine(),
                ctx.IDDEFINER(0).getText(),
                ctx.IDDEFINER(1).getText()
        );

        for (var c : ctx.elementContent())
            block.addContent(visit(c));

        return block;
    }

    // ===== CSS =====

    @Override
    public ASTNode visitCssProg(Jinja2withHTMLandCSSParser.CssProgContext ctx) {
        CSSProgNode prog = new CSSProgNode(ctx.start.getLine());
        for (var r : ctx.cssRule())
            prog.addRule((CSSRuleNode) visit(r));
        return prog;
    }

    @Override
    public ASTNode visitCssRule(Jinja2withHTMLandCSSParser.CssRuleContext ctx) {
        SelectorListNode selectors = (SelectorListNode) visit(ctx.cssSelectorList());
        CSSRuleNode rule = new CSSRuleNode(ctx.start.getLine(), selectors);

        for (var d : ctx.cssDeclaration())
            rule.addDeclaration((CSSDeclarationNode) visit(d));

        return rule;
    }

    @Override
    public ASTNode visitCssSelectorList(Jinja2withHTMLandCSSParser.CssSelectorListContext ctx) {
        SelectorListNode list = new SelectorListNode(ctx.start.getLine());
        for (var s : ctx.cssSelector())
            list.addSelector((SelectorChainNode) visit(s));
        return list;
    }

    @Override
    public ASTNode visitCssSelector(Jinja2withHTMLandCSSParser.CssSelectorContext ctx) {
        SelectorChainNode chain = new SelectorChainNode(ctx.start.getLine());
        for (var s : ctx.simpleSelector())
            chain.addPart((CSSSelectorNode) visit(s));

        if (ctx.pseudoClass() != null)
            chain.setPseudo(new PseudoClassNode(
                    ctx.pseudoClass().start.getLine(),
                    ctx.pseudoClass().getText()));

        return chain;
    }

    @Override
    public ASTNode visitElementSelector(Jinja2withHTMLandCSSParser.ElementSelectorContext ctx) {
        CSSNameNode name = new CSSNameNode(ctx.start.getLine(), ctx.className().getText());
        return new ElementSelectorNode(ctx.start.getLine(), name);
    }

    @Override
    public ASTNode visitClassSelector(Jinja2withHTMLandCSSParser.ClassSelectorContext ctx) {
        String className = ctx.className().getText();
        if (htmlST.getHtmlSymbol(className) == null) {
            semanticErrors.add("Line " + ctx.start.getLine() + " Warning: CSS class ." + className + " is defined but never used in HTML.");
        }
        CSSNameNode name = new CSSNameNode(ctx.start.getLine(), ctx.className().getText());
        return new ClassSelectorNode(ctx.start.getLine(), name);
    }

    @Override
    public ASTNode visitCustomElementSelector(Jinja2withHTMLandCSSParser.CustomElementSelectorContext ctx) {
        return new CustomElementSelectorNode(ctx.start.getLine(), ctx.IDDEFINER().getText());
    }

    @Override
    public ASTNode visitIdSelector(Jinja2withHTMLandCSSParser.IdSelectorContext ctx) {
        return new IdSelectorNode(ctx.start.getLine(), ctx.IDDEFINER().getText());
    }

    @Override
    public ASTNode visitCssDeclaration(Jinja2withHTMLandCSSParser.CssDeclarationContext ctx) {
        CSSPropertyNameNode prop = CSSPropertyFactory.create(ctx.start.getLine(), ctx.cssProperty().getText());
        CSSValueNode value = (CSSValueNode) visit(ctx.cssValue());
        return new CSSDeclarationNode(ctx.start.getLine(), prop, value);
    }

    @Override
    public ASTNode visitCssValue(Jinja2withHTMLandCSSParser.CssValueContext ctx) {
        CSSValueNode v = new CSSValueNode(ctx.start.getLine());
        for (var a : ctx.cssValueAtom())
            v.addAtom((CSSValueAtomNode) visit(a));
        return v;
    }

    // Labeled Alternatives for cssValueAtom
    @Override
    public ASTNode visitCssNumber(Jinja2withHTMLandCSSParser.CssNumberContext ctx) {
        return new NumberAtomNode(ctx.start.getLine(), ctx.getText());
    }

    @Override
    public ASTNode visitCssColor(Jinja2withHTMLandCSSParser.CssColorContext ctx) {
        return new ColorAtomNode(ctx.start.getLine(), ctx.getText());
    }

    @Override
    public ASTNode visitCssIdentifier(Jinja2withHTMLandCSSParser.CssIdentifierContext ctx) {
        return new IdentAtomNode(ctx.start.getLine(), ctx.getText());
    }

    @Override
    public ASTNode visitCssUnit(Jinja2withHTMLandCSSParser.CssUnitContext ctx) {
        return new SymbolAtomNode(ctx.start.getLine(), ctx.getText());
    }

    @Override
    public ASTNode visitCssComma(Jinja2withHTMLandCSSParser.CssCommaContext ctx) {
        return new SymbolAtomNode(ctx.start.getLine(), ctx.getText());
    }

    @Override
    public ASTNode visitCssLParen(Jinja2withHTMLandCSSParser.CssLParenContext ctx) {
        return new SymbolAtomNode(ctx.start.getLine(), ctx.getText());
    }

    @Override
    public ASTNode visitCssRParen(Jinja2withHTMLandCSSParser.CssRParenContext ctx) {
        return new SymbolAtomNode(ctx.start.getLine(), ctx.getText());
    }

    @Override
    public ASTNode visitCssMinus(Jinja2withHTMLandCSSParser.CssMinusContext ctx) {
        return new SymbolAtomNode(ctx.start.getLine(), ctx.getText());
    }
}
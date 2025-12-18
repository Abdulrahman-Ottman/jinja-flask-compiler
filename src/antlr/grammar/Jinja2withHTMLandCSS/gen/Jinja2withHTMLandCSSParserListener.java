// Generated from C:/Users/amres/OneDrive/Documents/GitHub/jinja-flask-compiler/src/antlr/grammar/Jinja2withHTMLandCSS/Jinja2withHTMLandCSSParser.g4 by ANTLR 4.13.2
package antlr.grammar.Jinja2withHTMLandCSS.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Jinja2withHTMLandCSSParser}.
 */
public interface Jinja2withHTMLandCSSParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Jinja2withHTMLandCSSParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Jinja2withHTMLandCSSParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#jinja2Prog}.
	 * @param ctx the parse tree
	 */
	void enterJinja2Prog(Jinja2withHTMLandCSSParser.Jinja2ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#jinja2Prog}.
	 * @param ctx the parse tree
	 */
	void exitJinja2Prog(Jinja2withHTMLandCSSParser.Jinja2ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#doctype}.
	 * @param ctx the parse tree
	 */
	void enterDoctype(Jinja2withHTMLandCSSParser.DoctypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#doctype}.
	 * @param ctx the parse tree
	 */
	void exitDoctype(Jinja2withHTMLandCSSParser.DoctypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#htmlelement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlelement(Jinja2withHTMLandCSSParser.HtmlelementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#htmlelement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlelement(Jinja2withHTMLandCSSParser.HtmlelementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#openCloseTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenCloseTag(Jinja2withHTMLandCSSParser.OpenCloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#openCloseTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenCloseTag(Jinja2withHTMLandCSSParser.OpenCloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#startTag}.
	 * @param ctx the parse tree
	 */
	void enterStartTag(Jinja2withHTMLandCSSParser.StartTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#startTag}.
	 * @param ctx the parse tree
	 */
	void exitStartTag(Jinja2withHTMLandCSSParser.StartTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#endTag}.
	 * @param ctx the parse tree
	 */
	void enterEndTag(Jinja2withHTMLandCSSParser.EndTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#endTag}.
	 * @param ctx the parse tree
	 */
	void exitEndTag(Jinja2withHTMLandCSSParser.EndTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(Jinja2withHTMLandCSSParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(Jinja2withHTMLandCSSParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(Jinja2withHTMLandCSSParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(Jinja2withHTMLandCSSParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#voidTagName}.
	 * @param ctx the parse tree
	 */
	void enterVoidTagName(Jinja2withHTMLandCSSParser.VoidTagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#voidTagName}.
	 * @param ctx the parse tree
	 */
	void exitVoidTagName(Jinja2withHTMLandCSSParser.VoidTagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(Jinja2withHTMLandCSSParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(Jinja2withHTMLandCSSParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(Jinja2withHTMLandCSSParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(Jinja2withHTMLandCSSParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(Jinja2withHTMLandCSSParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(Jinja2withHTMLandCSSParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#elementContent}.
	 * @param ctx the parse tree
	 */
	void enterElementContent(Jinja2withHTMLandCSSParser.ElementContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#elementContent}.
	 * @param ctx the parse tree
	 */
	void exitElementContent(Jinja2withHTMLandCSSParser.ElementContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Jinja2withHTMLandCSSParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Jinja2withHTMLandCSSParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Jinja2withHTMLandCSSParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Jinja2withHTMLandCSSParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(Jinja2withHTMLandCSSParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(Jinja2withHTMLandCSSParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Jinja2withHTMLandCSSParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Jinja2withHTMLandCSSParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssProg}.
	 * @param ctx the parse tree
	 */
	void enterCssProg(Jinja2withHTMLandCSSParser.CssProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssProg}.
	 * @param ctx the parse tree
	 */
	void exitCssProg(Jinja2withHTMLandCSSParser.CssProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(Jinja2withHTMLandCSSParser.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(Jinja2withHTMLandCSSParser.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssSelectorList}.
	 * @param ctx the parse tree
	 */
	void enterCssSelectorList(Jinja2withHTMLandCSSParser.CssSelectorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssSelectorList}.
	 * @param ctx the parse tree
	 */
	void exitCssSelectorList(Jinja2withHTMLandCSSParser.CssSelectorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssSelector(Jinja2withHTMLandCSSParser.CssSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssSelector(Jinja2withHTMLandCSSParser.CssSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssElementName}.
	 * @param ctx the parse tree
	 */
	void enterCssElementName(Jinja2withHTMLandCSSParser.CssElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssElementName}.
	 * @param ctx the parse tree
	 */
	void exitCssElementName(Jinja2withHTMLandCSSParser.CssElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(Jinja2withHTMLandCSSParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(Jinja2withHTMLandCSSParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementSelector}
	 * labeled alternative in {@link Jinja2withHTMLandCSSParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterElementSelector(Jinja2withHTMLandCSSParser.ElementSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementSelector}
	 * labeled alternative in {@link Jinja2withHTMLandCSSParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitElementSelector(Jinja2withHTMLandCSSParser.ElementSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CustomElementSelector}
	 * labeled alternative in {@link Jinja2withHTMLandCSSParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterCustomElementSelector(Jinja2withHTMLandCSSParser.CustomElementSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CustomElementSelector}
	 * labeled alternative in {@link Jinja2withHTMLandCSSParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitCustomElementSelector(Jinja2withHTMLandCSSParser.CustomElementSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassSelector}
	 * labeled alternative in {@link Jinja2withHTMLandCSSParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelector(Jinja2withHTMLandCSSParser.ClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassSelector}
	 * labeled alternative in {@link Jinja2withHTMLandCSSParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelector(Jinja2withHTMLandCSSParser.ClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdSelector}
	 * labeled alternative in {@link Jinja2withHTMLandCSSParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterIdSelector(Jinja2withHTMLandCSSParser.IdSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdSelector}
	 * labeled alternative in {@link Jinja2withHTMLandCSSParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitIdSelector(Jinja2withHTMLandCSSParser.IdSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#pseudoClass}.
	 * @param ctx the parse tree
	 */
	void enterPseudoClass(Jinja2withHTMLandCSSParser.PseudoClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#pseudoClass}.
	 * @param ctx the parse tree
	 */
	void exitPseudoClass(Jinja2withHTMLandCSSParser.PseudoClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclaration(Jinja2withHTMLandCSSParser.CssDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclaration(Jinja2withHTMLandCSSParser.CssDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterCssProperty(Jinja2withHTMLandCSSParser.CssPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitCssProperty(Jinja2withHTMLandCSSParser.CssPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValue(Jinja2withHTMLandCSSParser.CssValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValue(Jinja2withHTMLandCSSParser.CssValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssValueAtom}.
	 * @param ctx the parse tree
	 */
	void enterCssValueAtom(Jinja2withHTMLandCSSParser.CssValueAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssValueAtom}.
	 * @param ctx the parse tree
	 */
	void exitCssValueAtom(Jinja2withHTMLandCSSParser.CssValueAtomContext ctx);
}
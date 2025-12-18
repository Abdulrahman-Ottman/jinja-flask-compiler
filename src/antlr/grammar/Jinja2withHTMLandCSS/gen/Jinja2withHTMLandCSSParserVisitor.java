// Generated from C:/Users/amres/OneDrive/Documents/GitHub/jinja-flask-compiler/src/antlr/grammar/Jinja2withHTMLandCSS/Jinja2withHTMLandCSSParser.g4 by ANTLR 4.13.2
package antlr.grammar.Jinja2withHTMLandCSS.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Jinja2withHTMLandCSSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Jinja2withHTMLandCSSParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Jinja2withHTMLandCSSParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#jinja2Prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja2Prog(Jinja2withHTMLandCSSParser.Jinja2ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#doctype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctype(Jinja2withHTMLandCSSParser.DoctypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#htmlelement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlelement(Jinja2withHTMLandCSSParser.HtmlelementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#openCloseTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenCloseTag(Jinja2withHTMLandCSSParser.OpenCloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#startTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartTag(Jinja2withHTMLandCSSParser.StartTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#endTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndTag(Jinja2withHTMLandCSSParser.EndTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(Jinja2withHTMLandCSSParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(Jinja2withHTMLandCSSParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#voidTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidTagName(Jinja2withHTMLandCSSParser.VoidTagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(Jinja2withHTMLandCSSParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(Jinja2withHTMLandCSSParser.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(Jinja2withHTMLandCSSParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#elementContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementContent(Jinja2withHTMLandCSSParser.ElementContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Jinja2withHTMLandCSSParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Jinja2withHTMLandCSSParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#memberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(Jinja2withHTMLandCSSParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Jinja2withHTMLandCSSParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssProg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssProg(Jinja2withHTMLandCSSParser.CssProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(Jinja2withHTMLandCSSParser.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssSelectorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelectorList(Jinja2withHTMLandCSSParser.CssSelectorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelector(Jinja2withHTMLandCSSParser.CssSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssElementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssElementName(Jinja2withHTMLandCSSParser.CssElementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(Jinja2withHTMLandCSSParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementSelector}
	 * labeled alternative in {@link Jinja2withHTMLandCSSParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementSelector(Jinja2withHTMLandCSSParser.ElementSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CustomElementSelector}
	 * labeled alternative in {@link Jinja2withHTMLandCSSParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomElementSelector(Jinja2withHTMLandCSSParser.CustomElementSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassSelector}
	 * labeled alternative in {@link Jinja2withHTMLandCSSParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelector(Jinja2withHTMLandCSSParser.ClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdSelector}
	 * labeled alternative in {@link Jinja2withHTMLandCSSParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSelector(Jinja2withHTMLandCSSParser.IdSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#pseudoClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoClass(Jinja2withHTMLandCSSParser.PseudoClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclaration(Jinja2withHTMLandCSSParser.CssDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssProperty(Jinja2withHTMLandCSSParser.CssPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValue(Jinja2withHTMLandCSSParser.CssValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2withHTMLandCSSParser#cssValueAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueAtom(Jinja2withHTMLandCSSParser.CssValueAtomContext ctx);
}
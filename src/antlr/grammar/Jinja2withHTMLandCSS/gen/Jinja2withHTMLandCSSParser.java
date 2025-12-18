// Generated from C:/Users/amres/OneDrive/Documents/GitHub/jinja-flask-compiler/src/antlr/grammar/Jinja2withHTMLandCSS/Jinja2withHTMLandCSSParser.g4 by ANTLR 4.13.2
package antlr.grammar.Jinja2withHTMLandCSS.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Jinja2withHTMLandCSSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, JINJA_COMMENT=2, DOCTYPE_TAG=3, HTML_TAG=4, HEAD_TAG=5, BODY_TAG=6, 
		META_TAG=7, TITLE_TAG=8, LINK_TAG=9, DIV_TAG=10, A_TAG=11, P_TAG=12, H1_TAG=13, 
		H2_TAG=14, H3_TAG=15, H4_TAG=16, H5_TAG=17, H6_TAG=18, IMG_TAG=19, FORM_TAG=20, 
		INPUT_TAG=21, LABEL_TAG=22, BUTTON_TAG=23, TEXTAREA_TAG=24, SPAN_TAG=25, 
		UL_TAG=26, LI_TAG=27, CHARSET_ATT=28, STYLE_ATT=29, ALT_ATT=30, HREF_ATT=31, 
		SRC_ATT=32, REL_ATT=33, CLASS_ATT=34, METHOD_ATT=35, TYPE_ATT=36, NAME_ATT=37, 
		STEP_ATT=38, REQUIRED_ATT=39, FONT_FAMILY=40, BACKGROUND=41, BACKGROUND_COLOR=42, 
		COLOR_PROP=43, PADDING=44, PADDING_TOP=45, PADDING_BOTTOM=46, MARGIN=47, 
		MARGIN_TOP=48, MARGIN_BOTTOM=49, WIDTH=50, HEIGHT=51, DISPLAY=52, GAP=53, 
		FLEX_WRAP=54, JUSTIFY_CONTENT=55, TEXT_ALIGN=56, FONT_SIZE=57, FONT_WEIGHT=58, 
		BORDER=59, BORDER_RADIUS=60, BOX_SHADOW=61, TEXT_DECORATION=62, CURSOR=63, 
		TRANSFORM=64, FLEX_DIRECTION=65, PSEUDO_HOVER=66, LCURLY=67, RCURLY=68, 
		BLOCK_START=69, BLOCK_END=70, ASSIGN=71, NOT=72, OPEN_TAG=73, OPEN_TAG_SLASH=74, 
		CLOSE_TAG=75, SELF_CLOSD=76, COLON=77, SEMICOLON=78, COMMA=79, LPAREN=80, 
		RPAREN=81, DOT=82, HASH=83, PLUS=84, MINUS=85, STAR=86, DIVISION=87, FOR=88, 
		END_FOR=89, IN=90, STRING=91, NUMBER=92, BOOL=93, CSS_UNIT=94, CSS_COLOR=95, 
		IDDEFINER=96;
	public static final int
		RULE_prog = 0, RULE_jinja2Prog = 1, RULE_doctype = 2, RULE_htmlelement = 3, 
		RULE_openCloseTag = 4, RULE_startTag = 5, RULE_endTag = 6, RULE_tagName = 7, 
		RULE_selfClosingTag = 8, RULE_voidTagName = 9, RULE_attribute = 10, RULE_attributeName = 11, 
		RULE_attributeValue = 12, RULE_elementContent = 13, RULE_statement = 14, 
		RULE_expression = 15, RULE_memberAccess = 16, RULE_block = 17, RULE_cssProg = 18, 
		RULE_cssRule = 19, RULE_cssSelectorList = 20, RULE_cssSelector = 21, RULE_cssElementName = 22, 
		RULE_className = 23, RULE_simpleSelector = 24, RULE_pseudoClass = 25, 
		RULE_cssDeclaration = 26, RULE_cssProperty = 27, RULE_cssValue = 28, RULE_cssValueAtom = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "jinja2Prog", "doctype", "htmlelement", "openCloseTag", "startTag", 
			"endTag", "tagName", "selfClosingTag", "voidTagName", "attribute", "attributeName", 
			"attributeValue", "elementContent", "statement", "expression", "memberAccess", 
			"block", "cssProg", "cssRule", "cssSelectorList", "cssSelector", "cssElementName", 
			"className", "simpleSelector", "pseudoClass", "cssDeclaration", "cssProperty", 
			"cssValue", "cssValueAtom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'DOCTYPE'", "'html'", "'head'", "'body'", "'meta'", 
			"'title'", "'link'", "'div'", "'a'", "'p'", "'h1'", "'h2'", "'h3'", "'h4'", 
			"'h5'", "'h6'", "'img'", "'form'", "'input'", "'label'", "'button'", 
			"'textarea'", "'span'", "'ul'", "'li'", "'charset'", "'style'", "'alt'", 
			"'href'", "'src'", "'rel'", "'class'", "'method'", "'type'", "'name'", 
			"'step'", "'required'", "'font-family'", "'background'", "'background-color'", 
			"'color'", "'padding'", "'padding-top'", "'padding-bottom'", "'margin'", 
			"'margin-top'", "'margin-bottom'", "'width'", "'height'", "'display'", 
			"'gap'", "'flex-wrap'", "'justify-content'", "'text-align'", "'font-size'", 
			"'font-weight'", "'border'", "'border-radius'", "'box-shadow'", "'text-decoration'", 
			"'cursor'", "'transform'", "'flex-direction'", "'hover'", "'{'", "'}'", 
			"'{%'", "'%}'", "'='", "'!'", "'<'", "'</'", "'>'", "'/>'", "':'", "';'", 
			"','", "'('", "')'", "'.'", "'#'", "'+'", "'-'", "'*'", "'/'", "'for'", 
			"'endfor'", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "JINJA_COMMENT", "DOCTYPE_TAG", "HTML_TAG", "HEAD_TAG", "BODY_TAG", 
			"META_TAG", "TITLE_TAG", "LINK_TAG", "DIV_TAG", "A_TAG", "P_TAG", "H1_TAG", 
			"H2_TAG", "H3_TAG", "H4_TAG", "H5_TAG", "H6_TAG", "IMG_TAG", "FORM_TAG", 
			"INPUT_TAG", "LABEL_TAG", "BUTTON_TAG", "TEXTAREA_TAG", "SPAN_TAG", "UL_TAG", 
			"LI_TAG", "CHARSET_ATT", "STYLE_ATT", "ALT_ATT", "HREF_ATT", "SRC_ATT", 
			"REL_ATT", "CLASS_ATT", "METHOD_ATT", "TYPE_ATT", "NAME_ATT", "STEP_ATT", 
			"REQUIRED_ATT", "FONT_FAMILY", "BACKGROUND", "BACKGROUND_COLOR", "COLOR_PROP", 
			"PADDING", "PADDING_TOP", "PADDING_BOTTOM", "MARGIN", "MARGIN_TOP", "MARGIN_BOTTOM", 
			"WIDTH", "HEIGHT", "DISPLAY", "GAP", "FLEX_WRAP", "JUSTIFY_CONTENT", 
			"TEXT_ALIGN", "FONT_SIZE", "FONT_WEIGHT", "BORDER", "BORDER_RADIUS", 
			"BOX_SHADOW", "TEXT_DECORATION", "CURSOR", "TRANSFORM", "FLEX_DIRECTION", 
			"PSEUDO_HOVER", "LCURLY", "RCURLY", "BLOCK_START", "BLOCK_END", "ASSIGN", 
			"NOT", "OPEN_TAG", "OPEN_TAG_SLASH", "CLOSE_TAG", "SELF_CLOSD", "COLON", 
			"SEMICOLON", "COMMA", "LPAREN", "RPAREN", "DOT", "HASH", "PLUS", "MINUS", 
			"STAR", "DIVISION", "FOR", "END_FOR", "IN", "STRING", "NUMBER", "BOOL", 
			"CSS_UNIT", "CSS_COLOR", "IDDEFINER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Jinja2withHTMLandCSSParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Jinja2withHTMLandCSSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public Jinja2ProgContext jinja2Prog() {
			return getRuleContext(Jinja2ProgContext.class,0);
		}
		public CssProgContext cssProg() {
			return getRuleContext(CssProgContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				jinja2Prog();
				}
				break;
			case HTML_TAG:
			case HEAD_TAG:
			case BODY_TAG:
			case META_TAG:
			case TITLE_TAG:
			case LINK_TAG:
			case DIV_TAG:
			case A_TAG:
			case P_TAG:
			case H1_TAG:
			case H2_TAG:
			case H3_TAG:
			case H4_TAG:
			case H5_TAG:
			case H6_TAG:
			case IMG_TAG:
			case FORM_TAG:
			case INPUT_TAG:
			case LABEL_TAG:
			case BUTTON_TAG:
			case TEXTAREA_TAG:
			case SPAN_TAG:
			case UL_TAG:
			case LI_TAG:
			case DOT:
			case HASH:
			case IDDEFINER:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				cssProg();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2ProgContext extends ParserRuleContext {
		public DoctypeContext doctype() {
			return getRuleContext(DoctypeContext.class,0);
		}
		public List<HtmlelementContext> htmlelement() {
			return getRuleContexts(HtmlelementContext.class);
		}
		public HtmlelementContext htmlelement(int i) {
			return getRuleContext(HtmlelementContext.class,i);
		}
		public Jinja2ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja2Prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterJinja2Prog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitJinja2Prog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitJinja2Prog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja2ProgContext jinja2Prog() throws RecognitionException {
		Jinja2ProgContext _localctx = new Jinja2ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jinja2Prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(64);
				doctype();
				}
				break;
			}
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				htmlelement();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_TAG );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoctypeContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG() { return getToken(Jinja2withHTMLandCSSParser.OPEN_TAG, 0); }
		public TerminalNode NOT() { return getToken(Jinja2withHTMLandCSSParser.NOT, 0); }
		public TerminalNode DOCTYPE_TAG() { return getToken(Jinja2withHTMLandCSSParser.DOCTYPE_TAG, 0); }
		public TerminalNode HTML_TAG() { return getToken(Jinja2withHTMLandCSSParser.HTML_TAG, 0); }
		public TerminalNode CLOSE_TAG() { return getToken(Jinja2withHTMLandCSSParser.CLOSE_TAG, 0); }
		public DoctypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doctype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterDoctype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitDoctype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitDoctype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoctypeContext doctype() throws RecognitionException {
		DoctypeContext _localctx = new DoctypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_doctype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(OPEN_TAG);
			setState(73);
			match(NOT);
			setState(74);
			match(DOCTYPE_TAG);
			setState(75);
			match(HTML_TAG);
			setState(76);
			match(CLOSE_TAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlelementContext extends ParserRuleContext {
		public OpenCloseTagContext openCloseTag() {
			return getRuleContext(OpenCloseTagContext.class,0);
		}
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public HtmlelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlelement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterHtmlelement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitHtmlelement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitHtmlelement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlelementContext htmlelement() throws RecognitionException {
		HtmlelementContext _localctx = new HtmlelementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlelement);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				openCloseTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				selfClosingTag();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpenCloseTagContext extends ParserRuleContext {
		public StartTagContext startTag() {
			return getRuleContext(StartTagContext.class,0);
		}
		public EndTagContext endTag() {
			return getRuleContext(EndTagContext.class,0);
		}
		public List<ElementContentContext> elementContent() {
			return getRuleContexts(ElementContentContext.class);
		}
		public ElementContentContext elementContent(int i) {
			return getRuleContext(ElementContentContext.class,i);
		}
		public OpenCloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openCloseTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterOpenCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitOpenCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitOpenCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenCloseTagContext openCloseTag() throws RecognitionException {
		OpenCloseTagContext _localctx = new OpenCloseTagContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_openCloseTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			startTag();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 536929349L) != 0)) {
				{
				{
				setState(83);
				elementContent();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			endTag();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartTagContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG() { return getToken(Jinja2withHTMLandCSSParser.OPEN_TAG, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode CLOSE_TAG() { return getToken(Jinja2withHTMLandCSSParser.CLOSE_TAG, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public StartTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterStartTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitStartTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitStartTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartTagContext startTag() throws RecognitionException {
		StartTagContext _localctx = new StartTagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_startTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(OPEN_TAG);
			setState(92);
			tagName();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099243192320L) != 0)) {
				{
				{
				setState(93);
				attribute();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(CLOSE_TAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EndTagContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG_SLASH() { return getToken(Jinja2withHTMLandCSSParser.OPEN_TAG_SLASH, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode CLOSE_TAG() { return getToken(Jinja2withHTMLandCSSParser.CLOSE_TAG, 0); }
		public EndTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterEndTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitEndTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitEndTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndTagContext endTag() throws RecognitionException {
		EndTagContext _localctx = new EndTagContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_endTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(OPEN_TAG_SLASH);
			setState(102);
			tagName();
			setState(103);
			match(CLOSE_TAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode HTML_TAG() { return getToken(Jinja2withHTMLandCSSParser.HTML_TAG, 0); }
		public TerminalNode HEAD_TAG() { return getToken(Jinja2withHTMLandCSSParser.HEAD_TAG, 0); }
		public TerminalNode BODY_TAG() { return getToken(Jinja2withHTMLandCSSParser.BODY_TAG, 0); }
		public TerminalNode TITLE_TAG() { return getToken(Jinja2withHTMLandCSSParser.TITLE_TAG, 0); }
		public TerminalNode DIV_TAG() { return getToken(Jinja2withHTMLandCSSParser.DIV_TAG, 0); }
		public TerminalNode A_TAG() { return getToken(Jinja2withHTMLandCSSParser.A_TAG, 0); }
		public TerminalNode P_TAG() { return getToken(Jinja2withHTMLandCSSParser.P_TAG, 0); }
		public TerminalNode H1_TAG() { return getToken(Jinja2withHTMLandCSSParser.H1_TAG, 0); }
		public TerminalNode H2_TAG() { return getToken(Jinja2withHTMLandCSSParser.H2_TAG, 0); }
		public TerminalNode H3_TAG() { return getToken(Jinja2withHTMLandCSSParser.H3_TAG, 0); }
		public TerminalNode H4_TAG() { return getToken(Jinja2withHTMLandCSSParser.H4_TAG, 0); }
		public TerminalNode H5_TAG() { return getToken(Jinja2withHTMLandCSSParser.H5_TAG, 0); }
		public TerminalNode H6_TAG() { return getToken(Jinja2withHTMLandCSSParser.H6_TAG, 0); }
		public TerminalNode FORM_TAG() { return getToken(Jinja2withHTMLandCSSParser.FORM_TAG, 0); }
		public TerminalNode LABEL_TAG() { return getToken(Jinja2withHTMLandCSSParser.LABEL_TAG, 0); }
		public TerminalNode BUTTON_TAG() { return getToken(Jinja2withHTMLandCSSParser.BUTTON_TAG, 0); }
		public TerminalNode TEXTAREA_TAG() { return getToken(Jinja2withHTMLandCSSParser.TEXTAREA_TAG, 0); }
		public TerminalNode SPAN_TAG() { return getToken(Jinja2withHTMLandCSSParser.SPAN_TAG, 0); }
		public TerminalNode UL_TAG() { return getToken(Jinja2withHTMLandCSSParser.UL_TAG, 0); }
		public TerminalNode LI_TAG() { return getToken(Jinja2withHTMLandCSSParser.LI_TAG, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tagName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 265813360L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG() { return getToken(Jinja2withHTMLandCSSParser.OPEN_TAG, 0); }
		public VoidTagNameContext voidTagName() {
			return getRuleContext(VoidTagNameContext.class,0);
		}
		public TerminalNode SELF_CLOSD() { return getToken(Jinja2withHTMLandCSSParser.SELF_CLOSD, 0); }
		public TerminalNode CLOSE_TAG() { return getToken(Jinja2withHTMLandCSSParser.CLOSE_TAG, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(OPEN_TAG);
			setState(108);
			voidTagName();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099243192320L) != 0)) {
				{
				{
				setState(109);
				attribute();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==CLOSE_TAG || _la==SELF_CLOSD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VoidTagNameContext extends ParserRuleContext {
		public TerminalNode META_TAG() { return getToken(Jinja2withHTMLandCSSParser.META_TAG, 0); }
		public TerminalNode LINK_TAG() { return getToken(Jinja2withHTMLandCSSParser.LINK_TAG, 0); }
		public TerminalNode IMG_TAG() { return getToken(Jinja2withHTMLandCSSParser.IMG_TAG, 0); }
		public TerminalNode INPUT_TAG() { return getToken(Jinja2withHTMLandCSSParser.INPUT_TAG, 0); }
		public VoidTagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidTagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterVoidTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitVoidTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitVoidTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidTagNameContext voidTagName() throws RecognitionException {
		VoidTagNameContext _localctx = new VoidTagNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_voidTagName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2622080L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Jinja2withHTMLandCSSParser.ASSIGN, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attribute);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				attributeName();
				setState(120);
				match(ASSIGN);
				setState(121);
				attributeValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				attributeName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeNameContext extends ParserRuleContext {
		public TerminalNode CHARSET_ATT() { return getToken(Jinja2withHTMLandCSSParser.CHARSET_ATT, 0); }
		public TerminalNode ALT_ATT() { return getToken(Jinja2withHTMLandCSSParser.ALT_ATT, 0); }
		public TerminalNode HREF_ATT() { return getToken(Jinja2withHTMLandCSSParser.HREF_ATT, 0); }
		public TerminalNode SRC_ATT() { return getToken(Jinja2withHTMLandCSSParser.SRC_ATT, 0); }
		public TerminalNode REL_ATT() { return getToken(Jinja2withHTMLandCSSParser.REL_ATT, 0); }
		public TerminalNode CLASS_ATT() { return getToken(Jinja2withHTMLandCSSParser.CLASS_ATT, 0); }
		public TerminalNode METHOD_ATT() { return getToken(Jinja2withHTMLandCSSParser.METHOD_ATT, 0); }
		public TerminalNode TYPE_ATT() { return getToken(Jinja2withHTMLandCSSParser.TYPE_ATT, 0); }
		public TerminalNode NAME_ATT() { return getToken(Jinja2withHTMLandCSSParser.NAME_ATT, 0); }
		public TerminalNode STEP_ATT() { return getToken(Jinja2withHTMLandCSSParser.STEP_ATT, 0); }
		public TerminalNode REQUIRED_ATT() { return getToken(Jinja2withHTMLandCSSParser.REQUIRED_ATT, 0); }
		public TerminalNode STYLE_ATT() { return getToken(Jinja2withHTMLandCSSParser.STYLE_ATT, 0); }
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attributeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099243192320L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(Jinja2withHTMLandCSSParser.STRING, 0); }
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attributeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContentContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public HtmlelementContext htmlelement() {
			return getRuleContext(HtmlelementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElementContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterElementContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitElementContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitElementContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContentContext elementContent() throws RecognitionException {
		ElementContentContext _localctx = new ElementContentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elementContent);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
			case LPAREN:
			case RPAREN:
			case DOT:
			case IDDEFINER:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				statement();
				}
				break;
			case OPEN_TAG:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				htmlelement();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				expression();
				}
				break;
			case BLOCK_START:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<TerminalNode> IDDEFINER() { return getTokens(Jinja2withHTMLandCSSParser.IDDEFINER); }
		public TerminalNode IDDEFINER(int i) {
			return getToken(Jinja2withHTMLandCSSParser.IDDEFINER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(Jinja2withHTMLandCSSParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Jinja2withHTMLandCSSParser.COLON, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(Jinja2withHTMLandCSSParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(Jinja2withHTMLandCSSParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(Jinja2withHTMLandCSSParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(Jinja2withHTMLandCSSParser.RPAREN, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Jinja2withHTMLandCSSParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Jinja2withHTMLandCSSParser.DOT, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(136);
					_la = _input.LA(1);
					if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 524345L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(139); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> LCURLY() { return getTokens(Jinja2withHTMLandCSSParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(Jinja2withHTMLandCSSParser.LCURLY, i);
		}
		public MemberAccessContext memberAccess() {
			return getRuleContext(MemberAccessContext.class,0);
		}
		public List<TerminalNode> RCURLY() { return getTokens(Jinja2withHTMLandCSSParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(Jinja2withHTMLandCSSParser.RCURLY, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(LCURLY);
			setState(142);
			match(LCURLY);
			setState(143);
			memberAccess();
			setState(144);
			match(RCURLY);
			setState(145);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessContext extends ParserRuleContext {
		public List<TerminalNode> IDDEFINER() { return getTokens(Jinja2withHTMLandCSSParser.IDDEFINER); }
		public TerminalNode IDDEFINER(int i) {
			return getToken(Jinja2withHTMLandCSSParser.IDDEFINER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Jinja2withHTMLandCSSParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Jinja2withHTMLandCSSParser.DOT, i);
		}
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_memberAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IDDEFINER);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(148);
				match(DOT);
				setState(149);
				match(IDDEFINER);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> BLOCK_START() { return getTokens(Jinja2withHTMLandCSSParser.BLOCK_START); }
		public TerminalNode BLOCK_START(int i) {
			return getToken(Jinja2withHTMLandCSSParser.BLOCK_START, i);
		}
		public TerminalNode FOR() { return getToken(Jinja2withHTMLandCSSParser.FOR, 0); }
		public List<TerminalNode> IDDEFINER() { return getTokens(Jinja2withHTMLandCSSParser.IDDEFINER); }
		public TerminalNode IDDEFINER(int i) {
			return getToken(Jinja2withHTMLandCSSParser.IDDEFINER, i);
		}
		public TerminalNode IN() { return getToken(Jinja2withHTMLandCSSParser.IN, 0); }
		public List<TerminalNode> BLOCK_END() { return getTokens(Jinja2withHTMLandCSSParser.BLOCK_END); }
		public TerminalNode BLOCK_END(int i) {
			return getToken(Jinja2withHTMLandCSSParser.BLOCK_END, i);
		}
		public TerminalNode END_FOR() { return getToken(Jinja2withHTMLandCSSParser.END_FOR, 0); }
		public List<ElementContentContext> elementContent() {
			return getRuleContexts(ElementContentContext.class);
		}
		public ElementContentContext elementContent(int i) {
			return getRuleContext(ElementContentContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(BLOCK_START);
			setState(156);
			match(FOR);
			setState(157);
			match(IDDEFINER);
			setState(158);
			match(IN);
			setState(159);
			match(IDDEFINER);
			setState(160);
			match(BLOCK_END);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(161);
					elementContent();
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(167);
			match(BLOCK_START);
			setState(168);
			match(END_FOR);
			setState(169);
			match(BLOCK_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Jinja2withHTMLandCSSParser.EOF, 0); }
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public CssProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterCssProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitCssProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitCssProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssProgContext cssProg() throws RecognitionException {
		CssProgContext _localctx = new CssProgContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cssProg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				cssRule();
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 268435440L) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 16387L) != 0) );
			setState(176);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleContext extends ParserRuleContext {
		public CssSelectorListContext cssSelectorList() {
			return getRuleContext(CssSelectorListContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(Jinja2withHTMLandCSSParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Jinja2withHTMLandCSSParser.RCURLY, 0); }
		public List<CssDeclarationContext> cssDeclaration() {
			return getRuleContexts(CssDeclarationContext.class);
		}
		public CssDeclarationContext cssDeclaration(int i) {
			return getRuleContext(CssDeclarationContext.class,i);
		}
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cssRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			cssSelectorList();
			setState(179);
			match(LCURLY);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & 67108863L) != 0)) {
				{
				{
				setState(180);
				cssDeclaration();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorListContext extends ParserRuleContext {
		public List<CssSelectorContext> cssSelector() {
			return getRuleContexts(CssSelectorContext.class);
		}
		public CssSelectorContext cssSelector(int i) {
			return getRuleContext(CssSelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Jinja2withHTMLandCSSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Jinja2withHTMLandCSSParser.COMMA, i);
		}
		public CssSelectorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelectorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterCssSelectorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitCssSelectorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitCssSelectorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorListContext cssSelectorList() throws RecognitionException {
		CssSelectorListContext _localctx = new CssSelectorListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cssSelectorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			cssSelector();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(189);
				match(COMMA);
				setState(190);
				cssSelector();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorContext extends ParserRuleContext {
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public TerminalNode COLON() { return getToken(Jinja2withHTMLandCSSParser.COLON, 0); }
		public PseudoClassContext pseudoClass() {
			return getRuleContext(PseudoClassContext.class,0);
		}
		public CssSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterCssSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitCssSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitCssSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorContext cssSelector() throws RecognitionException {
		CssSelectorContext _localctx = new CssSelectorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cssSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			simpleSelector();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268435440L) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 16387L) != 0)) {
				{
				{
				setState(197);
				simpleSelector();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(203);
				match(COLON);
				setState(204);
				pseudoClass();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssElementNameContext extends ParserRuleContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public VoidTagNameContext voidTagName() {
			return getRuleContext(VoidTagNameContext.class,0);
		}
		public CssElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssElementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterCssElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitCssElementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitCssElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssElementNameContext cssElementName() throws RecognitionException {
		CssElementNameContext _localctx = new CssElementNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cssElementName);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TAG:
			case HEAD_TAG:
			case BODY_TAG:
			case TITLE_TAG:
			case DIV_TAG:
			case A_TAG:
			case P_TAG:
			case H1_TAG:
			case H2_TAG:
			case H3_TAG:
			case H4_TAG:
			case H5_TAG:
			case H6_TAG:
			case FORM_TAG:
			case LABEL_TAG:
			case BUTTON_TAG:
			case TEXTAREA_TAG:
			case SPAN_TAG:
			case UL_TAG:
			case LI_TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				tagName();
				}
				break;
			case META_TAG:
			case LINK_TAG:
			case IMG_TAG:
			case INPUT_TAG:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				voidTagName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode IDDEFINER() { return getToken(Jinja2withHTMLandCSSParser.IDDEFINER, 0); }
		public CssElementNameContext cssElementName() {
			return getRuleContext(CssElementNameContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_className);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDDEFINER:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(IDDEFINER);
				}
				break;
			case HTML_TAG:
			case HEAD_TAG:
			case BODY_TAG:
			case META_TAG:
			case TITLE_TAG:
			case LINK_TAG:
			case DIV_TAG:
			case A_TAG:
			case P_TAG:
			case H1_TAG:
			case H2_TAG:
			case H3_TAG:
			case H4_TAG:
			case H5_TAG:
			case H6_TAG:
			case IMG_TAG:
			case FORM_TAG:
			case INPUT_TAG:
			case LABEL_TAG:
			case BUTTON_TAG:
			case TEXTAREA_TAG:
			case SPAN_TAG:
			case UL_TAG:
			case LI_TAG:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				cssElementName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorContext extends ParserRuleContext {
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
	 
		public SimpleSelectorContext() { }
		public void copyFrom(SimpleSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CustomElementSelectorContext extends SimpleSelectorContext {
		public TerminalNode IDDEFINER() { return getToken(Jinja2withHTMLandCSSParser.IDDEFINER, 0); }
		public CustomElementSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterCustomElementSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitCustomElementSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitCustomElementSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdSelectorContext extends SimpleSelectorContext {
		public TerminalNode HASH() { return getToken(Jinja2withHTMLandCSSParser.HASH, 0); }
		public TerminalNode IDDEFINER() { return getToken(Jinja2withHTMLandCSSParser.IDDEFINER, 0); }
		public IdSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterIdSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitIdSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitIdSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassSelectorContext extends SimpleSelectorContext {
		public TerminalNode DOT() { return getToken(Jinja2withHTMLandCSSParser.DOT, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementSelectorContext extends SimpleSelectorContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ElementSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterElementSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitElementSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitElementSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_simpleSelector);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ElementSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				className();
				}
				break;
			case 2:
				_localctx = new CustomElementSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(IDDEFINER);
				}
				break;
			case 3:
				_localctx = new ClassSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(DOT);
				setState(218);
				className();
				}
				break;
			case 4:
				_localctx = new IdSelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				match(HASH);
				setState(220);
				match(IDDEFINER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoClassContext extends ParserRuleContext {
		public TerminalNode PSEUDO_HOVER() { return getToken(Jinja2withHTMLandCSSParser.PSEUDO_HOVER, 0); }
		public PseudoClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterPseudoClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitPseudoClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitPseudoClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoClassContext pseudoClass() throws RecognitionException {
		PseudoClassContext _localctx = new PseudoClassContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pseudoClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(PSEUDO_HOVER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationContext extends ParserRuleContext {
		public CssPropertyContext cssProperty() {
			return getRuleContext(CssPropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Jinja2withHTMLandCSSParser.COLON, 0); }
		public CssValueContext cssValue() {
			return getRuleContext(CssValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Jinja2withHTMLandCSSParser.SEMICOLON, 0); }
		public CssDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterCssDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitCssDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationContext cssDeclaration() throws RecognitionException {
		CssDeclarationContext _localctx = new CssDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cssDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			cssProperty();
			setState(226);
			match(COLON);
			setState(227);
			cssValue();
			setState(228);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssPropertyContext extends ParserRuleContext {
		public TerminalNode FONT_FAMILY() { return getToken(Jinja2withHTMLandCSSParser.FONT_FAMILY, 0); }
		public TerminalNode BACKGROUND() { return getToken(Jinja2withHTMLandCSSParser.BACKGROUND, 0); }
		public TerminalNode BACKGROUND_COLOR() { return getToken(Jinja2withHTMLandCSSParser.BACKGROUND_COLOR, 0); }
		public TerminalNode COLOR_PROP() { return getToken(Jinja2withHTMLandCSSParser.COLOR_PROP, 0); }
		public TerminalNode PADDING() { return getToken(Jinja2withHTMLandCSSParser.PADDING, 0); }
		public TerminalNode PADDING_TOP() { return getToken(Jinja2withHTMLandCSSParser.PADDING_TOP, 0); }
		public TerminalNode PADDING_BOTTOM() { return getToken(Jinja2withHTMLandCSSParser.PADDING_BOTTOM, 0); }
		public TerminalNode MARGIN() { return getToken(Jinja2withHTMLandCSSParser.MARGIN, 0); }
		public TerminalNode MARGIN_TOP() { return getToken(Jinja2withHTMLandCSSParser.MARGIN_TOP, 0); }
		public TerminalNode MARGIN_BOTTOM() { return getToken(Jinja2withHTMLandCSSParser.MARGIN_BOTTOM, 0); }
		public TerminalNode WIDTH() { return getToken(Jinja2withHTMLandCSSParser.WIDTH, 0); }
		public TerminalNode HEIGHT() { return getToken(Jinja2withHTMLandCSSParser.HEIGHT, 0); }
		public TerminalNode DISPLAY() { return getToken(Jinja2withHTMLandCSSParser.DISPLAY, 0); }
		public TerminalNode GAP() { return getToken(Jinja2withHTMLandCSSParser.GAP, 0); }
		public TerminalNode FLEX_WRAP() { return getToken(Jinja2withHTMLandCSSParser.FLEX_WRAP, 0); }
		public TerminalNode JUSTIFY_CONTENT() { return getToken(Jinja2withHTMLandCSSParser.JUSTIFY_CONTENT, 0); }
		public TerminalNode TEXT_ALIGN() { return getToken(Jinja2withHTMLandCSSParser.TEXT_ALIGN, 0); }
		public TerminalNode FONT_SIZE() { return getToken(Jinja2withHTMLandCSSParser.FONT_SIZE, 0); }
		public TerminalNode FONT_WEIGHT() { return getToken(Jinja2withHTMLandCSSParser.FONT_WEIGHT, 0); }
		public TerminalNode BORDER() { return getToken(Jinja2withHTMLandCSSParser.BORDER, 0); }
		public TerminalNode BORDER_RADIUS() { return getToken(Jinja2withHTMLandCSSParser.BORDER_RADIUS, 0); }
		public TerminalNode BOX_SHADOW() { return getToken(Jinja2withHTMLandCSSParser.BOX_SHADOW, 0); }
		public TerminalNode TEXT_DECORATION() { return getToken(Jinja2withHTMLandCSSParser.TEXT_DECORATION, 0); }
		public TerminalNode CURSOR() { return getToken(Jinja2withHTMLandCSSParser.CURSOR, 0); }
		public TerminalNode TRANSFORM() { return getToken(Jinja2withHTMLandCSSParser.TRANSFORM, 0); }
		public TerminalNode FLEX_DIRECTION() { return getToken(Jinja2withHTMLandCSSParser.FLEX_DIRECTION, 0); }
		public CssPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterCssProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitCssProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitCssProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssPropertyContext cssProperty() throws RecognitionException {
		CssPropertyContext _localctx = new CssPropertyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cssProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & 67108863L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueContext extends ParserRuleContext {
		public List<CssValueAtomContext> cssValueAtom() {
			return getRuleContexts(CssValueAtomContext.class);
		}
		public CssValueAtomContext cssValueAtom(int i) {
			return getRuleContext(CssValueAtomContext.class,i);
		}
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitCssValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cssValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(232);
				cssValueAtom();
				}
				}
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 237639L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueAtomContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(Jinja2withHTMLandCSSParser.NUMBER, 0); }
		public TerminalNode CSS_UNIT() { return getToken(Jinja2withHTMLandCSSParser.CSS_UNIT, 0); }
		public TerminalNode CSS_COLOR() { return getToken(Jinja2withHTMLandCSSParser.CSS_COLOR, 0); }
		public TerminalNode IDDEFINER() { return getToken(Jinja2withHTMLandCSSParser.IDDEFINER, 0); }
		public TerminalNode COMMA() { return getToken(Jinja2withHTMLandCSSParser.COMMA, 0); }
		public TerminalNode LPAREN() { return getToken(Jinja2withHTMLandCSSParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Jinja2withHTMLandCSSParser.RPAREN, 0); }
		public TerminalNode MINUS() { return getToken(Jinja2withHTMLandCSSParser.MINUS, 0); }
		public CssValueAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValueAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).enterCssValueAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2withHTMLandCSSParserListener ) ((Jinja2withHTMLandCSSParserListener)listener).exitCssValueAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2withHTMLandCSSParserVisitor ) return ((Jinja2withHTMLandCSSParserVisitor<? extends T>)visitor).visitCssValueAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueAtomContext cssValueAtom() throws RecognitionException {
		CssValueAtomContext _localctx = new CssValueAtomContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cssValueAtom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 237639L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001`\u00f0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0003\u0000?\b\u0000\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0001\u0004"+
		"\u0001E\b\u0001\u000b\u0001\f\u0001F\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"Q\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004U\b\u0004\n\u0004\f\u0004"+
		"X\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005_\b\u0005\n\u0005\f\u0005b\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0005\bo\b\b\n\b\f\br\t\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n}\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0087\b\r\u0001\u000e\u0004\u000e\u008a\b\u000e\u000b\u000e\f\u000e"+
		"\u008b\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0097\b\u0010\n"+
		"\u0010\f\u0010\u009a\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00a3\b\u0011\n"+
		"\u0011\f\u0011\u00a6\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0004\u0012\u00ad\b\u0012\u000b\u0012\f\u0012\u00ae"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00b6\b\u0013\n\u0013\f\u0013\u00b9\t\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00c0\b\u0014\n\u0014\f\u0014"+
		"\u00c3\t\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u00c7\b\u0015\n\u0015"+
		"\f\u0015\u00ca\t\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00ce\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u00d2\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u00d6\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u00de\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0004\u001c\u00ea\b\u001c\u000b\u001c\f\u001c"+
		"\u00eb\u0001\u001d\u0001\u001d\u0001\u001d\u0000\u0000\u001e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:\u0000\u0007\u0005\u0000\u0004\u0006\b\b\n\u0012\u0014"+
		"\u0014\u0016\u001b\u0001\u0000KL\u0004\u0000\u0007\u0007\t\t\u0013\u0013"+
		"\u0015\u0015\u0001\u0000\u001c\'\u0003\u0000MMPR``\u0001\u0000(A\u0004"+
		"\u0000OQUU\\\\^`\u00ea\u0000>\u0001\u0000\u0000\u0000\u0002A\u0001\u0000"+
		"\u0000\u0000\u0004H\u0001\u0000\u0000\u0000\u0006P\u0001\u0000\u0000\u0000"+
		"\bR\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000\u0000\fe\u0001\u0000"+
		"\u0000\u0000\u000ei\u0001\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000"+
		"\u0012u\u0001\u0000\u0000\u0000\u0014|\u0001\u0000\u0000\u0000\u0016~"+
		"\u0001\u0000\u0000\u0000\u0018\u0080\u0001\u0000\u0000\u0000\u001a\u0086"+
		"\u0001\u0000\u0000\u0000\u001c\u0089\u0001\u0000\u0000\u0000\u001e\u008d"+
		"\u0001\u0000\u0000\u0000 \u0093\u0001\u0000\u0000\u0000\"\u009b\u0001"+
		"\u0000\u0000\u0000$\u00ac\u0001\u0000\u0000\u0000&\u00b2\u0001\u0000\u0000"+
		"\u0000(\u00bc\u0001\u0000\u0000\u0000*\u00c4\u0001\u0000\u0000\u0000,"+
		"\u00d1\u0001\u0000\u0000\u0000.\u00d5\u0001\u0000\u0000\u00000\u00dd\u0001"+
		"\u0000\u0000\u00002\u00df\u0001\u0000\u0000\u00004\u00e1\u0001\u0000\u0000"+
		"\u00006\u00e6\u0001\u0000\u0000\u00008\u00e9\u0001\u0000\u0000\u0000:"+
		"\u00ed\u0001\u0000\u0000\u0000<?\u0003\u0002\u0001\u0000=?\u0003$\u0012"+
		"\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?\u0001\u0001"+
		"\u0000\u0000\u0000@B\u0003\u0004\u0002\u0000A@\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CE\u0003\u0006\u0003"+
		"\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000G\u0003\u0001\u0000\u0000\u0000"+
		"HI\u0005I\u0000\u0000IJ\u0005H\u0000\u0000JK\u0005\u0003\u0000\u0000K"+
		"L\u0005\u0004\u0000\u0000LM\u0005K\u0000\u0000M\u0005\u0001\u0000\u0000"+
		"\u0000NQ\u0003\b\u0004\u0000OQ\u0003\u0010\b\u0000PN\u0001\u0000\u0000"+
		"\u0000PO\u0001\u0000\u0000\u0000Q\u0007\u0001\u0000\u0000\u0000RV\u0003"+
		"\n\u0005\u0000SU\u0003\u001a\r\u0000TS\u0001\u0000\u0000\u0000UX\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0003\f\u0006\u0000"+
		"Z\t\u0001\u0000\u0000\u0000[\\\u0005I\u0000\u0000\\`\u0003\u000e\u0007"+
		"\u0000]_\u0003\u0014\n\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000cd\u0005K\u0000\u0000d\u000b\u0001"+
		"\u0000\u0000\u0000ef\u0005J\u0000\u0000fg\u0003\u000e\u0007\u0000gh\u0005"+
		"K\u0000\u0000h\r\u0001\u0000\u0000\u0000ij\u0007\u0000\u0000\u0000j\u000f"+
		"\u0001\u0000\u0000\u0000kl\u0005I\u0000\u0000lp\u0003\u0012\t\u0000mo"+
		"\u0003\u0014\n\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000st\u0007\u0001\u0000\u0000t\u0011\u0001"+
		"\u0000\u0000\u0000uv\u0007\u0002\u0000\u0000v\u0013\u0001\u0000\u0000"+
		"\u0000wx\u0003\u0016\u000b\u0000xy\u0005G\u0000\u0000yz\u0003\u0018\f"+
		"\u0000z}\u0001\u0000\u0000\u0000{}\u0003\u0016\u000b\u0000|w\u0001\u0000"+
		"\u0000\u0000|{\u0001\u0000\u0000\u0000}\u0015\u0001\u0000\u0000\u0000"+
		"~\u007f\u0007\u0003\u0000\u0000\u007f\u0017\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0005[\u0000\u0000\u0081\u0019\u0001\u0000\u0000\u0000\u0082\u0087"+
		"\u0003\u001c\u000e\u0000\u0083\u0087\u0003\u0006\u0003\u0000\u0084\u0087"+
		"\u0003\u001e\u000f\u0000\u0085\u0087\u0003\"\u0011\u0000\u0086\u0082\u0001"+
		"\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u001b\u0001"+
		"\u0000\u0000\u0000\u0088\u008a\u0007\u0004\u0000\u0000\u0089\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u001d\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0005C\u0000\u0000\u008e\u008f\u0005C\u0000"+
		"\u0000\u008f\u0090\u0003 \u0010\u0000\u0090\u0091\u0005D\u0000\u0000\u0091"+
		"\u0092\u0005D\u0000\u0000\u0092\u001f\u0001\u0000\u0000\u0000\u0093\u0098"+
		"\u0005`\u0000\u0000\u0094\u0095\u0005R\u0000\u0000\u0095\u0097\u0005`"+
		"\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099!\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0005E\u0000\u0000\u009c\u009d\u0005X\u0000\u0000\u009d"+
		"\u009e\u0005`\u0000\u0000\u009e\u009f\u0005Z\u0000\u0000\u009f\u00a0\u0005"+
		"`\u0000\u0000\u00a0\u00a4\u0005F\u0000\u0000\u00a1\u00a3\u0003\u001a\r"+
		"\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0005E\u0000\u0000\u00a8\u00a9\u0005Y\u0000\u0000\u00a9"+
		"\u00aa\u0005F\u0000\u0000\u00aa#\u0001\u0000\u0000\u0000\u00ab\u00ad\u0003"+
		"&\u0013\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0000"+
		"\u0000\u0001\u00b1%\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003(\u0014\u0000"+
		"\u00b3\u00b7\u0005C\u0000\u0000\u00b4\u00b6\u00034\u001a\u0000\u00b5\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00ba"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0005D\u0000\u0000\u00bb\'\u0001\u0000\u0000\u0000\u00bc\u00c1\u0003"+
		"*\u0015\u0000\u00bd\u00be\u0005O\u0000\u0000\u00be\u00c0\u0003*\u0015"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c2)\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c8\u00030\u0018\u0000\u00c5\u00c7\u00030\u0018\u0000\u00c6\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cd"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0005M\u0000\u0000\u00cc\u00ce\u00032\u0019\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce+\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d2\u0003\u000e\u0007\u0000\u00d0\u00d2\u0003\u0012\t\u0000"+
		"\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d2-\u0001\u0000\u0000\u0000\u00d3\u00d6\u0005`\u0000\u0000\u00d4\u00d6"+
		"\u0003,\u0016\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6/\u0001\u0000\u0000\u0000\u00d7\u00de\u0003.\u0017"+
		"\u0000\u00d8\u00de\u0005`\u0000\u0000\u00d9\u00da\u0005R\u0000\u0000\u00da"+
		"\u00de\u0003.\u0017\u0000\u00db\u00dc\u0005S\u0000\u0000\u00dc\u00de\u0005"+
		"`\u0000\u0000\u00dd\u00d7\u0001\u0000\u0000\u0000\u00dd\u00d8\u0001\u0000"+
		"\u0000\u0000\u00dd\u00d9\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000"+
		"\u0000\u0000\u00de1\u0001\u0000\u0000\u0000\u00df\u00e0\u0005B\u0000\u0000"+
		"\u00e03\u0001\u0000\u0000\u0000\u00e1\u00e2\u00036\u001b\u0000\u00e2\u00e3"+
		"\u0005M\u0000\u0000\u00e3\u00e4\u00038\u001c\u0000\u00e4\u00e5\u0005N"+
		"\u0000\u0000\u00e55\u0001\u0000\u0000\u0000\u00e6\u00e7\u0007\u0005\u0000"+
		"\u0000\u00e77\u0001\u0000\u0000\u0000\u00e8\u00ea\u0003:\u001d\u0000\u00e9"+
		"\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec"+
		"9\u0001\u0000\u0000\u0000\u00ed\u00ee\u0007\u0006\u0000\u0000\u00ee;\u0001"+
		"\u0000\u0000\u0000\u0015>AFPV`p|\u0086\u008b\u0098\u00a4\u00ae\u00b7\u00c1"+
		"\u00c8\u00cd\u00d1\u00d5\u00dd\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
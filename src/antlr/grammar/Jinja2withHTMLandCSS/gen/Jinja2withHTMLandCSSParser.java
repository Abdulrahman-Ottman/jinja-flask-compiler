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
		STEP_ATT=38, REQUIRED_ATT=39, LCURLY=40, RCURLY=41, BLOCK_START=42, BLOCK_END=43, 
		ASSIGN=44, NOT=45, OPEN_TAG=46, OPEN_TAG_SLASH=47, CLOSE_TAG=48, SELF_CLOSD=49, 
		COLON=50, LPAREN=51, RPAREN=52, DOT=53, PLUS=54, MINUS=55, STAR=56, DIVISION=57, 
		PERCENT=58, FOR=59, END_FOR=60, IN=61, STRING=62, NUMBER=63, BOOL=64, 
		IDDEFINER=65;
	public static final int
		RULE_prog = 0, RULE_jinja2Prog = 1, RULE_doctype = 2, RULE_htmlelement = 3, 
		RULE_openCloseTag = 4, RULE_startTag = 5, RULE_endTag = 6, RULE_tagName = 7, 
		RULE_selfClosingTag = 8, RULE_voidTagName = 9, RULE_attribute = 10, RULE_attributeName = 11, 
		RULE_attributeValue = 12, RULE_elementContent = 13, RULE_statement = 14, 
		RULE_expression = 15, RULE_memberAccess = 16, RULE_block = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "jinja2Prog", "doctype", "htmlelement", "openCloseTag", "startTag", 
			"endTag", "tagName", "selfClosingTag", "voidTagName", "attribute", "attributeName", 
			"attributeValue", "elementContent", "statement", "expression", "memberAccess", 
			"block"
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
			"'step'", "'required'", "'{'", "'}'", "'{%'", "'%}'", "'='", "'!'", "'<'", 
			"'</'", "'>'", "'/>'", "':'", "'('", "')'", "'.'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'for'", "'endfor'", "'in'"
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
			"REQUIRED_ATT", "LCURLY", "RCURLY", "BLOCK_START", "BLOCK_END", "ASSIGN", 
			"NOT", "OPEN_TAG", "OPEN_TAG_SLASH", "CLOSE_TAG", "SELF_CLOSD", "COLON", 
			"LPAREN", "RPAREN", "DOT", "PLUS", "MINUS", "STAR", "DIVISION", "PERCENT", 
			"FOR", "END_FOR", "IN", "STRING", "NUMBER", "BOOL", "IDDEFINER"
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
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			jinja2Prog();
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
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(38);
				doctype();
				}
				break;
			}
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				htmlelement();
				}
				}
				setState(44); 
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
			setState(46);
			match(OPEN_TAG);
			setState(47);
			match(NOT);
			setState(48);
			match(DOCTYPE_TAG);
			setState(49);
			match(HTML_TAG);
			setState(50);
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
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				openCloseTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
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
			setState(56);
			startTag();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & 33569861L) != 0)) {
				{
				{
				setState(57);
				elementContent();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
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
			setState(65);
			match(OPEN_TAG);
			setState(66);
			tagName();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099243192320L) != 0)) {
				{
				{
				setState(67);
				attribute();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
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
			setState(75);
			match(OPEN_TAG_SLASH);
			setState(76);
			tagName();
			setState(77);
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
			setState(79);
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
			setState(81);
			match(OPEN_TAG);
			setState(82);
			voidTagName();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099243192320L) != 0)) {
				{
				{
				setState(83);
				attribute();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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
			setState(91);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				attributeName();
				setState(94);
				match(ASSIGN);
				setState(95);
				attributeValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
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
			setState(100);
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
			setState(102);
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
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
			case LPAREN:
			case RPAREN:
			case DOT:
			case IDDEFINER:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				statement();
				}
				break;
			case OPEN_TAG:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				htmlelement();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				expression();
				}
				break;
			case BLOCK_START:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
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
			setState(111); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(110);
					_la = _input.LA(1);
					if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 32783L) != 0)) ) {
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
				setState(113); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			setState(115);
			match(LCURLY);
			setState(116);
			match(LCURLY);
			setState(117);
			memberAccess();
			setState(118);
			match(RCURLY);
			setState(119);
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
			setState(121);
			match(IDDEFINER);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(122);
				match(DOT);
				setState(123);
				match(IDDEFINER);
				}
				}
				setState(128);
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
			setState(129);
			match(BLOCK_START);
			setState(130);
			match(FOR);
			setState(131);
			match(IDDEFINER);
			setState(132);
			match(IN);
			setState(133);
			match(IDDEFINER);
			setState(134);
			match(BLOCK_END);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					elementContent();
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(141);
			match(BLOCK_START);
			setState(142);
			match(END_FOR);
			setState(143);
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

	public static final String _serializedATN =
		"\u0004\u0001A\u0092\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0001\u0004\u0001+\b\u0001\u000b"+
		"\u0001\f\u0001,\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u00037\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0005\u0004;\b\u0004\n\u0004\f\u0004>\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005E\b"+
		"\u0005\n\u0005\f\u0005H\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0005\bU\b\b\n\b\f\bX\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nc\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\rm\b\r\u0001\u000e"+
		"\u0004\u000ep\b\u000e\u000b\u000e\f\u000eq\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010}\b\u0010\n\u0010\f\u0010\u0080\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u0089\b\u0011\n\u0011\f\u0011\u008c\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"\u0000\u0005\u0005\u0000\u0004\u0006\b\b\n\u0012\u0014\u0014\u0016"+
		"\u001b\u0001\u000001\u0004\u0000\u0007\u0007\t\t\u0013\u0013\u0015\u0015"+
		"\u0001\u0000\u001c\'\u0002\u000025AA\u008c\u0000$\u0001\u0000\u0000\u0000"+
		"\u0002\'\u0001\u0000\u0000\u0000\u0004.\u0001\u0000\u0000\u0000\u0006"+
		"6\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\nA\u0001\u0000\u0000"+
		"\u0000\fK\u0001\u0000\u0000\u0000\u000eO\u0001\u0000\u0000\u0000\u0010"+
		"Q\u0001\u0000\u0000\u0000\u0012[\u0001\u0000\u0000\u0000\u0014b\u0001"+
		"\u0000\u0000\u0000\u0016d\u0001\u0000\u0000\u0000\u0018f\u0001\u0000\u0000"+
		"\u0000\u001al\u0001\u0000\u0000\u0000\u001co\u0001\u0000\u0000\u0000\u001e"+
		"s\u0001\u0000\u0000\u0000 y\u0001\u0000\u0000\u0000\"\u0081\u0001\u0000"+
		"\u0000\u0000$%\u0003\u0002\u0001\u0000%\u0001\u0001\u0000\u0000\u0000"+
		"&(\u0003\u0004\u0002\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000"+
		"\u0000(*\u0001\u0000\u0000\u0000)+\u0003\u0006\u0003\u0000*)\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-\u0003\u0001\u0000\u0000\u0000./\u0005.\u0000\u0000"+
		"/0\u0005-\u0000\u000001\u0005\u0003\u0000\u000012\u0005\u0004\u0000\u0000"+
		"23\u00050\u0000\u00003\u0005\u0001\u0000\u0000\u000047\u0003\b\u0004\u0000"+
		"57\u0003\u0010\b\u000064\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u0000"+
		"7\u0007\u0001\u0000\u0000\u00008<\u0003\n\u0005\u00009;\u0003\u001a\r"+
		"\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000?@\u0003\f\u0006\u0000@\t\u0001\u0000\u0000\u0000AB"+
		"\u0005.\u0000\u0000BF\u0003\u000e\u0007\u0000CE\u0003\u0014\n\u0000DC"+
		"\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000IJ\u00050\u0000\u0000J\u000b\u0001\u0000\u0000\u0000KL\u0005"+
		"/\u0000\u0000LM\u0003\u000e\u0007\u0000MN\u00050\u0000\u0000N\r\u0001"+
		"\u0000\u0000\u0000OP\u0007\u0000\u0000\u0000P\u000f\u0001\u0000\u0000"+
		"\u0000QR\u0005.\u0000\u0000RV\u0003\u0012\t\u0000SU\u0003\u0014\n\u0000"+
		"TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"+
		"\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000"+
		"\u0000\u0000YZ\u0007\u0001\u0000\u0000Z\u0011\u0001\u0000\u0000\u0000"+
		"[\\\u0007\u0002\u0000\u0000\\\u0013\u0001\u0000\u0000\u0000]^\u0003\u0016"+
		"\u000b\u0000^_\u0005,\u0000\u0000_`\u0003\u0018\f\u0000`c\u0001\u0000"+
		"\u0000\u0000ac\u0003\u0016\u000b\u0000b]\u0001\u0000\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000c\u0015\u0001\u0000\u0000\u0000de\u0007\u0003\u0000"+
		"\u0000e\u0017\u0001\u0000\u0000\u0000fg\u0005>\u0000\u0000g\u0019\u0001"+
		"\u0000\u0000\u0000hm\u0003\u001c\u000e\u0000im\u0003\u0006\u0003\u0000"+
		"jm\u0003\u001e\u000f\u0000km\u0003\"\u0011\u0000lh\u0001\u0000\u0000\u0000"+
		"li\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000"+
		"\u0000m\u001b\u0001\u0000\u0000\u0000np\u0007\u0004\u0000\u0000on\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000r\u001d\u0001\u0000\u0000\u0000st\u0005(\u0000"+
		"\u0000tu\u0005(\u0000\u0000uv\u0003 \u0010\u0000vw\u0005)\u0000\u0000"+
		"wx\u0005)\u0000\u0000x\u001f\u0001\u0000\u0000\u0000y~\u0005A\u0000\u0000"+
		"z{\u00055\u0000\u0000{}\u0005A\u0000\u0000|z\u0001\u0000\u0000\u0000}"+
		"\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001"+
		"\u0000\u0000\u0000\u007f!\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005*\u0000\u0000\u0082\u0083\u0005;\u0000\u0000\u0083"+
		"\u0084\u0005A\u0000\u0000\u0084\u0085\u0005=\u0000\u0000\u0085\u0086\u0005"+
		"A\u0000\u0000\u0086\u008a\u0005+\u0000\u0000\u0087\u0089\u0003\u001a\r"+
		"\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005*\u0000\u0000\u008e\u008f\u0005<\u0000\u0000\u008f"+
		"\u0090\u0005+\u0000\u0000\u0090#\u0001\u0000\u0000\u0000\u000b\',6<FV"+
		"blq~\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
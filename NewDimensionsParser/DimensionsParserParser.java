// Generated from DimensionsParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DimensionsParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NAMEOFDIM=7, UNITS=8, 
		WHITESPACE=9;
	public static final int
		RULE_file = 0, RULE_dimensions = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "dimensions"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "';'", "'='", "'/'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NAMEOFDIM", "UNITS", "WHITESPACE"
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
	public String getGrammarFileName() { return "DimensionsParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DimensionsParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DimensionsParserParser.EOF, 0); }
		public List<DimensionsContext> dimensions() {
			return getRuleContexts(DimensionsContext.class);
		}
		public DimensionsContext dimensions(int i) {
			return getRuleContext(DimensionsContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsParserListener ) ((DimensionsParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsParserListener ) ((DimensionsParserListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimensionsParserVisitor ) return ((DimensionsParserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAMEOFDIM) {
				{
				{
				setState(4);
				dimensions();
				}
				}
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(10);
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

	public static class DimensionsContext extends ParserRuleContext {
		public DimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensions; }
	 
		public DimensionsContext() { }
		public void copyFrom(DimensionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EnterDependentDimMulContext extends DimensionsContext {
		public Token e1;
		public Token e2;
		public Token e3;
		public List<TerminalNode> NAMEOFDIM() { return getTokens(DimensionsParserParser.NAMEOFDIM); }
		public TerminalNode NAMEOFDIM(int i) {
			return getToken(DimensionsParserParser.NAMEOFDIM, i);
		}
		public EnterDependentDimMulContext(DimensionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsParserListener ) ((DimensionsParserListener)listener).enterEnterDependentDimMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsParserListener ) ((DimensionsParserListener)listener).exitEnterDependentDimMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimensionsParserVisitor ) return ((DimensionsParserVisitor<? extends T>)visitor).visitEnterDependentDimMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnterDependentDimDivContext extends DimensionsContext {
		public Token e1;
		public Token e2;
		public Token e3;
		public List<TerminalNode> NAMEOFDIM() { return getTokens(DimensionsParserParser.NAMEOFDIM); }
		public TerminalNode NAMEOFDIM(int i) {
			return getToken(DimensionsParserParser.NAMEOFDIM, i);
		}
		public EnterDependentDimDivContext(DimensionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsParserListener ) ((DimensionsParserListener)listener).enterEnterDependentDimDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsParserListener ) ((DimensionsParserListener)listener).exitEnterDependentDimDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimensionsParserVisitor ) return ((DimensionsParserVisitor<? extends T>)visitor).visitEnterDependentDimDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnterIndepentDimContext extends DimensionsContext {
		public TerminalNode NAMEOFDIM() { return getToken(DimensionsParserParser.NAMEOFDIM, 0); }
		public TerminalNode UNITS() { return getToken(DimensionsParserParser.UNITS, 0); }
		public EnterIndepentDimContext(DimensionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsParserListener ) ((DimensionsParserListener)listener).enterEnterIndepentDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsParserListener ) ((DimensionsParserListener)listener).exitEnterIndepentDim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimensionsParserVisitor ) return ((DimensionsParserVisitor<? extends T>)visitor).visitEnterIndepentDim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionsContext dimensions() throws RecognitionException {
		DimensionsContext _localctx = new DimensionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dimensions);
		try {
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new EnterIndepentDimContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(NAMEOFDIM);
				setState(13);
				match(T__0);
				setState(14);
				match(UNITS);
				setState(15);
				match(T__1);
				setState(16);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new EnterDependentDimDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				((EnterDependentDimDivContext)_localctx).e1 = match(NAMEOFDIM);
				setState(18);
				match(T__3);
				setState(19);
				((EnterDependentDimDivContext)_localctx).e2 = match(NAMEOFDIM);
				setState(20);
				match(T__4);
				setState(21);
				((EnterDependentDimDivContext)_localctx).e3 = match(NAMEOFDIM);
				setState(22);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new EnterDependentDimMulContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				((EnterDependentDimMulContext)_localctx).e1 = match(NAMEOFDIM);
				setState(24);
				match(T__3);
				setState(25);
				((EnterDependentDimMulContext)_localctx).e2 = match(NAMEOFDIM);
				setState(26);
				match(T__5);
				setState(27);
				((EnterDependentDimMulContext)_localctx).e3 = match(NAMEOFDIM);
				setState(28);
				match(T__2);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\"\4\2\t\2\4\3"+
		"\t\3\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\3\2\2\4\2\4\2\2"+
		"\2\"\2\t\3\2\2\2\4\37\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\13\3\2\2\2\t\7"+
		"\3\2\2\2\t\n\3\2\2\2\n\f\3\2\2\2\13\t\3\2\2\2\f\r\7\2\2\3\r\3\3\2\2\2"+
		"\16\17\7\t\2\2\17\20\7\3\2\2\20\21\7\n\2\2\21\22\7\4\2\2\22 \7\5\2\2\23"+
		"\24\7\t\2\2\24\25\7\6\2\2\25\26\7\t\2\2\26\27\7\7\2\2\27\30\7\t\2\2\30"+
		" \7\5\2\2\31\32\7\t\2\2\32\33\7\6\2\2\33\34\7\t\2\2\34\35\7\b\2\2\35\36"+
		"\7\t\2\2\36 \7\5\2\2\37\16\3\2\2\2\37\23\3\2\2\2\37\31\3\2\2\2 \5\3\2"+
		"\2\2\4\t\37";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
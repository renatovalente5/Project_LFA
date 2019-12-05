// Generated from /home/renato/Desktop/2ano_2semestre/Projeto_LFA/SourceLanguage.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SourceLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, TYPENAME=11, VARNAME=12, INTEGER=13, DOUBLE=14, WHITESPACE=15, 
		ERROR=16;
	public static final int
		RULE_main = 0, RULE_instruction = 1, RULE_declaration = 2, RULE_type = 3, 
		RULE_assignment = 4, RULE_print = 5, RULE_expression = 6;
	public static final String[] ruleNames = {
		"main", "instruction", "declaration", "type", "assignment", "print", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'integer'", "'double'", "'='", "'print'", "'('", "')'", "'+'", 
		"'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "TYPENAME", 
		"VARNAME", "INTEGER", "DOUBLE", "WHITESPACE", "ERROR"
	};
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
	public String getGrammarFileName() { return "SourceLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SourceLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SourceLanguageParser.EOF, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << TYPENAME) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(14);
				instruction();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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

	public static class InstructionContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case TYPENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				declaration();
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				assignment();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				print();
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(SourceLanguageParser.VARNAME, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			type();
			setState(28);
			match(VARNAME);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerTypeContext extends TypeContext {
		public IntegerTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class DoubleTypeContext extends TypeContext {
		public DoubleTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class NewTypeContext extends TypeContext {
		public TerminalNode TYPENAME() { return getToken(SourceLanguageParser.TYPENAME, 0); }
		public NewTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(T__0);
				}
				break;
			case T__1:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(T__1);
				}
				break;
			case TYPENAME:
				_localctx = new NewTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(TYPENAME);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(SourceLanguageParser.VARNAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(VARNAME);
			setState(36);
			match(T__2);
			setState(37);
			expression(0);
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

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintVariableContext extends PrintContext {
		public TerminalNode VARNAME() { return getToken(SourceLanguageParser.VARNAME, 0); }
		public PrintVariableContext(PrintContext ctx) { copyFrom(ctx); }
	}
	public static class PrintExpressionContext extends PrintContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintExpressionContext(PrintContext ctx) { copyFrom(ctx); }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new PrintExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(T__3);
				setState(40);
				match(T__4);
				setState(41);
				expression(0);
				setState(42);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new PrintVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(T__3);
				setState(45);
				match(T__4);
				setState(46);
				match(VARNAME);
				setState(47);
				match(T__5);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionDoubleContext extends ExpressionContext {
		public TerminalNode DOUBLE() { return getToken(SourceLanguageParser.DOUBLE, 0); }
		public ExpressionDoubleContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExpressionMulDivContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionMulDivContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExpressionSignalContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionSignalContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExpressionIntegerContext extends ExpressionContext {
		public TerminalNode INTEGER() { return getToken(SourceLanguageParser.INTEGER, 0); }
		public ExpressionIntegerContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExpressionAddSubContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionAddSubContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
				{
				_localctx = new ExpressionSignalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51);
				((ExpressionSignalContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
					((ExpressionSignalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(52);
				expression(5);
				}
				break;
			case DOUBLE:
				{
				_localctx = new ExpressionDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(DOUBLE);
				}
				break;
			case INTEGER:
				{
				_localctx = new ExpressionIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(INTEGER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(63);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionMulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(57);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(58);
						((ExpressionMulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__9) ) {
							((ExpressionMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(59);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionAddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(60);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(61);
						((ExpressionAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
							((ExpressionAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(62);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22G\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\5\3\5\3\5\5\5$\n\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\63\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\5\b:\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bB\n\b\f\b\16\bE\13"+
		"\b\3\b\2\3\16\t\2\4\6\b\n\f\16\2\4\3\2\t\n\3\2\13\f\2I\2\23\3\2\2\2\4"+
		"\33\3\2\2\2\6\35\3\2\2\2\b#\3\2\2\2\n%\3\2\2\2\f\62\3\2\2\2\169\3\2\2"+
		"\2\20\22\5\4\3\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2"+
		"\2\24\26\3\2\2\2\25\23\3\2\2\2\26\27\7\2\2\3\27\3\3\2\2\2\30\34\5\6\4"+
		"\2\31\34\5\n\6\2\32\34\5\f\7\2\33\30\3\2\2\2\33\31\3\2\2\2\33\32\3\2\2"+
		"\2\34\5\3\2\2\2\35\36\5\b\5\2\36\37\7\16\2\2\37\7\3\2\2\2 $\7\3\2\2!$"+
		"\7\4\2\2\"$\7\r\2\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$\t\3\2\2\2%&\7\16\2"+
		"\2&\'\7\5\2\2\'(\5\16\b\2(\13\3\2\2\2)*\7\6\2\2*+\7\7\2\2+,\5\16\b\2,"+
		"-\7\b\2\2-\63\3\2\2\2./\7\6\2\2/\60\7\7\2\2\60\61\7\16\2\2\61\63\7\b\2"+
		"\2\62)\3\2\2\2\62.\3\2\2\2\63\r\3\2\2\2\64\65\b\b\1\2\65\66\t\2\2\2\66"+
		":\5\16\b\7\67:\7\20\2\28:\7\17\2\29\64\3\2\2\29\67\3\2\2\298\3\2\2\2:"+
		"C\3\2\2\2;<\f\6\2\2<=\t\3\2\2=B\5\16\b\7>?\f\5\2\2?@\t\2\2\2@B\5\16\b"+
		"\6A;\3\2\2\2A>\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\17\3\2\2\2EC\3\2"+
		"\2\2\t\23\33#\629AC";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
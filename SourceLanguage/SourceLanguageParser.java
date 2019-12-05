// Generated from SourceLanguage.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, TYPENAME=12, VARNAME=13, INTEGER=14, DOUBLE=15, WHITESPACE=16, 
		ERROR=17;
	public static final int
		RULE_main = 0, RULE_instruction = 1, RULE_declaration = 2, RULE_assignment = 3, 
		RULE_print = 4, RULE_expression = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "instruction", "declaration", "assignment", "print", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'Integer'", "'Double'", "'='", "'print'", "'('", "')'", 
			"'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"TYPENAME", "VARNAME", "INTEGER", "DOUBLE", "WHITESPACE", "ERROR"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << TYPENAME) | (1L << VARNAME) | (1L << INTEGER) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(12);
				instruction();
				setState(13);
				match(T__0);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				expression(0);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerTypeContext extends DeclarationContext {
		public TerminalNode VARNAME() { return getToken(SourceLanguageParser.VARNAME, 0); }
		public IntegerTypeContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitIntegerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitIntegerType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleTypeContext extends DeclarationContext {
		public TerminalNode VARNAME() { return getToken(SourceLanguageParser.VARNAME, 0); }
		public DoubleTypeContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitDoubleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewTypeContext extends DeclarationContext {
		public TerminalNode TYPENAME() { return getToken(SourceLanguageParser.TYPENAME, 0); }
		public TerminalNode VARNAME() { return getToken(SourceLanguageParser.VARNAME, 0); }
		public NewTypeContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterNewType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitNewType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitNewType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(T__1);
				setState(29);
				match(VARNAME);
				}
				break;
			case T__2:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(T__2);
				setState(31);
				match(VARNAME);
				}
				break;
			case TYPENAME:
				_localctx = new NewTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(TYPENAME);
				setState(33);
				match(VARNAME);
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
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignVariableContext extends AssignmentContext {
		public TerminalNode VARNAME() { return getToken(SourceLanguageParser.VARNAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignVariableContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterAssignVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitAssignVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitAssignVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignDeclarationContext extends AssignmentContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignDeclarationContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterAssignDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitAssignDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitAssignDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case TYPENAME:
				_localctx = new AssignDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				declaration();
				setState(37);
				match(T__3);
				setState(38);
				expression(0);
				}
				break;
			case VARNAME:
				_localctx = new AssignVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(VARNAME);
				setState(41);
				match(T__3);
				setState(42);
				expression(0);
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
	public static class PrintExpressionContext extends PrintContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintExpressionContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterPrintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitPrintExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitPrintExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			_localctx = new PrintExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__4);
			setState(46);
			match(T__5);
			setState(47);
			expression(0);
			setState(48);
			match(T__6);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterExpressionDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitExpressionDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitExpressionDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionMulDivContext extends ExpressionContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionMulDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterExpressionMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitExpressionMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitExpressionMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionSignalContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionSignalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterExpressionSignal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitExpressionSignal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitExpressionSignal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionIntegerContext extends ExpressionContext {
		public TerminalNode INTEGER() { return getToken(SourceLanguageParser.INTEGER, 0); }
		public ExpressionIntegerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterExpressionInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitExpressionInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitExpressionInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionVariableContext extends ExpressionContext {
		public TerminalNode VARNAME() { return getToken(SourceLanguageParser.VARNAME, 0); }
		public ExpressionVariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterExpressionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitExpressionVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitExpressionVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionAddSubContext extends ExpressionContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionAddSubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).enterExpressionAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourceLanguageListener ) ((SourceLanguageListener)listener).exitExpressionAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SourceLanguageVisitor ) return ((SourceLanguageVisitor<? extends T>)visitor).visitExpressionAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				{
				_localctx = new ExpressionSignalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51);
				((ExpressionSignalContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
					((ExpressionSignalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(52);
				expression(6);
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
			case VARNAME:
				{
				_localctx = new ExpressionVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(VARNAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(64);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionMulDivContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionMulDivContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(58);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(59);
						((ExpressionMulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
							((ExpressionMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(60);
						((ExpressionMulDivContext)_localctx).e2 = expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionAddSubContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionAddSubContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(61);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(62);
						((ExpressionAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
							((ExpressionAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(63);
						((ExpressionAddSubContext)_localctx).e2 = expression(5);
						}
						break;
					}
					} 
				}
				setState(68);
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
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23H\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4%"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5.\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7;\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7C\n\7\f\7\16\7F\13"+
		"\7\3\7\2\3\f\b\2\4\6\b\n\f\2\4\3\2\n\13\3\2\f\r\2M\2\23\3\2\2\2\4\34\3"+
		"\2\2\2\6$\3\2\2\2\b-\3\2\2\2\n/\3\2\2\2\f:\3\2\2\2\16\17\5\4\3\2\17\20"+
		"\7\3\2\2\20\22\3\2\2\2\21\16\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24"+
		"\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2\26\27\7\2\2\3\27\3\3\2\2\2\30\35"+
		"\5\6\4\2\31\35\5\b\5\2\32\35\5\n\6\2\33\35\5\f\7\2\34\30\3\2\2\2\34\31"+
		"\3\2\2\2\34\32\3\2\2\2\34\33\3\2\2\2\35\5\3\2\2\2\36\37\7\4\2\2\37%\7"+
		"\17\2\2 !\7\5\2\2!%\7\17\2\2\"#\7\16\2\2#%\7\17\2\2$\36\3\2\2\2$ \3\2"+
		"\2\2$\"\3\2\2\2%\7\3\2\2\2&\'\5\6\4\2\'(\7\6\2\2()\5\f\7\2).\3\2\2\2*"+
		"+\7\17\2\2+,\7\6\2\2,.\5\f\7\2-&\3\2\2\2-*\3\2\2\2.\t\3\2\2\2/\60\7\7"+
		"\2\2\60\61\7\b\2\2\61\62\5\f\7\2\62\63\7\t\2\2\63\13\3\2\2\2\64\65\b\7"+
		"\1\2\65\66\t\2\2\2\66;\5\f\7\b\67;\7\21\2\28;\7\20\2\29;\7\17\2\2:\64"+
		"\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;D\3\2\2\2<=\f\7\2\2=>\t\3\2\2"+
		">C\5\f\7\b?@\f\6\2\2@A\t\2\2\2AC\5\f\7\7B<\3\2\2\2B?\3\2\2\2CF\3\2\2\2"+
		"DB\3\2\2\2DE\3\2\2\2E\r\3\2\2\2FD\3\2\2\2\t\23\34$-:BD";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
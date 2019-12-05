// Generated from /home/renato/Desktop/2ano_2semestre/Projeto_LFA/SourceLanguage/SourceLanguage.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SourceLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, TYPENAME=12, VARNAME=13, INTEGER=14, DOUBLE=15, WHITESPACE=16, 
		ERROR=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "TYPENAME", "VARNAME", "INTEGER", "DOUBLE", "WHITESPACE", 
		"ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'Integer'", "'Double'", "'='", "'print'", "'('", "')'", 
		"'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"TYPENAME", "VARNAME", "INTEGER", "DOUBLE", "WHITESPACE", "ERROR"
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


	public SourceLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SourceLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23i\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\6\rM\n\r\r\r\16\rN\3\16\3\16\7\16S\n\16\f\16\16\16"+
		"V\13\16\3\17\6\17Y\n\17\r\17\16\17Z\3\20\3\20\3\20\3\20\3\21\6\21b\n\21"+
		"\r\21\16\21c\3\21\3\21\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\b\3\2C\\\3\2"+
		"c|\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2l\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2"+
		"\2\5\'\3\2\2\2\7/\3\2\2\2\t\66\3\2\2\2\138\3\2\2\2\r>\3\2\2\2\17@\3\2"+
		"\2\2\21B\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27H\3\2\2\2\31J\3\2\2\2\33P\3"+
		"\2\2\2\35X\3\2\2\2\37\\\3\2\2\2!a\3\2\2\2#g\3\2\2\2%&\7=\2\2&\4\3\2\2"+
		"\2\'(\7K\2\2()\7p\2\2)*\7v\2\2*+\7g\2\2+,\7i\2\2,-\7g\2\2-.\7t\2\2.\6"+
		"\3\2\2\2/\60\7F\2\2\60\61\7q\2\2\61\62\7w\2\2\62\63\7d\2\2\63\64\7n\2"+
		"\2\64\65\7g\2\2\65\b\3\2\2\2\66\67\7?\2\2\67\n\3\2\2\289\7r\2\29:\7t\2"+
		"\2:;\7k\2\2;<\7p\2\2<=\7v\2\2=\f\3\2\2\2>?\7*\2\2?\16\3\2\2\2@A\7+\2\2"+
		"A\20\3\2\2\2BC\7-\2\2C\22\3\2\2\2DE\7/\2\2E\24\3\2\2\2FG\7,\2\2G\26\3"+
		"\2\2\2HI\7\61\2\2I\30\3\2\2\2JL\t\2\2\2KM\t\3\2\2LK\3\2\2\2MN\3\2\2\2"+
		"NL\3\2\2\2NO\3\2\2\2O\32\3\2\2\2PT\t\4\2\2QS\t\5\2\2RQ\3\2\2\2SV\3\2\2"+
		"\2TR\3\2\2\2TU\3\2\2\2U\34\3\2\2\2VT\3\2\2\2WY\t\6\2\2XW\3\2\2\2YZ\3\2"+
		"\2\2ZX\3\2\2\2Z[\3\2\2\2[\36\3\2\2\2\\]\5\35\17\2]^\7\60\2\2^_\5\35\17"+
		"\2_ \3\2\2\2`b\t\7\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2"+
		"\2ef\b\21\2\2f\"\3\2\2\2gh\13\2\2\2h$\3\2\2\2\7\2NTZc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
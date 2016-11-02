package compilador;
// Generated from Java.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, PACKAGE=28, IMPORT=29, EXTENDS=30, PUBLIC=31, 
		PRIVATE=32, STATIC=33, FINAL=34, ABSTRACT=35, PROTECTED=36, IMPLEMENTS=37, 
		CLASS=38, VOID=39, NULL=40, RETURN=41, IF=42, ELSE=43, WHILE=44, FOR=45, 
		SWITCH=46, CASE=47, BREAK=48, NEW=49, DEFAULT=50, TRY=51, CATCH=52, SUPER=53, 
		THIS=54, THROW=55, DO=56, TRUE=57, FALSE=58, INSTANCEOF=59, MOD_METODO=60, 
		PONT=61, ID=62, IDMETODO=63, TIPO=64, INT=65, STRING=66, DOUBLE_FLOAT=67, 
		OP=68, OP_ATR=69, SEPARADOR=70, WS=71, IDSTRING=72, ID_CLASSE=73;
	public static final int
		RULE_start = 0, RULE_pck = 1, RULE_imports = 2, RULE_dec_classe = 3, RULE_mod_classe = 4, 
		RULE_corpo_classe = 5, RULE_dec_main = 6, RULE_corpo_main = 7, RULE_dec_metodo = 8, 
		RULE_corpo_metodo = 9, RULE_dec_var = 10, RULE_atribuir = 11, RULE_statement = 12, 
		RULE_cond_if = 13, RULE_loop_for = 14, RULE_loop_while = 15, RULE_cond_switch = 16, 
		RULE_escreva = 17, RULE_expr = 18, RULE_idexpr = 19;
	public static final String[] ruleNames = {
		"start", "pck", "imports", "dec_classe", "mod_classe", "corpo_classe", 
		"dec_main", "corpo_main", "dec_metodo", "corpo_metodo", "dec_var", "atribuir", 
		"statement", "cond_if", "loop_for", "loop_while", "cond_switch", "escreva", 
		"expr", "idexpr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "';'", "'{'", "'}'", "'main'", "'('", "'String'", "'['", 
		"']'", "')'", "','", "'='", "'int'", "'lenght'", "'<'", "'>'", "'++'", 
		"'--'", "':'", "'System'", "'out'", "'print'", "'printf'", "'println'", 
		"'\"'", "'?'", "'!'", "'package'", "'import'", "'extends'", "'public'", 
		"'private'", "'static'", "'final'", "'abstract'", "'protected'", "'implements'", 
		"'class'", "'void'", "'null'", "'return'", "'if'", "'else'", "'while'", 
		"'for'", "'switch'", "'case'", "'break'", "'new'", "'default'", "'try'", 
		"'catch'", "'super'", "'this'", "'throw'", "'do'", "'true'", "'false'", 
		"'instanceof'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "PACKAGE", "IMPORT", "EXTENDS", "PUBLIC", "PRIVATE", 
		"STATIC", "FINAL", "ABSTRACT", "PROTECTED", "IMPLEMENTS", "CLASS", "VOID", 
		"NULL", "RETURN", "IF", "ELSE", "WHILE", "FOR", "SWITCH", "CASE", "BREAK", 
		"NEW", "DEFAULT", "TRY", "CATCH", "SUPER", "THIS", "THROW", "DO", "TRUE", 
		"FALSE", "INSTANCEOF", "MOD_METODO", "PONT", "ID", "IDMETODO", "TIPO", 
		"INT", "STRING", "DOUBLE_FLOAT", "OP", "OP_ATR", "SEPARADOR", "WS", "IDSTRING", 
		"ID_CLASSE"
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
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public Dec_classeContext dec_classe() {
			return getRuleContext(Dec_classeContext.class,0);
		}
		public PckContext pck() {
			return getRuleContext(PckContext.class,0);
		}
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(40);
				pck();
				}
			}

			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(43);
				imports();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			dec_classe();
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

	public static class PckContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(JavaParser.PACKAGE, 0); }
		public List<TerminalNode> ID() { return getTokens(JavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaParser.ID, i);
		}
		public PckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPck(this);
		}
	}

	public final PckContext pck() throws RecognitionException {
		PckContext _localctx = new PckContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pck);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(PACKAGE);
			setState(52);
			match(ID);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(53);
				match(T__0);
				setState(54);
				match(ID);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(T__1);
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

	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JavaParser.IMPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(JavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaParser.ID, i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitImports(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(IMPORT);
			setState(63);
			match(ID);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(64);
				match(T__0);
				setState(65);
				match(ID);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(T__1);
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

	public static class Dec_classeContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(JavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaParser.ID, i);
		}
		public Mod_classeContext mod_classe() {
			return getRuleContext(Mod_classeContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public Corpo_classeContext corpo_classe() {
			return getRuleContext(Corpo_classeContext.class,0);
		}
		public Dec_classeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_classe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDec_classe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDec_classe(this);
		}
	}

	public final Dec_classeContext dec_classe() throws RecognitionException {
		Dec_classeContext _localctx = new Dec_classeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dec_classe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << STATIC) | (1L << FINAL) | (1L << ABSTRACT) | (1L << PROTECTED))) != 0)) {
				{
				setState(73);
				mod_classe();
				}
			}

			setState(76);
			match(CLASS);
			setState(77);
			match(ID);
			setState(80);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(78);
				match(EXTENDS);
				setState(79);
				match(ID);
				}
			}

			setState(84);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(82);
				match(IMPLEMENTS);
				setState(83);
				match(ID);
				}
			}

			setState(87);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__19) | (1L << T__26) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << STATIC) | (1L << FINAL) | (1L << ABSTRACT) | (1L << PROTECTED) | (1L << CLASS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << MOD_METODO) | (1L << ID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TIPO - 64)) | (1L << (INT - 64)) | (1L << (DOUBLE_FLOAT - 64)) | (1L << (IDSTRING - 64)) | (1L << (ID_CLASSE - 64)))) != 0)) {
				{
				setState(86);
				corpo_classe();
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

	public static class Mod_classeContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public Mod_classeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_classe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMod_classe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMod_classe(this);
		}
	}

	public final Mod_classeContext mod_classe() throws RecognitionException {
		Mod_classeContext _localctx = new Mod_classeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mod_classe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << STATIC) | (1L << FINAL) | (1L << ABSTRACT) | (1L << PROTECTED))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Corpo_classeContext extends ParserRuleContext {
		public Dec_mainContext dec_main() {
			return getRuleContext(Dec_mainContext.class,0);
		}
		public Dec_varContext dec_var() {
			return getRuleContext(Dec_varContext.class,0);
		}
		public Dec_metodoContext dec_metodo() {
			return getRuleContext(Dec_metodoContext.class,0);
		}
		public Dec_classeContext dec_classe() {
			return getRuleContext(Dec_classeContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Corpo_classeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo_classe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCorpo_classe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCorpo_classe(this);
		}
	}

	public final Corpo_classeContext corpo_classe() throws RecognitionException {
		Corpo_classeContext _localctx = new Corpo_classeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_corpo_classe);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(T__2);
				setState(92);
				dec_main();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				dec_var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				dec_metodo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				dec_classe();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				statement();
				setState(97);
				match(T__3);
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

	public static class Dec_mainContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public Corpo_mainContext corpo_main() {
			return getRuleContext(Corpo_mainContext.class,0);
		}
		public Dec_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDec_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDec_main(this);
		}
	}

	public final Dec_mainContext dec_main() throws RecognitionException {
		Dec_mainContext _localctx = new Dec_mainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dec_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(PUBLIC);
			setState(102);
			match(STATIC);
			setState(103);
			match(VOID);
			setState(104);
			match(T__4);
			setState(105);
			match(T__5);
			setState(106);
			match(T__6);
			setState(107);
			match(T__7);
			setState(108);
			match(T__8);
			setState(109);
			match(ID);
			setState(110);
			match(T__9);
			setState(112);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__19) | (1L << T__26) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << ID))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT - 65)) | (1L << (DOUBLE_FLOAT - 65)) | (1L << (IDSTRING - 65)) | (1L << (ID_CLASSE - 65)))) != 0)) {
				{
				setState(111);
				corpo_main();
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

	public static class Corpo_mainContext extends ParserRuleContext {
		public Dec_varContext dec_var() {
			return getRuleContext(Dec_varContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Corpo_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCorpo_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCorpo_main(this);
		}
	}

	public final Corpo_mainContext corpo_main() throws RecognitionException {
		Corpo_mainContext _localctx = new Corpo_mainContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_corpo_main);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(T__2);
				setState(115);
				dec_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				statement();
				setState(117);
				match(T__3);
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

	public static class Dec_metodoContext extends ParserRuleContext {
		public TerminalNode MOD_METODO() { return getToken(JavaParser.MOD_METODO, 0); }
		public TerminalNode IDMETODO() { return getToken(JavaParser.IDMETODO, 0); }
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public List<TerminalNode> TIPO() { return getTokens(JavaParser.TIPO); }
		public TerminalNode TIPO(int i) {
			return getToken(JavaParser.TIPO, i);
		}
		public List<TerminalNode> ID() { return getTokens(JavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaParser.ID, i);
		}
		public Corpo_metodoContext corpo_metodo() {
			return getRuleContext(Corpo_metodoContext.class,0);
		}
		public Dec_metodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDec_metodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDec_metodo(this);
		}
	}

	public final Dec_metodoContext dec_metodo() throws RecognitionException {
		Dec_metodoContext _localctx = new Dec_metodoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dec_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(MOD_METODO);
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==TIPO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(123);
			match(IDMETODO);
			setState(124);
			match(T__5);
			setState(135);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(125);
				match(TIPO);
				setState(126);
				match(ID);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(127);
					match(T__10);
					setState(128);
					match(TIPO);
					setState(129);
					match(ID);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(137);
			match(T__9);
			setState(139);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__19) | (1L << T__26) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << ID))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT - 65)) | (1L << (DOUBLE_FLOAT - 65)) | (1L << (IDSTRING - 65)) | (1L << (ID_CLASSE - 65)))) != 0)) {
				{
				setState(138);
				corpo_metodo();
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

	public static class Corpo_metodoContext extends ParserRuleContext {
		public Dec_varContext dec_var() {
			return getRuleContext(Dec_varContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(JavaParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Corpo_metodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCorpo_metodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCorpo_metodo(this);
		}
	}

	public final Corpo_metodoContext corpo_metodo() throws RecognitionException {
		Corpo_metodoContext _localctx = new Corpo_metodoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_corpo_metodo);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(T__2);
				setState(142);
				dec_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				statement();
				setState(148);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(144);
					match(RETURN);
					setState(145);
					expr();
					setState(146);
					match(T__1);
					}
				}

				setState(150);
				match(T__3);
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

	public static class Dec_varContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(JavaParser.TIPO, 0); }
		public List<TerminalNode> ID() { return getTokens(JavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaParser.ID, i);
		}
		public AtribuirContext atribuir() {
			return getRuleContext(AtribuirContext.class,0);
		}
		public Dec_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDec_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDec_var(this);
		}
	}

	public final Dec_varContext dec_var() throws RecognitionException {
		Dec_varContext _localctx = new Dec_varContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dec_var);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(TIPO);
				setState(155);
				match(ID);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(156);
					match(T__10);
					setState(157);
					match(ID);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				atribuir();
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

	public static class AtribuirContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(JavaParser.TIPO, 0); }
		public List<TerminalNode> ID() { return getTokens(JavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaParser.ID, i);
		}
		public TerminalNode OP_ATR() { return getToken(JavaParser.OP_ATR, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode DOUBLE_FLOAT() { return getToken(JavaParser.DOUBLE_FLOAT, 0); }
		public AtribuirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAtribuir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAtribuir(this);
		}
	}

	public final AtribuirContext atribuir() throws RecognitionException {
		AtribuirContext _localctx = new AtribuirContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atribuir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(TIPO);
			setState(168);
			match(ID);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(169);
				match(T__10);
				setState(170);
				match(ID);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(OP_ATR);
			setState(177);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (ID - 62)) | (1L << (INT - 62)) | (1L << (DOUBLE_FLOAT - 62)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(178);
			match(T__1);
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

	public static class StatementContext extends ParserRuleContext {
		public Cond_ifContext cond_if() {
			return getRuleContext(Cond_ifContext.class,0);
		}
		public Loop_forContext loop_for() {
			return getRuleContext(Loop_forContext.class,0);
		}
		public Loop_whileContext loop_while() {
			return getRuleContext(Loop_whileContext.class,0);
		}
		public Cond_switchContext cond_switch() {
			return getRuleContext(Cond_switchContext.class,0);
		}
		public EscrevaContext escreva() {
			return getRuleContext(EscrevaContext.class,0);
		}
		public TerminalNode IDSTRING() { return getToken(JavaParser.IDSTRING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(180);
				cond_if();
				}
				break;
			case FOR:
				{
				setState(181);
				loop_for();
				}
				break;
			case WHILE:
				{
				setState(182);
				loop_while();
				}
				break;
			case SWITCH:
				{
				setState(183);
				cond_switch();
				}
				break;
			case T__19:
				{
				setState(184);
				escreva();
				}
				break;
			case IDSTRING:
				{
				setState(185);
				match(IDSTRING);
				setState(186);
				match(T__11);
				setState(187);
				expr();
				setState(188);
				match(T__1);
				}
				break;
			case T__2:
				{
				setState(190);
				match(T__2);
				setState(191);
				statement();
				setState(192);
				match(T__3);
				}
				break;
			case T__26:
			case ID:
			case INT:
			case DOUBLE_FLOAT:
			case ID_CLASSE:
				{
				setState(194);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Cond_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
		public Cond_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCond_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCond_if(this);
		}
	}

	public final Cond_ifContext cond_if() throws RecognitionException {
		Cond_ifContext _localctx = new Cond_ifContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cond_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(IF);
			setState(198);
			match(T__5);
			setState(199);
			expr();
			setState(200);
			match(T__9);
			setState(201);
			statement();
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(202);
				match(ELSE);
				setState(203);
				statement();
				}
				break;
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

	public static class Loop_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JavaParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(JavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(JavaParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(JavaParser.INT, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Loop_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLoop_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLoop_for(this);
		}
	}

	public final Loop_forContext loop_for() throws RecognitionException {
		Loop_forContext _localctx = new Loop_forContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loop_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(FOR);
			setState(207);
			match(T__5);
			setState(208);
			match(T__12);
			setState(209);
			match(ID);
			setState(210);
			match(T__11);
			setState(211);
			match(INT);
			setState(212);
			match(T__1);
			setState(213);
			match(ID);
			setState(216);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(214);
				match(T__0);
				setState(215);
				match(T__13);
				}
			}

			setState(218);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(219);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(220);
			match(T__1);
			setState(221);
			match(ID);
			setState(222);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(223);
			statement();
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

	public static class Loop_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Loop_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLoop_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLoop_while(this);
		}
	}

	public final Loop_whileContext loop_while() throws RecognitionException {
		Loop_whileContext _localctx = new Loop_whileContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_loop_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(WHILE);
			setState(226);
			match(T__5);
			setState(227);
			expr();
			setState(228);
			match(T__9);
			setState(229);
			statement();
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

	public static class Cond_switchContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> CASE() { return getTokens(JavaParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(JavaParser.CASE, i);
		}
		public List<TerminalNode> ID() { return getTokens(JavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaParser.ID, i);
		}
		public List<TerminalNode> BREAK() { return getTokens(JavaParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(JavaParser.BREAK, i);
		}
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public Cond_switchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCond_switch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCond_switch(this);
		}
	}

	public final Cond_switchContext cond_switch() throws RecognitionException {
		Cond_switchContext _localctx = new Cond_switchContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cond_switch);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(SWITCH);
			setState(232);
			match(T__5);
			setState(233);
			expr();
			setState(234);
			match(T__9);
			setState(235);
			statement();
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(236);
					match(CASE);
					setState(237);
					match(ID);
					setState(238);
					match(T__18);
					setState(239);
					statement();
					setState(240);
					match(BREAK);
					setState(241);
					match(T__1);
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(248);
				match(DEFAULT);
				setState(249);
				statement();
				}
				break;
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

	public static class EscrevaContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode DOUBLE_FLOAT() { return getToken(JavaParser.DOUBLE_FLOAT, 0); }
		public List<TerminalNode> ID() { return getTokens(JavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaParser.ID, i);
		}
		public EscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEscreva(this);
		}
	}

	public final EscrevaContext escreva() throws RecognitionException {
		EscrevaContext _localctx = new EscrevaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_escreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__19);
			setState(253);
			match(T__0);
			setState(254);
			match(T__20);
			setState(255);
			match(T__0);
			setState(256);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(257);
			match(T__5);
			setState(268);
			switch (_input.LA(1)) {
			case T__24:
				{
				setState(258);
				match(T__24);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(259);
					match(ID);
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(265);
				match(T__24);
				}
				break;
			case INT:
				{
				setState(266);
				match(INT);
				}
				break;
			case DOUBLE_FLOAT:
				{
				setState(267);
				match(DOUBLE_FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(270);
			match(T__9);
			setState(271);
			match(T__1);
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

	public static class ExprContext extends ParserRuleContext {
		public List<IdexprContext> idexpr() {
			return getRuleContexts(IdexprContext.class);
		}
		public IdexprContext idexpr(int i) {
			return getRuleContext(IdexprContext.class,i);
		}
		public TerminalNode OP() { return getToken(JavaParser.OP, 0); }
		public List<TerminalNode> ID() { return getTokens(JavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaParser.ID, i);
		}
		public TerminalNode ID_CLASSE() { return getToken(JavaParser.ID_CLASSE, 0); }
		public TerminalNode IDSTRING() { return getToken(JavaParser.IDSTRING, 0); }
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public TerminalNode TIPO() { return getToken(JavaParser.TIPO, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode DOUBLE_FLOAT() { return getToken(JavaParser.DOUBLE_FLOAT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(273);
				idexpr();
				setState(274);
				match(OP);
				setState(275);
				idexpr();
				}
				break;
			case 2:
				{
				setState(277);
				idexpr();
				setState(278);
				match(T__0);
				setState(279);
				match(ID);
				setState(280);
				match(T__5);
				setState(289);
				_la = _input.LA(1);
				if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (ID - 62)) | (1L << (INT - 62)) | (1L << (DOUBLE_FLOAT - 62)))) != 0)) {
					{
					setState(281);
					idexpr();
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(282);
						match(T__10);
						setState(283);
						idexpr();
						}
						}
						setState(288);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(291);
				match(T__9);
				}
				break;
			case 3:
				{
				setState(293);
				match(ID_CLASSE);
				setState(294);
				match(IDSTRING);
				setState(295);
				match(T__11);
				setState(296);
				match(NEW);
				setState(297);
				match(TIPO);
				setState(298);
				match(ID);
				setState(299);
				match(T__5);
				setState(301);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(300);
					match(ID);
					}
				}

				setState(303);
				match(T__9);
				setState(304);
				match(T__1);
				}
				break;
			case 4:
				{
				setState(305);
				idexpr();
				setState(306);
				match(T__0);
				setState(307);
				match(ID);
				}
				break;
			case 5:
				{
				setState(309);
				idexpr();
				setState(310);
				match(T__7);
				setState(311);
				idexpr();
				setState(312);
				match(T__8);
				}
				break;
			case 6:
				{
				setState(314);
				idexpr();
				setState(315);
				match(T__25);
				setState(316);
				idexpr();
				setState(317);
				match(T__18);
				setState(318);
				idexpr();
				}
				break;
			case 7:
				{
				setState(320);
				match(T__26);
				setState(321);
				idexpr();
				}
				break;
			case 8:
				{
				setState(322);
				idexpr();
				setState(323);
				match(T__16);
				}
				break;
			case 9:
				{
				setState(325);
				idexpr();
				setState(326);
				match(T__17);
				}
				break;
			case 10:
				{
				setState(328);
				match(ID);
				}
				break;
			case 11:
				{
				setState(329);
				match(INT);
				}
				break;
			case 12:
				{
				setState(330);
				match(DOUBLE_FLOAT);
				}
				break;
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

	public static class IdexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode DOUBLE_FLOAT() { return getToken(JavaParser.DOUBLE_FLOAT, 0); }
		public IdexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterIdexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitIdexpr(this);
		}
	}

	public final IdexprContext idexpr() throws RecognitionException {
		IdexprContext _localctx = new IdexprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_idexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (ID - 62)) | (1L << (INT - 62)) | (1L << (DOUBLE_FLOAT - 62)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3K\u0152\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\5\2,\n\2\3\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\7\4E\n\4\f\4\16\4H\13\4\3\4\3\4\3\5\5\5M\n\5\3\5\3\5\3\5\3\5\5\5"+
		"S\n\5\3\5\3\5\5\5W\n\5\3\5\5\5Z\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7f\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bs\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\5\tz\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0085"+
		"\n\n\f\n\16\n\u0088\13\n\5\n\u008a\n\n\3\n\3\n\5\n\u008e\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u0097\n\13\3\13\3\13\5\13\u009b\n\13\3"+
		"\f\3\f\3\f\3\f\7\f\u00a1\n\f\f\f\16\f\u00a4\13\f\3\f\3\f\5\f\u00a8\n\f"+
		"\3\r\3\r\3\r\3\r\7\r\u00ae\n\r\f\r\16\r\u00b1\13\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00c6\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00cf\n\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00db\n\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00f6\n\22\f\22"+
		"\16\22\u00f9\13\22\3\22\3\22\5\22\u00fd\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u0107\n\23\f\23\16\23\u010a\13\23\3\23\3\23\3\23"+
		"\5\23\u010f\n\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\7\24\u011f\n\24\f\24\16\24\u0122\13\24\5\24\u0124\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0130\n\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u014e\n\24\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(\2\t\3\2!&\4\2))BB\5\2@@CCEE\3\2\21\22\4\2@@CC\3\2\23\24\3\2"+
		"\30\32\u016f\2+\3\2\2\2\4\65\3\2\2\2\6@\3\2\2\2\bL\3\2\2\2\n[\3\2\2\2"+
		"\fe\3\2\2\2\16g\3\2\2\2\20y\3\2\2\2\22{\3\2\2\2\24\u009a\3\2\2\2\26\u00a7"+
		"\3\2\2\2\30\u00a9\3\2\2\2\32\u00c5\3\2\2\2\34\u00c7\3\2\2\2\36\u00d0\3"+
		"\2\2\2 \u00e3\3\2\2\2\"\u00e9\3\2\2\2$\u00fe\3\2\2\2&\u014d\3\2\2\2(\u014f"+
		"\3\2\2\2*,\5\4\3\2+*\3\2\2\2+,\3\2\2\2,\60\3\2\2\2-/\5\6\4\2.-\3\2\2\2"+
		"/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63"+
		"\64\5\b\5\2\64\3\3\2\2\2\65\66\7\36\2\2\66;\7@\2\2\678\7\3\2\28:\7@\2"+
		"\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\4"+
		"\2\2?\5\3\2\2\2@A\7\37\2\2AF\7@\2\2BC\7\3\2\2CE\7@\2\2DB\3\2\2\2EH\3\2"+
		"\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\4\2\2J\7\3\2\2\2KM\5"+
		"\n\6\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7(\2\2OR\7@\2\2PQ\7 \2\2QS\7@\2"+
		"\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TU\7\'\2\2UW\7@\2\2VT\3\2\2\2VW\3\2\2"+
		"\2WY\3\2\2\2XZ\5\f\7\2YX\3\2\2\2YZ\3\2\2\2Z\t\3\2\2\2[\\\t\2\2\2\\\13"+
		"\3\2\2\2]^\7\5\2\2^f\5\16\b\2_f\5\26\f\2`f\5\22\n\2af\5\b\5\2bc\5\32\16"+
		"\2cd\7\6\2\2df\3\2\2\2e]\3\2\2\2e_\3\2\2\2e`\3\2\2\2ea\3\2\2\2eb\3\2\2"+
		"\2f\r\3\2\2\2gh\7!\2\2hi\7#\2\2ij\7)\2\2jk\7\7\2\2kl\7\b\2\2lm\7\t\2\2"+
		"mn\7\n\2\2no\7\13\2\2op\7@\2\2pr\7\f\2\2qs\5\20\t\2rq\3\2\2\2rs\3\2\2"+
		"\2s\17\3\2\2\2tu\7\5\2\2uz\5\26\f\2vw\5\32\16\2wx\7\6\2\2xz\3\2\2\2yt"+
		"\3\2\2\2yv\3\2\2\2z\21\3\2\2\2{|\7>\2\2|}\t\3\2\2}~\7A\2\2~\u0089\7\b"+
		"\2\2\177\u0080\7B\2\2\u0080\u0086\7@\2\2\u0081\u0082\7\r\2\2\u0082\u0083"+
		"\7B\2\2\u0083\u0085\7@\2\2\u0084\u0081\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0089\177\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d"+
		"\7\f\2\2\u008c\u008e\5\24\13\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2"+
		"\u008e\23\3\2\2\2\u008f\u0090\7\5\2\2\u0090\u009b\5\26\f\2\u0091\u0096"+
		"\5\32\16\2\u0092\u0093\7+\2\2\u0093\u0094\5&\24\2\u0094\u0095\7\4\2\2"+
		"\u0095\u0097\3\2\2\2\u0096\u0092\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\7\6\2\2\u0099\u009b\3\2\2\2\u009a\u008f\3\2\2\2\u009a"+
		"\u0091\3\2\2\2\u009b\25\3\2\2\2\u009c\u009d\7B\2\2\u009d\u00a2\7@\2\2"+
		"\u009e\u009f\7\r\2\2\u009f\u00a1\7@\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a4"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a8\7\4\2\2\u00a6\u00a8\5\30\r\2\u00a7\u009c\3"+
		"\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\27\3\2\2\2\u00a9\u00aa\7B\2\2\u00aa\u00af"+
		"\7@\2\2\u00ab\u00ac\7\r\2\2\u00ac\u00ae\7@\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7G\2\2\u00b3\u00b4\t\4\2\2\u00b4"+
		"\u00b5\7\4\2\2\u00b5\31\3\2\2\2\u00b6\u00c6\5\34\17\2\u00b7\u00c6\5\36"+
		"\20\2\u00b8\u00c6\5 \21\2\u00b9\u00c6\5\"\22\2\u00ba\u00c6\5$\23\2\u00bb"+
		"\u00bc\7J\2\2\u00bc\u00bd\7\16\2\2\u00bd\u00be\5&\24\2\u00be\u00bf\7\4"+
		"\2\2\u00bf\u00c6\3\2\2\2\u00c0\u00c1\7\5\2\2\u00c1\u00c2\5\32\16\2\u00c2"+
		"\u00c3\7\6\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c6\5&\24\2\u00c5\u00b6\3\2"+
		"\2\2\u00c5\u00b7\3\2\2\2\u00c5\u00b8\3\2\2\2\u00c5\u00b9\3\2\2\2\u00c5"+
		"\u00ba\3\2\2\2\u00c5\u00bb\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c5\u00c4\3\2"+
		"\2\2\u00c6\33\3\2\2\2\u00c7\u00c8\7,\2\2\u00c8\u00c9\7\b\2\2\u00c9\u00ca"+
		"\5&\24\2\u00ca\u00cb\7\f\2\2\u00cb\u00ce\5\32\16\2\u00cc\u00cd\7-\2\2"+
		"\u00cd\u00cf\5\32\16\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\35"+
		"\3\2\2\2\u00d0\u00d1\7/\2\2\u00d1\u00d2\7\b\2\2\u00d2\u00d3\7\17\2\2\u00d3"+
		"\u00d4\7@\2\2\u00d4\u00d5\7\16\2\2\u00d5\u00d6\7C\2\2\u00d6\u00d7\7\4"+
		"\2\2\u00d7\u00da\7@\2\2\u00d8\u00d9\7\3\2\2\u00d9\u00db\7\20\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\t\5"+
		"\2\2\u00dd\u00de\t\6\2\2\u00de\u00df\7\4\2\2\u00df\u00e0\7@\2\2\u00e0"+
		"\u00e1\t\7\2\2\u00e1\u00e2\5\32\16\2\u00e2\37\3\2\2\2\u00e3\u00e4\7.\2"+
		"\2\u00e4\u00e5\7\b\2\2\u00e5\u00e6\5&\24\2\u00e6\u00e7\7\f\2\2\u00e7\u00e8"+
		"\5\32\16\2\u00e8!\3\2\2\2\u00e9\u00ea\7\60\2\2\u00ea\u00eb\7\b\2\2\u00eb"+
		"\u00ec\5&\24\2\u00ec\u00ed\7\f\2\2\u00ed\u00f7\5\32\16\2\u00ee\u00ef\7"+
		"\61\2\2\u00ef\u00f0\7@\2\2\u00f0\u00f1\7\25\2\2\u00f1\u00f2\5\32\16\2"+
		"\u00f2\u00f3\7\62\2\2\u00f3\u00f4\7\4\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00ee"+
		"\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00fc\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7\64\2\2\u00fb\u00fd\5"+
		"\32\16\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd#\3\2\2\2\u00fe"+
		"\u00ff\7\26\2\2\u00ff\u0100\7\3\2\2\u0100\u0101\7\27\2\2\u0101\u0102\7"+
		"\3\2\2\u0102\u0103\t\b\2\2\u0103\u010e\7\b\2\2\u0104\u0108\7\33\2\2\u0105"+
		"\u0107\7@\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010f\7\33\2\2\u010c\u010f\7C\2\2\u010d\u010f\7E\2\2\u010e\u0104\3\2"+
		"\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\7\f\2\2\u0111\u0112\7\4\2\2\u0112%\3\2\2\2\u0113\u0114\5(\25\2"+
		"\u0114\u0115\7F\2\2\u0115\u0116\5(\25\2\u0116\u014e\3\2\2\2\u0117\u0118"+
		"\5(\25\2\u0118\u0119\7\3\2\2\u0119\u011a\7@\2\2\u011a\u0123\7\b\2\2\u011b"+
		"\u0120\5(\25\2\u011c\u011d\7\r\2\2\u011d\u011f\5(\25\2\u011e\u011c\3\2"+
		"\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u011b\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7\f\2\2\u0126\u014e\3\2\2\2\u0127"+
		"\u0128\7K\2\2\u0128\u0129\7J\2\2\u0129\u012a\7\16\2\2\u012a\u012b\7\63"+
		"\2\2\u012b\u012c\7B\2\2\u012c\u012d\7@\2\2\u012d\u012f\7\b\2\2\u012e\u0130"+
		"\7@\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\7\f\2\2\u0132\u014e\7\4\2\2\u0133\u0134\5(\25\2\u0134\u0135\7\3"+
		"\2\2\u0135\u0136\7@\2\2\u0136\u014e\3\2\2\2\u0137\u0138\5(\25\2\u0138"+
		"\u0139\7\n\2\2\u0139\u013a\5(\25\2\u013a\u013b\7\13\2\2\u013b\u014e\3"+
		"\2\2\2\u013c\u013d\5(\25\2\u013d\u013e\7\34\2\2\u013e\u013f\5(\25\2\u013f"+
		"\u0140\7\25\2\2\u0140\u0141\5(\25\2\u0141\u014e\3\2\2\2\u0142\u0143\7"+
		"\35\2\2\u0143\u014e\5(\25\2\u0144\u0145\5(\25\2\u0145\u0146\7\23\2\2\u0146"+
		"\u014e\3\2\2\2\u0147\u0148\5(\25\2\u0148\u0149\7\24\2\2\u0149\u014e\3"+
		"\2\2\2\u014a\u014e\7@\2\2\u014b\u014e\7C\2\2\u014c\u014e\7E\2\2\u014d"+
		"\u0113\3\2\2\2\u014d\u0117\3\2\2\2\u014d\u0127\3\2\2\2\u014d\u0133\3\2"+
		"\2\2\u014d\u0137\3\2\2\2\u014d\u013c\3\2\2\2\u014d\u0142\3\2\2\2\u014d"+
		"\u0144\3\2\2\2\u014d\u0147\3\2\2\2\u014d\u014a\3\2\2\2\u014d\u014b\3\2"+
		"\2\2\u014d\u014c\3\2\2\2\u014e\'\3\2\2\2\u014f\u0150\t\4\2\2\u0150)\3"+
		"\2\2\2 +\60;FLRVYery\u0086\u0089\u008d\u0096\u009a\u00a2\u00a7\u00af\u00c5"+
		"\u00ce\u00da\u00f7\u00fc\u0108\u010e\u0120\u0123\u012f\u014d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
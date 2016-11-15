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
		T__17=18, T__18=19, T__19=20, T__20=21, PACKAGE=22, IMPORT=23, EXTENDS=24, 
		PUBLIC=25, PRIVATE=26, STATIC=27, FINAL=28, ABSTRACT=29, PROTECTED=30, 
		IMPLEMENTS=31, CLASS=32, VOID=33, NULL=34, RETURN=35, IF=36, ELSE=37, 
		WHILE=38, FOR=39, SWITCH=40, CASE=41, BREAK=42, NEW=43, DEFAULT=44, TRY=45, 
		CATCH=46, SUPER=47, THIS=48, THROW=49, DO=50, TRUE=51, FALSE=52, INSTANCEOF=53, 
		INTEIRO=54, DOUBLE=55, FLOAT=56, STRING=57, CHAR=58, LONG=59, BOOLEAN=60, 
		SHORT=61, PRINT=62, PRINTLN=63, PRINTF=64, OUT=65, PONT=66, ID=67, TIPO=68, 
		MASCARA=69, INT=70, DOUBLE_FLOAT=71, MAIS=72, MENOS=73, MULT=74, DIV=75, 
		E=76, OU=77, MAIOR_IG=78, MENOR_IG=79, SHIFTR=80, SHIFTL=81, MOD=82, DIF=83, 
		IG=84, MAIOR=85, MENOR=86, ATR=87, MAIS_ATR=88, MENOS_ATR=89, MULT_ATR=90, 
		DIV_ATR=91, MOD_ATR=92, SEPARADOR=93, WS=94, COMENTARIO=95, COMENTARIO_LINHA=96;
	public static final int
		RULE_start = 0, RULE_pck = 1, RULE_imports = 2, RULE_nomes = 3, RULE_dec_classe = 4, 
		RULE_identificador = 5, RULE_dec_met_main = 6, RULE_param = 7, RULE_mod_classe = 8, 
		RULE_corpo_classe = 9, RULE_dec_corpo_classe = 10, RULE_corpo_main = 11, 
		RULE_dec_metodo = 12, RULE_mod_metodo = 13, RULE_corpo_metodo = 14, RULE_dec_var = 15, 
		RULE_dec_var_main = 16, RULE_atribuir = 17, RULE_bloco = 18, RULE_cond_if = 19, 
		RULE_loop_for = 20, RULE_loop_while = 21, RULE_cond_switch = 22, RULE_saida = 23, 
		RULE_tipo_print = 24, RULE_print = 25, RULE_printf = 26, RULE_expr = 27, 
		RULE_term = 28, RULE_literal = 29, RULE_tipo = 30, RULE_op_A = 31, RULE_op_B = 32, 
		RULE_op_atr = 33;
	public static final String[] ruleNames = {
		"start", "pck", "imports", "nomes", "dec_classe", "identificador", "dec_met_main", 
		"param", "mod_classe", "corpo_classe", "dec_corpo_classe", "corpo_main", 
		"dec_metodo", "mod_metodo", "corpo_metodo", "dec_var", "dec_var_main", 
		"atribuir", "bloco", "cond_if", "loop_for", "loop_while", "cond_switch", 
		"saida", "tipo_print", "print", "printf", "expr", "term", "literal", "tipo", 
		"op_A", "op_B", "op_atr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "';'", "'('", "')'", "'{'", "'}'", "','", "'PUBLIC'", "'PRIVATE'", 
		"'PROTECTED'", "'STATIC'", "'['", "']'", "'lenght'", "'++'", "'--'", "':'", 
		"'System'", "'\"'", "'?'", "'!'", "'package'", "'import'", "'extends'", 
		"'public'", "'private'", "'static'", "'final'", "'abstract'", "'protected'", 
		"'implements'", "'class'", "'void'", "'null'", "'return'", "'if'", "'else'", 
		"'while'", "'for'", "'switch'", "'case'", "'break'", "'new'", "'default'", 
		"'try'", "'catch'", "'super'", "'this'", "'throw'", "'do'", "'true'", 
		"'false'", "'instanceof'", "'int'", "'double'", "'float'", "'String'", 
		"'char'", "'long'", "'boolean'", "'short'", "'print'", "'println'", "'printf'", 
		"'out'", null, null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
		"'&&'", "'||'", "'>='", "'<='", "'>>'", "'<<'", "'%'", "'!='", "'=='", 
		"'>'", "'<'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "PACKAGE", 
		"IMPORT", "EXTENDS", "PUBLIC", "PRIVATE", "STATIC", "FINAL", "ABSTRACT", 
		"PROTECTED", "IMPLEMENTS", "CLASS", "VOID", "NULL", "RETURN", "IF", "ELSE", 
		"WHILE", "FOR", "SWITCH", "CASE", "BREAK", "NEW", "DEFAULT", "TRY", "CATCH", 
		"SUPER", "THIS", "THROW", "DO", "TRUE", "FALSE", "INSTANCEOF", "INTEIRO", 
		"DOUBLE", "FLOAT", "STRING", "CHAR", "LONG", "BOOLEAN", "SHORT", "PRINT", 
		"PRINTLN", "PRINTF", "OUT", "PONT", "ID", "TIPO", "MASCARA", "INT", "DOUBLE_FLOAT", 
		"MAIS", "MENOS", "MULT", "DIV", "E", "OU", "MAIOR_IG", "MENOR_IG", "SHIFTR", 
		"SHIFTL", "MOD", "DIF", "IG", "MAIOR", "MENOR", "ATR", "MAIS_ATR", "MENOS_ATR", 
		"MULT_ATR", "DIV_ATR", "MOD_ATR", "SEPARADOR", "WS", "COMENTARIO", "COMENTARIO_LINHA"
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
			setState(69);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(68);
				pck();
				}
			}

			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(71);
				imports();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
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
		public NomesContext nomes() {
			return getRuleContext(NomesContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(PACKAGE);
			setState(80);
			nomes();
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
		public NomesContext nomes() {
			return getRuleContext(NomesContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(IMPORT);
			setState(83);
			nomes();
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

	public static class NomesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaParser.ID, i);
		}
		public NomesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNomes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNomes(this);
		}
	}

	public final NomesContext nomes() throws RecognitionException {
		NomesContext _localctx = new NomesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nomes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(ID);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(86);
				match(T__0);
				setState(87);
				match(ID);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
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
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public Mod_classeContext mod_classe() {
			return getRuleContext(Mod_classeContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public List<Corpo_classeContext> corpo_classe() {
			return getRuleContexts(Corpo_classeContext.class);
		}
		public Corpo_classeContext corpo_classe(int i) {
			return getRuleContext(Corpo_classeContext.class,i);
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
		enterRule(_localctx, 8, RULE_dec_classe);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << STATIC) | (1L << FINAL) | (1L << ABSTRACT) | (1L << PROTECTED))) != 0)) {
				{
				setState(95);
				mod_classe();
				}
			}

			setState(98);
			match(CLASS);
			setState(99);
			identificador();
			setState(102);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(100);
				match(EXTENDS);
				setState(101);
				identificador();
				}
			}

			setState(106);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(104);
				match(IMPLEMENTS);
				setState(105);
				identificador();
				}
			}

			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					corpo_classe();
					}
					} 
				}
				setState(113);
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
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ID);
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

	public static class Dec_met_mainContext extends ParserRuleContext {
		public Mod_classeContext mod_classe() {
			return getRuleContext(Mod_classeContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Corpo_classeContext corpo_classe() {
			return getRuleContext(Corpo_classeContext.class,0);
		}
		public Dec_met_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_met_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDec_met_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDec_met_main(this);
		}
	}

	public final Dec_met_mainContext dec_met_main() throws RecognitionException {
		Dec_met_mainContext _localctx = new Dec_met_mainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dec_met_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			mod_classe();
			setState(117);
			match(STATIC);
			setState(118);
			match(VOID);
			setState(119);
			identificador();
			setState(120);
			param();
			setState(121);
			corpo_classe();
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

	public static class ParamContext extends ParserRuleContext {
		public Dec_var_mainContext dec_var_main() {
			return getRuleContext(Dec_var_mainContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__2);
			setState(124);
			dec_var_main();
			setState(125);
			match(T__3);
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
		enterRule(_localctx, 16, RULE_mod_classe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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
		public List<Dec_corpo_classeContext> dec_corpo_classe() {
			return getRuleContexts(Dec_corpo_classeContext.class);
		}
		public Dec_corpo_classeContext dec_corpo_classe(int i) {
			return getRuleContext(Dec_corpo_classeContext.class,i);
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
		enterRule(_localctx, 18, RULE_corpo_classe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__4);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__17) | (1L << T__20) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << STATIC) | (1L << FINAL) | (1L << ABSTRACT) | (1L << PROTECTED) | (1L << CLASS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << INTEIRO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << SHORT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ID - 67)) | (1L << (INT - 67)) | (1L << (DOUBLE_FLOAT - 67)))) != 0)) {
				{
				{
				setState(130);
				dec_corpo_classe();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(T__5);
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

	public static class Dec_corpo_classeContext extends ParserRuleContext {
		public Dec_metodoContext dec_metodo() {
			return getRuleContext(Dec_metodoContext.class,0);
		}
		public Dec_classeContext dec_classe() {
			return getRuleContext(Dec_classeContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Dec_corpo_classeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_corpo_classe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDec_corpo_classe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDec_corpo_classe(this);
		}
	}

	public final Dec_corpo_classeContext dec_corpo_classe() throws RecognitionException {
		Dec_corpo_classeContext _localctx = new Dec_corpo_classeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dec_corpo_classe);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				dec_metodo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				dec_classe();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				bloco();
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

	public static class Corpo_mainContext extends ParserRuleContext {
		public Dec_varContext dec_var() {
			return getRuleContext(Dec_varContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
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
		enterRule(_localctx, 22, RULE_corpo_main);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(T__4);
				setState(144);
				dec_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				bloco();
				setState(146);
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

	public static class Dec_metodoContext extends ParserRuleContext {
		public Mod_metodoContext mod_metodo() {
			return getRuleContext(Mod_metodoContext.class,0);
		}
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public Corpo_metodoContext corpo_metodo() {
			return getRuleContext(Corpo_metodoContext.class,0);
		}
		public Dec_met_mainContext dec_met_main() {
			return getRuleContext(Dec_met_mainContext.class,0);
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
		enterRule(_localctx, 24, RULE_dec_metodo);
		int _la;
		try {
			setState(175);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				mod_metodo();
				setState(153);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(151);
					match(VOID);
					}
					break;
				case INTEIRO:
				case DOUBLE:
				case FLOAT:
				case STRING:
				case CHAR:
				case LONG:
				case BOOLEAN:
				case SHORT:
					{
					setState(152);
					tipo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(155);
				identificador();
				setState(156);
				match(T__2);
				setState(168);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIRO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << SHORT))) != 0)) {
					{
					setState(157);
					tipo();
					setState(158);
					identificador();
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(159);
						match(T__6);
						setState(160);
						tipo();
						setState(161);
						identificador();
						}
						}
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(170);
				match(T__3);
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(171);
					corpo_metodo();
					}
					break;
				}
				}
				break;
			case PUBLIC:
			case PRIVATE:
			case STATIC:
			case FINAL:
			case ABSTRACT:
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				dec_met_main();
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

	public static class Mod_metodoContext extends ParserRuleContext {
		public Mod_metodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMod_metodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMod_metodo(this);
		}
	}

	public final Mod_metodoContext mod_metodo() throws RecognitionException {
		Mod_metodoContext _localctx = new Mod_metodoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mod_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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

	public static class Corpo_metodoContext extends ParserRuleContext {
		public Dec_varContext dec_var() {
			return getRuleContext(Dec_varContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
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
		enterRule(_localctx, 28, RULE_corpo_metodo);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(T__4);
				setState(180);
				dec_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				bloco();
				setState(186);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(182);
					match(RETURN);
					setState(183);
					expr();
					setState(184);
					match(T__1);
					}
				}

				setState(188);
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

	public static class Dec_varContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
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
		enterRule(_localctx, 30, RULE_dec_var);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				tipo();
				setState(193);
				identificador();
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(194);
					match(T__6);
					setState(195);
					identificador();
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				tipo();
				setState(204);
				identificador();
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(205);
					match(T__11);
					setState(206);
					match(T__12);
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(212);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
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

	public static class Dec_var_mainContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Dec_var_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_var_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDec_var_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDec_var_main(this);
		}
	}

	public final Dec_var_mainContext dec_var_main() throws RecognitionException {
		Dec_var_mainContext _localctx = new Dec_var_mainContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dec_var_main);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				tipo();
				setState(218);
				identificador();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(219);
					match(T__11);
					setState(220);
					match(T__12);
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				tipo();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(227);
					match(T__11);
					setState(228);
					match(T__12);
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				identificador();
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
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public Op_atrContext op_atr() {
			return getRuleContext(Op_atrContext.class,0);
		}
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode DOUBLE_FLOAT() { return getToken(JavaParser.DOUBLE_FLOAT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_atribuir);
		int _la;
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				tipo();
				setState(239);
				identificador();
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(240);
					match(T__6);
					setState(241);
					identificador();
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247);
				op_atr();
				setState(251);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(248);
					identificador();
					}
					break;
				case INT:
					{
					setState(249);
					match(INT);
					}
					break;
				case DOUBLE_FLOAT:
					{
					setState(250);
					match(DOUBLE_FLOAT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(253);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				tipo();
				setState(256);
				identificador();
				setState(257);
				op_atr();
				setState(261);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(258);
					identificador();
					}
					break;
				case INT:
					{
					setState(259);
					match(INT);
					}
					break;
				case DOUBLE_FLOAT:
					{
					setState(260);
					match(DOUBLE_FLOAT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(263);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				identificador();
				setState(266);
				op_atr();
				setState(270);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(267);
					identificador();
					}
					break;
				case INT:
					{
					setState(268);
					match(INT);
					}
					break;
				case DOUBLE_FLOAT:
					{
					setState(269);
					match(DOUBLE_FLOAT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(272);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIRO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << SHORT))) != 0)) {
					{
					setState(274);
					tipo();
					}
				}

				setState(277);
				identificador();
				setState(278);
				op_atr();
				setState(279);
				expr();
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

	public static class BlocoContext extends ParserRuleContext {
		public Dec_varContext dec_var() {
			return getRuleContext(Dec_varContext.class,0);
		}
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
		public SaidaContext saida() {
			return getRuleContext(SaidaContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(283);
				dec_var();
				}
				break;
			case 2:
				{
				setState(284);
				cond_if();
				}
				break;
			case 3:
				{
				setState(285);
				loop_for();
				}
				break;
			case 4:
				{
				setState(286);
				loop_while();
				}
				break;
			case 5:
				{
				setState(287);
				cond_switch();
				}
				break;
			case 6:
				{
				setState(288);
				saida();
				}
				break;
			case 7:
				{
				setState(289);
				match(T__4);
				setState(290);
				bloco();
				setState(291);
				match(T__5);
				}
				break;
			case 8:
				{
				setState(293);
				expr();
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

	public static class Cond_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
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
		enterRule(_localctx, 38, RULE_cond_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(IF);
			setState(297);
			match(T__2);
			setState(298);
			expr();
			setState(299);
			match(T__3);
			setState(300);
			bloco();
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(301);
				match(ELSE);
				setState(302);
				bloco();
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
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
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
		enterRule(_localctx, 40, RULE_loop_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(FOR);
			setState(306);
			match(T__2);
			setState(307);
			match(INTEIRO);
			setState(308);
			identificador();
			setState(309);
			match(ATR);
			setState(310);
			match(INT);
			setState(311);
			match(T__1);
			setState(312);
			identificador();
			setState(315);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(313);
				match(T__0);
				setState(314);
				match(T__13);
				}
			}

			setState(317);
			_la = _input.LA(1);
			if ( !(_la==MAIOR || _la==MENOR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(318);
			literal();
			setState(319);
			match(T__1);
			setState(320);
			match(ID);
			setState(321);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(322);
			bloco();
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
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
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
		enterRule(_localctx, 42, RULE_loop_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(WHILE);
			setState(325);
			match(T__2);
			setState(326);
			expr();
			setState(327);
			match(T__3);
			setState(328);
			bloco();
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
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<TerminalNode> CASE() { return getTokens(JavaParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(JavaParser.CASE, i);
		}
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
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
		enterRule(_localctx, 44, RULE_cond_switch);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(SWITCH);
			setState(331);
			match(T__2);
			setState(332);
			expr();
			setState(333);
			match(T__3);
			setState(334);
			bloco();
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(335);
					match(CASE);
					setState(336);
					identificador();
					setState(337);
					match(T__16);
					setState(338);
					bloco();
					setState(339);
					match(BREAK);
					setState(340);
					match(T__1);
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(347);
				match(DEFAULT);
				setState(348);
				bloco();
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

	public static class SaidaContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(JavaParser.OUT, 0); }
		public Tipo_printContext tipo_print() {
			return getRuleContext(Tipo_printContext.class,0);
		}
		public SaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSaida(this);
		}
	}

	public final SaidaContext saida() throws RecognitionException {
		SaidaContext _localctx = new SaidaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_saida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(T__17);
			setState(352);
			match(T__0);
			setState(353);
			match(OUT);
			setState(354);
			match(T__0);
			setState(355);
			tipo_print();
			setState(356);
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

	public static class Tipo_printContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PrintfContext printf() {
			return getRuleContext(PrintfContext.class,0);
		}
		public Tipo_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTipo_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTipo_print(this);
		}
	}

	public final Tipo_printContext tipo_print() throws RecognitionException {
		Tipo_printContext _localctx = new Tipo_printContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tipo_print);
		try {
			setState(360);
			switch (_input.LA(1)) {
			case PRINT:
			case PRINTLN:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				print();
				}
				break;
			case PRINTF:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				printf();
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
		public TerminalNode PRINT() { return getToken(JavaParser.PRINT, 0); }
		public TerminalNode PRINTLN() { return getToken(JavaParser.PRINTLN, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_print);
		int _la;
		try {
			setState(392);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(PRINT);
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(PRINTLN);
				setState(364);
				match(T__2);
				setState(374);
				switch (_input.LA(1)) {
				case T__18:
					{
					setState(365);
					match(T__18);
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2 || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ID - 67)) | (1L << (INT - 67)) | (1L << (DOUBLE_FLOAT - 67)))) != 0)) {
						{
						{
						setState(366);
						literal();
						}
						}
						setState(371);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(372);
					match(T__18);
					}
					break;
				case T__2:
				case ID:
				case INT:
				case DOUBLE_FLOAT:
					{
					setState(373);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				{
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2 || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ID - 67)) | (1L << (INT - 67)) | (1L << (DOUBLE_FLOAT - 67)) | (1L << (MAIS - 67)))) != 0)) {
					{
					setState(386);
					switch (_input.LA(1)) {
					case MAIS:
						{
						setState(376);
						match(MAIS);
						setState(377);
						match(T__18);
						setState(381);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2 || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ID - 67)) | (1L << (INT - 67)) | (1L << (DOUBLE_FLOAT - 67)))) != 0)) {
							{
							{
							setState(378);
							literal();
							}
							}
							setState(383);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(384);
						match(T__18);
						}
						break;
					case T__2:
					case ID:
					case INT:
					case DOUBLE_FLOAT:
						{
						setState(385);
						literal();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(390);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(391);
				match(T__3);
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

	public static class PrintfContext extends ParserRuleContext {
		public TerminalNode PRINTF() { return getToken(JavaParser.PRINTF, 0); }
		public List<TerminalNode> MASCARA() { return getTokens(JavaParser.MASCARA); }
		public TerminalNode MASCARA(int i) {
			return getToken(JavaParser.MASCARA, i);
		}
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public PrintfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrintf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrintf(this);
		}
	}

	public final PrintfContext printf() throws RecognitionException {
		PrintfContext _localctx = new PrintfContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_printf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(PRINTF);
			setState(395);
			match(T__2);
			setState(396);
			match(T__18);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MASCARA) {
				{
				{
				setState(397);
				match(MASCARA);
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(403);
			match(T__18);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(404);
				match(T__6);
				setState(405);
				identificador();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			match(T__3);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Op_AContext op_A() {
			return getRuleContext(Op_AContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public AtribuirContext atribuir() {
			return getRuleContext(AtribuirContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_expr);
		int _la;
		try {
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				term();
				setState(417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(414);
					op_A();
					setState(415);
					expr();
					}
					break;
				}
				setState(420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(419);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				literal();
				setState(423);
				match(T__0);
				setState(424);
				identificador();
				setState(425);
				match(T__2);
				setState(434);
				_la = _input.LA(1);
				if (_la==T__2 || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ID - 67)) | (1L << (INT - 67)) | (1L << (DOUBLE_FLOAT - 67)))) != 0)) {
					{
					setState(426);
					literal();
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(427);
						match(T__6);
						setState(428);
						literal();
						}
						}
						setState(433);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(436);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				identificador();
				setState(439);
				match(ATR);
				setState(440);
				match(NEW);
				setState(441);
				tipo();
				setState(442);
				identificador();
				setState(443);
				match(T__2);
				setState(445);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(444);
					identificador();
					}
				}

				setState(447);
				match(T__3);
				setState(448);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(450);
				literal();
				setState(451);
				match(T__0);
				setState(452);
				identificador();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(454);
				literal();
				setState(455);
				match(T__11);
				setState(456);
				literal();
				setState(457);
				match(T__12);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(459);
				literal();
				setState(460);
				match(T__19);
				setState(461);
				literal();
				setState(462);
				match(T__16);
				setState(463);
				literal();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(465);
				match(T__20);
				setState(466);
				literal();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(467);
				literal();
				setState(468);
				match(T__14);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(470);
				literal();
				setState(471);
				match(T__15);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(473);
				identificador();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(474);
				literal();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(475);
				atribuir();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(476);
				match(INT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(477);
				match(DOUBLE_FLOAT);
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

	public static class TermContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Op_BContext op_B() {
			return getRuleContext(Op_BContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			literal();
			setState(484);
			_la = _input.LA(1);
			if (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (MULT - 74)) | (1L << (DIV - 74)) | (1L << (E - 74)) | (1L << (OU - 74)) | (1L << (MAIOR_IG - 74)) | (1L << (MENOR_IG - 74)) | (1L << (DIF - 74)) | (1L << (IG - 74)) | (1L << (MAIOR - 74)) | (1L << (MENOR - 74)))) != 0)) {
				{
				setState(481);
				op_B();
				setState(482);
				expr();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode DOUBLE_FLOAT() { return getToken(JavaParser.DOUBLE_FLOAT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_literal);
		try {
			setState(493);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				match(INT);
				}
				break;
			case DOUBLE_FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				match(DOUBLE_FLOAT);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				match(T__2);
				setState(490);
				expr();
				setState(491);
				match(T__3);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(JavaParser.INTEIRO, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(JavaParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(JavaParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(JavaParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(JavaParser.BOOLEAN, 0); }
		public TerminalNode LONG() { return getToken(JavaParser.LONG, 0); }
		public TerminalNode SHORT() { return getToken(JavaParser.SHORT, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIRO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << SHORT))) != 0)) ) {
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

	public static class Op_AContext extends ParserRuleContext {
		public TerminalNode MAIS() { return getToken(JavaParser.MAIS, 0); }
		public TerminalNode MENOS() { return getToken(JavaParser.MENOS, 0); }
		public Op_AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_A; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterOp_A(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitOp_A(this);
		}
	}

	public final Op_AContext op_A() throws RecognitionException {
		Op_AContext _localctx = new Op_AContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_op_A);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_la = _input.LA(1);
			if ( !(_la==MAIS || _la==MENOS) ) {
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

	public static class Op_BContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(JavaParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(JavaParser.DIV, 0); }
		public TerminalNode E() { return getToken(JavaParser.E, 0); }
		public TerminalNode OU() { return getToken(JavaParser.OU, 0); }
		public TerminalNode MAIOR_IG() { return getToken(JavaParser.MAIOR_IG, 0); }
		public TerminalNode MENOR_IG() { return getToken(JavaParser.MENOR_IG, 0); }
		public TerminalNode DIF() { return getToken(JavaParser.DIF, 0); }
		public TerminalNode IG() { return getToken(JavaParser.IG, 0); }
		public TerminalNode MAIOR() { return getToken(JavaParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(JavaParser.MENOR, 0); }
		public Op_BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_B; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterOp_B(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitOp_B(this);
		}
	}

	public final Op_BContext op_B() throws RecognitionException {
		Op_BContext _localctx = new Op_BContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_op_B);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (MULT - 74)) | (1L << (DIV - 74)) | (1L << (E - 74)) | (1L << (OU - 74)) | (1L << (MAIOR_IG - 74)) | (1L << (MENOR_IG - 74)) | (1L << (DIF - 74)) | (1L << (IG - 74)) | (1L << (MAIOR - 74)) | (1L << (MENOR - 74)))) != 0)) ) {
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

	public static class Op_atrContext extends ParserRuleContext {
		public TerminalNode ATR() { return getToken(JavaParser.ATR, 0); }
		public TerminalNode MAIS_ATR() { return getToken(JavaParser.MAIS_ATR, 0); }
		public TerminalNode MENOS_ATR() { return getToken(JavaParser.MENOS_ATR, 0); }
		public TerminalNode MULT_ATR() { return getToken(JavaParser.MULT_ATR, 0); }
		public TerminalNode DIV_ATR() { return getToken(JavaParser.DIV_ATR, 0); }
		public TerminalNode MOD_ATR() { return getToken(JavaParser.MOD_ATR, 0); }
		public Op_atrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_atr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterOp_atr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitOp_atr(this);
		}
	}

	public final Op_atrContext op_atr() throws RecognitionException {
		Op_atrContext _localctx = new Op_atrContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_op_atr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (ATR - 87)) | (1L << (MAIS_ATR - 87)) | (1L << (MENOS_ATR - 87)) | (1L << (MULT_ATR - 87)) | (1L << (DIV_ATR - 87)) | (1L << (MOD_ATR - 87)))) != 0)) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3b\u01fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\5\2H\n\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3\5\3\6\5"+
		"\6c\n\6\3\6\3\6\3\6\3\6\5\6i\n\6\3\6\3\6\5\6m\n\6\3\6\7\6p\n\6\f\6\16"+
		"\6s\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\7\13\u0086\n\13\f\13\16\13\u0089\13\13\3\13\3\13\3\f\3\f\3\f"+
		"\5\f\u0090\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u0097\n\r\3\16\3\16\3\16\5\16\u009c"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a6\n\16\f\16\16"+
		"\16\u00a9\13\16\5\16\u00ab\n\16\3\16\3\16\5\16\u00af\n\16\3\16\5\16\u00b2"+
		"\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00bd\n\20\3\20"+
		"\3\20\5\20\u00c1\n\20\3\21\3\21\3\21\3\21\7\21\u00c7\n\21\f\21\16\21\u00ca"+
		"\13\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00d2\n\21\f\21\16\21\u00d5"+
		"\13\21\3\21\3\21\3\21\5\21\u00da\n\21\3\22\3\22\3\22\3\22\7\22\u00e0\n"+
		"\22\f\22\16\22\u00e3\13\22\3\22\3\22\3\22\7\22\u00e8\n\22\f\22\16\22\u00eb"+
		"\13\22\3\22\3\22\5\22\u00ef\n\22\3\23\3\23\3\23\3\23\7\23\u00f5\n\23\f"+
		"\23\16\23\u00f8\13\23\3\23\3\23\3\23\3\23\5\23\u00fe\n\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u0108\n\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0111\n\23\3\23\3\23\3\23\5\23\u0116\n\23\3\23\3\23\3"+
		"\23\3\23\5\23\u011c\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0129\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0132"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u013e\n\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0159\n\30"+
		"\f\30\16\30\u015c\13\30\3\30\3\30\5\30\u0160\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\5\32\u016b\n\32\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u0172\n\33\f\33\16\33\u0175\13\33\3\33\3\33\5\33\u0179\n\33\3\33\3\33"+
		"\3\33\7\33\u017e\n\33\f\33\16\33\u0181\13\33\3\33\3\33\7\33\u0185\n\33"+
		"\f\33\16\33\u0188\13\33\3\33\5\33\u018b\n\33\3\34\3\34\3\34\3\34\7\34"+
		"\u0191\n\34\f\34\16\34\u0194\13\34\3\34\3\34\3\34\7\34\u0199\n\34\f\34"+
		"\16\34\u019c\13\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u01a4\n\35\3\35"+
		"\5\35\u01a7\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u01b0\n\35\f"+
		"\35\16\35\u01b3\13\35\5\35\u01b5\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\5\35\u01c0\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01e1\n\35\3\36\3\36"+
		"\3\36\3\36\5\36\u01e7\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01f0"+
		"\n\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\n\3\2\33 \3\2\n\r\3\2WX\3\2\21"+
		"\22\3\28?\3\2JK\4\2LQUX\3\2Y^\u0225\2G\3\2\2\2\4Q\3\2\2\2\6T\3\2\2\2\b"+
		"W\3\2\2\2\nb\3\2\2\2\ft\3\2\2\2\16v\3\2\2\2\20}\3\2\2\2\22\u0081\3\2\2"+
		"\2\24\u0083\3\2\2\2\26\u008f\3\2\2\2\30\u0096\3\2\2\2\32\u00b1\3\2\2\2"+
		"\34\u00b3\3\2\2\2\36\u00c0\3\2\2\2 \u00d9\3\2\2\2\"\u00ee\3\2\2\2$\u011b"+
		"\3\2\2\2&\u0128\3\2\2\2(\u012a\3\2\2\2*\u0133\3\2\2\2,\u0146\3\2\2\2."+
		"\u014c\3\2\2\2\60\u0161\3\2\2\2\62\u016a\3\2\2\2\64\u018a\3\2\2\2\66\u018c"+
		"\3\2\2\28\u01e0\3\2\2\2:\u01e2\3\2\2\2<\u01ef\3\2\2\2>\u01f1\3\2\2\2@"+
		"\u01f3\3\2\2\2B\u01f5\3\2\2\2D\u01f7\3\2\2\2FH\5\4\3\2GF\3\2\2\2GH\3\2"+
		"\2\2HL\3\2\2\2IK\5\6\4\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2"+
		"\2\2NL\3\2\2\2OP\5\n\6\2P\3\3\2\2\2QR\7\30\2\2RS\5\b\5\2S\5\3\2\2\2TU"+
		"\7\31\2\2UV\5\b\5\2V\7\3\2\2\2W\\\7E\2\2XY\7\3\2\2Y[\7E\2\2ZX\3\2\2\2"+
		"[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\4\2\2`\t\3\2"+
		"\2\2ac\5\22\n\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\"\2\2eh\5\f\7\2fg\7"+
		"\32\2\2gi\5\f\7\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2jk\7!\2\2km\5\f\7\2lj\3"+
		"\2\2\2lm\3\2\2\2mq\3\2\2\2np\5\24\13\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2q"+
		"r\3\2\2\2r\13\3\2\2\2sq\3\2\2\2tu\7E\2\2u\r\3\2\2\2vw\5\22\n\2wx\7\35"+
		"\2\2xy\7#\2\2yz\5\f\7\2z{\5\20\t\2{|\5\24\13\2|\17\3\2\2\2}~\7\5\2\2~"+
		"\177\5\"\22\2\177\u0080\7\6\2\2\u0080\21\3\2\2\2\u0081\u0082\t\2\2\2\u0082"+
		"\23\3\2\2\2\u0083\u0087\7\7\2\2\u0084\u0086\5\26\f\2\u0085\u0084\3\2\2"+
		"\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\b\2\2\u008b\25\3\2\2\2\u008c"+
		"\u0090\5\32\16\2\u008d\u0090\5\n\6\2\u008e\u0090\5&\24\2\u008f\u008c\3"+
		"\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\27\3\2\2\2\u0091"+
		"\u0092\7\7\2\2\u0092\u0097\5 \21\2\u0093\u0094\5&\24\2\u0094\u0095\7\b"+
		"\2\2\u0095\u0097\3\2\2\2\u0096\u0091\3\2\2\2\u0096\u0093\3\2\2\2\u0097"+
		"\31\3\2\2\2\u0098\u009b\5\34\17\2\u0099\u009c\7#\2\2\u009a\u009c\5> \2"+
		"\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e"+
		"\5\f\7\2\u009e\u00aa\7\5\2\2\u009f\u00a0\5> \2\u00a0\u00a7\5\f\7\2\u00a1"+
		"\u00a2\7\t\2\2\u00a2\u00a3\5> \2\u00a3\u00a4\5\f\7\2\u00a4\u00a6\3\2\2"+
		"\2\u00a5\u00a1\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u009f\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\7\6\2\2\u00ad\u00af\5\36"+
		"\20\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00b2\5\16\b\2\u00b1\u0098\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\33\3\2\2"+
		"\2\u00b3\u00b4\t\3\2\2\u00b4\35\3\2\2\2\u00b5\u00b6\7\7\2\2\u00b6\u00c1"+
		"\5 \21\2\u00b7\u00bc\5&\24\2\u00b8\u00b9\7%\2\2\u00b9\u00ba\58\35\2\u00ba"+
		"\u00bb\7\4\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7\b\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00b5\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c1\37\3\2\2\2\u00c2\u00c3\5> \2"+
		"\u00c3\u00c8\5\f\7\2\u00c4\u00c5\7\t\2\2\u00c5\u00c7\5\f\7\2\u00c6\u00c4"+
		"\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7\4\2\2\u00cc\u00da\3\2"+
		"\2\2\u00cd\u00ce\5> \2\u00ce\u00d3\5\f\7\2\u00cf\u00d0\7\16\2\2\u00d0"+
		"\u00d2\7\17\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3"+
		"\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00d7\7\4\2\2\u00d7\u00da\3\2\2\2\u00d8\u00da\5$\23\2\u00d9\u00c2\3\2"+
		"\2\2\u00d9\u00cd\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da!\3\2\2\2\u00db\u00dc"+
		"\5> \2\u00dc\u00e1\5\f\7\2\u00dd\u00de\7\16\2\2\u00de\u00e0\7\17\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00ef\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e9\5> \2\u00e5\u00e6"+
		"\7\16\2\2\u00e6\u00e8\7\17\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2"+
		"\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00ec\u00ed\5\f\7\2\u00ed\u00ef\3\2\2\2\u00ee\u00db\3\2\2\2\u00ee"+
		"\u00e4\3\2\2\2\u00ef#\3\2\2\2\u00f0\u00f1\5> \2\u00f1\u00f6\5\f\7\2\u00f2"+
		"\u00f3\7\t\2\2\u00f3\u00f5\5\f\7\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fd\5D#\2\u00fa\u00fe\5\f\7\2\u00fb\u00fe\7H\2"+
		"\2\u00fc\u00fe\7I\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7\4\2\2\u0100\u011c\3\2\2\2\u0101"+
		"\u0102\5> \2\u0102\u0103\5\f\7\2\u0103\u0107\5D#\2\u0104\u0108\5\f\7\2"+
		"\u0105\u0108\7H\2\2\u0106\u0108\7I\2\2\u0107\u0104\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7\4\2\2\u010a"+
		"\u011c\3\2\2\2\u010b\u010c\5\f\7\2\u010c\u0110\5D#\2\u010d\u0111\5\f\7"+
		"\2\u010e\u0111\7H\2\2\u010f\u0111\7I\2\2\u0110\u010d\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7\4\2\2\u0113"+
		"\u011c\3\2\2\2\u0114\u0116\5> \2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2"+
		"\2\u0116\u0117\3\2\2\2\u0117\u0118\5\f\7\2\u0118\u0119\5D#\2\u0119\u011a"+
		"\58\35\2\u011a\u011c\3\2\2\2\u011b\u00f0\3\2\2\2\u011b\u0101\3\2\2\2\u011b"+
		"\u010b\3\2\2\2\u011b\u0115\3\2\2\2\u011c%\3\2\2\2\u011d\u0129\5 \21\2"+
		"\u011e\u0129\5(\25\2\u011f\u0129\5*\26\2\u0120\u0129\5,\27\2\u0121\u0129"+
		"\5.\30\2\u0122\u0129\5\60\31\2\u0123\u0124\7\7\2\2\u0124\u0125\5&\24\2"+
		"\u0125\u0126\7\b\2\2\u0126\u0129\3\2\2\2\u0127\u0129\58\35\2\u0128\u011d"+
		"\3\2\2\2\u0128\u011e\3\2\2\2\u0128\u011f\3\2\2\2\u0128\u0120\3\2\2\2\u0128"+
		"\u0121\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0123\3\2\2\2\u0128\u0127\3\2"+
		"\2\2\u0129\'\3\2\2\2\u012a\u012b\7&\2\2\u012b\u012c\7\5\2\2\u012c\u012d"+
		"\58\35\2\u012d\u012e\7\6\2\2\u012e\u0131\5&\24\2\u012f\u0130\7\'\2\2\u0130"+
		"\u0132\5&\24\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132)\3\2\2\2"+
		"\u0133\u0134\7)\2\2\u0134\u0135\7\5\2\2\u0135\u0136\78\2\2\u0136\u0137"+
		"\5\f\7\2\u0137\u0138\7Y\2\2\u0138\u0139\7H\2\2\u0139\u013a\7\4\2\2\u013a"+
		"\u013d\5\f\7\2\u013b\u013c\7\3\2\2\u013c\u013e\7\20\2\2\u013d\u013b\3"+
		"\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\t\4\2\2\u0140"+
		"\u0141\5<\37\2\u0141\u0142\7\4\2\2\u0142\u0143\7E\2\2\u0143\u0144\t\5"+
		"\2\2\u0144\u0145\5&\24\2\u0145+\3\2\2\2\u0146\u0147\7(\2\2\u0147\u0148"+
		"\7\5\2\2\u0148\u0149\58\35\2\u0149\u014a\7\6\2\2\u014a\u014b\5&\24\2\u014b"+
		"-\3\2\2\2\u014c\u014d\7*\2\2\u014d\u014e\7\5\2\2\u014e\u014f\58\35\2\u014f"+
		"\u0150\7\6\2\2\u0150\u015a\5&\24\2\u0151\u0152\7+\2\2\u0152\u0153\5\f"+
		"\7\2\u0153\u0154\7\23\2\2\u0154\u0155\5&\24\2\u0155\u0156\7,\2\2\u0156"+
		"\u0157\7\4\2\2\u0157\u0159\3\2\2\2\u0158\u0151\3\2\2\2\u0159\u015c\3\2"+
		"\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015f\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015d\u015e\7.\2\2\u015e\u0160\5&\24\2\u015f\u015d\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160/\3\2\2\2\u0161\u0162\7\24\2\2\u0162\u0163"+
		"\7\3\2\2\u0163\u0164\7C\2\2\u0164\u0165\7\3\2\2\u0165\u0166\5\62\32\2"+
		"\u0166\u0167\7\4\2\2\u0167\61\3\2\2\2\u0168\u016b\5\64\33\2\u0169\u016b"+
		"\5\66\34\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b\63\3\2\2\2\u016c"+
		"\u018b\7@\2\2\u016d\u016e\7A\2\2\u016e\u0178\7\5\2\2\u016f\u0173\7\25"+
		"\2\2\u0170\u0172\5<\37\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0176\u0179\7\25\2\2\u0177\u0179\5<\37\2\u0178\u016f\3\2\2\2\u0178"+
		"\u0177\3\2\2\2\u0179\u0186\3\2\2\2\u017a\u017b\7J\2\2\u017b\u017f\7\25"+
		"\2\2\u017c\u017e\5<\37\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0182\u0185\7\25\2\2\u0183\u0185\5<\37\2\u0184\u017a\3\2\2\2\u0184"+
		"\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018b\7\6\2\2\u018a"+
		"\u016c\3\2\2\2\u018a\u016d\3\2\2\2\u018b\65\3\2\2\2\u018c\u018d\7B\2\2"+
		"\u018d\u018e\7\5\2\2\u018e\u0192\7\25\2\2\u018f\u0191\7G\2\2\u0190\u018f"+
		"\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u019a\7\25\2\2\u0196\u0197\7"+
		"\t\2\2\u0197\u0199\5\f\7\2\u0198\u0196\3\2\2\2\u0199\u019c\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019d\u019e\7\6\2\2\u019e\67\3\2\2\2\u019f\u01a3\5:\36\2\u01a0\u01a1"+
		"\5@!\2\u01a1\u01a2\58\35\2\u01a2\u01a4\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a7\7\4\2\2\u01a6\u01a5\3\2"+
		"\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01e1\3\2\2\2\u01a8\u01a9\5<\37\2\u01a9"+
		"\u01aa\7\3\2\2\u01aa\u01ab\5\f\7\2\u01ab\u01b4\7\5\2\2\u01ac\u01b1\5<"+
		"\37\2\u01ad\u01ae\7\t\2\2\u01ae\u01b0\5<\37\2\u01af\u01ad\3\2\2\2\u01b0"+
		"\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b5\3\2"+
		"\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01ac\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01b7\7\6\2\2\u01b7\u01e1\3\2\2\2\u01b8\u01b9\5\f"+
		"\7\2\u01b9\u01ba\7Y\2\2\u01ba\u01bb\7-\2\2\u01bb\u01bc\5> \2\u01bc\u01bd"+
		"\5\f\7\2\u01bd\u01bf\7\5\2\2\u01be\u01c0\5\f\7\2\u01bf\u01be\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\7\6\2\2\u01c2\u01c3\7\4"+
		"\2\2\u01c3\u01e1\3\2\2\2\u01c4\u01c5\5<\37\2\u01c5\u01c6\7\3\2\2\u01c6"+
		"\u01c7\5\f\7\2\u01c7\u01e1\3\2\2\2\u01c8\u01c9\5<\37\2\u01c9\u01ca\7\16"+
		"\2\2\u01ca\u01cb\5<\37\2\u01cb\u01cc\7\17\2\2\u01cc\u01e1\3\2\2\2\u01cd"+
		"\u01ce\5<\37\2\u01ce\u01cf\7\26\2\2\u01cf\u01d0\5<\37\2\u01d0\u01d1\7"+
		"\23\2\2\u01d1\u01d2\5<\37\2\u01d2\u01e1\3\2\2\2\u01d3\u01d4\7\27\2\2\u01d4"+
		"\u01e1\5<\37\2\u01d5\u01d6\5<\37\2\u01d6\u01d7\7\21\2\2\u01d7\u01e1\3"+
		"\2\2\2\u01d8\u01d9\5<\37\2\u01d9\u01da\7\22\2\2\u01da\u01e1\3\2\2\2\u01db"+
		"\u01e1\5\f\7\2\u01dc\u01e1\5<\37\2\u01dd\u01e1\5$\23\2\u01de\u01e1\7H"+
		"\2\2\u01df\u01e1\7I\2\2\u01e0\u019f\3\2\2\2\u01e0\u01a8\3\2\2\2\u01e0"+
		"\u01b8\3\2\2\2\u01e0\u01c4\3\2\2\2\u01e0\u01c8\3\2\2\2\u01e0\u01cd\3\2"+
		"\2\2\u01e0\u01d3\3\2\2\2\u01e0\u01d5\3\2\2\2\u01e0\u01d8\3\2\2\2\u01e0"+
		"\u01db\3\2\2\2\u01e0\u01dc\3\2\2\2\u01e0\u01dd\3\2\2\2\u01e0\u01de\3\2"+
		"\2\2\u01e0\u01df\3\2\2\2\u01e19\3\2\2\2\u01e2\u01e6\5<\37\2\u01e3\u01e4"+
		"\5B\"\2\u01e4\u01e5\58\35\2\u01e5\u01e7\3\2\2\2\u01e6\u01e3\3\2\2\2\u01e6"+
		"\u01e7\3\2\2\2\u01e7;\3\2\2\2\u01e8\u01f0\7E\2\2\u01e9\u01f0\7H\2\2\u01ea"+
		"\u01f0\7I\2\2\u01eb\u01ec\7\5\2\2\u01ec\u01ed\58\35\2\u01ed\u01ee\7\6"+
		"\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01e8\3\2\2\2\u01ef\u01e9\3\2\2\2\u01ef"+
		"\u01ea\3\2\2\2\u01ef\u01eb\3\2\2\2\u01f0=\3\2\2\2\u01f1\u01f2\t\6\2\2"+
		"\u01f2?\3\2\2\2\u01f3\u01f4\t\7\2\2\u01f4A\3\2\2\2\u01f5\u01f6\t\b\2\2"+
		"\u01f6C\3\2\2\2\u01f7\u01f8\t\t\2\2\u01f8E\3\2\2\2\65GL\\bhlq\u0087\u008f"+
		"\u0096\u009b\u00a7\u00aa\u00ae\u00b1\u00bc\u00c0\u00c8\u00d3\u00d9\u00e1"+
		"\u00e9\u00ee\u00f6\u00fd\u0107\u0110\u0115\u011b\u0128\u0131\u013d\u015a"+
		"\u015f\u016a\u0173\u0178\u017f\u0184\u0186\u018a\u0192\u019a\u01a3\u01a6"+
		"\u01b1\u01b4\u01bf\u01e0\u01e6\u01ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
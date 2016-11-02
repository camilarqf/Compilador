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
		enterRule(_localctx, 8, RULE_dec_classe);
		int _la;
		try {
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

			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(108);
				corpo_classe();
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
			setState(111);
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
			setState(113);
			mod_classe();
			setState(114);
			match(STATIC);
			setState(115);
			match(VOID);
			setState(116);
			identificador();
			setState(117);
			param();
			setState(118);
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
			setState(120);
			match(T__2);
			setState(121);
			dec_var_main();
			setState(122);
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
			setState(124);
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
			setState(126);
			match(T__4);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__17) | (1L << T__20) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << STATIC) | (1L << FINAL) | (1L << ABSTRACT) | (1L << PROTECTED) | (1L << CLASS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << INTEIRO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << SHORT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ID - 67)) | (1L << (INT - 67)) | (1L << (DOUBLE_FLOAT - 67)))) != 0)) {
				{
				{
				setState(127);
				dec_corpo_classe();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				dec_metodo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				dec_classe();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
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
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(T__4);
				setState(141);
				dec_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				bloco();
				setState(143);
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
			setState(172);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				mod_metodo();
				setState(150);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(148);
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
					setState(149);
					tipo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(152);
				identificador();
				setState(153);
				match(T__2);
				setState(165);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIRO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << SHORT))) != 0)) {
					{
					setState(154);
					tipo();
					setState(155);
					identificador();
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(156);
						match(T__6);
						setState(157);
						tipo();
						setState(158);
						identificador();
						}
						}
						setState(164);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(167);
				match(T__3);
				setState(169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(168);
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
				setState(171);
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
			setState(174);
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
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(T__4);
				setState(177);
				dec_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				bloco();
				setState(183);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(179);
					match(RETURN);
					setState(180);
					expr(0);
					setState(181);
					match(T__1);
					}
				}

				setState(185);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				tipo();
				setState(190);
				identificador();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(191);
					match(T__6);
					setState(192);
					identificador();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				tipo();
				setState(201);
				identificador();
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(202);
					match(T__11);
					setState(203);
					match(T__12);
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				expr(0);
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
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				tipo();
				setState(215);
				identificador();
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(216);
					match(T__11);
					setState(217);
					match(T__12);
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				tipo();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(224);
					match(T__11);
					setState(225);
					match(T__12);
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(231);
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
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				tipo();
				setState(236);
				identificador();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(237);
					match(T__6);
					setState(238);
					identificador();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244);
				op_atr();
				setState(248);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(245);
					identificador();
					}
					break;
				case INT:
					{
					setState(246);
					match(INT);
					}
					break;
				case DOUBLE_FLOAT:
					{
					setState(247);
					match(DOUBLE_FLOAT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(250);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				tipo();
				setState(253);
				identificador();
				setState(254);
				op_atr();
				setState(258);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(255);
					identificador();
					}
					break;
				case INT:
					{
					setState(256);
					match(INT);
					}
					break;
				case DOUBLE_FLOAT:
					{
					setState(257);
					match(DOUBLE_FLOAT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(260);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				identificador();
				setState(263);
				op_atr();
				setState(267);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(264);
					identificador();
					}
					break;
				case INT:
					{
					setState(265);
					match(INT);
					}
					break;
				case DOUBLE_FLOAT:
					{
					setState(266);
					match(DOUBLE_FLOAT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(269);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIRO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << SHORT))) != 0)) {
					{
					setState(271);
					tipo();
					}
				}

				setState(274);
				identificador();
				setState(275);
				op_atr();
				setState(276);
				expr(0);
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
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(280);
				dec_var();
				}
				break;
			case 2:
				{
				setState(281);
				cond_if();
				}
				break;
			case 3:
				{
				setState(282);
				loop_for();
				}
				break;
			case 4:
				{
				setState(283);
				loop_while();
				}
				break;
			case 5:
				{
				setState(284);
				cond_switch();
				}
				break;
			case 6:
				{
				setState(285);
				saida();
				}
				break;
			case 7:
				{
				setState(286);
				match(T__4);
				setState(287);
				bloco();
				setState(288);
				match(T__5);
				}
				break;
			case 8:
				{
				setState(290);
				expr(0);
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
			setState(293);
			match(IF);
			setState(294);
			match(T__2);
			setState(295);
			expr(0);
			setState(296);
			match(T__3);
			setState(297);
			bloco();
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(298);
				match(ELSE);
				setState(299);
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
			setState(302);
			match(FOR);
			setState(303);
			match(T__2);
			setState(304);
			match(INTEIRO);
			setState(305);
			identificador();
			setState(306);
			match(ATR);
			setState(307);
			match(INT);
			setState(308);
			match(T__1);
			setState(309);
			identificador();
			setState(312);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(310);
				match(T__0);
				setState(311);
				match(T__13);
				}
			}

			setState(314);
			_la = _input.LA(1);
			if ( !(_la==MAIOR || _la==MENOR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(315);
			literal();
			setState(316);
			match(T__1);
			setState(317);
			match(ID);
			setState(318);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(319);
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
			setState(321);
			match(WHILE);
			setState(322);
			match(T__2);
			setState(323);
			expr(0);
			setState(324);
			match(T__3);
			setState(325);
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
			setState(327);
			match(SWITCH);
			setState(328);
			match(T__2);
			setState(329);
			expr(0);
			setState(330);
			match(T__3);
			setState(331);
			bloco();
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(332);
					match(CASE);
					setState(333);
					identificador();
					setState(334);
					match(T__16);
					setState(335);
					bloco();
					setState(336);
					match(BREAK);
					setState(337);
					match(T__1);
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(344);
				match(DEFAULT);
				setState(345);
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
			setState(348);
			match(T__17);
			setState(349);
			match(T__0);
			setState(350);
			match(OUT);
			setState(351);
			match(T__0);
			setState(352);
			tipo_print();
			setState(353);
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
			setState(357);
			switch (_input.LA(1)) {
			case PRINT:
			case PRINTLN:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				print();
				}
				break;
			case PRINTF:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
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
			setState(389);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(PRINT);
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(PRINTLN);
				setState(361);
				match(T__2);
				setState(371);
				switch (_input.LA(1)) {
				case T__18:
					{
					setState(362);
					match(T__18);
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ID - 67)) | (1L << (INT - 67)) | (1L << (DOUBLE_FLOAT - 67)))) != 0)) {
						{
						{
						setState(363);
						literal();
						}
						}
						setState(368);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(369);
					match(T__18);
					}
					break;
				case ID:
				case INT:
				case DOUBLE_FLOAT:
					{
					setState(370);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				{
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ID - 67)) | (1L << (INT - 67)) | (1L << (DOUBLE_FLOAT - 67)) | (1L << (MAIS - 67)))) != 0)) {
					{
					setState(383);
					switch (_input.LA(1)) {
					case MAIS:
						{
						setState(373);
						match(MAIS);
						setState(374);
						match(T__18);
						setState(378);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ID - 67)) | (1L << (INT - 67)) | (1L << (DOUBLE_FLOAT - 67)))) != 0)) {
							{
							{
							setState(375);
							literal();
							}
							}
							setState(380);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(381);
						match(T__18);
						}
						break;
					case ID:
					case INT:
					case DOUBLE_FLOAT:
						{
						setState(382);
						literal();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(388);
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
			setState(391);
			match(PRINTF);
			setState(392);
			match(T__2);
			setState(393);
			match(T__18);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MASCARA) {
				{
				{
				setState(394);
				match(MASCARA);
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(400);
			match(T__18);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(401);
				match(T__6);
				setState(402);
				identificador();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AtribuirContext atribuir() {
			return getRuleContext(AtribuirContext.class,0);
		}
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode DOUBLE_FLOAT() { return getToken(JavaParser.DOUBLE_FLOAT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Op_AContext op_A() {
			return getRuleContext(Op_AContext.class,0);
		}
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
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(411);
				literal();
				setState(412);
				match(T__0);
				setState(413);
				identificador();
				setState(414);
				match(T__2);
				setState(423);
				_la = _input.LA(1);
				if (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ID - 67)) | (1L << (INT - 67)) | (1L << (DOUBLE_FLOAT - 67)))) != 0)) {
					{
					setState(415);
					literal();
					setState(420);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(416);
						match(T__6);
						setState(417);
						literal();
						}
						}
						setState(422);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(425);
				match(T__3);
				}
				break;
			case 2:
				{
				setState(427);
				identificador();
				setState(428);
				match(ATR);
				setState(429);
				match(NEW);
				setState(430);
				tipo();
				setState(431);
				identificador();
				setState(432);
				match(T__2);
				setState(434);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(433);
					identificador();
					}
				}

				setState(436);
				match(T__3);
				setState(437);
				match(T__1);
				}
				break;
			case 3:
				{
				setState(439);
				literal();
				setState(440);
				match(T__0);
				setState(441);
				identificador();
				}
				break;
			case 4:
				{
				setState(443);
				literal();
				setState(444);
				match(T__11);
				setState(445);
				literal();
				setState(446);
				match(T__12);
				}
				break;
			case 5:
				{
				setState(448);
				literal();
				setState(449);
				match(T__19);
				setState(450);
				literal();
				setState(451);
				match(T__16);
				setState(452);
				literal();
				}
				break;
			case 6:
				{
				setState(454);
				match(T__20);
				setState(455);
				literal();
				}
				break;
			case 7:
				{
				setState(456);
				literal();
				setState(457);
				match(T__14);
				}
				break;
			case 8:
				{
				setState(459);
				literal();
				setState(460);
				match(T__15);
				}
				break;
			case 9:
				{
				setState(462);
				identificador();
				}
				break;
			case 10:
				{
				setState(463);
				term();
				}
				break;
			case 11:
				{
				setState(464);
				literal();
				}
				break;
			case 12:
				{
				setState(465);
				atribuir();
				}
				break;
			case 13:
				{
				setState(466);
				match(INT);
				}
				break;
			case 14:
				{
				setState(467);
				match(DOUBLE_FLOAT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(478);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(470);
					if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
					setState(471);
					op_A();
					setState(472);
					term();
					setState(474);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(473);
						match(T__1);
						}
						break;
					}
					}
					} 
				}
				setState(480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		try {
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				literal();
				setState(482);
				op_B();
				setState(483);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				literal();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode DOUBLE_FLOAT() { return getToken(JavaParser.DOUBLE_FLOAT, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ID - 67)) | (1L << (INT - 67)) | (1L << (DOUBLE_FLOAT - 67)))) != 0)) ) {
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
			setState(490);
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
		public TerminalNode E() { return getToken(JavaParser.E, 0); }
		public TerminalNode OU() { return getToken(JavaParser.OU, 0); }
		public TerminalNode MAIOR_IG() { return getToken(JavaParser.MAIOR_IG, 0); }
		public TerminalNode MENOR_IG() { return getToken(JavaParser.MENOR_IG, 0); }
		public TerminalNode DIF() { return getToken(JavaParser.DIF, 0); }
		public TerminalNode IG() { return getToken(JavaParser.IG, 0); }
		public TerminalNode MAIOR() { return getToken(JavaParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(JavaParser.MENOR, 0); }
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
			setState(492);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (MAIS - 72)) | (1L << (MENOS - 72)) | (1L << (E - 72)) | (1L << (OU - 72)) | (1L << (MAIOR_IG - 72)) | (1L << (MENOR_IG - 72)) | (1L << (DIF - 72)) | (1L << (IG - 72)) | (1L << (MAIOR - 72)) | (1L << (MENOR - 72)))) != 0)) ) {
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
		public TerminalNode SHIFTR() { return getToken(JavaParser.SHIFTR, 0); }
		public TerminalNode SHIFTL() { return getToken(JavaParser.SHIFTL, 0); }
		public TerminalNode MOD() { return getToken(JavaParser.MOD, 0); }
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
			setState(494);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (MULT - 74)) | (1L << (DIV - 74)) | (1L << (SHIFTR - 74)) | (1L << (SHIFTL - 74)) | (1L << (MOD - 74)))) != 0)) ) {
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
			setState(496);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3b\u01f5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\5\2H\n\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3\5\3\6\5"+
		"\6c\n\6\3\6\3\6\3\6\3\6\5\6i\n\6\3\6\3\6\5\6m\n\6\3\6\5\6p\n\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\7\13\u0083"+
		"\n\13\f\13\16\13\u0086\13\13\3\13\3\13\3\f\3\f\3\f\5\f\u008d\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u0094\n\r\3\16\3\16\3\16\5\16\u0099\n\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a3\n\16\f\16\16\16\u00a6\13\16"+
		"\5\16\u00a8\n\16\3\16\3\16\5\16\u00ac\n\16\3\16\5\16\u00af\n\16\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ba\n\20\3\20\3\20\5\20"+
		"\u00be\n\20\3\21\3\21\3\21\3\21\7\21\u00c4\n\21\f\21\16\21\u00c7\13\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00cf\n\21\f\21\16\21\u00d2\13\21"+
		"\3\21\3\21\3\21\5\21\u00d7\n\21\3\22\3\22\3\22\3\22\7\22\u00dd\n\22\f"+
		"\22\16\22\u00e0\13\22\3\22\3\22\3\22\7\22\u00e5\n\22\f\22\16\22\u00e8"+
		"\13\22\3\22\3\22\5\22\u00ec\n\22\3\23\3\23\3\23\3\23\7\23\u00f2\n\23\f"+
		"\23\16\23\u00f5\13\23\3\23\3\23\3\23\3\23\5\23\u00fb\n\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u0105\n\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u010e\n\23\3\23\3\23\3\23\5\23\u0113\n\23\3\23\3\23\3"+
		"\23\3\23\5\23\u0119\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0126\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u012f"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u013b\n\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0156\n\30"+
		"\f\30\16\30\u0159\13\30\3\30\3\30\5\30\u015d\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\5\32\u0168\n\32\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u016f\n\33\f\33\16\33\u0172\13\33\3\33\3\33\5\33\u0176\n\33\3\33\3\33"+
		"\3\33\7\33\u017b\n\33\f\33\16\33\u017e\13\33\3\33\3\33\7\33\u0182\n\33"+
		"\f\33\16\33\u0185\13\33\3\33\5\33\u0188\n\33\3\34\3\34\3\34\3\34\7\34"+
		"\u018e\n\34\f\34\16\34\u0191\13\34\3\34\3\34\3\34\7\34\u0196\n\34\f\34"+
		"\16\34\u0199\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7"+
		"\35\u01a5\n\35\f\35\16\35\u01a8\13\35\5\35\u01aa\n\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\5\35\u01b5\n\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u01d7\n\35\3\35\3\35\3\35\3\35\5\35\u01dd\n\35\7\35\u01df\n\35\f\35\16"+
		"\35\u01e2\13\35\3\36\3\36\3\36\3\36\3\36\5\36\u01e9\n\36\3\37\3\37\3 "+
		"\3 \3!\3!\3\"\3\"\3#\3#\3#\2\38$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BD\2\13\3\2\33 \3\2\n\r\3\2WX\3\2\21\22\4\2"+
		"EEHI\3\28?\5\2JKNQUX\4\2LMRT\3\2Y^\u021d\2G\3\2\2\2\4Q\3\2\2\2\6T\3\2"+
		"\2\2\bW\3\2\2\2\nb\3\2\2\2\fq\3\2\2\2\16s\3\2\2\2\20z\3\2\2\2\22~\3\2"+
		"\2\2\24\u0080\3\2\2\2\26\u008c\3\2\2\2\30\u0093\3\2\2\2\32\u00ae\3\2\2"+
		"\2\34\u00b0\3\2\2\2\36\u00bd\3\2\2\2 \u00d6\3\2\2\2\"\u00eb\3\2\2\2$\u0118"+
		"\3\2\2\2&\u0125\3\2\2\2(\u0127\3\2\2\2*\u0130\3\2\2\2,\u0143\3\2\2\2."+
		"\u0149\3\2\2\2\60\u015e\3\2\2\2\62\u0167\3\2\2\2\64\u0187\3\2\2\2\66\u0189"+
		"\3\2\2\28\u01d6\3\2\2\2:\u01e8\3\2\2\2<\u01ea\3\2\2\2>\u01ec\3\2\2\2@"+
		"\u01ee\3\2\2\2B\u01f0\3\2\2\2D\u01f2\3\2\2\2FH\5\4\3\2GF\3\2\2\2GH\3\2"+
		"\2\2HL\3\2\2\2IK\5\6\4\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2"+
		"\2\2NL\3\2\2\2OP\5\n\6\2P\3\3\2\2\2QR\7\30\2\2RS\5\b\5\2S\5\3\2\2\2TU"+
		"\7\31\2\2UV\5\b\5\2V\7\3\2\2\2W\\\7E\2\2XY\7\3\2\2Y[\7E\2\2ZX\3\2\2\2"+
		"[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\4\2\2`\t\3\2"+
		"\2\2ac\5\22\n\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\"\2\2eh\5\f\7\2fg\7"+
		"\32\2\2gi\5\f\7\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2jk\7!\2\2km\5\f\7\2lj\3"+
		"\2\2\2lm\3\2\2\2mo\3\2\2\2np\5\24\13\2on\3\2\2\2op\3\2\2\2p\13\3\2\2\2"+
		"qr\7E\2\2r\r\3\2\2\2st\5\22\n\2tu\7\35\2\2uv\7#\2\2vw\5\f\7\2wx\5\20\t"+
		"\2xy\5\24\13\2y\17\3\2\2\2z{\7\5\2\2{|\5\"\22\2|}\7\6\2\2}\21\3\2\2\2"+
		"~\177\t\2\2\2\177\23\3\2\2\2\u0080\u0084\7\7\2\2\u0081\u0083\5\26\f\2"+
		"\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\b\2\2\u0088"+
		"\25\3\2\2\2\u0089\u008d\5\32\16\2\u008a\u008d\5\n\6\2\u008b\u008d\5&\24"+
		"\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\27"+
		"\3\2\2\2\u008e\u008f\7\7\2\2\u008f\u0094\5 \21\2\u0090\u0091\5&\24\2\u0091"+
		"\u0092\7\b\2\2\u0092\u0094\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u0090\3\2"+
		"\2\2\u0094\31\3\2\2\2\u0095\u0098\5\34\17\2\u0096\u0099\7#\2\2\u0097\u0099"+
		"\5> \2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\5\f\7\2\u009b\u00a7\7\5\2\2\u009c\u009d\5> \2\u009d\u00a4\5\f\7"+
		"\2\u009e\u009f\7\t\2\2\u009f\u00a0\5> \2\u00a0\u00a1\5\f\7\2\u00a1\u00a3"+
		"\3\2\2\2\u00a2\u009e\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u009c\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\7\6\2\2\u00aa"+
		"\u00ac\5\36\20\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\3"+
		"\2\2\2\u00ad\u00af\5\16\b\2\u00ae\u0095\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\33\3\2\2\2\u00b0\u00b1\t\3\2\2\u00b1\35\3\2\2\2\u00b2\u00b3\7\7\2\2\u00b3"+
		"\u00be\5 \21\2\u00b4\u00b9\5&\24\2\u00b5\u00b6\7%\2\2\u00b6\u00b7\58\35"+
		"\2\u00b7\u00b8\7\4\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00b2\3\2\2\2\u00bd\u00b4\3\2\2\2\u00be\37\3\2\2\2\u00bf\u00c0\5> \2"+
		"\u00c0\u00c5\5\f\7\2\u00c1\u00c2\7\t\2\2\u00c2\u00c4\5\f\7\2\u00c3\u00c1"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\4\2\2\u00c9\u00d7\3\2"+
		"\2\2\u00ca\u00cb\5> \2\u00cb\u00d0\5\f\7\2\u00cc\u00cd\7\16\2\2\u00cd"+
		"\u00cf\7\17\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d4\7\4\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d7\58\35\2\u00d6\u00bf\3\2"+
		"\2\2\u00d6\u00ca\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7!\3\2\2\2\u00d8\u00d9"+
		"\5> \2\u00d9\u00de\5\f\7\2\u00da\u00db\7\16\2\2\u00db\u00dd\7\17\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00ec\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e6\5> \2\u00e2\u00e3"+
		"\7\16\2\2\u00e3\u00e5\7\17\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2"+
		"\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00ea\5\f\7\2\u00ea\u00ec\3\2\2\2\u00eb\u00d8\3\2\2\2\u00eb"+
		"\u00e1\3\2\2\2\u00ec#\3\2\2\2\u00ed\u00ee\5> \2\u00ee\u00f3\5\f\7\2\u00ef"+
		"\u00f0\7\t\2\2\u00f0\u00f2\5\f\7\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00fa\5D#\2\u00f7\u00fb\5\f\7\2\u00f8\u00fb\7H\2"+
		"\2\u00f9\u00fb\7I\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7\4\2\2\u00fd\u0119\3\2\2\2\u00fe"+
		"\u00ff\5> \2\u00ff\u0100\5\f\7\2\u0100\u0104\5D#\2\u0101\u0105\5\f\7\2"+
		"\u0102\u0105\7H\2\2\u0103\u0105\7I\2\2\u0104\u0101\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\7\4\2\2\u0107"+
		"\u0119\3\2\2\2\u0108\u0109\5\f\7\2\u0109\u010d\5D#\2\u010a\u010e\5\f\7"+
		"\2\u010b\u010e\7H\2\2\u010c\u010e\7I\2\2\u010d\u010a\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7\4\2\2\u0110"+
		"\u0119\3\2\2\2\u0111\u0113\5> \2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2"+
		"\2\u0113\u0114\3\2\2\2\u0114\u0115\5\f\7\2\u0115\u0116\5D#\2\u0116\u0117"+
		"\58\35\2\u0117\u0119\3\2\2\2\u0118\u00ed\3\2\2\2\u0118\u00fe\3\2\2\2\u0118"+
		"\u0108\3\2\2\2\u0118\u0112\3\2\2\2\u0119%\3\2\2\2\u011a\u0126\5 \21\2"+
		"\u011b\u0126\5(\25\2\u011c\u0126\5*\26\2\u011d\u0126\5,\27\2\u011e\u0126"+
		"\5.\30\2\u011f\u0126\5\60\31\2\u0120\u0121\7\7\2\2\u0121\u0122\5&\24\2"+
		"\u0122\u0123\7\b\2\2\u0123\u0126\3\2\2\2\u0124\u0126\58\35\2\u0125\u011a"+
		"\3\2\2\2\u0125\u011b\3\2\2\2\u0125\u011c\3\2\2\2\u0125\u011d\3\2\2\2\u0125"+
		"\u011e\3\2\2\2\u0125\u011f\3\2\2\2\u0125\u0120\3\2\2\2\u0125\u0124\3\2"+
		"\2\2\u0126\'\3\2\2\2\u0127\u0128\7&\2\2\u0128\u0129\7\5\2\2\u0129\u012a"+
		"\58\35\2\u012a\u012b\7\6\2\2\u012b\u012e\5&\24\2\u012c\u012d\7\'\2\2\u012d"+
		"\u012f\5&\24\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f)\3\2\2\2"+
		"\u0130\u0131\7)\2\2\u0131\u0132\7\5\2\2\u0132\u0133\78\2\2\u0133\u0134"+
		"\5\f\7\2\u0134\u0135\7Y\2\2\u0135\u0136\7H\2\2\u0136\u0137\7\4\2\2\u0137"+
		"\u013a\5\f\7\2\u0138\u0139\7\3\2\2\u0139\u013b\7\20\2\2\u013a\u0138\3"+
		"\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\t\4\2\2\u013d"+
		"\u013e\5<\37\2\u013e\u013f\7\4\2\2\u013f\u0140\7E\2\2\u0140\u0141\t\5"+
		"\2\2\u0141\u0142\5&\24\2\u0142+\3\2\2\2\u0143\u0144\7(\2\2\u0144\u0145"+
		"\7\5\2\2\u0145\u0146\58\35\2\u0146\u0147\7\6\2\2\u0147\u0148\5&\24\2\u0148"+
		"-\3\2\2\2\u0149\u014a\7*\2\2\u014a\u014b\7\5\2\2\u014b\u014c\58\35\2\u014c"+
		"\u014d\7\6\2\2\u014d\u0157\5&\24\2\u014e\u014f\7+\2\2\u014f\u0150\5\f"+
		"\7\2\u0150\u0151\7\23\2\2\u0151\u0152\5&\24\2\u0152\u0153\7,\2\2\u0153"+
		"\u0154\7\4\2\2\u0154\u0156\3\2\2\2\u0155\u014e\3\2\2\2\u0156\u0159\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015c\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u015a\u015b\7.\2\2\u015b\u015d\5&\24\2\u015c\u015a\3\2"+
		"\2\2\u015c\u015d\3\2\2\2\u015d/\3\2\2\2\u015e\u015f\7\24\2\2\u015f\u0160"+
		"\7\3\2\2\u0160\u0161\7C\2\2\u0161\u0162\7\3\2\2\u0162\u0163\5\62\32\2"+
		"\u0163\u0164\7\4\2\2\u0164\61\3\2\2\2\u0165\u0168\5\64\33\2\u0166\u0168"+
		"\5\66\34\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168\63\3\2\2\2\u0169"+
		"\u0188\7@\2\2\u016a\u016b\7A\2\2\u016b\u0175\7\5\2\2\u016c\u0170\7\25"+
		"\2\2\u016d\u016f\5<\37\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0173\u0176\7\25\2\2\u0174\u0176\5<\37\2\u0175\u016c\3\2\2\2\u0175"+
		"\u0174\3\2\2\2\u0176\u0183\3\2\2\2\u0177\u0178\7J\2\2\u0178\u017c\7\25"+
		"\2\2\u0179\u017b\5<\37\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2"+
		"\2\2\u017f\u0182\7\25\2\2\u0180\u0182\5<\37\2\u0181\u0177\3\2\2\2\u0181"+
		"\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2"+
		"\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0188\7\6\2\2\u0187"+
		"\u0169\3\2\2\2\u0187\u016a\3\2\2\2\u0188\65\3\2\2\2\u0189\u018a\7B\2\2"+
		"\u018a\u018b\7\5\2\2\u018b\u018f\7\25\2\2\u018c\u018e\7G\2\2\u018d\u018c"+
		"\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0192\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0197\7\25\2\2\u0193\u0194\7"+
		"\t\2\2\u0194\u0196\5\f\7\2\u0195\u0193\3\2\2\2\u0196\u0199\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2"+
		"\2\2\u019a\u019b\7\6\2\2\u019b\67\3\2\2\2\u019c\u019d\b\35\1\2\u019d\u019e"+
		"\5<\37\2\u019e\u019f\7\3\2\2\u019f\u01a0\5\f\7\2\u01a0\u01a9\7\5\2\2\u01a1"+
		"\u01a6\5<\37\2\u01a2\u01a3\7\t\2\2\u01a3\u01a5\5<\37\2\u01a4\u01a2\3\2"+
		"\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01a1\3\2\2\2\u01a9\u01aa\3\2"+
		"\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\7\6\2\2\u01ac\u01d7\3\2\2\2\u01ad"+
		"\u01ae\5\f\7\2\u01ae\u01af\7Y\2\2\u01af\u01b0\7-\2\2\u01b0\u01b1\5> \2"+
		"\u01b1\u01b2\5\f\7\2\u01b2\u01b4\7\5\2\2\u01b3\u01b5\5\f\7\2\u01b4\u01b3"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\7\6\2\2\u01b7"+
		"\u01b8\7\4\2\2\u01b8\u01d7\3\2\2\2\u01b9\u01ba\5<\37\2\u01ba\u01bb\7\3"+
		"\2\2\u01bb\u01bc\5\f\7\2\u01bc\u01d7\3\2\2\2\u01bd\u01be\5<\37\2\u01be"+
		"\u01bf\7\16\2\2\u01bf\u01c0\5<\37\2\u01c0\u01c1\7\17\2\2\u01c1\u01d7\3"+
		"\2\2\2\u01c2\u01c3\5<\37\2\u01c3\u01c4\7\26\2\2\u01c4\u01c5\5<\37\2\u01c5"+
		"\u01c6\7\23\2\2\u01c6\u01c7\5<\37\2\u01c7\u01d7\3\2\2\2\u01c8\u01c9\7"+
		"\27\2\2\u01c9\u01d7\5<\37\2\u01ca\u01cb\5<\37\2\u01cb\u01cc\7\21\2\2\u01cc"+
		"\u01d7\3\2\2\2\u01cd\u01ce\5<\37\2\u01ce\u01cf\7\22\2\2\u01cf\u01d7\3"+
		"\2\2\2\u01d0\u01d7\5\f\7\2\u01d1\u01d7\5:\36\2\u01d2\u01d7\5<\37\2\u01d3"+
		"\u01d7\5$\23\2\u01d4\u01d7\7H\2\2\u01d5\u01d7\7I\2\2\u01d6\u019c\3\2\2"+
		"\2\u01d6\u01ad\3\2\2\2\u01d6\u01b9\3\2\2\2\u01d6\u01bd\3\2\2\2\u01d6\u01c2"+
		"\3\2\2\2\u01d6\u01c8\3\2\2\2\u01d6\u01ca\3\2\2\2\u01d6\u01cd\3\2\2\2\u01d6"+
		"\u01d0\3\2\2\2\u01d6\u01d1\3\2\2\2\u01d6\u01d2\3\2\2\2\u01d6\u01d3\3\2"+
		"\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01e0\3\2\2\2\u01d8"+
		"\u01d9\f\21\2\2\u01d9\u01da\5@!\2\u01da\u01dc\5:\36\2\u01db\u01dd\7\4"+
		"\2\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de"+
		"\u01d8\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2"+
		"\2\2\u01e19\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\5<\37\2\u01e4\u01e5"+
		"\5B\"\2\u01e5\u01e6\58\35\2\u01e6\u01e9\3\2\2\2\u01e7\u01e9\5<\37\2\u01e8"+
		"\u01e3\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9;\3\2\2\2\u01ea\u01eb\t\6\2\2"+
		"\u01eb=\3\2\2\2\u01ec\u01ed\t\7\2\2\u01ed?\3\2\2\2\u01ee\u01ef\t\b\2\2"+
		"\u01efA\3\2\2\2\u01f0\u01f1\t\t\2\2\u01f1C\3\2\2\2\u01f2\u01f3\t\n\2\2"+
		"\u01f3E\3\2\2\2\64GL\\bhlo\u0084\u008c\u0093\u0098\u00a4\u00a7\u00ab\u00ae"+
		"\u00b9\u00bd\u00c5\u00d0\u00d6\u00de\u00e6\u00eb\u00f3\u00fa\u0104\u010d"+
		"\u0112\u0118\u0125\u012e\u013a\u0157\u015c\u0167\u0170\u0175\u017c\u0181"+
		"\u0183\u0187\u018f\u0197\u01a6\u01a9\u01b4\u01d6\u01dc\u01e0\u01e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
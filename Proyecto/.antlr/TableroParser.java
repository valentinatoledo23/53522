// Generated from c:/Users/USUARIO/53522/Proyecto/Tablero.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TableroParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TABLERO=1, FUENTE=2, TIPO=3, RUTA=4, METRICA=5, GRAFICO=6, USAR=7, FILTRO=8, 
		ALERTA=9, SI=10, ENTONCES=11, VERDADERO=12, FALSO=13, CSV=14, API=15, 
		JSON=16, SUMA=17, PROMEDIO=18, MAXIMO=19, MINIMO=20, CONTAR=21, BARRAS=22, 
		LINEAS=23, TORTA=24, TABLA=25, CADENA=26, LBRACE=27, RBRACE=28, LPAREN=29, 
		RPAREN=30, SEMICOLON=31, COLON=32, SLASH=33, EQ=34, COMMA=35, UNDERSCORE=36, 
		GUION=37, DOT=38, DOUBLE_EQ=39, EXCLAM_EQ=40, MAYOR_EQ=41, MENOR_EQ=42, 
		MAYOR=43, MENOR=44, WS=45, IDENTIFICADOR=46, NUMERO=47;
	public static final int
		RULE_programa = 0, RULE_elemento = 1, RULE_fuente = 2, RULE_tipo_fuente = 3, 
		RULE_metrica = 4, RULE_agregacion = 5, RULE_grafico = 6, RULE_tipo_grafico = 7, 
		RULE_filtro = 8, RULE_operador = 9, RULE_alerta = 10, RULE_campo = 11, 
		RULE_valor = 12, RULE_booleano = 13, RULE_cadena = 14, RULE_id = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "elemento", "fuente", "tipo_fuente", "metrica", "agregacion", 
			"grafico", "tipo_grafico", "filtro", "operador", "alerta", "campo", "valor", 
			"booleano", "cadena", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'tablero'", "'fuente'", "'tipo'", "'ruta'", "'metrica'", "'grafico'", 
			"'usar'", "'filtro'", "'alerta'", "'si'", "'entonces'", "'verdadero'", 
			"'falso'", "'csv'", "'api'", "'json'", "'suma'", "'promedio'", "'maximo'", 
			"'minimo'", "'contar'", "'barras'", "'lineas'", "'torta'", "'tabla'", 
			null, "'{'", "'}'", "'('", "')'", "';'", "':'", "'/'", "'='", "','", 
			"'_'", "'-'", "'.'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TABLERO", "FUENTE", "TIPO", "RUTA", "METRICA", "GRAFICO", "USAR", 
			"FILTRO", "ALERTA", "SI", "ENTONCES", "VERDADERO", "FALSO", "CSV", "API", 
			"JSON", "SUMA", "PROMEDIO", "MAXIMO", "MINIMO", "CONTAR", "BARRAS", "LINEAS", 
			"TORTA", "TABLA", "CADENA", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "SEMICOLON", 
			"COLON", "SLASH", "EQ", "COMMA", "UNDERSCORE", "GUION", "DOT", "DOUBLE_EQ", 
			"EXCLAM_EQ", "MAYOR_EQ", "MENOR_EQ", "MAYOR", "MENOR", "WS", "IDENTIFICADOR", 
			"NUMERO"
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
	public String getGrammarFileName() { return "Tablero.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TableroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode TABLERO() { return getToken(TableroParser.TABLERO, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(TableroParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TableroParser.RBRACE, 0); }
		public List<ElementoContext> elemento() {
			return getRuleContexts(ElementoContext.class);
		}
		public ElementoContext elemento(int i) {
			return getRuleContext(ElementoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(TABLERO);
			setState(33);
			id();
			setState(34);
			match(LBRACE);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 868L) != 0)) {
				{
				{
				setState(35);
				elemento();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			match(RBRACE);
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
	public static class ElementoContext extends ParserRuleContext {
		public FuenteContext fuente() {
			return getRuleContext(FuenteContext.class,0);
		}
		public MetricaContext metrica() {
			return getRuleContext(MetricaContext.class,0);
		}
		public GraficoContext grafico() {
			return getRuleContext(GraficoContext.class,0);
		}
		public FiltroContext filtro() {
			return getRuleContext(FiltroContext.class,0);
		}
		public AlertaContext alerta() {
			return getRuleContext(AlertaContext.class,0);
		}
		public ElementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento; }
	}

	public final ElementoContext elemento() throws RecognitionException {
		ElementoContext _localctx = new ElementoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_elemento);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUENTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				fuente();
				}
				break;
			case METRICA:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				metrica();
				}
				break;
			case GRAFICO:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				grafico();
				}
				break;
			case FILTRO:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				filtro();
				}
				break;
			case ALERTA:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				alerta();
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
	public static class FuenteContext extends ParserRuleContext {
		public TerminalNode FUENTE() { return getToken(TableroParser.FUENTE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(TableroParser.TIPO, 0); }
		public Tipo_fuenteContext tipo_fuente() {
			return getRuleContext(Tipo_fuenteContext.class,0);
		}
		public TerminalNode RUTA() { return getToken(TableroParser.RUTA, 0); }
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TableroParser.SEMICOLON, 0); }
		public FuenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuente; }
	}

	public final FuenteContext fuente() throws RecognitionException {
		FuenteContext _localctx = new FuenteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fuente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(FUENTE);
			setState(51);
			id();
			setState(52);
			match(TIPO);
			setState(53);
			tipo_fuente();
			setState(54);
			match(RUTA);
			setState(55);
			cadena();
			setState(56);
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
	public static class Tipo_fuenteContext extends ParserRuleContext {
		public TerminalNode CSV() { return getToken(TableroParser.CSV, 0); }
		public TerminalNode API() { return getToken(TableroParser.API, 0); }
		public TerminalNode JSON() { return getToken(TableroParser.JSON, 0); }
		public Tipo_fuenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_fuente; }
	}

	public final Tipo_fuenteContext tipo_fuente() throws RecognitionException {
		Tipo_fuenteContext _localctx = new Tipo_fuenteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo_fuente);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0)) ) {
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
	public static class MetricaContext extends ParserRuleContext {
		public TerminalNode METRICA() { return getToken(TableroParser.METRICA, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EQ() { return getToken(TableroParser.EQ, 0); }
		public AgregacionContext agregacion() {
			return getRuleContext(AgregacionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TableroParser.LPAREN, 0); }
		public CampoContext campo() {
			return getRuleContext(CampoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TableroParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(TableroParser.SEMICOLON, 0); }
		public MetricaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metrica; }
	}

	public final MetricaContext metrica() throws RecognitionException {
		MetricaContext _localctx = new MetricaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_metrica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(METRICA);
			setState(61);
			id();
			setState(62);
			match(EQ);
			setState(63);
			agregacion();
			setState(64);
			match(LPAREN);
			setState(65);
			campo();
			setState(66);
			match(RPAREN);
			setState(67);
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
	public static class AgregacionContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(TableroParser.SUMA, 0); }
		public TerminalNode PROMEDIO() { return getToken(TableroParser.PROMEDIO, 0); }
		public TerminalNode MAXIMO() { return getToken(TableroParser.MAXIMO, 0); }
		public TerminalNode MINIMO() { return getToken(TableroParser.MINIMO, 0); }
		public TerminalNode CONTAR() { return getToken(TableroParser.CONTAR, 0); }
		public AgregacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agregacion; }
	}

	public final AgregacionContext agregacion() throws RecognitionException {
		AgregacionContext _localctx = new AgregacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_agregacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4063232L) != 0)) ) {
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
	public static class GraficoContext extends ParserRuleContext {
		public TerminalNode GRAFICO() { return getToken(TableroParser.GRAFICO, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(TableroParser.LBRACE, 0); }
		public TerminalNode TIPO() { return getToken(TableroParser.TIPO, 0); }
		public List<TerminalNode> EQ() { return getTokens(TableroParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(TableroParser.EQ, i);
		}
		public Tipo_graficoContext tipo_grafico() {
			return getRuleContext(Tipo_graficoContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(TableroParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(TableroParser.SEMICOLON, i);
		}
		public TerminalNode USAR() { return getToken(TableroParser.USAR, 0); }
		public TerminalNode RBRACE() { return getToken(TableroParser.RBRACE, 0); }
		public GraficoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grafico; }
	}

	public final GraficoContext grafico() throws RecognitionException {
		GraficoContext _localctx = new GraficoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_grafico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(GRAFICO);
			setState(72);
			id();
			setState(73);
			match(LBRACE);
			setState(74);
			match(TIPO);
			setState(75);
			match(EQ);
			setState(76);
			tipo_grafico();
			setState(77);
			match(SEMICOLON);
			setState(78);
			match(USAR);
			setState(79);
			match(EQ);
			setState(80);
			id();
			setState(81);
			match(SEMICOLON);
			setState(82);
			match(RBRACE);
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
	public static class Tipo_graficoContext extends ParserRuleContext {
		public TerminalNode BARRAS() { return getToken(TableroParser.BARRAS, 0); }
		public TerminalNode LINEAS() { return getToken(TableroParser.LINEAS, 0); }
		public TerminalNode TORTA() { return getToken(TableroParser.TORTA, 0); }
		public TerminalNode TABLA() { return getToken(TableroParser.TABLA, 0); }
		public Tipo_graficoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_grafico; }
	}

	public final Tipo_graficoContext tipo_grafico() throws RecognitionException {
		Tipo_graficoContext _localctx = new Tipo_graficoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo_grafico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) ) {
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
	public static class FiltroContext extends ParserRuleContext {
		public TerminalNode FILTRO() { return getToken(TableroParser.FILTRO, 0); }
		public CampoContext campo() {
			return getRuleContext(CampoContext.class,0);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TableroParser.SEMICOLON, 0); }
		public FiltroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filtro; }
	}

	public final FiltroContext filtro() throws RecognitionException {
		FiltroContext _localctx = new FiltroContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_filtro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(FILTRO);
			setState(87);
			campo();
			setState(88);
			operador();
			setState(89);
			valor();
			setState(90);
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
	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode DOUBLE_EQ() { return getToken(TableroParser.DOUBLE_EQ, 0); }
		public TerminalNode EXCLAM_EQ() { return getToken(TableroParser.EXCLAM_EQ, 0); }
		public TerminalNode MAYOR() { return getToken(TableroParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(TableroParser.MENOR, 0); }
		public TerminalNode MAYOR_EQ() { return getToken(TableroParser.MAYOR_EQ, 0); }
		public TerminalNode MENOR_EQ() { return getToken(TableroParser.MENOR_EQ, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34634616274944L) != 0)) ) {
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
	public static class AlertaContext extends ParserRuleContext {
		public TerminalNode ALERTA() { return getToken(TableroParser.ALERTA, 0); }
		public TerminalNode SI() { return getToken(TableroParser.SI, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(TableroParser.ENTONCES, 0); }
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TableroParser.SEMICOLON, 0); }
		public AlertaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alerta; }
	}

	public final AlertaContext alerta() throws RecognitionException {
		AlertaContext _localctx = new AlertaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_alerta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(ALERTA);
			setState(95);
			match(SI);
			setState(96);
			id();
			setState(97);
			operador();
			setState(98);
			valor();
			setState(99);
			match(ENTONCES);
			setState(100);
			cadena();
			setState(101);
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
	public static class CampoContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(TableroParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TableroParser.DOT, i);
		}
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_campo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			id();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(104);
				match(DOT);
				setState(105);
				id();
				}
				}
				setState(110);
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
	public static class ValorContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(TableroParser.NUMERO, 0); }
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_valor);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				cadena();
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(NUMERO);
				}
				break;
			case VERDADERO:
			case FALSO:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				booleano();
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
	public static class BooleanoContext extends ParserRuleContext {
		public TerminalNode VERDADERO() { return getToken(TableroParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(TableroParser.FALSO, 0); }
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==VERDADERO || _la==FALSO) ) {
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
	public static class CadenaContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(TableroParser.CADENA, 0); }
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(CADENA);
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
	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(TableroParser.IDENTIFICADOR, 0); }
		public TerminalNode TABLERO() { return getToken(TableroParser.TABLERO, 0); }
		public TerminalNode FUENTE() { return getToken(TableroParser.FUENTE, 0); }
		public TerminalNode TIPO() { return getToken(TableroParser.TIPO, 0); }
		public TerminalNode RUTA() { return getToken(TableroParser.RUTA, 0); }
		public TerminalNode METRICA() { return getToken(TableroParser.METRICA, 0); }
		public TerminalNode GRAFICO() { return getToken(TableroParser.GRAFICO, 0); }
		public TerminalNode USAR() { return getToken(TableroParser.USAR, 0); }
		public TerminalNode FILTRO() { return getToken(TableroParser.FILTRO, 0); }
		public TerminalNode ALERTA() { return getToken(TableroParser.ALERTA, 0); }
		public TerminalNode SI() { return getToken(TableroParser.SI, 0); }
		public TerminalNode ENTONCES() { return getToken(TableroParser.ENTONCES, 0); }
		public TerminalNode VERDADERO() { return getToken(TableroParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(TableroParser.FALSO, 0); }
		public TerminalNode CSV() { return getToken(TableroParser.CSV, 0); }
		public TerminalNode API() { return getToken(TableroParser.API, 0); }
		public TerminalNode JSON() { return getToken(TableroParser.JSON, 0); }
		public TerminalNode SUMA() { return getToken(TableroParser.SUMA, 0); }
		public TerminalNode PROMEDIO() { return getToken(TableroParser.PROMEDIO, 0); }
		public TerminalNode MAXIMO() { return getToken(TableroParser.MAXIMO, 0); }
		public TerminalNode MINIMO() { return getToken(TableroParser.MINIMO, 0); }
		public TerminalNode CONTAR() { return getToken(TableroParser.CONTAR, 0); }
		public TerminalNode BARRAS() { return getToken(TableroParser.BARRAS, 0); }
		public TerminalNode LINEAS() { return getToken(TableroParser.LINEAS, 0); }
		public TerminalNode TORTA() { return getToken(TableroParser.TORTA, 0); }
		public TerminalNode TABLA() { return getToken(TableroParser.TABLA, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 70368811286526L) != 0)) ) {
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
		"\u0004\u0001/{\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000%\b\u0000\n\u0000"+
		"\f\u0000(\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000bk\b\u000b\n\u000b\f\u000bn\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0003\fs\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0006"+
		"\u0001\u0000\u000e\u0010\u0001\u0000\u0011\u0015\u0001\u0000\u0016\u0019"+
		"\u0001\u0000\',\u0001\u0000\f\r\u0002\u0000\u0001\u0019..r\u0000 \u0001"+
		"\u0000\u0000\u0000\u00020\u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000"+
		"\u0000\u0006:\u0001\u0000\u0000\u0000\b<\u0001\u0000\u0000\u0000\nE\u0001"+
		"\u0000\u0000\u0000\fG\u0001\u0000\u0000\u0000\u000eT\u0001\u0000\u0000"+
		"\u0000\u0010V\u0001\u0000\u0000\u0000\u0012\\\u0001\u0000\u0000\u0000"+
		"\u0014^\u0001\u0000\u0000\u0000\u0016g\u0001\u0000\u0000\u0000\u0018r"+
		"\u0001\u0000\u0000\u0000\u001at\u0001\u0000\u0000\u0000\u001cv\u0001\u0000"+
		"\u0000\u0000\u001ex\u0001\u0000\u0000\u0000 !\u0005\u0001\u0000\u0000"+
		"!\"\u0003\u001e\u000f\u0000\"&\u0005\u001b\u0000\u0000#%\u0003\u0002\u0001"+
		"\u0000$#\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000"+
		"\u0000\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000(&\u0001"+
		"\u0000\u0000\u0000)*\u0005\u001c\u0000\u0000*\u0001\u0001\u0000\u0000"+
		"\u0000+1\u0003\u0004\u0002\u0000,1\u0003\b\u0004\u0000-1\u0003\f\u0006"+
		"\u0000.1\u0003\u0010\b\u0000/1\u0003\u0014\n\u00000+\u0001\u0000\u0000"+
		"\u00000,\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u00000.\u0001\u0000"+
		"\u0000\u00000/\u0001\u0000\u0000\u00001\u0003\u0001\u0000\u0000\u0000"+
		"23\u0005\u0002\u0000\u000034\u0003\u001e\u000f\u000045\u0005\u0003\u0000"+
		"\u000056\u0003\u0006\u0003\u000067\u0005\u0004\u0000\u000078\u0003\u001c"+
		"\u000e\u000089\u0005\u001f\u0000\u00009\u0005\u0001\u0000\u0000\u0000"+
		":;\u0007\u0000\u0000\u0000;\u0007\u0001\u0000\u0000\u0000<=\u0005\u0005"+
		"\u0000\u0000=>\u0003\u001e\u000f\u0000>?\u0005\"\u0000\u0000?@\u0003\n"+
		"\u0005\u0000@A\u0005\u001d\u0000\u0000AB\u0003\u0016\u000b\u0000BC\u0005"+
		"\u001e\u0000\u0000CD\u0005\u001f\u0000\u0000D\t\u0001\u0000\u0000\u0000"+
		"EF\u0007\u0001\u0000\u0000F\u000b\u0001\u0000\u0000\u0000GH\u0005\u0006"+
		"\u0000\u0000HI\u0003\u001e\u000f\u0000IJ\u0005\u001b\u0000\u0000JK\u0005"+
		"\u0003\u0000\u0000KL\u0005\"\u0000\u0000LM\u0003\u000e\u0007\u0000MN\u0005"+
		"\u001f\u0000\u0000NO\u0005\u0007\u0000\u0000OP\u0005\"\u0000\u0000PQ\u0003"+
		"\u001e\u000f\u0000QR\u0005\u001f\u0000\u0000RS\u0005\u001c\u0000\u0000"+
		"S\r\u0001\u0000\u0000\u0000TU\u0007\u0002\u0000\u0000U\u000f\u0001\u0000"+
		"\u0000\u0000VW\u0005\b\u0000\u0000WX\u0003\u0016\u000b\u0000XY\u0003\u0012"+
		"\t\u0000YZ\u0003\u0018\f\u0000Z[\u0005\u001f\u0000\u0000[\u0011\u0001"+
		"\u0000\u0000\u0000\\]\u0007\u0003\u0000\u0000]\u0013\u0001\u0000\u0000"+
		"\u0000^_\u0005\t\u0000\u0000_`\u0005\n\u0000\u0000`a\u0003\u001e\u000f"+
		"\u0000ab\u0003\u0012\t\u0000bc\u0003\u0018\f\u0000cd\u0005\u000b\u0000"+
		"\u0000de\u0003\u001c\u000e\u0000ef\u0005\u001f\u0000\u0000f\u0015\u0001"+
		"\u0000\u0000\u0000gl\u0003\u001e\u000f\u0000hi\u0005&\u0000\u0000ik\u0003"+
		"\u001e\u000f\u0000jh\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0017\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000os\u0003\u001c\u000e\u0000ps\u0005"+
		"/\u0000\u0000qs\u0003\u001a\r\u0000ro\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000s\u0019\u0001\u0000\u0000"+
		"\u0000tu\u0007\u0004\u0000\u0000u\u001b\u0001\u0000\u0000\u0000vw\u0005"+
		"\u001a\u0000\u0000w\u001d\u0001\u0000\u0000\u0000xy\u0007\u0005\u0000"+
		"\u0000y\u001f\u0001\u0000\u0000\u0000\u0004&0lr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from c:/Users/USUARIO/53522/Proyecto/Tablero.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TableroParser}.
 */
public interface TableroListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TableroParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(TableroParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableroParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(TableroParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableroParser#elemento}.
	 * @param ctx the parse tree
	 */
	void enterElemento(TableroParser.ElementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableroParser#elemento}.
	 * @param ctx the parse tree
	 */
	void exitElemento(TableroParser.ElementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableroParser#fuente}.
	 * @param ctx the parse tree
	 */
	void enterFuente(TableroParser.FuenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableroParser#fuente}.
	 * @param ctx the parse tree
	 */
	void exitFuente(TableroParser.FuenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableroParser#tipo_fuente}.
	 * @param ctx the parse tree
	 */
	void enterTipo_fuente(TableroParser.Tipo_fuenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableroParser#tipo_fuente}.
	 * @param ctx the parse tree
	 */
	void exitTipo_fuente(TableroParser.Tipo_fuenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableroParser#metrica}.
	 * @param ctx the parse tree
	 */
	void enterMetrica(TableroParser.MetricaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableroParser#metrica}.
	 * @param ctx the parse tree
	 */
	void exitMetrica(TableroParser.MetricaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableroParser#agregacion}.
	 * @param ctx the parse tree
	 */
	void enterAgregacion(TableroParser.AgregacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableroParser#agregacion}.
	 * @param ctx the parse tree
	 */
	void exitAgregacion(TableroParser.AgregacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableroParser#grafico}.
	 * @param ctx the parse tree
	 */
	void enterGrafico(TableroParser.GraficoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableroParser#grafico}.
	 * @param ctx the parse tree
	 */
	void exitGrafico(TableroParser.GraficoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableroParser#tipo_grafico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_grafico(TableroParser.Tipo_graficoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableroParser#tipo_grafico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_grafico(TableroParser.Tipo_graficoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableroParser#filtro}.
	 * @param ctx the parse tree
	 */
	void enterFiltro(TableroParser.FiltroContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableroParser#filtro}.
	 * @param ctx the parse tree
	 */
	void exitFiltro(TableroParser.FiltroContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableroParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(TableroParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableroParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(TableroParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableroParser#alerta}.
	 * @param ctx the parse tree
	 */
	void enterAlerta(TableroParser.AlertaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableroParser#alerta}.
	 * @param ctx the parse tree
	 */
	void exitAlerta(TableroParser.AlertaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableroParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(TableroParser.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableroParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(TableroParser.CampoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableroParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(TableroParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableroParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(TableroParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableroParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(TableroParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableroParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(TableroParser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableroParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(TableroParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableroParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(TableroParser.CadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableroParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(TableroParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableroParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(TableroParser.IdContext ctx);
}
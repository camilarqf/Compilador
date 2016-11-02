package compilador;
// Generated from Java.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParser}.
 */
public interface JavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(JavaParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(JavaParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#pck}.
	 * @param ctx the parse tree
	 */
	void enterPck(JavaParser.PckContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#pck}.
	 * @param ctx the parse tree
	 */
	void exitPck(JavaParser.PckContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(JavaParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(JavaParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#dec_classe}.
	 * @param ctx the parse tree
	 */
	void enterDec_classe(JavaParser.Dec_classeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dec_classe}.
	 * @param ctx the parse tree
	 */
	void exitDec_classe(JavaParser.Dec_classeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#mod_classe}.
	 * @param ctx the parse tree
	 */
	void enterMod_classe(JavaParser.Mod_classeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#mod_classe}.
	 * @param ctx the parse tree
	 */
	void exitMod_classe(JavaParser.Mod_classeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#corpo_classe}.
	 * @param ctx the parse tree
	 */
	void enterCorpo_classe(JavaParser.Corpo_classeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#corpo_classe}.
	 * @param ctx the parse tree
	 */
	void exitCorpo_classe(JavaParser.Corpo_classeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#dec_main}.
	 * @param ctx the parse tree
	 */
	void enterDec_main(JavaParser.Dec_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dec_main}.
	 * @param ctx the parse tree
	 */
	void exitDec_main(JavaParser.Dec_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#corpo_main}.
	 * @param ctx the parse tree
	 */
	void enterCorpo_main(JavaParser.Corpo_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#corpo_main}.
	 * @param ctx the parse tree
	 */
	void exitCorpo_main(JavaParser.Corpo_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#dec_metodo}.
	 * @param ctx the parse tree
	 */
	void enterDec_metodo(JavaParser.Dec_metodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dec_metodo}.
	 * @param ctx the parse tree
	 */
	void exitDec_metodo(JavaParser.Dec_metodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#corpo_metodo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo_metodo(JavaParser.Corpo_metodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#corpo_metodo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo_metodo(JavaParser.Corpo_metodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#dec_var}.
	 * @param ctx the parse tree
	 */
	void enterDec_var(JavaParser.Dec_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dec_var}.
	 * @param ctx the parse tree
	 */
	void exitDec_var(JavaParser.Dec_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void enterAtribuir(JavaParser.AtribuirContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void exitAtribuir(JavaParser.AtribuirContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#cond_if}.
	 * @param ctx the parse tree
	 */
	void enterCond_if(JavaParser.Cond_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#cond_if}.
	 * @param ctx the parse tree
	 */
	void exitCond_if(JavaParser.Cond_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#loop_for}.
	 * @param ctx the parse tree
	 */
	void enterLoop_for(JavaParser.Loop_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#loop_for}.
	 * @param ctx the parse tree
	 */
	void exitLoop_for(JavaParser.Loop_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#loop_while}.
	 * @param ctx the parse tree
	 */
	void enterLoop_while(JavaParser.Loop_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#loop_while}.
	 * @param ctx the parse tree
	 */
	void exitLoop_while(JavaParser.Loop_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#cond_switch}.
	 * @param ctx the parse tree
	 */
	void enterCond_switch(JavaParser.Cond_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#cond_switch}.
	 * @param ctx the parse tree
	 */
	void exitCond_switch(JavaParser.Cond_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#escreva}.
	 * @param ctx the parse tree
	 */
	void enterEscreva(JavaParser.EscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#escreva}.
	 * @param ctx the parse tree
	 */
	void exitEscreva(JavaParser.EscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(JavaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(JavaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#idexpr}.
	 * @param ctx the parse tree
	 */
	void enterIdexpr(JavaParser.IdexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#idexpr}.
	 * @param ctx the parse tree
	 */
	void exitIdexpr(JavaParser.IdexprContext ctx);
}
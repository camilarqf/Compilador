package compilador;

// Generated from Java.g4 by ANTLR 4.5.3
import compilador.Main;
import java.util.Collections;
import java.util.List;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
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
	 * Enter a parse tree produced by {@link JavaParser#nomes}.
	 * @param ctx the parse tree
	 */
	void enterNomes(JavaParser.NomesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#nomes}.
	 * @param ctx the parse tree
	 */
	void exitNomes(JavaParser.NomesContext ctx);
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
	 * Enter a parse tree produced by {@link JavaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(JavaParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(JavaParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#dec_met_main}.
	 * @param ctx the parse tree
	 */
	void enterDec_met_main(JavaParser.Dec_met_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dec_met_main}.
	 * @param ctx the parse tree
	 */
	void exitDec_met_main(JavaParser.Dec_met_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(JavaParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(JavaParser.ParamContext ctx);
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
	 * Enter a parse tree produced by {@link JavaParser#dec_corpo_classe}.
	 * @param ctx the parse tree
	 */
	void enterDec_corpo_classe(JavaParser.Dec_corpo_classeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dec_corpo_classe}.
	 * @param ctx the parse tree
	 */
	void exitDec_corpo_classe(JavaParser.Dec_corpo_classeContext ctx);
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
	 * Enter a parse tree produced by {@link JavaParser#mod_metodo}.
	 * @param ctx the parse tree
	 */
	void enterMod_metodo(JavaParser.Mod_metodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#mod_metodo}.
	 * @param ctx the parse tree
	 */
	void exitMod_metodo(JavaParser.Mod_metodoContext ctx);
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
	 * Enter a parse tree produced by {@link JavaParser#dec_var_main}.
	 * @param ctx the parse tree
	 */
	void enterDec_var_main(JavaParser.Dec_var_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dec_var_main}.
	 * @param ctx the parse tree
	 */
	void exitDec_var_main(JavaParser.Dec_var_mainContext ctx);
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
	 * Enter a parse tree produced by {@link JavaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(JavaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(JavaParser.BlocoContext ctx);
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
	 * Enter a parse tree produced by {@link JavaParser#saida}.
	 * @param ctx the parse tree
	 */
	void enterSaida(JavaParser.SaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#saida}.
	 * @param ctx the parse tree
	 */
	void exitSaida(JavaParser.SaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#tipo_print}.
	 * @param ctx the parse tree
	 */
	void enterTipo_print(JavaParser.Tipo_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#tipo_print}.
	 * @param ctx the parse tree
	 */
	void exitTipo_print(JavaParser.Tipo_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(JavaParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(JavaParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#printf}.
	 * @param ctx the parse tree
	 */
	void enterPrintf(JavaParser.PrintfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#printf}.
	 * @param ctx the parse tree
	 */
	void exitPrintf(JavaParser.PrintfContext ctx);
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
	 * Enter a parse tree produced by {@link JavaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(JavaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(JavaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(JavaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(JavaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#op_A}.
	 * @param ctx the parse tree
	 */
	void enterOp_A(JavaParser.Op_AContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#op_A}.
	 * @param ctx the parse tree
	 */
	void exitOp_A(JavaParser.Op_AContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#op_B}.
	 * @param ctx the parse tree
	 */
	void enterOp_B(JavaParser.Op_BContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#op_B}.
	 * @param ctx the parse tree
	 */
	void exitOp_B(JavaParser.Op_BContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#op_atr}.
	 * @param ctx the parse tree
	 */
	void enterOp_atr(JavaParser.Op_atrContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#op_atr}.
	 * @param ctx the parse tree
	 */
	void exitOp_atr(JavaParser.Op_atrContext ctx);
        
        
         public static class VerboseListener extends BaseErrorListener {

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                Object simbolo,
                int linha,
                int poslinha,
                String msg,
                RecognitionException e) {
            List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
            Collections.reverse(stack);

            Main m = new Main();
            m.texto += "Rastro da pilha: " + stack;
            m.texto += " linha " + linha + ":" + poslinha + "\n at " + simbolo + ": " + msg;
        }

    }
}
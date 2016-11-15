/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;


import compilador.JavaListener.VerboseListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author cami
 */
public class Lexico {
Main m = new Main();
    
    public Lexico(String g) {

        ANTLRInputStream input;
        try {
            input = new ANTLRFileStream(g);
            JavaLexer lexer = new JavaLexer(input); // criar analisador lexico
            CommonTokenStream tokens = new CommonTokenStream(lexer); // obter tokens
            JavaParser parser = new JavaParser(tokens);
               
            //gerar parsetree
            ParseTree tree = parser.start();           
                 
            //mostrar  tokens
           m.texto = "=================================\nTOKENS\n=================================\n";
            for (int i = 0; i < tokens.size(); i++) {
                m.texto += tokens.get(i) +"\n";
               
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Lexico.class.getName()).log(Level.SEVERE, null, ex);
                     
        }

    }

}

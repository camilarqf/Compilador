/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author cami
 */
public class Sintatico {

    public Sintatico(String g) {
       
        try {
           ANTLRInputStream  input = new ANTLRFileStream(g);
            JavaLexer lexer = new JavaLexer(input); // criar analisador lexico
            CommonTokenStream tokens = new CommonTokenStream(lexer); // obter tokens
            JavaParser parser = new JavaParser(tokens);
           
            parser.removeErrorListeners();
            parser.addErrorListener(new JavaListener.VerboseListener());

            //gerar parsetree
            ParseTree tree = parser.start();
           
            //mostrar gui
             Trees.inspect(tree, parser);
             
           
        } catch (IOException ex) {
            Logger.getLogger(Lexico.class.getName()).log(Level.SEVERE, null, ex);
            

        }

    }
}


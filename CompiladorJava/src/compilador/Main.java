package compilador;


import java.io.IOException;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Main {

	public static void main(String[] args) throws IOException {
		
			ANTLRInputStream input = new ANTLRFileStream("codigo");
			JavaLexer lexer = new JavaLexer(input); // criar analisador lexico
			CommonTokenStream tokens = new CommonTokenStream(lexer); // obter tokens
			JavaParser parser = new JavaParser(tokens);
			
			//gerar parsetree
			ParseTree tree = parser.start();
					
			//mostrar gui
			Trees.inspect(tree, parser);
			
			//mostrar  tokens
			
			System.out.printf("%s%20s%s","=================================\n "
											,"TOKENS\n"
							  ,"=================================\n");
			for(int i=0; i < tokens.size(); i++){
				System.out.println(tokens.get(i));
			}

	}

}

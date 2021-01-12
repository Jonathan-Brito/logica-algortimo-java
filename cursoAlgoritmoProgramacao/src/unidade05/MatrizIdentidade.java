package unidade05;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Locale;

public class MatrizIdentidade {
	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);
		
		FileWriter arq = new FileWriter("matriz.txt");
		PrintWriter gravaarq = new PrintWriter(arq);
		
		int i;
		int j;
		int I [] [] = new int [3] [3];
		
		for (i = 0; i < 3; i ++) 
			for (j = 0; j < 3; j ++) {
				
				if (i == j) {
					I [i] [j] = 1;
				
				} else {
					I [i] [j] = 0;
				}
				
			for (i = 0; i < 3; i ++) {
				for (j = 0; j < 3; j ++)
					gravaarq.print(I [i] [j]);
				gravaarq.println();
					
			}		
			
			
			}
		
			arq.close();
			gravaarq.close();
	
	}

}

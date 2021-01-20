package unidade05;

import java.util.Locale;
import java.util.Scanner;

public class Matematica {
	
	public static void tabuada(int numero) {
		
		int total;
		int i;
		
		for (i=1; i<=10; i++) {
			total = numero*i;
			System.out.println("N�mero: " + numero + " x " + i + " = " + total);
		}
		
	}
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Por favor informar a nota do aluno");
		int numero = sc.nextInt();
		
		tabuada(numero);
		
		sc.close();
		
	}

}
package unidade05;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AlunosVetor {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String listaAlunos [] = new String [5];
		int i;
		String nome;
		
		for (i = 0; i < 5; i = i + 1) {
			//nome = sc.next();
			nome = JOptionPane.showInputDialog("Por favor digite o nome do aluno");
			listaAlunos [i] = nome;
		}
		
		for (i = 0; i < 5; i = i + 1) {
			System.out.println("Nome = " + listaAlunos [i]);
		}
		
		
		
		sc.close();
	}

}

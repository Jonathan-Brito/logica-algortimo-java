package unidade2;

import java.util.Locale;

import javax.swing.JOptionPane;

public class AppFaturamentoVendas {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double vendasJaneiro; // 15000
		double vendasFevereiro; // 23000
		double vendasMarco; // 17000
		
		vendasJaneiro = Double.parseDouble(JOptionPane.showInputDialog("Favor informar as vendas de janeiro"));
		vendasFevereiro = Double.parseDouble(JOptionPane.showInputDialog("Favor informar as vendas de fevereiro"));
		vendasMarco = Double.parseDouble(JOptionPane.showInputDialog("Favor informar as vendas de mar�o"));
		
		double faturamentoTrimestral = vendasJaneiro + vendasFevereiro + vendasMarco;
		
		JOptionPane.showMessageDialog(null, "Resultado faturamento trimestral= " + faturamentoTrimestral);
	}

}
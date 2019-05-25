package cursojava.excutavel;

import javax.swing.JOptionPane;

public class opcao_conformicao {

	public static void main(String[] args) {
		
		String carros =	JOptionPane.showInputDialog("Informe á quatidade de carros? ");
		String pessoas = JOptionPane.showInputDialog("Informe á quatidade de Pessoas? ");
		
		double carrosNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carrosNumero / pessoasNumero);
		
		double resto = carrosNumero % pessoasNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja saber o resultado?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao + "O resoto -> " + resto);
		}
		
		
		
	}
}

package cursojava.excutavel;

import javax.swing.JOptionPane;

public class entrada_dados {

	public static void main(String[] args) {
		
	String carros =	JOptionPane.showInputDialog("Informe á quatidade de carros? ");
	String pessoas = JOptionPane.showInputDialog("Informe á quatidade de Pessoas? ");
	
	double carrosNumero = Double.parseDouble(carros);
	double pessoasNumero = Double.parseDouble(pessoas);
	
	int divisao = (int) (carrosNumero / pessoasNumero);
	
	double resto = carrosNumero % pessoasNumero;
	
	JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao + " carros e sobrou " + resto + " carros" );
	// System.out.println("Divisão para pessoas deu " + divisao + " carros e sobrou " + resto + " carros");
	
	}
}

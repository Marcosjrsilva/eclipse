package cursojava.excutavel;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* MAIN É UM METODO AUTO EXECUVELEM JAVA*/
	public static void main(String[] args) {

		/*new Aluno() é uma instancia (criação do objeto) */
		/* aluno1 é um referencia para o objeto*/
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		String idade = JOptionPane.showInputDialog("Qual idade?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data nascimento?");
		String rg = JOptionPane.showInputDialog("Numero do RG?");
		String cpf = JOptionPane.showInputDialog("Número do CPF?");
		String mae = JOptionPane.showInputDialog("Nome da Mae?");
		String pai = JOptionPane.showInputDialog("Nome do pai?");
		String dataMatricula = JOptionPane.showInputDialog("Data da matricula");
		String serie = JOptionPane.showInputDialog("Serie matriculada?");
		String escola = JOptionPane.showInputDialog("Nome da escola?");
		String n1 = JOptionPane.showInputDialog("Nota 1=");
		String n2 = JOptionPane.showInputDialog("Nota 2=");
		String n3 = JOptionPane.showInputDialog("Nota 3=");
		String n4 = JOptionPane.showInputDialog("Nota 4=");
		
		
		Aluno aluno1 = new Aluno(); // Estanciado 
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		aluno1.setNota1(Double.parseDouble(n1));
		aluno1.setNota1(Double.parseDouble(n2));
		aluno1.setNota1(Double.parseDouble(n3));
		aluno1.setNota1(Double.parseDouble(n4));
		
		
		System.out.println(aluno1.toString());
				
		System.out.println("Aluno 1 nome é " + aluno1.getNome());
		System.out.println("Aluno 1 idade é " + aluno1.getIdade());
		System.out.println("Aluno 1 numero RG: " + aluno1.getRegistroGeral());
		System.out.println("Aluno 1 nummero CPF " + aluno1.getNumeroCpf());
		System.out.println("Há media do aluno 1 é: " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("----------------------------------------------------------------------------");
	
		
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setNome("Gabreelly Fernanda da Silva");
		aluno2.setIdade(06);
		aluno2.setDataNascimento("22/01/2013");
		aluno2.setRegistroGeral("67.900.821-11");
		aluno2.setNumeroCpf("302.892.389-92");
		aluno2.setNomeMae("Ana Rosa Maria de Jesus");
		aluno2.setNomePai("Marcos Junior da Silva");
		aluno2.setDataMatricula("22/02/2017");
		aluno2.setSerieMatriculado("1");
		aluno2.setNomeEscola("Colégio Vivo Smurf");
		aluno2.setNota1(88.2);
		aluno2.setNota2(82.8);
		aluno2.setNota3(69.9);
		aluno2.setNota4(89.7);
		
		
		
		
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jose", 50);
	
	}
}	
	
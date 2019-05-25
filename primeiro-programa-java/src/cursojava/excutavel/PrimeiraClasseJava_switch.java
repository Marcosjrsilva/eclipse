package cursojava.excutavel;

public class PrimeiraClasseJava_switch {

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 60;
		int n3 = 0;
		int n4 = 60;
		int media = 0;
		
		media = (n1 + n2 + n3 + n4) / 4;
		int dia = 4;
		
		switch (dia) {
		case 1: 
			System.out.println("Domingo");
			break;
			
		case 2: 
			System.out.println("Segunda-feira");
			break;
			
		case 3: 
			System.out.println("Terça-feira");
			break;
			
		case 4: 
			System.out.println("Quarta-feira");
			break;	
			
		default: System.out.println("Outro valor " + media );
			break;
		}
	
	}
}	
	
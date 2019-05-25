package cursojava.excutavel;

public class while_do_whule {

	public static void main(String[] args) {
		
		int i = 1; //count ou cont
		int max = 10;
		
		System.out.println("Contando até: " + max);
		
		while (i <= max) {
			System.out.println("O valor de i: " + i);
			i++;
		}
		
		System.out.println(i);
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
		
		} while(i < 15);
	
		System.out.println(i);
	}
}

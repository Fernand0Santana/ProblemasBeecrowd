import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double preco = 0;
		
		switch(codigo) {
		case 1: preco = 4; break;
		case 2: preco = 4.5; break;
		case 3: preco = 5; break;
		case 4: preco = 2; break;
		case 5: preco = 1.5; break;
		}
		
		System.out.printf("Total: R$ %.2f%n", preco * quantidade);
		
		sc.close();
	}
}

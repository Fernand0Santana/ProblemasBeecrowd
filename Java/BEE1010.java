import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		sc.nextInt();
		int quantidadePeca1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		
		sc.nextInt();
		int quantidadePeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		
		sc.close();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", quantidadePeca1 * valorPeca1 + quantidadePeca2 * valorPeca2);
		
	}
}

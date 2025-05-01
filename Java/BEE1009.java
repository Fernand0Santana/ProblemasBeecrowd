import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		sc.nextLine();
		double salario = sc.nextDouble();
		double vendas = sc.nextDouble();
		
		sc.close();
		
		System.out.printf("TOTAL = R$ %.2f%n", salario + vendas * 0.15);
		
	}
}

import java.util.Scanner;
import java.util.Locale;

public class Main {
	
	public static void main(String rgs[]) {
		
		Locale.setDefault(Locale.US);
		
		double raio;
		
		Scanner sc = new Scanner(System.in);
		
		raio = sc.nextDouble();
		
		System.out.printf("A=%.4f%n", raio * raio * 3.14159);
		
		sc.close();
		
	}
}

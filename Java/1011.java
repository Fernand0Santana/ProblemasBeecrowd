import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		
		sc.close();
		
		System.out.printf("VOLUME = %.3f%n", (4/3.0) * 3.14159 * Math.pow(raio, 3));
		
	}
}

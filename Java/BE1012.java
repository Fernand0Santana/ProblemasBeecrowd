import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		sc.close();
		
		System.out.printf("TRIANGULO: %.3f%n", A * C / 2);
		System.out.printf("CIRCULO: %.3f%n", C * C * 3.14159);
		System.out.printf("TRAPEZIO: %.3f%n", (A + B) * C / 2);
		System.out.printf("QUADRADO: %.3f%n", B * B);
		System.out.printf("RETANGULO: %.3f%n", A * B);
		
	}
}

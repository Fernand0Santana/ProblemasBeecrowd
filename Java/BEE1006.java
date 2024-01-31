import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, MEDIA;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		MEDIA = (A * 2 + B * 3 + C * 5) / 10.0 ;
		
		System.out.printf("MEDIA = %.1f%n", MEDIA);
		
		sc.close();
	}

}

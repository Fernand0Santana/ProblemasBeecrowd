import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double n1, n2, n3;

		for(int x=0 ; x<n ; x++) {
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			System.out.printf("%.1f%n",(n1*2+n2*3+n3*5)/10);
		}

		sc.close();

	}
}

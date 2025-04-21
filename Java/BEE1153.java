import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		sc.close();
		
		int fatorial = 1;

		for(int x=1 ; x<=n; x++) {
			fatorial *= x;
		}
		
		System.out.println(fatorial);

	}
}

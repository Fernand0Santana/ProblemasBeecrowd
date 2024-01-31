import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=2 ; i <= N ; i+=2) {
			System.out.printf("%d^2 = %d%n", i, i*i);
		}
		
		sc.close();
	}
	
}

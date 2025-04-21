import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		sc.close();

		for(int x=1 ; x<=n; x++) {
			if(n%x==0) {
				System.out.println(x);
			}
		}

	}
}

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int A, B;
        
        A = sc.nextInt();
        sc.nextLine();
        B = sc.nextInt();
        
        System.out.printf("X = %d%n", A + B);
        
        sc.close();
    }
 
}

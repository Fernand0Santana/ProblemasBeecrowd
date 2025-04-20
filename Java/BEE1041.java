import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        sc.close();
        
        if(x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if (x == 0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0) {
            System.out.println("Eixo X");
        }
        else {
            if(x > 0) {
                if(y > 0) {
                    System.out.println("Q1");
                }
                else {
                    System.out.println("Q4");
                }
            }
            else {
                if(y > 0) {
                    System.out.println("Q2");
                }
                else {
                    System.out.println("Q3");
                }
            }
        }
      
    }
}

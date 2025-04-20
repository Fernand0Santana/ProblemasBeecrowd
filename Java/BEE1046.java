import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao;

        sc.close();

        if(horaInicial >= horaFinal) {
            duracao = horaFinal + 24 - horaInicial;
        }
        else {
            duracao = horaFinal - horaInicial;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

    }
}

import java.util.Scanner;

public class Adivinhar {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int secreto = 7;

        System.out.println("chute um número de 1-10");
        int chute = entrada.nextInt();
        
        if (chute == secreto) {
            System.out.println("Parabéns, ganhou!");
        } else {
            System.out.println("Errou, tente de novo!");
        }

        entrada.close();
    }
}

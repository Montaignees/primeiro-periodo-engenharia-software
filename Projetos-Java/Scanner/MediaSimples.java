import java.util.Scanner;

public class MediaSimples {

    public static void main(String[] args) {

        Scanner n1 = new Scanner(System.in);

        System.out.print("digite o primeiro numero:");
        int numero1 = n1.nextInt();

        System.out.print("digite o segundo numero:");
        int numero2 = n1.nextInt();

        System.out.println("a média dos 2 numeros é: " + ((numero1 + numero2) / 2));

        n1.close();
    }
}
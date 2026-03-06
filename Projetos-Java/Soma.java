import java.util.Scanner;
public class Soma {

    public static void main(String[] args) {

        Scanner n1 = new Scanner(System.in);

        System.out.print("digite o primeiro numero:");
        int numero1 = n1.nextInt();

        System.out.print("digite o segundo numero:");
        int numero2 = n1.nextInt();

        System.out.print("o resultado da soma é de: " + (numero1 + numero2));

        n1.close();
    }
}

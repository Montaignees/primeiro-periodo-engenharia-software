import java.util.Scanner;

public class Antecessorsucessor {

    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);

        System.out.print("digite o numero:");
        int numero1 = n1.nextInt();

        System.out.println("o antecessor do número: " + numero1 + " é: " + (numero1 - 1));
        System.out.print("o sucessor do número: " + numero1 + " é: " + (numero1 + 1));

        n1.close();

    }
}

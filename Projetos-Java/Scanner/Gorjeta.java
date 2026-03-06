import java.util.Scanner;

public class Gorjeta {

    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);

        System.out.print("digite o valor da conta:");
        double numero1 = n1.nextDouble();

        System.out.print("o valor da gorjeta é: " + (numero1 * 0.1));

        n1.close();

    }
}

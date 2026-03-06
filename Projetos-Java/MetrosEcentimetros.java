import java.util.Scanner;

public class MetrosEcentimetros {

    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);

        System.out.print("digite um numero:");
        double numero1 = n1.nextDouble();

        System.out.print(numero1 + " metros é igual a " + (numero1 * 100) + "cm");

        n1.close();

    }
}

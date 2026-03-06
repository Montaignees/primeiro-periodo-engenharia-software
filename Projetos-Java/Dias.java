import java.util.Scanner;
public class Dias {

    public static void main(String[] args) {

        Scanner n1 = new Scanner(System.in);

        System.out.print("digite quantos anos você tem:");
        double numero1 = n1.nextDouble();

        System.out.print("você tem " + (numero1 * 365) + " dias de vida");

        n1.close();
    }
}

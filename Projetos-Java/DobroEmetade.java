import java.util.Scanner;

public class DobroEmetade {

    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);

        System.out.print("digite um numero:");
        double numero1 = n1.nextDouble();

        System.out.print("o dobro do número: " + numero1 + " é: " + (numero1 * 2));
        System.out.print("a metade do número: " + numero1 + " é: " + (numero1 / 2));

        n1.close();
    }
}

import java.util.Scanner;
public class Cambio {

    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);

        System.out.print("digite quantos reais voce possui:");
        double numero1 = n1.nextDouble();

        System.out.print("você possui " + (numero1 / 5) + " dolares");

        n1.close();
    }
}

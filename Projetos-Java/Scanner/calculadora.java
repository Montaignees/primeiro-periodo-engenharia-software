import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = entrada.nextInt();

        int x = 1;
        while (x <= 10) {

            System.out.println(numero + " x " + x + " = " + numero * x);

            x++;
        }
        entrada.close();
    }
}

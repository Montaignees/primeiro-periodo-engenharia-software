import java.util.Scanner;

public class maiorDeTres {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("digite o primeiro número");
        int n1 = entrada.nextInt();

        System.out.print("digite o segundo número:");
        int n2 = entrada.nextInt();

        System.out.print("digite o terceiro número:");
        int n3 = entrada.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("o maior número é o " + n1);
        } else {
            if (n2 > n3) {
                System.out.println("o maior número é o " + n2);
            } else {
                System.out.println("o maior número é o " + n3);
            }
        }
        entrada.close();
    }
}

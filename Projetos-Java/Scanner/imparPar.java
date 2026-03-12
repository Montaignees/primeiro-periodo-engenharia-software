import java.util.Scanner;
public class imparPar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("digite um número: ");
        int n1 = entrada.nextInt();
            
        if (n1%2 == 0) {
            System.out.print("o número: " + n1 + " é par.");
        } else {
            System.out.println("o número: " + n1 + " é impar");
        }

entrada.close();
    }
}
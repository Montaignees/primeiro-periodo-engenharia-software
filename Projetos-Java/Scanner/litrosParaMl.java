import java.util.Scanner;
public class litrosParaMl {
    public static void main(String[] args) {
        
        Scanner n1 = new Scanner(System.in);

        System.out.println("digite o valor em litros: ");
        double litros = n1.nextDouble();

        System.out.println(litros + " litros em mililitros é igual a: " + litros * 1000 + "ml");

        n1.close();






    }
}

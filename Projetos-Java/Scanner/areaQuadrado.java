import java.util.Scanner;
public class areaQuadrado {
    public static void main(String[] args) {
        
        Scanner n1 = new Scanner(System.in);

        System.out.println("digite o valor do lado do quadrado");
        double lado = n1.nextDouble();

        System.out.println("o perimetro do quadrado é igual a: " + (lado * 4));

        n1.close();

    }
}
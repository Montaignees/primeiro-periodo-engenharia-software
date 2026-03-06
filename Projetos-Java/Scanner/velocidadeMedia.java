import java.util.Scanner;
public class velocidadeMedia {
    public static void main(String[] args) {
        
        Scanner n1 = new Scanner(System.in);

        System.out.println("digite a distancia percorrida em km:");
        double distancia = n1.nextDouble();

        System.out.println("digite o tempo gasto em horas:");
        double horas = n1.nextDouble();

        System.out.println("a velocidade média do trajeto é igual a: " + (distancia / horas));

        n1.close();







    }
}

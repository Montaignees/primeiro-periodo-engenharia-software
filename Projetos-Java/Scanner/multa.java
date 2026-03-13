import java.util.Scanner;
public class multa {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("qual é a velocidade do carro?");
        double velocidade = entrada.nextDouble();

        if (velocidade <= 60) {
            System.out.println("Dentro do limite");
        } else if (velocidade <= 80) {
            System.out.println("Multa leve");
        } else if (velocidade <= 100) {
            System.out.println("Multa grave");
        } else
            System.out.println("Multa gravíssima");

        entrada.close();
    }
}

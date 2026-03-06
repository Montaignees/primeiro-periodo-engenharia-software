import java.util.Scanner;
public class Salario {

        public static void main(String[] args) {
                Scanner n1 = new Scanner(System.in);

                System.out.print("digite seu salario por hora:");
                double numero1 = n1.nextDouble();

                System.out.print("digite quantas horas trabalhou:");
                double numero2 = n1.nextDouble();

                System.out.print("seu salário mensal é de: " + (numero1 * numero2) + " reais");

                n1.close();
        }
}

import java.util.Scanner;
public class estacionamento {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("quantas horas o veículo ficou estacionado?");
        double horas = entrada.nextDouble();

        if (horas <= 1) {
            System.out.println("o valor a ser pago é de R$ 5");
        } else if (horas <= 3) {
            System.out.println("O valor a ser pago é de R$ 10");
        } else if (horas <= 6 ) {
            System.out.println("O valor a ser pago é de R$ 15");
        }else {
            System.out.println("o valor a ser pago é de R$ 20");
        }
    
        entrada.close();
    }
}

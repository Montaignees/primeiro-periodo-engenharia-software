import java.util.Scanner;
public class caixaEletronico {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual é o valor do seu saldo");
        double saldo = entrada.nextDouble();

        System.out.print("quanto você quer sacar?");
        double saque = entrada.nextDouble();

        if(saque > saldo) {
            System.out.println("Saldo insuficiente para realizar a operação");
        } else {
            System.out.print("saque realizado. seu novo saldo é de: " + (saldo - saque));
        }
            
        entrada.close();        
    }
}

import java.util.Scanner;

public class caixaEletronico {
    public static void main(String[] args) {

        int menu;
        int saldo = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");

            System.out.print("Escolha sua ação");
            menu = entrada.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("seu saldo atual é de : " + saldo + "R$");
                    break;
                case 2: {
                    System.out.println("Qual valor voçê deseja depositar?");
                    double deposito = entrada.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("Valor de deposito inválido inválido");
                    } else {
                        saldo += deposito;
                        System.out.println(
                                "Deposito realizado com sucesso. Seu novo saldo é de:" + (saldo + deposito) + "R$");
                        break;
                    }
                }
                case 3:
                    System.out.print("Quanto você deseja sacar?");
                    double saque = entrada.nextDouble();

                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente para realizar saque.");
                    } else {
                        saldo -= saque;
                        System.out.println(
                                "Saque realizado com s2ucesso. Seu novo saldo é de: " + (saldo - saque) + "R$");

                    }
                    break;
                case 4:
                    System.out.print("Saindo...");

                    break;

            }
        } while (menu != 4);
        entrada.close();
    }
}

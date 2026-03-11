import java.util.Scanner;

public class multibanco {
            public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("qual é o seu saldo?");
        int saldo = entrada.nextInt();

        System.out.println("quanto deseja sacar?");
        int saque = entrada.nextInt();        
        
        if (saque<=saldo) {
            System.out.println("transação aprovada");
        } else {
            System.out.println("saldo insuficiente");
    }
    entrada.close();
}
}


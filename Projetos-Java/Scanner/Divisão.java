import java.util.Scanner;

public class Divisão {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite o dividendo");
        int dividendo = entrada.nextInt();

        System.out.println("digite o divisor");
        int divisor = entrada.nextInt();        
        
        if (divisor == 0) {
            System.out.println("Erro: Impossível dividir por zero");
        } else {
            System.out.println("o resultado da operação é: " + (dividendo / divisor));
    }
    entrada.close();
    }
}

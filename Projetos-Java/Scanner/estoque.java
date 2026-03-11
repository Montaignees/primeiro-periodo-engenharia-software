import java.util.Scanner;

public class estoque {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("qual é a quantidade de produtos no estoque?");
        int produtos = entrada.nextInt();
        
        if (produtos < 5) {
            System.out.println("Aviso: Necessário repor stock");
        } else {
            System.out.println("Estoque adequado");
        }

        entrada.close();
    }
}

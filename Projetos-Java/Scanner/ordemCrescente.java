import java.util.Scanner;

public class ordemCrescente {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite o primeiro número:");
        double n1 = entrada.nextDouble();

        System.out.println("digite o segundo número:");
        double n2 = entrada.nextDouble();    
        

        if (n1>n2) {
            System.out.println("a ordem crescente entre os números digitados é: " + n2 + " , " + n1);
        } else {
            System.out.println("a ordem crescente entre os números digitados é: " + n1 + " , " + n2);
    }
    entrada.close();
}
}


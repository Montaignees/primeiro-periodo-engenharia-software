import java.util.Scanner;

public class imc {
            public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual é a sua altura?");
        double altura = entrada.nextDouble();

        System.out.println("Qual é é seu peso?");
        double peso = entrada.nextDouble();    
        
        double imc = peso / (altura * altura);

        if (imc >= 25) {
            System.out.println("Acima do peso");
        } else {
            System.out.println("Peso normal");
    }
    entrada.close();
}
}

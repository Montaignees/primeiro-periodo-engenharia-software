import java.util.Scanner;

public class radarTransito {
        public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual é a velocidade do carro? ");
        double velocidade = entrada.nextDouble();
        
        if ( velocidade> 120){
            System.out.println("Multado por excesso de velocidade");
        } else {
            System.out.println("Boa viagem, velocidade adequada");
    }
    entrada.close();
}
}

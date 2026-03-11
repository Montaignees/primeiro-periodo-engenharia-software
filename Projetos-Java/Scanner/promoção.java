import java.util.Scanner;

public class promoção {
    
        public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual é o valor do produto?");
        double valor = entrada.nextDouble();
        double promoção = valor * 0.9;

        if ( valor> 200) {
            System.out.println("este produto contêm uma promoção de 10%. seu valor final é de: " + promoção + " reais");
        } else {
            System.out.println("este produto custa " + valor);
    }
    entrada.close();
}
}


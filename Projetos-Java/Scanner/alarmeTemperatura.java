import java.util.Scanner;

public class alarmeTemperatura {
            public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("qual é a temperatura da caldeira?");
        int temperatura = entrada.nextInt();
        
        if (temperatura > 35) {
            System.out.println("PERIGO: Sobreaquecimento");
        } else {
            System.out.println("Temperatura Normal");
    }
    entrada.close();
}
}

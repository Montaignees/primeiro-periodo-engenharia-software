import java.util.Scanner;
public class horasEstudando {
    public static void main(String[] args) {
        
        Scanner n1 = new Scanner(System.in);

        System.out.println("quantos minutos você estudou? ");
        double horas = n1.nextDouble();
        System.out.println("a quantidade de minutos estudados foram: " + (horas * 60));

        n1.close();




    }
}

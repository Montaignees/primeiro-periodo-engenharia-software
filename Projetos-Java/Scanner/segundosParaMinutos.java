import java.util.Scanner;
public class segundosParaMinutos {
    public static void main(String[] args) {
        
        Scanner n1 = new Scanner(System.in);

        System.out.println("digite o tempo em segundos");
        double segundos = n1.nextDouble();

        System.out.println(segundos + " segundos é igual a: " + (segundos / 60) + " minutos");

        n1.close();
    }
}

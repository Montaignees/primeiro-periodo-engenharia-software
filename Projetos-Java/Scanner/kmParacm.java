import java.util.Scanner;
public class kmParacm {

    public static void main(String[] args) {
        
        Scanner n1 = new Scanner(System.in);

        System.err.println("digite a distancia em km: ");
        double km = n1.nextDouble();

        System.err.println(km + " km em centimetros é igual a: " + km * 100000 + "cm");

        n1.close();


    }



}
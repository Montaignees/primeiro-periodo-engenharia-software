import java.util.Scanner;
public class areaTrapezio {
    public static void main(String[] args) {
        
        Scanner n1 = new Scanner(System.in);

        System.out.println("o valor da base maior do trapézio:");
        double baseMaior = n1.nextDouble();

        System.out.println("digite o valor da base menor do trapézio:");
        double baseMenor = n1.nextDouble();

        System.out.println("digite o valor da altura do trapézio:");
        double altura = n1.nextDouble();

        System.out.println("a área do trapézio é igual a: " + ((baseMaior + baseMenor) * altura/2));

        n1.close();
    }
}

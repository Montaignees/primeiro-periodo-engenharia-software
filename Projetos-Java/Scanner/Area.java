import java.util.Scanner;

public class Area {

        public static void main(String[] args) {
                Scanner n1 = new Scanner(System.in);

                System.out.print("digite altura em metros: ");
                double numero1 = n1.nextDouble();

                System.out.print("digite a largura em metros: ");
                double numero2 = n1.nextDouble();

                System.out.print("a área do terreno é de: " + (numero1 * numero2) + "m²");
                
                n1.close();
        }
}
import java.util.Scanner;
public class consumoEnergia {
    public static void main(String[] args) {
        
        Scanner n1 = new Scanner(System.in);

        System.out.println("digite a potencia em Watts do aparelho:");
        double watts = n1.nextDouble();

        System.out.println("digite a quantidade de horas que o aparelho fica ligado: ");
        double horas = n1.nextDouble();

        System.out.println("o consumo em kWh do aparelho è de: " + ((watts * horas)/1000 ));

        n1.close();






    }
}

import java.util.Scanner;
public class areaCirculo {
    public static void main(String[] args) {
        
        Scanner n1 = new Scanner(System.in);

        System.out.println("Digite o raio do circulo aqui: ");
        double raio = n1.nextDouble();

        System.out.println("a área do seu circulo é igual a: " + (raio * 3.14));

        n1.close();
    }
}

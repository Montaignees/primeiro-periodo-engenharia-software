import java.util.Scanner;
public class acrescimo {
    public static void main(String[] args) {
        
        Scanner n1 = new Scanner(System.in);

        System.out.println("digite o preço do produto:");
        double preço = n1.nextDouble();

        System.out.println("o preço final com acrescimo de 15% sobre o produto é de: " + (preço * 1.15));

        n1.close();
    }
}

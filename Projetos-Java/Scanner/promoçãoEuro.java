import java.util.Scanner;

public class promoçãoEuro {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o valor do produto em euro?");
        double valor = entrada.nextDouble();

        if (valor > 500) {
            System.out.println(
                    "este produto contêm uma promoção de 20%. seu valor final é de: " + valor * 0.8 + " euros");
        } else {

            if (valor > 200) {
                System.out.println(
                        "este produto contêm uma promoção de 10%. seu valor final é de: " + valor * 0.9 + " euros");
            } else {
                System.out.println("este produto não contêm uma promoção. seu valor final é de: " + valor + " euros");
            }
        }
        entrada.close();
    }
}

// "este produto contêm uma promoção de 10%. seu valor final é de: " + promoção
// + " reais")
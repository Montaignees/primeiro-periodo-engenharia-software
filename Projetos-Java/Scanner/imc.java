import java.util.Scanner;
public class imc {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu peso");
        double peso = entrada.nextDouble();

        System.out.print("digite sua altura");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        if (imc <18.5) {
            System.out.println("abaixo do peso");
        } else if (imc <24.9) {
            System.out.println("Peso normal");
        } else if (imc <29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
        entrada.close();
    }       
}

import java.util.Scanner;
public class nota {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite a nota do aluno:");
        int nota = entrada.nextInt();

        if (nota > 90) {
            System.out.println("Excelente");
        } else if (nota >= 70) {
            System.out.println("Bom");
        } else if (nota >= 50) {
            System.out.println("Regular");
        } else
            System.out.println("Insuficiente");

        entrada.close();
        }
    }


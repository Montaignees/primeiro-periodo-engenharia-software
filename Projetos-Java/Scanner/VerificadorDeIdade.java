
// Importar a utilitária scanner;
import java.util.Scanner;

public class VerificadorDeIdade {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int anoAtual = java.time.Year.now().getValue();
        // Loop até o usuário digitar um ano válido
        while (true) {

            // Pedir/Armazenamento de informações
            System.out.println("Digite seu ano de nascimento:");
            int anoNascimento = entrada.nextInt();

            int idade = anoAtual - anoNascimento;

            if (anoNascimento > anoAtual) {
                System.out.println("idade inválida. Tente novamente.");
            } else {

                if (idade >= 18) {
                    System.out.println("Acesso permitido. Seja bem-vindo.");
                } else {
                    System.out.println("Acesso negado. Conteúdo permitido apenas para maiores.");
                }
                break;
            }
        }
        entrada.close();
    }
}

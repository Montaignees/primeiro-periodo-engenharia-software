    // Importar a utilitária scanner;
import java.util.Scanner;

public class verificadorIdade {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); 
           
            // Pedir/Armazenamento de informações
        System.out.print("digite seu ano de nascimento aqui:");
        int ano_Nascimento = entrada.nextInt();

        int ano_Atual = java.time.Year.now().getValue();
        int idade = ano_Atual - ano_Nascimento;
            
        entrada.close();

        if (idade >=18) {
            System.out.println("Seja bem Vindo!");
        } else {
            System.out.println("Você precisa ser maior de 18 anos para acessar este conteúdo, no momento você possui: " + idade + " anos." );
        }
    }
}

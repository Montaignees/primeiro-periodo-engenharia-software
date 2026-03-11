import java.util.Scanner;

public class maioridadeSimples {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual e seu ano de nascimento?  ");
        int anoNascimento = entrada.nextInt();
        int anoAtual = 2026;
        int idade = anoAtual - anoNascimento;
        
        if ( idade>= 18){
            System.out.println("Pode Entrar");
        } else {
            System.out.println("Entrada Negada");
    }
    entrada.close();
}
}
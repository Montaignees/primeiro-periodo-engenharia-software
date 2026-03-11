import java.util.Scanner;
public class senhaNumerica {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int senhaCorreta = 1234;
                
        System.out.println("Digite a sua senha: ");
        int senha = entrada.nextInt();
        
        if (senha == senhaCorreta){
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso Negado");
    }
  
entrada.close();
}
}
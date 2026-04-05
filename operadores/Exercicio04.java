import java.util.Scanner;

public class Exercicio04{
    public static void main (String[] args){
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("----------BEM-VINDO AO SEU LOGIN!--------");
        
        System.out.print("USUÁRIO: ");
        String usuario = scanner.nextLine();
        
        System.out.print("Senha: ");
        int senha = scanner.nextInt();
        
        if (usuario.equals ("admin")){
            if (senha == 1234){
                System.out.print("Entrando...");
            }
        }
        else{
            System.out.print("Senha ou usuário incorreto");
        }
    }
}

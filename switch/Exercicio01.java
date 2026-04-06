import java.util.Scanner;

public class Exercicio01{
    public static void main (String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escolhaa uma opão de 1 a 3: ");
        byte opcao = scanner.nextByte();
        
        switch (opcao){
            
            case 1:
                System.out.println("Saldo");
                break;
            case 2:
                System.out.println("Saque");
                break;
            case 3:
                System.out.println("Depósito");
                break;
            default:
                System.out.println("Opção inválida meu bem :(");
                break;
        }
    }
}

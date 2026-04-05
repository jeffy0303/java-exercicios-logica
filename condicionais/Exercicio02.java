import java.util.Scanner;

public class Exercicio02{
    public static void main (String[] args){
        
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite um ano para saber se ele é bissexto ou não: ");
    int ano = scanner.nextInt();
    
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println("Esse ano é bissexto!");
        } else {
            System.out.println("Esse ano não é bissexto");
        }
    }
}

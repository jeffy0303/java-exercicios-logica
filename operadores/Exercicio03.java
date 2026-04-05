import java.util.Scanner;

public class Exercicio03{
    public static void main (String[] args){
    
    //Verfifique se um número é par OU multiplo de 5
    
    Scanner scanner = new Scanner (System.in);
    
    System.out.print("Digite um número: ");
    int numero = scanner.nextInt();
    
    if (numero % 2 == 0 || numero % 5 == 0){
        System.out.println("Ok");
    }
    else{
        System.out.println("Outro numero meu bem");
    }
    
    }
}

import java.util.Scanner;

public class Exercicio02{
    public static void main (String[] args){

    //Verifique se um número está entre 10 e 50
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite um número entre 10 e 50: ");
    int numero = scanner.nextInt();
    
    if (numero >= 10 && numero <= 50){
        System.out.println("O número está entre 10 e 50!");
    }
    else{
        System.out.println("Esse número não está entre 10 e 50, escolha outro");
    }
    
    }
}

import java.util.Scanner;

public class Exercicio02{
    public static void main (String[] args){
         Scanner sc = new Scanner(System.in);
         
    //calculadora simples
    
    char continuar = 's';
    
    while (continuar == 's'){
        
        System.out.println("Escolha a operação: ");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        byte operacao = sc.nextByte();
        
        System.out.print("Escolha o primeiro número: ");
        double numero1 = sc.nextDouble();
        System.out.print("Escolha o segundo número: ");
        double numero2 = sc.nextDouble();
    
        double resultado;
    
        switch(operacao){
        
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                resultado = numero1 / numero2;
                break;    
            default:
                System.out.println("Opção inválida!");
                continue;
                }
        
        System.out.println("Resultado: " + resultado);

        System.out.println("Deseja fazer outra operação (s/n): ");
        continuar = sc.next().toLowerCase().charAt(0);
    }
    
    System.out.println("---------Programa finalizado com sucesso-----------");
  }
}

import java.util.Scanner;

public class Exercicio01{
    public static void main (String[] args){
        
    //receba a nota de um aluno onde >=7 é aprovado, >=5 é recuperação, e < 5 é reprovado
    Scanner scanner = new Scanner (System.in);
    
    System.out.print("Digite sua nota: ");
    int nota = scanner.nextInt();
    
        if (nota >= 7){
            System.out.println("Boa! Você foi aprovado, parabéns!!!");
        } else if (nota >= 5){
            System.out.println("Quase! Você está de recuperação, continue estudando viu ;) ");
        } else {
            System.out.println("Poxa... Infelizmente você está reprovado, mas não se preocupe você terá mais uma chance ;)");
        }
    
    }
}

import java.util.Scanner;

public class Exercicio01{
	public static void main(String[] args) {
	    
	//Crie um programa que receba idade e verifique se o usuário pode entrar em uma festa (idade>=18 E nome não vazio)
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Digite primeiro seu nome: ");
	String nome = scanner.nextLine();
	
	
	System.out.print("Agora sua idade: ");
	int idade = scanner.nextInt();
	
	
	if (nome.isEmpty()){
	    System.out.println("Preciso primeiro saber seu nome");}
	    
	else if (idade >= 18){
	    System.out.println(nome+" você está liberado(a) para entrar na festa! ;)");}
	    
	else {
	    System.out.println(nome+" você ainda não é permitido entrar:(");}
	    
	}
}

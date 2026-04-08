public class Exercicio02{
    public static void main (String[] args){
    
    int [][] numeros = new int [3][3];
    
    numeros [0][0] = 20;
    numeros [0][1] = 21;
    numeros [0][2] = 22;
    
    numeros [1][0] = 20;
    numeros [1][1] = 21;
    numeros [1][2] = 22;
    
    numeros [2][0] = 20;
    numeros [2][1] = 21;
    numeros [2][2] = 22;
    
    for(int i = 0; i < numeros.length; i++){
        for(int j = 0; j <numeros[i].length; j++){
        System.out.println(numeros[i][j]);}}
 }
}

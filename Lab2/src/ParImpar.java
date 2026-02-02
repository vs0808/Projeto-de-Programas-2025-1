/*
 Crie uma classe em Java chamada ParImpar que fique lendo números inteiros do teclado até que o número -1 seja digitado. Para cada número, imprimir se ele é "PAR" ou "IMPAR".
Exemplo de entrada e saída esperada:

    Entrada: 6 67 32 7 -1
    Saída: PAR
    IMPAR
    PAR
    IMPAR


 */
import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int[] vetor_numeros = new int[100];
    int i=0, contador =0;
    int numero;
    while(true){
        numero = scan.nextInt();
        if(numero == -1) break;
        vetor_numeros[contador] = numero;
        contador++;
    }
    for(i=0;i<contador;i++){
        if((vetor_numeros[i]%2)!=0){
            System.out.println("IMPAR");
        }
        if((vetor_numeros[i]%2)==0){
            System.out.println("PAR");
        }
    }
    }
}
//Acredito que o ideal fosse aplicar uma lista, semelhante ao exercicio PorcentagemAcerto do lab1.
//Mas para fins de aprendizagem, segue essa solução.
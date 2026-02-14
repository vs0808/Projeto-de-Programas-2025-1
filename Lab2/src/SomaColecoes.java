/*
 Escreva um programa (classe SomaColecoes) que calcula a soma de várias coleções de valores digitados pelo usuário. O usuário irá inserir -1 para indicar o fim de uma coleção e o início da próxima. Uma coleção sem elementos indica o final do programa.
Exemplo de entrada e saída esperada:

    Entrada: 20 30 40 -1 8 7 64 -1 38 26 15 95 -1 -1
    Saída: 90
    79
    174


 */
import java.util.Scanner;
public class SomaColecoes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        int somador=0;
        while(true){
            numero = scan.nextInt();
            if(numero == -1){
                if(somador == 0){
                    System.out.println("");
                    break;
                }else{
                    System.out.printf("%d\n", somador);
                    somador =0;
                }

            }else{
                somador = somador+numero;
            }
        }
        scan.close();
    }
}

//Não me soa a solução mais elegante, eu particularmente não gosto muito do uso de break, entretanto,
//resolve o problema.
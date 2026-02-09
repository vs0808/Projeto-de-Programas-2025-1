/*
 Desenvolva um programa (classe SomaDigitos) que leia um número inteiro a partir do teclado e exiba a soma dos dígitos do número.
Exemplo de entrada e saída esperada:
    Entrada: 3141
    Saída: 9
Dica:
    Use o operador de resto da divisão (%).
 */
import java.util.Scanner;
public class SomaDigitos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double numero=0, somador = 0, converte_resto, novo_numero = 0, resto;

        numero = scan.nextDouble();

        while(numero!=0){

            resto = numero%10; //Pega o resto

            novo_numero = numero/10; //(Ex: 3141 -> 314,1
            somador = somador+resto;
            converte_resto = resto/10; //retoma resto para um valor decimal (Ex: 1 (resto) -> 0,1)
            numero = novo_numero-converte_resto; //numero assume um novo valor(Ex: 314,1 - 0,1 = 314)
        }
        System.out.printf("%.0f\n", somador);// O usuário vai ver como um valor inteiro

    }
}

//Imagino que haja uma solução mais elegante, mas desenvolvi essa.
//O ideal imagino que fosse o trabalho com divisões inteiras.

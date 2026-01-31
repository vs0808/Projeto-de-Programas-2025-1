/*
 Crie uma classe em Java chamada Xadrez que leia a quantidade de linhas do usuário e imprima o padrão abaixo (para entrada 6).
* * * * * *
 * * * * * *
* * * * * *
 * * * * * *
* * * * * *
 * * * * * *
Dicas:

    Note que tanto a quantidade de linhas quanto a quantidade de "*" é 6 (número digitado pelo usuário).
    Para imprimir algo em Java sem a nova linha no final, use o método System.out.print(). Exemplo: System.out.print('*');

 */

import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numDeLinhas = scan.nextInt();

        for(int i=0;i<numDeLinhas;i++) {
            if (i % 2 == 0) {
                System.out.println("******");
            }
            if (i % 2 != 0) {
                System.out.println(" ******");
            }
        }
    }
}
/*
 As respostas de um candidato a uma prova de múltipla escolha são guardadas em um vetor.
 O gabarito é guardado em outro vetor de mesmo tamanho. Escreva um programa (classe PorcentagemAcerto) que
 leia o vetor de respostas e o vetor do gabarito, nessa ordem, e imprima na saída a porcentagem de acerto do
 candidato, com duas casas decimais de precisão. Considere que os dois vetores inseridos são sempre do
 mesmo tamanho, possuem pelo menos um elemento e, para indicar o fim do vetor, o número -1 é inserido.
Exemplo de entrada e saída esperada:

    Entrada: 1 2 3 4 5 -1 1 2 3 1 1 -1
    Saída: 60,00


*/

import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] respostas = new int[100];
        int tamanho = 0;

        // Lê respostas até -1
        while (true) {
            int valor = scan.nextInt();
            if (valor == -1) break;
            respostas[tamanho] = valor;
            tamanho++;
        }

        int[] gabarito = new int[tamanho];

        // Lê gabarito até -1 (ou até preencher tamanho)
        int j = 0;
        while (true) {
            int valor = scan.nextInt();
            if (valor == -1) break;
            gabarito[j] = valor;
            j++;
        }

        int acertos = 0;
        for (int i = 0; i < tamanho; i++) {
            if (respostas[i] == gabarito[i]) acertos++;
        }

        double porcentagem = (acertos * 100.0) / tamanho;


        System.out.printf( "%.2f%n", porcentagem);

        scan.close();
    }
}

//O ideal acredito que seria usarmos listas, mas tudo bem, segue essa solução apenas para fins de aprendizagem.



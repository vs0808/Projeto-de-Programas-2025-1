/*
 As cédulas do real começaram a entrar em circulação no Brasil em 1994. Diferentemente das moedas que haviam circulado anteriormente, o real não traz na sua nota personalidades da história nacional, mas sim animais da fauna brasileira, conforme mostra a tabela abaixo.
Animal 	Valor da Cédula
Tartaruga 	R$ 2
Garça 	R$ 5
Arara 	R$ 10
Mico-leão-dourado 	R$ 20
Onça-pintada 	R$ 50
Garoupa 	R$ 100
Escreva um programa (classe AnimaisCedulas) que leia o valor de uma cédula e apresente na tela o nome do animal representado no verso da nota. Se não existir uma cédula no valor inserido, o programa deverá imprimir "erro".
Dica:

    A saída é com acentos e com a primeira letra em maiúsculo.


 */
import java.util.Scanner;

public class AnimaisCedulas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int valor_celula = scan.nextInt();
        if(valor_celula==2){
            System.out.println("Tartaruga");
        }else if(valor_celula ==5){
            System.out.println("Garça");
        }else if(valor_celula ==10){
            System.out.println("Arara");
        }else if(valor_celula ==20){
            System.out.println("Mico-Leão-Dourado");
        }
        else if(valor_celula ==50){
            System.out.println("Onça-pintada");
        }
        else if(valor_celula ==100){
            System.out.println("Garoupa");
        }else{
            System.out.println("invalido");
        }
        scan.close();
    }
}


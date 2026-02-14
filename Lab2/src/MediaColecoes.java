/*
 Escreva um programa (classe MediaColecoes) que calcula a média de várias coleções de valores digitados
 pelo usuário, com duas casas decimais. O usuário irá inserir -1 para indicar o fim de uma coleção e o
 início da próxima. Uma coleção sem elementos indica o final do programa.
Exemplo de entrada e saída esperada:

    Entrada: 20 30 40 -1 8 7 64 -1 38 26 15 95 -1 -1
    Saída: 30,00
    26,33
    43,50


 */
import java.util.Scanner;
public class MediaColecoes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double numero, media=0, contador=0, somador=0;

        while(true){
            numero = scan.nextDouble();
            if(numero == -1){
                if(contador == 0){
                    System.out.println("");
                    break;
                }else{
                    media = somador/contador;
                    System.out.printf("%.2f\n", media);
                    somador=0;
                    contador =0;
                }

            }else{
                somador = somador + numero;
                contador++;
            }
        }
        scan.close();
    }
}

/*
Assim como a questão de SomaColecoes, essa resolução não me parece a mais elegante, mas resolve
o problema.
 */
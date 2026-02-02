/*
 Crie uma classe em Java chamada RaizQuadrada que calcule e imprima a raiz quadrada de um número inteiro lido do teclado. Sua saída deverá ter 4 casas decimais.
Dicas:

    Você pode representar os números reais usando float ou double.
    Em Java, um número real isolado (e.g., 1.21) é considerado como sendo do tipo double. Para usar um número como sendo do tipo float, use o 'f' ao final do número (e.g., 1.21f).
    Java converte automaticamente tipos quando não há perda de precisão. Exemplo: double nota = 8.7f; // Converte de float para double automaticamente
    Entretanto, quando há perda de precisão, isso não é possível e o uso do cast é obrigatório. Exemplo: float nota = (float) 8.7; // Converte de double para float usando o cast
    Para calcular uma raiz quadrada em Java, usa-se o método sqrt(double a) da classe Math. Exemplo: double raiz = Math.sqrt(24601);
    Para imprimir algo formatado em Java, use o método System.out.printf(String format, Object... args). Exemplo: System.out.printf("%.3f\n", media);


 */

import java.util.Scanner;
public class RaizQuadrada {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    double raiz, numero;
    numero = scan.nextDouble();
    raiz = Math.sqrt(numero);
    System.out.printf("%.4f\n", raiz);
    }
}

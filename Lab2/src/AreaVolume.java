/*
 Escreva um programa (classe AreaVolume) que leia o valor de um raio , inserido a partir do teclado. O programa deverá mostrar a área de um círculo com o raio e o volume de uma esfera com raio , de acordo com o exemplo abaixo. Para esta questão, use apenas variáveis do tipo double.
Exemplo de entrada e saída esperada:

    Entrada: 45
    Saída: Um circulo com raio de 45,00 centimetros tem uma area de 6361,73 centimetros quadrados.
    Uma esfera com raio de 45,00 centimetros tem um volume de 381703,51 centimetros cubicos.

Fórmulas:

    A área de um círculo é dada pela fórmula .
    O volume de uma esfera é dada pela fórmula .

Dicas:

    Use apenas variáveis do tipo double para não perder precisão e não dar erro na correção automática.
    Use a constante PI presente na classe Math do Java para pegar o valor de . Exemplo: double pi = Math.PI;
    Note que em Java, 1/3 = 1, enquanto que 1.0/3.0 = 1.333.
    Para calcular uma exponenciação em Java, usa-se o método pow(double a, double b) da classe Math. Exemplo: double exp = Math.sqrt(2, 8);


 */
import java.util.Scanner;
public class AreaVolume{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double raio;
        double pi = Math.PI;

        raio = scan.nextDouble();

        double area;

        area = pi * (Math.pow(raio, 2));

        double volume;

        volume = (4 *pi * (Math.pow(raio,3)))/3;

        System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.\n", raio, area);
        System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.\n", raio, volume);
        scan.close();
    }
}
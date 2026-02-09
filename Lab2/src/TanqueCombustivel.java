/*
 Um tanque de combustível tem o formato esférico. Escreva um programa (classe TanqueCombustivel) que leia o valor do raio () do tanque, o valor da altura do ar () e a opção para saber se deseja calcular o volume de ar (opção 1) ou o volume de combustível no tanque (opção 2).
Figura: tanque de combustível
A saída do programa deverá ser o volume conforme a opção selecionada, com quatro casas decimais de precisão. Não é necessário verificar situações inválidas (opções diferentes de 1 ou 2, ou valores de altura maiores que o raio da esfera).
Fórmulas:

    Volume da esfera de raio :
    Volume da calota esférica de raio e altura :

Exemplos de entrada e saída esperada:

    Entrada: 30 27 1
    Saída: 48094,6419
    Entrada: 30 27 2
    Saída: 65002,6936

Dica:

    O volume de ar corresponde à formula da calota esférica. Já o volume do combustível corresponde ao complemento do volume da calota esférica em relação ao volume total da esfera.
 */
import java.util.Scanner;

public class TanqueCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double raio = scan.nextDouble();
        double altura_do_ar = scan.nextDouble();
        int opcao = scan.nextInt();

        double pi = Math.PI;

        double volumeEsfera = (4.0 * pi * Math.pow(raio, 3)) / 3;
        double volumeAr = (pi * Math.pow(altura_do_ar, 2) * (3 * raio - altura_do_ar)) / 3;

        if (opcao == 1) {
            System.out.printf("%.4f\n", volumeAr);
        } else if (opcao == 2) {
            double volumeCombustivel = volumeEsfera - volumeAr;
            System.out.printf("%.4f\n", volumeCombustivel);
        }

        scan.close();
    }
}
/*
 Um número narcisista é um número que segue a seguinte regra:
,
onde é a quantidade de dígitos do número. Por exemplo, o número é um número narcisista, pois .
Desenvolva um programa (classe NumeroNarcisista) que leia um número inteiro do teclado e diga "SIM" se ele for um número narcisista ou "NAO", caso contrário.
Dicas:

    Use o operador de resto da divisão (%).
    Para calcular uma exponenciação em Java, usa-se o método pow(double a, double b) da classe Math. Exemplo: double exp = Math.sqrt(2, 8);
 */

import java.util.Scanner;

import java.util.Scanner;

public class NumeroNarcisista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long numero = scan.nextLong();
        long copia = numero;

        // conta dígitos
        int digitos = 0;
        long temp = numero;
        if (temp == 0) digitos = 1;
        while (temp > 0) {
            temp /= 10;
            digitos++;
        }

        // soma potências
        long soma = 0;
        while (copia > 0) {
            long resto = copia % 10;
            soma += (long) Math.pow(resto, digitos);
            copia /= 10;
        }

        if (soma == numero) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }
}

/*
Tentei usar double, mas para o exemplo 153, eu tinha a seguinte saída:
153
129997047846698040000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
NAO

Não sei ao certo que tipo de adaptação eu devia fazer para usar double, suponho que sucessivas divisões usando
double, cause uma grande propagação de erro.
 */
/*
 Escreva um programa (classe ArteAscii) que imprima uma figura semelhante à representada abaixo, a partir da leitura do número de asteriscos presentes na base. Por exemplo, para uma entrada igual a 5, o resultado produzido será igual ao da figura abaixo.
*****
****
***
**
*
*
**
***
****
*****
Dicas:

    Para imprimir algo em Java sem a nova linha no final, use o método System.out.print(). Exemplo: System.out.print('*');
    Para imprimir apenas uma nova linha use System.out.println();


 */
import java.util.Scanner;

public class ArteAscii {

    // imprime n asteriscos na mesma linha (recursivo)
    public static void imprimeEstrelas(int n) {
        if (n == 0) {
            return; // caso base: não imprime nada
        }
        System.out.print("*");
        imprimeEstrelas(n - 1); // chamada recursiva
    }

    // imprime a figura completa (recursivo)
    public static void imprimeArte(int n) {
        if (n == 0) {
            return; // segurança: nada a fazer
        }

        // descida: imprime n, depois vai para n-1
        imprimeEstrelas(n);
        System.out.println();

        if (n == 1) {
            // no "meio" do desenho, precisa imprimir a linha 1 duas vezes
            imprimeEstrelas(1);
            System.out.println();
            return;
        }

        imprimeArte(n - 1); // recursão para descer

        // subida: quando volta, imprime n novamente
        imprimeEstrelas(n);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        imprimeArte(numero);
        scan.close();
    }
}

/*
A questão não exigia recursão, provavelmente seria mais direto e fácil sem recursão, fiz dessa forma
apenas para treinar um pouco de recursão também.
 */
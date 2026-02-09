/*
 Escreva um programa (classe TipoTriangulo) que leia as medidas dos três lados de um triângulo, fornecidas pelo usuário, em qualquer ordem, e imprima o nome do tipo de triângulo: "equilatero" (todos os três lados iguais), "isosceles" (apenas dois lados iguais), ou "escaleno" (nenhum par de lados iguais).
Se pelo menos um dos lados for negativo ou os três lados não formarem um triângulo, o programa deverá imprimir a mensagem "invalido" na tela.
Dicas:

    A saída é em minúsculo, sem acentos.
    Em um triângulo, a soma dos comprimentos de quaisquer dois lados é maior que o comprimento do terceiro lado [Wiki].

 */
import java.util.Scanner;
public class TipoTriangulo{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double l1 = scan.nextDouble();
        double l2 = scan.nextDouble();
        double l3 = scan.nextDouble();

        if(l1<=0 || l2 <=0 || l3 <=0 || (l1+l2)<l3 || (l1+l3)<l2 || (l2+l3)<l1){
            System.out.println("invalido");
        } else if (l1==l2 && l2==l3 && l1==l3) {
            System.out.println("equilatero");
        } else if ( (l1==l2 && l1!=l3 && l2!=l3) || (l1==l3 && l1!=l2 && l3!=l2 ) || (l2==l3 && l1!=l2 && l3!=l1 )) {
            System.out.println("isosceles");
        } else if (l1!=l2 && l1!=l3 && l2!=l3 ) {
            System.out.println("escaleno");
        }
        scan.close();
    }
}
//Talvez haja uma melhor forma de validar o isosceles, mas enfim, código funcional
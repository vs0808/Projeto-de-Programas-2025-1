/*


Escreva um programa (classe ContaEnergia) que determine o preço a pagar pelo fornecimento de energia elétrica. Como entrada, ele deve receber o consumo de energia (em kWh) e o tipo de instalação (R para residências, I para indústrias, e C para comércios). Use a tabela a seguir para calcular o preço devido:
Preço por tipo e faixa de consumo
Tipo 	Faixa (kWh) 	Preço
Residencial 	Até 500 	R$ 0,40
Acima de 500 	R$ 0,65
Comercial 	Até 1000 	R$ 0,55
Acima de 1000 	R$ 0,60
Industrial 	Até 5000 	R$ 0,55
Acima de 5000 	R$ 0,60
A saída deve ter duas casas decimais. Caso algum valor inválido seja inserido, o programa deve imprimir -1.00.
Exemplo de entrada e saída esperada:

    Entrada: 6340 R
    Saída: 4121,00

Dica:

    A classe Scanner não possui o método nextChar(). Para ler um caractere do teclado use: char tipo = scan.next().charAt(0);


 */

import java.util.Scanner;

public class ContaEnergia {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        float consumo = scan.nextFloat();
        char tipo = scan.next().charAt(0);
        float valor =0;

        if(tipo!='R' && tipo !='C' && tipo!='I'){
            System.out.println("-1.00");
        }
        if(consumo<0){
            System.out.println("-1.00");
        }

        if(tipo =='R'){
            if(consumo<=500 && consumo>0){
                valor = 0.40f;
                float preco_final = consumo*valor;
                System.out.printf("%.2f\n ", preco_final);
            }
            if(consumo>500){
                valor = 0.65f;
                float preco_final = consumo*valor;
                System.out.printf("%.2f\n", preco_final);
            }
        }


        if(tipo =='C'){
            if(consumo<=1000 & consumo>0){
                valor = 0.55f;
                float preco_final = consumo*valor;
                System.out.printf("%.2f\n", preco_final);
            }
            if(consumo>1000){
                valor = 0.60f;
                float preco_final = consumo*valor;
                System.out.printf("%.2f\n", preco_final);
            }
        }

        if(tipo =='I'){
            if(consumo<=5000 && consumo>0){
                valor = 0.55f;
                float preco_final = consumo*valor;
                System.out.printf("%.2f\n", preco_final);
            }
            if(consumo>5000){
                valor = 0.60f;
                float preco_final = consumo*valor;
                System.out.printf("%.2f\n", preco_final);
            }
        }

        scan.close();
    }
}
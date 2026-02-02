/*
 Fernando Silva é programador e ganha por horas trabalhadas. Sabendo que são descontados 11% para o Imposto de Renda e 8% para o INSS. Escreva uma classe chamada FolhaPagamento que receba o valor da hora (double) e quantidade de horas (int) trabalhadas de Fernando e calcule:

    Qual o salário bruto?
    Quanto Fernando pagou de Imposto de Renda?
    Quanto Fernando pagou ao INSS?
    Qual o total de descontos do salário de Fernando?
    Qual é o salário líquido de Fernando?

A saída do programa deve ser de acordo com o exemplo abaixo.
Exemplo de entrada e saída esperada:

    Entrada: 50 40
    Saída: Salario bruto: R$2000,00
    IR: R$220,00
    INSS: R$160,00
    Total de descontos: R$380,00
    Salario liquido: R$1620,00

Dica:
    Salário Bruto – Descontos = Salário Líquido.

 */
import java.util.Scanner;
public class FolhaPagamento {
    public static void main(String[] args) {
    double valor_hora, salario_bruto;
    int quantidade_horas;
    Scanner scan = new Scanner(System.in);

    valor_hora = scan.nextDouble();
    quantidade_horas = scan.nextInt();

    salario_bruto = valor_hora*quantidade_horas;
    double desconto_ir; //11%
    double desconto_inss;//8%
    desconto_ir = salario_bruto * 0.11;
    desconto_inss = salario_bruto * 0.08;

    double total_descontos = desconto_inss+desconto_ir;

    double salario_liquido = salario_bruto - total_descontos;

    System.out.printf("Salario bruto: R$%.2f\n", salario_bruto);
    System.out.printf("IR: R$%.2f\n", desconto_ir);
    System.out.printf("INSS: R$%.2f\n", desconto_inss);
    System.out.printf("Total de descontos: R$%.2f\n", total_descontos);
    System.out.printf("Salario liquido: R$%.2f\n", salario_liquido);
    scan.close();




    }
}

/*
 Escreva uma classe chamada Fahrenheit que converta uma temperatura digitada de em . Use apenas uma casa decimal na saída. A fórmula para essa conversão é:
Exemplo de entrada e saída esperada:
    Entrada: 42
    Saída: 107,6
 */
import java.util.Scanner;
public class Fahrenheit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double tempF, tempC;
        tempC = scan.nextDouble();
        tempF = ((9*tempC)/5)+32;
        System.out.printf("%.1f\n", tempF);
        scan.close();
    }
}

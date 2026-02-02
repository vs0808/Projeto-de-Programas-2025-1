/*
 Crie uma classe em Java chamada Media que calcule e imprima, com duas casas decimais, a média aritmética de três números reais lidos do teclado.
Exemplo de entrada e saída esperada:

    Entrada: 88,0 1,21 70,2
    Saída: 53,14

Dicas:

    A classe Scanner, usada para ler dados do teclado, usa as configurações do sistema para setar o formato dos números reais. Dependendo da linguagem do seu sistema, um número real pode usar "." (ponto) ou "," (vírgula).
    Você pode representar os números reais usando float ou double.
    Em Java, um número real isolado (e.g., 1.21) é considerado como sendo do tipo double. Para usar um número como sendo do tipo float, use o 'f' ao final do número (e.g., 1.21f).
    Java converte automaticamente tipos quando não há perda de precisão. Exemplo: double nota = 8.7f; // Converte de float para double automaticamente
    Entretanto, quando há perda de precisão, isso não é possível e o uso do cast é obrigatório. Exemplo: float nota = (float) 8.7; // Converte de double para float usando o cast
    Para imprimir algo formatado em Java, use o método System.out.printf(String format, Object... args). Exemplo: System.out.printf("%.3f\n", media);


 */
import java.util.Scanner;
public class Media {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double numero1, numero2, numero3;
        numero1 = scan.nextDouble();
        numero2 = scan.nextDouble();
        numero3 = scan.nextDouble();
        double media = (numero1+numero2+numero3)/3;
        System.out.printf("%.2f\n", media);
    }
}

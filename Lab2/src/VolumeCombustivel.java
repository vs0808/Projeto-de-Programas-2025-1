/*
 Considere um tanque de combustível com o formato descrito na figura abaixo.
Figura: tanque de combustível
Escreva um programa (classe VolumeCombustivel) que calcule o volume de combustível (em litros), com três casas decimais de precisão, dadas as medidas (em metros) de altura total do tanque (), nível de combustível no tanque () e raio dos bojos semi-esféricos (). Caso algum dos dados sejam inválidos, a saída deve ser -1.000.
Fórmulas:
Figura: esfera

    Volume da esfera de raio :
    Volume da calota esférica de raio e altura :
    Volume do cilindro de raio e altura :

Dicas:

    Verifique as diversas possibilidades do nível de combustível em relação à altura do tanque .
    Desenhe! Use papel e caneta para melhor visualizar as diversas variáveis e diferentes casos.
    Use a constante PI presente na classe Math do Java para pegar o valor de . Exemplo: double pi = Math.PI;
    Para calcular uma exponenciação em Java, usa-se o método pow(double a, double b) da classe Math. Exemplo: double exp = Math.sqrt(2, 8);

Exemplo de entrada e saída esperada:

    Entrada: 50 40 10
    Saída: 11519,173


 */
import java.util.Scanner;

public class VolumeCombustivel {

    // Volume de uma calota esférica (raio r, altura x)
    // V = (pi/3) * x^2 * (3r - x)
    private static double volumeCalota(double r, double x) {
        return (Math.PI / 3.0) * x * x * (3.0 * r - x);
    }

    private static String formatar3CasasComVirgula(double valor) {
        // Gera com 3 casas (geralmente com ponto) e troca por vírgula
        String s = String.format("%.3f", valor);
        return s.replace('.', ',');
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Leitura (na prática, o exemplo do enunciado bate com decímetros - dm)
        double H = scan.nextDouble();
        double h = scan.nextDouble();
        double r = scan.nextDouble();

        // Validações
        boolean invalido = (H <= 0.0) || (r <= 0.0) || (H < 2.0 * r) || (h < 0.0) || (h > H);

        if (invalido) {
            System.out.println(formatar3CasasComVirgula(-1.0));
            scan.close();
            return;
        }

        // Altura do trecho cilíndrico
        double alturaCilindro = H - 2.0 * r;

        // Volume de uma semiesfera
        double volumeSemiEsfera = (2.0 / 3.0) * Math.PI * Math.pow(r, 3);

        // Como o enunciado-exemplo bate com dm, dm³ == litros
        double volumeLitros;

        if (h <= r) {
            // Caso A: só na semiesfera inferior (calota com altura h)
            volumeLitros = volumeCalota(r, h);

        } else if (h <= (H - r)) {
            // Caso B: semiesfera inferior cheia + cilindro parcial
            double alturaNoCilindro = h - r;
            double volumeCilindroParcial = Math.PI * r * r * alturaNoCilindro;
            volumeLitros = volumeSemiEsfera + volumeCilindroParcial;

        } else {
            // Caso C: semiesfera inferior cheia + cilindro cheio + parte da semiesfera superior
            double volumeCilindroCheio = Math.PI * r * r * alturaCilindro;

            double alturaVaziaTopo = H - h;
            double volumeCalotaVazia = volumeCalota(r, alturaVaziaTopo);

            double volumeParteSuperior = volumeSemiEsfera - volumeCalotaVazia;

            volumeLitros = volumeSemiEsfera + volumeCilindroCheio + volumeParteSuperior;
        }

        System.out.println(formatar3CasasComVirgula(volumeLitros));
        scan.close();
    }
}

//Que questão chatinha
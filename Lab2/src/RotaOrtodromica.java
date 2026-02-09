/*
 Como o GoogleMaps calcula a distância entre dois pontos na superfície da Terra? A superfície da Terra é curva, e a distância entre os graus de longitude varia com a latitude. Como resultado, encontrar a distância entre dois pontos na superfície da Terra é mais complicado do que simplesmente usando o Teorema de Pitágoras. Para isso, usamos Rotas Ortodrômicas: sejam e a latitude e longitude de dois pontos e na superfície da Terra. A distância entre esses pontos, na superfície da Terra, em km é dada por:
onde é o raio médio da Terra.
Escreva um programa (classe RotaOrtodromica) em que o usuário digite a latitude e longitude de dois pontos na Terra em graus. Seu programa deve exibir a distância entre os pontos, na superfície da Terra, em quilômetros, de acordo com o exemplo abaixo. Para esta questão, use apenas variáveis do tipo double.
Exemplo de entrada e saída esperada:

    Entrada: 28,485867 -80,544439 -3,088144 -59,964330
    Saída: A distancia entre os pontos (28,485867, -80,544439) e (-3,088144, -59,964330) e de 4142,52 km

Dicas:

    Use apenas variáveis do tipo double para não perder precisão e não dar erro na correção automática.
    Funções trigonométricas do Java operam em radianos. Como resultado, você vai precisar converter a entrada do usuário de graus para radianos antes de calcular a distância. Para isso, use o método toRadians(double angdeg) da classe Math. Exemplo: double radians = Math.toRadians(45);
    Use os métodos trigonométricos da classe Math para calcular o seno – Math.sin(double a), cosseno – Math.cos(double a) e arco cosseno – Math.acos(double a).
    Note que, na saída, as coordenadas possuem 6 casas decimais, enquanto que a distância possui duas casas decimais.
    É possível ver as coordenadas de um local na URL do Google Maps. É possível pesquisar uma coordenada no Google Maps.


 */
import java.util.Scanner;

public class RotaOrtodromica {
    public static final double R = 6371; // Raio médio da Terra em Km
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double t1 = scan.nextDouble();
        double g1 = scan.nextDouble();
        double t2 = scan.nextDouble();
        double g2 = scan.nextDouble();

        // Conversão das coordenadas para radianos
        double radians_t1 = Math.toRadians(t1);
        double radians_g1 = Math.toRadians(g1);
        double radians_t2 = Math.toRadians(t2);
        double radians_g2 = Math.toRadians(g2);
        double produto_sen_cos = (Math.sin(radians_t1) * Math.sin(radians_t2)) +
                (Math.cos(radians_t1) * Math.cos(radians_t2) * Math.cos(radians_g1 - radians_g2));
        double d = R * (Math.acos(produto_sen_cos));
        System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f\n",
                t1,g1,t2,g2, d);
        scan.close();
    }
}
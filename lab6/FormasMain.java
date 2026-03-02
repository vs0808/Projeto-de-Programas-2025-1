package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {
    public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[3];
        formas[0] = new Retangulo(10, 20, 5, 10);
        formas[1] = new Circulo(15, 25, 7);
        formas[2] = new Quadrado(30, 40, 8);

        for (FormaGeometrica forma : formas) {
            System.out.println(forma);
        }
    }
}

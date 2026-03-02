package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica{
    public double raio;
    public double pi = Math.PI;

    public Circulo(int posX, int posY, double raio){
        super(posX,posY);
        this.raio = raio;
    }
    public double getArea(){
        return pi*Math.pow(raio,2);
    }
    public double getPerimetro(){
        return 2*pi*raio;
    }
    public String toString(){
        double perimetro = getPerimetro();
        return "Círculo na " + getPosString() + 
               " com raio de " + raio +"cm "+ "(área=" + getArea() + "cm2, " +
               "perímetro=" + perimetro + "cm)";
    }

}
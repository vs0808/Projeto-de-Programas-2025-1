package br.edu.ufam.icomp.lab_encapsulamento;
//Classe Posicao
public class Posicao{

    private double latitude;
    private double longitude;
    private double altitude;

    //Construtor
    public Posicao( double latitude,  double longitude,  double altitude){
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    
    public void setLatitude(double latitude){
        this.latitude = latitude;
    }

    
    public double getLatitude(){
        return latitude;
    }

    
    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    
    public double getLongitude(){
        return longitude;
    }

    //Seter
    public void setAltitude(double altitude){
        this.altitude = altitude;
    }

    //Getter
    public double getAltitude(){
        return altitude;
    }

    public String toString() {
        return "Posição: "+ latitude + ", " + longitude + ", " + altitude;
    }
}
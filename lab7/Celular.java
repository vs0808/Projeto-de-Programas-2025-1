package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.*;

import br.edu.ufam.icomp.lab_encapsulamento.Localizavel;

public class Celular implements Localizavel{
    private int codPais;
    private int codArea;
    private int numero;

    public Celular(int codPais, int codArea, int numero) {
        this.codPais = codPais;
        this.codArea = codArea;
        this.numero = numero;
    }

    public final void setCodPais(int codePais){
        this.codPais = codePais;
    }

    public int getCodPais(){
        if(codPais <0 || codPais > 1999){
            codPais = -1;
            return this.codPais;
        }else{
            return this.codPais;
        }
        
    }
    public final void setCodArea(int codeArea){
        this.codArea = codeArea;
    }

    public int getCodArea(){
        if(codArea <0 || codArea > 99){
            codArea = -1;
            return this.codArea;
        }else{
            return this.codArea;
        }
        
    }
    public final void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        if(numero <10000000 || numero > 999999999){
            this.numero = -1;
            return this.numero;
        }
        else{
            return this.numero;
        }
        
    }
    public Posicao getPosicao() {
        Random r = new Random();

        double latitude = -3.160000 + (-2.960000 + 3.160000) * r.nextDouble();
        double longitude = -60.120000 + (-59.820000 + 60.120000) * r.nextDouble();
        double altitude = 15.0 + (100.0 - 15.0) * r.nextDouble();

        return new Posicao(latitude, longitude, altitude);
    }

    public double getErroLocalizacao(){
        return 50.0;
    }

}

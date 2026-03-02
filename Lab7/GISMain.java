package br.edu.ufam.icomp.lab_encapsulamento;

import br.edu.ufam.icomp.lab_encapsulamento.CarroLuxuoso;
import br.edu.ufam.icomp.lab_encapsulamento.Localizavel;

public class GISMain {
    public static void main(String[] args) {
        
        CarroLuxuoso carro = new CarroLuxuoso("ABCD");
        Celular cel = new Celular(123, 90090, 1010);

        // Criando vetor estático com dois elementos
        Localizavel[] vetorLocalizaveis = new Localizavel[2];
        vetorLocalizaveis[0] = cel;
        vetorLocalizaveis[1] = carro;

        for (int i = 0; i < vetorLocalizaveis.length; i++) {
            System.out.println(vetorLocalizaveis[i].getPosicao());
        }
    }
}

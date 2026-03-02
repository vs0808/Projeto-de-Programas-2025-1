package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
    private Coordenada[] caminho;
    private int tamanho;
    private int limite;

    public Caminho() {
        this(100);
    }

    public Caminho(int limite) {
        this.limite = limite;
        this.caminho = new Coordenada[limite];
        this.tamanho = 0;
    }

    public int tamanho() {
        return tamanho;
    }

    public void addCoordenada(Coordenada coordenada)
            throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException {
        if (tamanho >= limite) {
            throw new TamanhoMaximoExcedidoException();
        }

        if (tamanho > 0) {
            double distancia = coordenada.distancia(caminho[tamanho - 1]);
            if (distancia > 15.0) {
                throw new DistanciaEntrePontosExcedidaException();
            }
        }

        caminho[tamanho] = coordenada;
        tamanho++;
    }

    public void reset() {
        caminho = new Coordenada[limite];
        tamanho = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados do caminho:\n");
        sb.append(" - Quantidade de pontos: ").append(tamanho).append("\n");
        sb.append(" - Pontos:\n");

        for (int i = 0; i < tamanho; i++) {
            sb.append(" -> ").append(caminho[i].toString()).append("\n");
        }

        return sb.toString();
    }
}

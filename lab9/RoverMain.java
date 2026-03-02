package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
    public static void main(String[] args) {
        Caminho caminho = new Caminho();

        try {
            // Coordenadas válidas
            caminho.addCoordenada(new Coordenada(10, 10));
            caminho.addCoordenada(new Coordenada(15, 15));
            caminho.addCoordenada(new Coordenada(20, 20));

            // Coordenada inválida -- vai gerar exceção por distância > 15m
            caminho.addCoordenada(new Coordenada(50, 50));

        } catch (RoverException e) {
            // Captura qualquer exceção derivada de RoverException
            System.out.println("Erro ao adicionar coordenada: " + e.getMessage());

            // Executa reset para evitar caminho inválido
            caminho.reset();
        }

        // Imprime o caminho completo (ou vazio, se houve erro)
        System.out.println(caminho);
    }
}

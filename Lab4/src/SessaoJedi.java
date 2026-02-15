import java.util.ArrayList;

/*
De forma semelhante às questões anteriores, crie uma classe para representar uma SessaoJedi.
Implemente os métodos:

    addIniciado: adiciona um IniciadoJedi na lista de iniciados que farão parte da sessão. Caso já exista um
    iniciado com o mesmo nome, o iniciado não deve ser adicionado.
    getIniciado: retorna um IniciadoJedi da lista de iniciados da sessão que possui o nome especificado. Retorna
    nulo caso o iniciado não pertença à sessão.
    getMediaAnoNascimento: retorna a média do ano de nascimento dos iniciados.
    getDescricao: retorna uma String contendo a descrição completa da sessão, incluindo as informações
    (getDescricao) do treinador e dos iniciados participantes, de acordo com o exemplo abaixo:
    --> SESSÃO Instruções de Uso da Força (Treinador: Grão-Mestre Fae Coven)
      - Iniciado 1: Katooni (especie=Tholothian, nascimento=23 ABY)
      - Iniciado 2: Byph (especie=Ithorian, nascimento=21 ABY)
      - Iniciado 3: Gungi (especie=Wookiee, nascimento=23 ABY)
      - Iniciado 4: Petro (especie=Human, nascimento=22 ABY)

Para testar a classe, modifique a classe SessaoJediMain, criada nas questões anteriores, para criar um ou mais
objetos da classe SessaoJedi. Adicione iniciados às sessões e, em seguida, imprima o resultado da execução do
método getDescricao dos objetos criados.
Para essa questão, submeta apenas a classe SessaoJedi. Não precisa submeter a classe SessaoJediMain.
 */

public class SessaoJedi {
    String nome;
    TreinadorJedi treinador;
    ArrayList<IniciadoJedi> iniciados;

    SessaoJedi(String nome, TreinadorJedi treinador){
        this.nome = nome;
        this.treinador = treinador;
        this.iniciados = new ArrayList<>();
    }

    void addIniciado(IniciadoJedi iniciado){
        for (IniciadoJedi i : iniciados){
            if (i.nome.equals(iniciado.nome)){
                return;
            }
        }
        iniciados.add(iniciado);
    }

    IniciadoJedi getIniciado(String nome){
        for (IniciadoJedi i : iniciados){
            if (i.nome.equals(nome)){
                return i;
            }
        }
        return null; // Não encontrado
    }

    double getMediaAnoNascimento(){
        if (iniciados.isEmpty()) return 0;
        double soma = 0;
        for (IniciadoJedi i : iniciados){
            soma += i.anoNascimento;
        }
        return soma / iniciados.size();
    }

    String getDescricao(){
        StringBuilder sb = new StringBuilder();
        sb.append("--> SESSÃO ").append(nome).append(" (Treinador: ").append(treinador.getDescricao()).append(")\n");
        int contador = 1;
        for (IniciadoJedi i : iniciados){
            sb.append("- Iniciado ").append(contador).append(": ").append(i.getDescricao()).append("\n");
            contador++;
        }
        return sb.toString();
    }
}

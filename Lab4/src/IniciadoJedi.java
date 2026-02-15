/*
Crie uma classe para representar o IniciadoJedi. Os atributos de um objeto da classe IniciadoJedi
poderão ser setados diretamente (e.g., iniciado1.nome="Katooni") ou pelo método construtor. Use a
técnica de encadeamento de construtores para criar os construtores da classe, semelhante ao feito em
sala e mostrado nos slides.
Implemente os métodos:

    getAnoNascimento: retorna uma String contendo o ano de nascimento do Iniciado Jedi seguido da sigla
    ABY ("Antes da Batalha de Yavin". caso o anoNacimento seja negativo) ou DBY ("Depois da Batalha de
    Yavin", caso o anoNascimento seja positivo). Exemplo: "23 ABY", para um anoNascimento=-23.
    getDescricao: retorna uma String contendo a descrição completa do Iniciado Jedi de acordo com o
    exemplo abaixo:
    Katooni (especie=Tholothian, nascimento=23 ABY)

Para testar a classe, crie uma nova classe chamada SessaoJediMain. Nesta classe, crie o método main,
que será o ponto de partida do seu programa. No método main, crie um ou mais objetos da classe
IniciadoJedi e, em seguida, imprima o resultado da execução do método getDescricao dos objetos criados.
Para essa questão, submeta apenas a classe IniciadoJedi. Não precisa submeter a classe SessaoJediMain.
 */

public class IniciadoJedi {
    String nome;
    String especie;
    int anoNascimento;

    IniciadoJedi(){
        this("","",0);
    }

    IniciadoJedi(String nome, String especie, int anoNascimento){
        this.nome = nome;
        this.especie = especie;
        this.anoNascimento = anoNascimento;
    }

    String getAnoNascimento(){
        if(anoNascimento<0){
            return Math.abs(anoNascimento)+" ABY";
        }else{
            return anoNascimento+" DBY";
        }
    }

    String getDescricao(){
        return nome+" (especie="+especie+", nascimento="+ getAnoNascimento()+")";
    }
}

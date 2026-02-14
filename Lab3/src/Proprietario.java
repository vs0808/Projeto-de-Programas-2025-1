/*
 Crie uma classe para representar o Proprietario de um carro de acordo com o diagrama de classe ao lado. Os
  atributos de um objeto da classe Proprietario poderão ser setados diretamente
  (e.g., proprietario1.nome="Emmett L. Brown") ou pelo método construtor. Use a técnica de encadeamento de
                                                          construtores para criar os dois construtores da
                                                          classe, semelhante ao feito em sala e mostrado nos
                                                          slides. Implemente os métodos:

    getIdade: retorna um int contendo a idade do proprietario em relação ao parâmetro anoReferencia.
    getDescricao: retorna uma String contendo a descrição completa do proprietario de acordo com a linha
    a seguir:
    Proprietario: nome=Emmett L. Brown, cnh=98008173, anoNascimento=1920.

Para testar a classe, crie uma nova classe chamada CarroMain. Nesta classe, crie o método main,
que será o ponto de partida do seu programa.
No método main, crie um ou mais objetos da classe Proprietario e,  em seguida, imprima o resultado da
execução do método getDescricao dos objetos criados.
Para essa questão, submeta apenas a classe Proprietario. Não precisa submeter a classe CarroMain.
 */

import java.lang.reflect.Constructor;

public class Proprietario {
    String nome;
    int cnh;
    int anoNascimento;

    //Construtor
    Proprietario(){
        this("",0,0);
    }
    //Construtor com parametros
    Proprietario(String nome, int cnh,  int anoNascimento ){
        this.nome = nome;
        this.cnh = cnh;
        this.anoNascimento = anoNascimento;

    }
    //getters
    int getIdade(int anoReferencia){
        return anoReferencia-anoNascimento;
    }
    String getDescricao(){
        return "Proprietario: nome="+nome+", cnh="+cnh+", anoNascimento="+anoNascimento+".";
    }
}

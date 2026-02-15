/*
De forma semelhante às questões anteriores, crie uma classe para representar o TreinadorJedi.
Implemente o método:

    getDescricao: retorna uma String contendo a descrição completa do TreinadorJedi de acordo com o exemplo
    abaixo (onde a titulacao é "Grão-Mestre"):
    Grão-Mestre Fae Coven

Para testar a classe, modifique a classe SessaoJediMain, criada na questão anterior, para criar um ou mais
objetos da classe TreinadorJedi e, em seguida, imprima o resultado da execução do
método getDescricao() dos objetos criados.
Para essa questão, submeta apenas a classe TreinadorJedi. Não precisa submeter a classe SessaoJediMain.
 */
public class TreinadorJedi {
    String titulacao;
    String nome;

    TreinadorJedi(){
        this("", "");
    }

    TreinadorJedi(String titulacao, String nome){
        this.titulacao = titulacao;
        this.nome = nome;
    }

    String getDescricao(){
        return titulacao+" "+nome;
    }
}

/*
Como nas questões anteriores, implemente uma classe para representar o Motor do veículo de acordo com o
diagrama de classe ao lado. Implemente os métodos:

    getTipoString: retorna uma String de acordo com o tipo do motor: 1=Gasolina, 2=Alcool, 3=Flex,
    4=Diesel, 5=Eletrico, qualquer outro=Outros
    getDescricao: retorna uma String contendo a descrição do motor de acordo com a linha a seguir:
    Motor: tipo=Gasolina, capacidade=2.85L, potencia=130CV.

Para testar esta terceira classe, modifique a classe CarroMain, criada nas questões anteriores para
 criar um ou mais objetos da classe Motor e, em seguida, imprimir o resultado da execução do
 método getDescricao dos objetos criados.
Para essa questão, submeta apenas a classe Motor. Não precisa submeter a classe CarroMain.
 */
public class Motor {
    int tipo;
    double capacidade;
    int potencia;

    Motor(){
        this(0,0.0,0);
    }

    Motor(int tipo, double capacidade, int potencia){
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.potencia = potencia;
    }

    //getters
    String getTipoString(){
        if(tipo == 1){
            return "Gasolina";
        }
        else if(tipo == 2){
            return "Alcool";
        }
        else if(tipo == 3){
            return "Flex";
        }
        else if(tipo == 4){
            return "Diesel";
        }else if(tipo ==5){
            return "Eletrico";
        }
        else{
            return "Outros";
        }
    }

    String getDescricao(){
        return "Motor: tipo="+getTipoString()+", capacidade="+capacidade+", potencia="+potencia;
    }
}

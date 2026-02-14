/*
De forma semelhante à questão anterior, implemente uma classe para representar a Placa do carro de acordo com o diagrama de classe ao lado. Implemente os métodos:

    getTipoString: retorna uma String de acordo com o tipo da placa: 1=Normal, 2=Servico, 3=Oficial, 4=Auto Escola, 5=Prototipo, 6=Colecionador, qualquer outro=Outros
    temEstacionamentoLivre: retorna true se o tipo da placa for 2 ou 3. false, caso contrário.
    getDescricao: retorna uma String contendo a descrição do placa de acordo com a linha a seguir:
    Placa: placa=OAT-3966, tipo=Colecionador, estacionamentoLivre=false.

Para testar esta segunda classe, modifique a classe CarroMain, criada na questão anterior para criar um ou mais objetos da classe Placa e, em seguida, imprimir o resultado da execução do método getDescricao dos objetos criados.
Para essa questão, submeta apenas a classe Placa. Não precisa submeter a classe CarroMain.
Dicas:

    Use a estrutura de controle switch.


 */

public class Placa {
    String placa;
    int tipo;

    Placa(){
        this("", 0);
    }

    Placa(String placa, int tipo){
        this.placa = placa;
        this.tipo = tipo;
    }

    String getTipoString(){
        if(tipo == 1){
            return "Normal";
        }else if(tipo == 2){
            return "Servico";
        }else if(tipo == 3){
            return "Oficial";
        }else if(tipo == 4){
            return "Auto Escola";
        }else if(tipo == 5){
            return "Prototipo";
        }else if(tipo == 6){
            return "Colecionador";
        }else{
            return "Outros";
        }
    }

    boolean temEstacionamentoLivre(){
        if(tipo==2 || tipo ==3){
            return true;
        }else{
            return false;
        }
    }

    String getDescricao(){
        return "Placa: placa="+placa+", tipo="+getTipoString()+
                ", estacionamentoLivre="+temEstacionamentoLivre();
    }
}

/*
A questão sugere switch, contudo, eu fui um pouco no automático e acabei usando
apenas ifs e else if. Talvez fosse mais elegante o uso de switchs. Acontece.
 */
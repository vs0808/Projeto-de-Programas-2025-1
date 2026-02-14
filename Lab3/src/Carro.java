/*
Implemente uma classe para Carro. Conforme o diagrama de classe ao lado, o veículo deverá ter atributos
para a sua marca e modelo (String), um atributo da classe Proprietario (criada na Questão 1), um atributo
da classe Placa (criada na Questão 2) e um atributo da classe Motor (criada na Questão 3).
Crie o método getDescricao que retorne uma String contendo todos os dados do carro. Este método deverá se
basear na execução do método getDescricao dos objetos das outras classes (Proprietario, Placa e Motor),
gerando uma String como a seguinte (para um carro da marca "DeLorean" e modelo "DMC-12"):
Carro DeLorean/DMC-12. Proprietario: nome=Emmett L. Brown, cnh=98008173, anoNascimento=1920.
Placa: placa=OAT-3966, tipo=Colecionador, estacionamentoLivre=false. Motor: tipo=Gasolina, capacidade=2.85L,
potencia=130CV.
Para testar esta classe, modifique a classe CarroMain, criada nas questões anteriores para criar um ou
mais objetos da classe Carro e, em seguida, imprimir o resultado da execução do método getDescricao dos
objetos criados.
Para essa questão, submeta apenas a classe Carro. Não precisa submeter a classe CarroMain.
 */

public class Carro {
    String marca;
    String modelo;
    Proprietario proprietario;
    Placa placa;
    Motor motor;

    Carro(String marca, String modelo, Proprietario proprietario, Placa placa, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.proprietario = proprietario;
        this.placa = placa;
        this.motor = motor;
    }

    String getDescricao(){
        return "Carro " + marca + "/" + modelo + ". "
                + proprietario.getDescricao() + " "
                + placa.getDescricao() + ". "
                + motor.getDescricao() + ".";
    }
}

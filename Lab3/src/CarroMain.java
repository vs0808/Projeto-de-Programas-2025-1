/*
 Por fim, submeta a classe CarroMain.
 */
public class CarroMain {
    public static void main(String[] args) {

        //Criando um objeto da classe Proprietario testando seus metódos
       Proprietario prop1 = new Proprietario("Claudio", 1234, 2002);
       System.out.println(prop1.getDescricao());
       System.out.println(prop1.getIdade(2025));

       //Criando um objeto da classe Placa e testando seus metódos
       Placa placa1 = new Placa("ABCD", 2);
       System.out.println(placa1.getDescricao());
       System.out.println(placa1.getTipoString());

       //Criando um objeto da classe Motor e testando seus metódos
       Motor motor1 = new Motor(3, 4.4, 300);
       System.out.println(motor1.getDescricao());
       System.out.println(motor1.getTipoString());

       //Criando um objeto da classe Carro e testando seus metódos
        Carro carro1 = new Carro("GOL", "QUADRADO", prop1, placa1,motor1);
        System.out.println(carro1.getDescricao());
    }
}

/*
No exemplo acima, a saída esperada é:
Proprietario: nome=Claudio, cnh=1234, anoNascimento=2002.
23
Placa: placa=ABCD, tipo=Servico, estacionamentoLivre=true
Servico
Motor: tipo=Flex, capacidade=4.4, potencia=300
Flex
Carro GOL/QUADRADO. Proprietario: nome=Claudio, cnh=1234, anoNascimento=2002. Placa: placa=ABCD, tipo=Servico, estacionamentoLivre=true. Motor: tipo=Flex, capacidade=4.4, potencia=300.
 */
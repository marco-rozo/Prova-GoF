package br.utfpr.gof.provaPP.N4_GoFAdapter;

public class CenarioMarcoAntonioSingleton {
    private static CenarioMarcoAntonioSingleton instancia;
    private int contador = 0; //contador de vezes em que a classe foi instanciada

    //construtor privado da classe
    private CenarioMarcoAntonioSingleton(){
        //O construtor é criado para suprir o contrutor padrão que é público
        //o contador foi incluido apenas para provar que é instanciado uma única vez
        this.setContador(this.getContador() +1);
    }

    public int getContador(){
        return this.contador;
    }

    public void setContador(int contador){
        this.contador = contador;
    }

    public static CenarioMarcoAntonioSingleton getInstance(){
        if(instancia == null){
            instancia = new CenarioMarcoAntonioSingleton();
        }

        return instancia;
    }

    public void detalhamento(String typeExec){
        System.out.println("Marco Anotonio Rozo");
        System.out.println("Mapa Mirage Counter Strike");

        /*2) Apresente uma aplicação do padrão de projeto GoF Adapter no mesmo projeto utilizado para resolver
        a questão anterior referente ao padrão Singleton. Comente o código de forma a indicar com que objetivo o
        padrão foi aplicado, e quais alterações foram realizadas no código para atender o que sugere o padrão
        escolhido. (Peso 3,0)*/

        //Para atender o padrão adapter, separei as classes do meu cenário (diferente da Numero 3, onde a descrição dos cenários ocorriam dentro do switch case do detalhamento),
        //agora eu so preciso chamar as classes e o seu método para imprimir os cenários
        //as classes 'ExecucaoSmokadaA' e 'ExecucaoSmokadaB' implementam a interface 'Execucao'
        //já a classe 'ExecucaoRushB' não implementa, e possui um método próprio (getRush) para detalhar o cenário
        //Por esse motivo teve a necessidade da utilização do padrão Adapter, que foi implementado com
        // a classe ExecucaoRushAdapter, aonde está classe implementa a execução recebida por parametro (ExecucaoRushB)
        // e faz a resolução e do método implementado da interface (getExecucao) chamando o método da ExecucaoRushB ( execucaoRushB.getRush)

        if (typeExec == "A"){
            //Instancia as classes
            Execucao execA =  new ExecucaoSmokadaA();
            execA.getExecucao();
        } else if(typeExec == "B") {
            //Instancia a classe
            Execucao execB =  new ExecucaoSmokadaB();
            execB.getExecucao();

        } else if (typeExec == "RUSH"){
            //Instancia a classe do 'rush' por meio do adapter
            Execucao execRushB =  new ExecucaoRushAdapter(new ExecucaoRushB());
            //assim tendo acesso ao getExecucao (que acessa o execRushB.getRush()) para imprimir as informações
            execRushB.getExecucao(); //getExecucao acessado por meio do Adapter criado
        }

        System.out.println("Em cenário de sucesso ocorrem algumas 'trade kills', é jogado o 'after plant' e meu Metodo Singleton é chamado apenas uma vez");
        System.out.println("Contador do método Singleton: " + getContador());
    }
}

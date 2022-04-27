package br.utfpr.gof.provaPP.N3_GoFSingleton;

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

        if (typeExec == "A"){
            System.out.println("Exec Bomb A");
            System.out.println("Player 1 na padrão palácio para molotovar arreia do pxel do pilar");
            System.out.println("Player 2 posicionado para smokar 'cabecinha' (posição do mapa)");
            System.out.println("Player 3 posicionado para smokar passagem/nip (posição do mapa)");
            System.out.println("Player 4 posicionado no andaime dando cover caso o CT rushe caverna, aproveitndo para executar as bangs de entrada juntamente com o Player 2 (que smokou cabecinha)");
            System.out.println("Player 5 posicionado na esquina do meio fazendo o lurker para cortar a rotação dos Cts do meio e B");
            System.out.println("Players 1, 3 e 4 entram após as bangs estourarem em direção ao plant na caixa de fogo (já que nao possui smoke na base CT)");
        } else if(typeExec == "B") {
            System.out.println("Exec Bomb B");
            System.out.println("Player 1 smoka 'passagem carroça' da base TR");
            System.out.println("Player 5 domina meio passando pra carroça com a proteção da smoke 'passagem carroça'");
            System.out.println("Player 1 realiza o domínio rápido do rato (posição do mapa)");
            System.out.println("Player 1 cuida rush do tapede por parte dos CTs e se prepara para fazer o 'entry' no bomb após as smokes e bangs");
            System.out.println("Player 2 posicionado para smokar 'edward' (posição do mapa)");
            System.out.println("Player 3 posicionado para smokar 'pilar' (posição do mapa)");
            System.out.println("Player 4 posicionado para smokar 'janela mercado' (posição do mapa)");
            System.out.println("Player 5 posicionado carroça ou esquina do meio fazendo o lurker para cortar a rotação dos Cts do meio e A");
            System.out.println("Players 2, 3 e 4 smokam, bangam por cima, molotovam porta do mercado e van e em seguida entram para realizar a trade no Player 1 (entry fragger)");
            System.out.println("Players 1, 2, 3 e 4 entram após as bangs estourarem em direção ao plant bomb");
        } else if (typeExec == "RUSH"){
            System.out.println("Rush Bomb B");
            System.out.println("Todos os 5 players rusham em direção ao bomb B");
            System.out.println("Jogam as bangs por cima");
            System.out.println("Apagam a molotov do tapete");
            System.out.println("Seguram na mao de Deus");
        }

        System.out.println("Em cenário de sucesso ocorrem algumas 'trade kills', é jogado o 'after plant' e meu Metodo Singleton é chamado apenas uma vez");
        System.out.println("Contador do método Singleton: " + getContador());
    }
}

package br.utfpr.gof.provaPP.N1_GoFStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tipos de Entrega de acordo com o contexto");
        System.out.println("==========================================");
        System.out.println("\b");

        ComprasContextoA comprasA = new ComprasContextoA(new EntregaPadrao());
        ComprasContextoB comprasB = new ComprasContextoB(new EntregaRetiradaLoja());

        System.out.println("Compras no  Contexto A possuem o tipo de entrega:");
        comprasA.consultarEntrega();

        System.out.println("\b");

        System.out.println("Compras no  Contexto B possuem o tipo de entrega:");
        comprasB.consultarEntrega();
    }
}

package br.utfpr.gof.provaPP.N2_GoFFactoryMethod;


public class Main {
    public static void main(String[] args) {
        System.out.println("Tipos de Entrega de acordo com o contexto");
        System.out.println("==========================================");
        System.out.println("\b");

        //Criado o factory método com o objetivo de encapsular os métodos de Compra (ComprasContextoA e ComprasContextoB)
        CompraFactory factory = new CompraFactoryConcrete();

        //Instancia as Compras pelo método de criação da factory de acordo com o parâmetro que vai ser passado
        CarrinhoDeCompras comprasA1 = factory.create("A");
        CarrinhoDeCompras comprasB1 = factory.create("B");

        System.out.println("Compras no  Contexto A possuem o tipo de entrega:");
        //acessa o método da Compra para consultar o tipo de entrega
        comprasA1.consultarEntrega();

        System.out.println("\b");

        System.out.println("Compras no Contexto B possuem o tipo de entrega:");
        comprasB1.consultarEntrega();
    }
}

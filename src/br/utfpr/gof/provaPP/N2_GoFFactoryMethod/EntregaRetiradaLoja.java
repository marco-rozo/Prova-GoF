package br.utfpr.gof.provaPP.N2_GoFFactoryMethod;

public class EntregaRetiradaLoja implements Entrega {

    @Override
    public void calcular() {
        System.out.println("RetiradaNaLoja: Entrega sem custos mediante retirada do produto pelo próprio cliente na loja física.");
    }
}

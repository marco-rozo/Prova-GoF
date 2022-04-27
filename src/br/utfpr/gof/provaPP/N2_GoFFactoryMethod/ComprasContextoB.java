package br.utfpr.gof.provaPP.N2_GoFFactoryMethod;

public class ComprasContextoB extends CarrinhoDeCompras {
    public ComprasContextoB(EntregaRetiradaLoja entrega) {
        super(entrega);
        entrega = new EntregaRetiradaLoja();
    }
}
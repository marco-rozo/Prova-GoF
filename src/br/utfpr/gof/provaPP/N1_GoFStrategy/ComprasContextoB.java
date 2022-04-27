package br.utfpr.gof.provaPP.N1_GoFStrategy;

public class ComprasContextoB extends CarrinhoDeCompras {
    public ComprasContextoB(EntregaRetiradaLoja entrega) {
        super(entrega);
        entrega = new EntregaRetiradaLoja();
    }
}
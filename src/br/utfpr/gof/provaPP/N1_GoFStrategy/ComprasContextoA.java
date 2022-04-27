package br.utfpr.gof.provaPP.N1_GoFStrategy;

public class ComprasContextoA extends CarrinhoDeCompras {
    public ComprasContextoA(EntregaPadrao entrega) {
        super(entrega);
        entrega = new EntregaPadrao();
    }

}
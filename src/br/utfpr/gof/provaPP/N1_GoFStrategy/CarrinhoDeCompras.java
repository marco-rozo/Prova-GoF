package br.utfpr.gof.provaPP.N1_GoFStrategy;

public abstract class CarrinhoDeCompras {
    protected Entrega entrega;

    public CarrinhoDeCompras(Entrega entrega){
        this.entrega = entrega;
    }
    public void consultarEntrega(){
        entrega.calcular();
    }
}

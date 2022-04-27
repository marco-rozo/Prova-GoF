package br.utfpr.gof.provaPP.N2_GoFFactoryMethod;


public abstract class CompraFactory { //classe abstrata a ser utilizada
    protected abstract CarrinhoDeCompras create(String typeCompra);
}

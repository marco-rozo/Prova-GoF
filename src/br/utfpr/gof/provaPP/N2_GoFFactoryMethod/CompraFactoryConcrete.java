package br.utfpr.gof.provaPP.N2_GoFFactoryMethod;

public class CompraFactoryConcrete extends CompraFactory { //extende da classe abstrata factory
    @Override //Cria o tipo de compra de acordo com o parâmetro recebido
    protected CarrinhoDeCompras create(String typeCompra) {
        //resolve e retorna o tipo de compra de acordo com o parâmetro recebido
        if("A".equals(typeCompra)){
            return new ComprasContextoA(new EntregaPadrao());
        }else if("B".equals(typeCompra)){
            return new ComprasContextoB(new EntregaRetiradaLoja());
        }

        //caso não entre nos ifs para verificar o tipo de compra retorna nulo
        return null;
    }
}

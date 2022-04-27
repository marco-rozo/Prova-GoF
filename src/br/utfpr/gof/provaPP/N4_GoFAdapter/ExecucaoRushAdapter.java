package br.utfpr.gof.provaPP.N4_GoFAdapter;

public class ExecucaoRushAdapter implements Execucao {
    ExecucaoRushB execucaoRushB;

    //Inicia no construtor a execucao recebida por parâmetro
    public ExecucaoRushAdapter(ExecucaoRushB execucaoRushB){
        this.execucaoRushB = execucaoRushB;
    }

    @Override
    public void getExecucao() {
        execucaoRushB.getRush();
    }
}

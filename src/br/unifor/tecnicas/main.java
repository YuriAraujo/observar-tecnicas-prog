package br.unifor.tecnicas;

public class main {

    public static void main(String[] args) {
        FundoDeInvestimento f = new FundoDeInvestimento();
        Grafico g = new Grafico();
        Mensagem m = new Mensagem();
        f.adicionaSinal(g);
        f.adicionaSinal(m);
        f.notificar();
    }

}

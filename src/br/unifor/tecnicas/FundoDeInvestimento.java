package br.unifor.tecnicas;

import java.util.ArrayList;

public class FundoDeInvestimento {
    private ArrayList<Sinalizacao> sinais;

    public FundoDeInvestimento() {
        this.sinais = new ArrayList<>();
    }

    public void adicionaSinal(Sinalizacao s) {
        this.sinais.add(s);
    }

    public void notificar(){
        for (Sinalizacao s: this.sinais) {
            s.avisar();
        }
    }
}
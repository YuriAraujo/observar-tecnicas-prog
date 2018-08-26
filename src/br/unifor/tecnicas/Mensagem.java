package br.unifor.tecnicas;

public class Mensagem implements Sinalizacao {

    @Override
    public void avisar() {
        System.out.println("avisar mensagem");
    }
}
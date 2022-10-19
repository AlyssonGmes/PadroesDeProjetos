package br.com.padroes.atividadeextra;

public class modeloReactNativeBuilder extends ReactNativeAppBuilder {
    @Override
    public void criarInstancia() {
        super.criarInstancia();
    }

    @Override
    public void buildAnoDeEstreia() {
        app.setAnoDeEstreia("10/10/2000");
    }

    @Override
    public void buildVersaoAtual() {
        app.setVersaoAtual(2.0f);
    }

    @Override
    public void buildSistemaOperacional() {
        app.setSistemaOperacional("Windows");
    }

    @Override
    public void buildLinguagemBase() {
        app.setLinguagemBase("JavaScript");
    }
}

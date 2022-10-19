package br.com.padroes.atividadeextra;

public class modeloFlutterBuilder extends FlutterAppBuilder {
    @Override
    public void criarInstancia() {
        super.criarInstancia();
    }

    @Override
    public void buildAnoDeEstreia() {
        app.setAnoDeEstreia("10/10/2010");
    }

    @Override
    public void buildVersaoAtual() {
        app.setVersaoAtual(1.0f);
    }

    @Override
    public void buildSistemaOperacional() {
        app.setSistemaOperacional("Windows, Linux ou macOS");
    }

    @Override
    public void buildLinguagemBase() {
        app.setLinguagemBase("Dart");
    }
}

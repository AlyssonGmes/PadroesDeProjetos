package br.com.padroes.atividadeextra;

public abstract class FlutterAppBuilder{

    AppWithFlutter app = AppWithFlutter.getInstance();

    public void criarInstancia() {
        app = AppWithFlutter.getInstance();
    }

    public abstract void buildAnoDeEstreia();

    public abstract void buildVersaoAtual();

    public abstract void buildSistemaOperacional();

    public abstract void buildLinguagemBase();

    public AppWithFlutter getApp() {
        return app;
    }
}

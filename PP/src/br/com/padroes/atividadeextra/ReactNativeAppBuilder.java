package br.com.padroes.atividadeextra;

public abstract class ReactNativeAppBuilder {


    AppWithReactNative app = AppWithReactNative.getInstance();

    public void criarInstancia() {
        app = AppWithReactNative.getInstance();
    }

    public abstract void buildAnoDeEstreia();

    public abstract void buildVersaoAtual();

    public abstract void buildSistemaOperacional();

    public abstract void buildLinguagemBase();

    public AppWithReactNative getApp() {
        return app;
    }

}

package br.com.padroes.atividadeextra;

public class AppWithReactNative extends Framework {

    public static AppWithReactNative instanciaUnica;

    private AppWithReactNative(){

    }

    public static AppWithReactNative getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new AppWithReactNative();
        }
        return instanciaUnica;
    }

    @Override
    public String toString() {
        return "br.com.padroes.atividadeextra.AppWithReactNative{" +
                "anoDeEstreia='" + anoDeEstreia + '\'' +
                ", versaoAtual=" + versaoAtual +
                ", sistemaOperacional='" + sistemaOperacional + '\'' +
                ", linguagemBase='" + linguagemBase + '\'' +
                '}';
    }
}

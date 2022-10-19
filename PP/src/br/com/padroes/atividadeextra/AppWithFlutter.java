package br.com.padroes.atividadeextra;

public class AppWithFlutter extends Framework {

    public static AppWithFlutter instanciaUnica;

    private AppWithFlutter(){

    }

    public static AppWithFlutter getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new AppWithFlutter();
        }
        return instanciaUnica;
    }

    @Override
    public String toString() {
        return "br.com.padroes.atividadeextra.AppWithFlutter{" +
                "anoDeEstreia='" + anoDeEstreia + '\'' +
                ", versaoAtual=" + versaoAtual +
                ", sistemaOperacional='" + sistemaOperacional + '\'' +
                ", linguagemBase='" + linguagemBase + '\'' +
                '}';
    }


}


package br.com.padroes.atividadeextra;

public abstract class Framework {

    String anoDeEstreia;
    float versaoAtual;
    String sistemaOperacional;
    String linguagemBase;

    public String getAnoDeEstreia() {
        return anoDeEstreia;
    }

    public void setAnoDeEstreia(String anoDeEstreia) {
        this.anoDeEstreia = anoDeEstreia;
    }

    public float getVersaoAtual() {
        return versaoAtual;
    }

    public void setVersaoAtual(float versaoAtual) {
        this.versaoAtual = versaoAtual;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getLinguagemBase() {
        return linguagemBase;
    }

    public void setLinguagemBase(String linguagemBase) {
        this.linguagemBase = linguagemBase;
    }

}

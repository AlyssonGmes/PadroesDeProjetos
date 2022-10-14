package br.com.padroes.builder;

public class LinhaDeMontagem {
    FogueteBuilder foguete;

    public LinhaDeMontagem(FogueteBuilder espaconave){
        this.foguete = espaconave;
    }

    public void montarFoguete(){
        foguete.buildModelo();
        foguete.buildAltura();
        foguete.buildFabricante();
        foguete.buildPeso();
        foguete.buildTipoCombustivel();
        foguete.buildTotalAssentos();
        foguete.buildCapacidadeTanqueCombustivel();
        foguete.buildTipoMotor();
        foguete.buildVelocidadeMaxima();
    }

    public void montarFogueteNaoTripulado(){
        foguete.buildModelo();
        foguete.buildAltura();
        foguete.buildFabricante();
        foguete.buildPeso();
        foguete.buildTipoCombustivel();
        foguete.buildCapacidadeTanqueCombustivel();
        foguete.buildTipoMotor();
        foguete.buildVelocidadeMaxima();
    }

    public Foguete getFoguete(){
        return foguete.getFoguete();
    }
}

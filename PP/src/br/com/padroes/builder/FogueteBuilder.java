package br.com.padroes.builder;

public abstract class FogueteBuilder extends Foguete {

    Foguete foguete;

    public FogueteBuilder(){
        this.foguete = new Foguete();
    }

    public abstract void buildModelo();
    public abstract void buildTipoMotor();
    public abstract void buildTipoCombustivel();
    public abstract void buildCapacidadeTanqueCombustivel();
    public abstract void buildTotalAssentos();
    public abstract void buildVelocidadeMaxima();
    public abstract void buildPeso();
    public abstract void buildAltura();
    public abstract void buildFabricante();

    public Foguete getFoguete(){
        return this.foguete;
    }
}

package br.com.padroes.builder;

public class ModeloIBuilder extends FogueteBuilder {

    @Override
    public void buildModelo() {
        foguete.setModelo("Falcon Heavy");
    }

    @Override
    public void buildTipoMotor() {
        foguete.setTipoMotor("3x Merlin D1 (centrais e laterais)");
    }

    @Override
    public void buildTipoCombustivel() {
        foguete.setTipoCombustivel("Querosene");
    }

    @Override
    public void buildCapacidadeTanqueCombustivel() {
        foguete.setCapacidadeTanqueCombustivel(2700000);
    }

    @Override
    public void buildTotalAssentos() {
        foguete.setTotalAssentos((short)30);
    }

    @Override
    public void buildVelocidadeMaxima() {
        foguete.setVelocidadeMaxima(39600);
    }

    @Override
    public void buildPeso() {
        foguete.setPeso(1420788);
    }

    @Override
    public void buildAltura() {
        foguete.setAltura(70);
    }

    @Override
    public void buildFabricante() {
        foguete.setFabricante("SpaceX");
    }
}

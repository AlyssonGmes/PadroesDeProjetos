package br.com.padroes.builder;

public class ModeloIIBuilder extends FogueteBuilder {

    @Override
    public void buildModelo() {
        foguete.setModelo("Saturno V");
    }

    @Override
    public void buildTipoMotor() {
        foguete.setTipoMotor("5x Rocketdyne F-1");
    }

    @Override
    public void buildTipoCombustivel() {
        foguete.setTipoCombustivel("Querosene");
    }

    @Override
    public void buildCapacidadeTanqueCombustivel() {
        foguete.setCapacidadeTanqueCombustivel(770000);
    }

    @Override
    public void buildTotalAssentos() {
        foguete.setTotalAssentos((short)60);
    }

    @Override
    public void buildVelocidadeMaxima() {
        foguete.setVelocidadeMaxima(9900);
    }

    @Override
    public void buildPeso() {
        foguete.setPeso(2965000);
    }

    @Override
    public void buildAltura() {
        foguete.setAltura(110);
    }

    @Override
    public void buildFabricante() {
        foguete.setFabricante("Boeing");
    }
}

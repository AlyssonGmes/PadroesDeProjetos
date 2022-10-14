package br.com.padroes.builder;

public class ModeloVANTBuilder extends FogueteBuilder {

    @Override
    public void buildModelo() {
        foguete.setModelo("Drone");
    }

    @Override
    public void buildTipoMotor() {
        foguete.setTipoMotor("Motorzinho");
    }

    @Override
    public void buildTipoCombustivel() {
        foguete.setTipoCombustivel("Querosene");
    }

    @Override
    public void buildCapacidadeTanqueCombustivel() {
        foguete.setCapacidadeTanqueCombustivel(300);
    }

    @Override
    public void buildVelocidadeMaxima() {
        foguete.setVelocidadeMaxima(1000);
    }

    @Override
    public void buildPeso() {
        foguete.setPeso(500);
    }

    @Override
    public void buildAltura() {
        foguete.setAltura(5);
    }

    @Override
    public void buildFabricante() {
        foguete.setFabricante("IFSX");
    }

    @Override
    public void buildTotalAssentos(){

    }
}

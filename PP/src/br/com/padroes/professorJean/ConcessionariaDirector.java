package br.com.padroes.professorJean;

public class ConcessionariaDirector {
	protected CarroBuilder montadora;

    public ConcessionariaDirector(CarroBuilder montadora) {
        this.montadora = montadora;
    }
 
    public void construirPopular() {
        montadora.buildPreco();
        montadora.buildAnoDeFabricacao();
        montadora.buildDscMotor();
        montadora.buildModelo();
        montadora.buildMontadora();
    }

    public void construirMercedes(){
        montadora.buildPreco();
        montadora.buildAnoDeFabricacao();
        montadora.buildDscMotor();
        montadora.buildModelo();
        montadora.buildMontadora();
        montadora.buildOpcional();
    }
 
    public CarroProduct getCarro() {
        return montadora.getCarro();
    }
}

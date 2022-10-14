package br.com.padroes.builder;

public class SistemaAeroespacial {
    public static void main(String[] args) {
/*
        LinhaDeMontagem lote2 = new LinhaDeMontagem(new FogueteModeloIIBuilder());
        lote2.montarFoguete();
        Foguete foguete2 = lote2.getFoguete();
        System.out.println(foguete2.toString());
*/

        LinhaDeMontagem lote1 = new LinhaDeMontagem(new ModeloIBuilder());
        lote1.montarFoguete();
        Foguete foguete1 = lote1.getFoguete();
        System.out.println(foguete1.toString());

        LinhaDeMontagem drone = new LinhaDeMontagem(new ModeloVANTBuilder());
        drone.montarFogueteNaoTripulado();
        Foguete droneX = drone.getFoguete();
        System.out.println(droneX.toString());
    }
}

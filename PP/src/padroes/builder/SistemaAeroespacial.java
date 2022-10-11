package padroes.builder;

public class SistemaAeroespacial {
    public static void main(String[] args) {
        LinhaDeMontagem lote1 = new LinhaDeMontagem(new FogueteModeloI());
        lote1.montarFoguete();
        Foguete foguete1 = lote1.getFoguete();
        System.out.println(foguete1.toString());

        LinhaDeMontagem lote2 = new LinhaDeMontagem(new FogueteModeloII());
        lote2.montarFoguete();
        Foguete foguete2 = lote2.getFoguete();
        System.out.println(foguete2.toString());
    }
}

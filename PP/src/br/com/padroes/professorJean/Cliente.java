package br.com.padroes.professorJean;

public class Cliente {

	public static void main(String[] args) {
		ConcessionariaDirector novaMercedes = new ConcessionariaDirector(new MercedesBuilder());
		novaMercedes.construirMercedes();
		CarroProduct carroMercedes = novaMercedes.getCarro();
		System.out.println(carroMercedes.toString());




		ConcessionariaDirector novoCarro2 = new ConcessionariaDirector(new FiatBuilder());
		novoCarro2.construirPopular();
		CarroProduct carro2 = novoCarro2.getCarro();
		System.out.println(carro2.toString());
	}
}

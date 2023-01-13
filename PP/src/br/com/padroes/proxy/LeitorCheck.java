package br.com.padroes.proxy;

public class LeitorCheck extends Leitor implements ILeitor {
    public LeitorCheck() {

    }

    @Override
    public void listarPalavras() {
        if (listaDePalavras.size() == 0) {
            System.out.println("Nenhum texto foi lido.");
        } else {
            for (String palavra : listaDePalavras) {
                if(palavra.length() > 1) {
                    System.out.println(palavra + ": " + palavra.length() + " caracteres");
                }else{
                    System.out.println(palavra + ": " + palavra.length() + " caractere");
                }
            }
        }
    }
}

package br.com.padroes.proxy;

import java.util.ArrayList;

public class Leitor implements ILeitor {
    ArrayList<String> listaDePalavras = new ArrayList<>();

    public Leitor() {

    }

    public void lerTexto(String texto) {
        for (String palavra : texto.split("[, .]")) {
            if (palavra.length() != 0) {
                listaDePalavras.add(palavra);
            }
        }
    }

    public void listarPalavras() {
        if (listaDePalavras.size() == 0) {
            System.out.println("Nenhum texto foi lido.");
        } else {
            for (String palavra : listaDePalavras) {
                System.out.println(palavra);
            }
        }
    }
}

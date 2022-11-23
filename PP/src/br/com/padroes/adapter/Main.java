package br.com.padroes.adapter;

public class Main {
    public static void main(String[] args) {
        ImageTarget img1 = new JL15_Adapter();
        img1.selecionarImagem("foto.png");

        ImageTarget img2 = new JL16_Adapter();
        img2.selecionarImagem("foto.png");
    }
}
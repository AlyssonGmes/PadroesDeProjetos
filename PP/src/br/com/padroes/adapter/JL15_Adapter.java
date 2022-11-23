package br.com.padroes.adapter;

public class JL15_Adapter extends JL15_Image implements ImageTarget {
    public void selecionarImagem(String imagem) {
        JL15_SelecionarImagem(imagem);
    }

    public void exibirImagem(int largura, int altura, int posicaoX, int posicaoY, int width, int height) {
        JL15_ExibirImagem(largura, altura, posicaoX, posicaoY, width, height);
    }
}

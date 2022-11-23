package br.com.padroes.adapter;

public class JL16_Adapter extends JL16_Image implements ImageTarget {
    public void selecionarImagem(String imagem) {
        JL16_SelecionarImagem(imagem);
    }

    public void exibirImagem(int largura, int altura, int posicaoX, int posicaoY, int width, int height) {
        JL16_ExibirImagem(largura, altura, posicaoX, posicaoY, width, height);
    }
}

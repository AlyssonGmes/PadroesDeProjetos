package br.com.padroes.prototype;

import java.util.Date;

public class Cliente extends Pessoa {
    private Livro[] carrinho;
    private Livro[] comprados;

    public Cliente(String nome, String endereco, char genero,
                   Date dataNascimento, String CPF, String RG,
                   String contatoTelefonico, String email, Livro[] carrinho, Livro[] comprados) {

        super(nome, endereco, genero, dataNascimento, CPF, RG, contatoTelefonico, email);
        this.carrinho = carrinho;
        this.comprados = comprados;
    }

    public void comprarLivro(Livro livro) {
        if (comprados == null) {
            comprados = new Livro[25];
            comprados[0] = livro;
            return;
        }
        int contador = this.comprados.length;

        for (Livro n : comprados) {
            if (n == null) {
                contador--;
            }
        }

        if (contador < 10) {
            Livro[] colecao = new Livro[this.comprados.length + 50];
            for (int i = 0; i < comprados.length; i++) {
                if (this.comprados[i] == null) {
                    colecao[i] = livro;
                    break;
                }
                colecao[i] = this.comprados[i];
            }
            this.comprados = colecao;
        } else {
            for (int i = 0; i < comprados.length; i++) {
                if (comprados[i] == null) {
                    comprados[i] = livro;
                    break;
                }
            }
        }
    }

    public void adicionarAoCarrinho(Livro livro) {
        if (carrinho == null) {
            carrinho = new Livro[100];
            carrinho[0] = livro;
            return;
        }
        int contador = this.carrinho.length;

        for (Livro n : carrinho) {
            if (n == null) {
                contador--;
            }
        }

        if (contador < 10) {
            Livro[] colecao = new Livro[this.carrinho.length + 50];
            for (int i = 0; i < carrinho.length; i++) {
                if (this.carrinho[i] == null) {
                    colecao[i] = livro;
                    break;
                }
                colecao[i] = this.carrinho[i];
            }
            this.carrinho = colecao;
        } else {
            for (int i = 0; i < carrinho.length; i++) {
                if (carrinho[i] == null) {
                    carrinho[i] = livro;
                    break;
                }
            }
        }
    }

    public void esvaziarCarrinho() {
        carrinho = null;
    }

    public void fazerDedicatoria(String str, Livro livro) {
        livro.setDedicatoria(str);
    }

    public Livro[] getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Livro[] carrinho) {
        this.carrinho = carrinho;
    }

    public Livro[] getComprados() {
        return comprados;
    }

    public void setComprados(Livro[] comprados) {
        this.comprados = comprados;
    }


    public void verCarrinho(){
        if(carrinho == null){
            System.out.println("╒════════════════╕");
            System.out.println("│ Carrinho vazio │");
            System.out.println("╘════════════════╛\n");

            return;
        }
        System.out.println("╒══════════════╕");
        System.out.println("│ Meu carrinho │ ");
        System.out.println("╘══════════════╛");
        for (Livro n : carrinho) {
            if (n == null) {
                break;
            }
            System.out.println("Título: " + n.getTitulo());
            System.out.println("Autor: " + n.getAutor());
            System.out.println();
        }
    }

    public void verComprados() {
        if(comprados == null){
            System.out.println("╒═══════════════════════════╕");
            System.out.println("│ Nenhum livro foi comprado │");
            System.out.println("╘═══════════════════════════╛\n");
            return;
        }
        System.out.println("╒══════════════════╕");
        System.out.println("│ Livros comprados │");
        System.out.println("╘══════════════════╛\n");

        for (Livro n : comprados) {
            if (n == null) {
                break;
            }
            System.out.println("Título: " + n.getTitulo());
            System.out.println("Autor: " + n.getAutor());
            if(n.getDedicatoria() != ""){
                System.out.println("Dedicatória: "+n.getDedicatoria());
            }
            System.out.println();
        }
    }
}

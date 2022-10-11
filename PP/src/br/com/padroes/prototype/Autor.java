package br.com.padroes.prototype;

import java.util.Date;

public class Autor extends Pessoa {
    private Livro[] livros;
    public Autor(String nome, String endereco, char genero,
                 Date dataNascimento, String CPF, String RG,
                 String contatoTelefonico, String email,
                 Livro[] livros) {

        super(nome, endereco, genero, dataNascimento, CPF, RG, contatoTelefonico, email);
        this.livros = livros;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro livro) {
        if(livros == null){
            livros = new Livro[15];
            livros[0] = livro;
            return;
        }
        int contador = this.livros.length;

        for(Livro n : livros){
            if(n == null){
                contador--;
            }
        }

        if(contador < 10){
            Livro[] colecao = new Livro[this.livros.length+50];
            for(int i = 0; i < livros.length; i++){
                if(this.livros[i] == null){
                    colecao[i] = livro;
                    break;
                }
                colecao[i] = this.livros[i];
            }
            this.livros = colecao;
        }else{
            for(int i = 0; i < livros.length; i++){
                if(livros[i] == null){
                    livros[i] = livro;
                    break;
                }
            }
        }
    }

    public void verLivros(){
        if(livros == null){
            System.out.println("╒════════════════════════════════════════╕");
            System.out.println("│ Este autor não possui nenhum exemplar. │");
            System.out.println("╘════════════════════════════════════════╛\n");
            return;
        }

        System.out.println("╒════════╕");
        System.out.println("│ Livros │");
        System.out.println("╘════════╛\n");

        for(Livro n : livros){
            if(n == null){
                break;
            }
            System.out.println("Título: "+n.getTitulo());
            System.out.println("Total de páginas: "+ n.getPaginas());
            System.out.println();
        }
    }
}

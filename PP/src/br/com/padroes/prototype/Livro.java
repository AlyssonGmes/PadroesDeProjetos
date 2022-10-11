package br.com.padroes.prototype;

public class Livro implements Cloneable {
    private String titulo;
    private String nomeAutor;
    private int qtdPaginas;

    public String getDedicatoria() {
        return dedicatoria;
    }

    public void setDedicatoria(String dedicatoria) {
        this.dedicatoria = dedicatoria;
    }

    private String dedicatoria = "";

    public Livro() {

    }
    public Livro(String titulo, Autor autor, int qtdPaginas) {
        this.titulo = titulo;
        this.nomeAutor = autor.getNome();
        this.qtdPaginas = qtdPaginas;
        autor.setLivros(this);
    }


    public Livro clone() {
        try {
            return (Livro) super.clone();
        }catch(CloneNotSupportedException e){
            System.out.println("Não foi possível clonar: "+e.getMessage());
            return null;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return nomeAutor;
    }

    public void setAutor(Autor autor) {
        this.nomeAutor = autor.getNome();
    }

    public int getPaginas() {
        return qtdPaginas;
    }

    public void setPaginas(int paginas) {
        this.qtdPaginas = paginas;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }
}

package br.com.padroes.prototype;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String endereco;
    private char genero;
    private Date dataNascimento;
    private String CPF;
    private String RG;
    private String contatoTelefonico;
    private String email;

    public Pessoa(String nome, String endereco, char genero, Date dataNascimento,
                  String CPF, String RG, String contatoTelefonico, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
        this.RG = RG;
        this.contatoTelefonico = contatoTelefonico;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getContatoTelefonico() {
        return contatoTelefonico;
    }

    public void setContatoTelefonico(String contatoTelefonico) {
        this.contatoTelefonico = contatoTelefonico;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

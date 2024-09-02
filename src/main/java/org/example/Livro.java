package org.example;

public class Livro {

    private String nome;
    private String autor;
    private int anoPublicacao;

    public Livro(String nome, String autor, int anoPublicacao) {
        this.nome = nome;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public Livro setAutor(String autor) {
        this.autor = autor;
        return this;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public Livro setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
        return this;
    }
}

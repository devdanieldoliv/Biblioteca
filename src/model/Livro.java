package model;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private String isbn;
    private int anoPublicacao;
    private int quantidadeTotal;
    private int quantidadeDisponivel;
    public Livro(int id, String titulo, String autor, String isbn, int anoPublicacao, int quantidadeTotal){
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.quantidadeTotal= quantidadeTotal;
        this.quantidadeDisponivel = quantidadeTotal;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }
}

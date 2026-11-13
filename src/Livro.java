public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private String isbn;
    private int anoPublicacao;
    private int quantidadeTotal;
    private int quantidadeDisponivel;
    public Livro(int id, String titulo, String autor, String isbn, int anoPublicacao, int quantidadeTotal, int quantidadeDisponivel){
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.quantidadeTotal= quantidadeTotal;
        this.quantidadeDisponivel = quantidadeDisponivel;
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

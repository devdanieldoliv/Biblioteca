package model;
import java.time.LocalDate;
public class Emprestimo {
    private int id;
    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDevolucao;
    private LocalDate dataDevolucao;
    private StatusEmprestimo status;

    public Emprestimo(int id, Livro livro, Usuario usuario, LocalDate dataEmprestimo, LocalDate dataPrevistaDevolucao) {
        if (dataEmprestimo == null || dataPrevistaDevolucao == null) {
            throw new IllegalArgumentException("As datas são obrigatórias.");
        }

        if (dataPrevistaDevolucao.isBefore(dataEmprestimo)) {
            throw new IllegalArgumentException(
                    "A data prevista não pode ser anterior à data do empréstimo."
            );
        }
        if (livro == null || usuario == null) {
            throw new IllegalArgumentException(
                    "Livro e usuário são obrigatórios."
            );
        }
        this.id = id;
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
        this.dataDevolucao = null;
        this.status = StatusEmprestimo.EM_ANDAMENTO;
    }

    public int getId() {
        return id;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public StatusEmprestimo getStatus() {
        return status;
    }

    public void registrarDevolucao(){
        if (status == StatusEmprestimo.DEVOLVIDO) {
            System.out.println("Este empréstimo já foi devolvido.");
            return;
        }
        dataDevolucao = LocalDate.now();
        status = StatusEmprestimo.DEVOLVIDO;
    }

    public void exibirInformacoes(){
        System.out.println("===EMPRÉSTIMO===");
        System.out.println("ID: " + getId());
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Usuário" + usuario.getNome());
        System.out.println("Data do empréstimo: " + getDataEmprestimo());
        System.out.println("Devolução prevista: " + getDataPrevistaDevolucao());
        if (dataDevolucao == null) {
            System.out.println("Devolução efetiva: Ainda não devolvido");
        } else {
            System.out.println("Devolução efetiva: " + dataDevolucao);
        }
        System.out.println("Status: " + getStatus());
    }


}

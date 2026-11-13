import model.Emprestimo;
import model.Livro;
import model.Usuario;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(
                1,
                "João Silva",
                "joao@email.com",
                "12345678900"
        );

        Livro livro1 = new Livro(18, "Clean Code", "roberto", "23ap1A", 2020, 3);

        Emprestimo emprestimo = new Emprestimo(
                1,
                livro1,
                usuario1,
                LocalDate.now(),
                LocalDate.now().plusDays(7)
        );

        emprestimo.exibirInformacoes();
        emprestimo.registrarDevolucao();
        emprestimo.exibirInformacoes();

    }
}
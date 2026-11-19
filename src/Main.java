import model.Emprestimo;
import model.Livro;
import model.Usuario;
import repository.LivroRepository;
import repository.UsuarioRepository;
import service.EmprestimoService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LivroRepository livroRepository = new LivroRepository();
        UsuarioRepository usuarioRepository = new UsuarioRepository();

        Livro l1 = new Livro(1, "Noites Brancas", "Dostoiévski", "1234", 1890, 3);
        Livro l2 = new Livro(2, "Notas do subsolo", "Dostoiévski", "1111", 1895, 3);
        Livro l3 = new Livro(3, "Raízes do Brasil", "Sergio Buarque de Holanda", "AAAA", 1955, 3);

        livroRepository.adicionarLivro(l1);
        livroRepository.adicionarLivro(l2);
        livroRepository.adicionarLivro(l3);

        Usuario user1 = new Usuario(1, "Daniel", "daniel@gmail.com", "073");
        Usuario user2 = new Usuario(2, "Douglas", "dog@gmail.com", "999");
        Usuario user3 = new Usuario(3, "ana", "ana@gmail.com", "888");

        usuarioRepository.adicionarUsuario(user1);
        usuarioRepository.adicionarUsuario(user2);
        usuarioRepository.adicionarUsuario(user3);

        System.out.println(l1.getQuantidadeDisponivel());

        EmprestimoService emprestimoService1 = new EmprestimoService(livroRepository, usuarioRepository);
        emprestimoService1.realizarEmprestimo(1, 1);

        System.out.println(l1.getQuantidadeDisponivel());
    }
}
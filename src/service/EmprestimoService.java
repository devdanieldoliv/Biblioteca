package service;
import model.Emprestimo;
import model.Livro;
import model.StatusEmprestimo;
import model.Usuario;
import repository.UsuarioRepository;
import repository.LivroRepository;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmprestimoService {
    private LivroRepository livroRepository;
    private UsuarioRepository usuarioRepository;
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();
     public EmprestimoService (LivroRepository livroRepository, UsuarioRepository usuarioRepository){
         this.livroRepository = livroRepository;
         this.usuarioRepository = usuarioRepository;
     }

    public Emprestimo realizarEmprestimo(int idUsuario, int idLivro){
        Usuario usuario = usuarioRepository.buscarPorId(idUsuario);
        if (usuario == null) {
            return null;
        }
        Livro livro = livroRepository.buscarPorId(idLivro);
        if (livro == null) {
            return null;
        }

        if (livro.getQuantidadeDisponivel() == 0){
            return null;
        }

        Emprestimo emprestimo = new Emprestimo(emprestimos.size() + 1, livro,
                usuario, LocalDate.now(), LocalDate.now().plusDays(7) );

        emprestimos.add(emprestimo);

        livro.emprestarExemplar();

        return emprestimo;
    }

    public Emprestimo registrarDevolucao(int idEmprestimo){
        for(Emprestimo emprestimo : emprestimos){
            if (emprestimo.getId() == idEmprestimo){
                if (emprestimo.getStatus() == StatusEmprestimo.EM_ANDAMENTO){
                    emprestimo.registrarDevolucao();
                    emprestimo.getLivro().devolverExemplar();
                    return emprestimo;
                }
            }
        }
        return  null;
        }
    }


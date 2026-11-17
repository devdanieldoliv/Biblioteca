package repository;
import model.Livro;
import model.Usuario;
import java.util.ArrayList;
public class UsuarioRepository {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    public void listarUsuarios(){
        if (usuarios.isEmpty()){
            System.out.println("Erro, lista vazia");
        }
        else {
            for (Usuario usuario : usuarios){
                System.out.println(usuario.getNome() + " - " + usuario.getId());
            }
        }
    }
    public Usuario buscarPorId(int id){
        for (Usuario usuario : usuarios) {
            if(usuario.getId() == id){
                return usuario;
            }
        }
        return null;
    }
    public Usuario removerPorId(int id){
        Usuario removido = buscarPorId(id);
        if (removido != null){
            usuarios.remove(removido);
            return removido;
        }
        return null;
    }
}

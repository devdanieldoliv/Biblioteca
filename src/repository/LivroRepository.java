package repository;
import model.Livro;

import java.util.ArrayList;
public class LivroRepository {
   private ArrayList<Livro> livros = new ArrayList<>();
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
    public void listarLivros(){
       if (livros.isEmpty()){
           System.out.println("Erro, lista vazia");
       }
       else {
           for (Livro livro : livros){
               System.out.println(livro.getTitulo() + " - " + livro.getAutor());
           }
       }
    }
    public Livro buscarPorId(int id){
        for (Livro livro : livros) {
            if(livro.getId() == id){
                return livro;
            }
        }
            return null;
    }
public Livro removerPorId(int id){
      Livro removido = buscarPorId(id);
      if (removido != null){
          livros.remove(removido);
          return removido;
      }
      return null;
}
    }



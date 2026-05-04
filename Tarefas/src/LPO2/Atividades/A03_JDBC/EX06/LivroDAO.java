package src.LPO2.Atividades.A03_JDBC.EX06;

import java.util.ArrayList;
import java.util.List;

public class LivroDAO {

    private List<Livro> livros = new ArrayList<>();

    public void inserirLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> listarLivros() {
        return livros;
    }

    public Livro buscarLivroPorId(int id) {
    for (Livro livro : livros) {
        if (livro.getId() == id) {
            return livro;
        }
    }

    return null;
}
}
package src.LPO2.Atividades.A03_JDBC.EX06;

import java.util.ArrayList;
import java.util.List;

public class Autor {

    private int id;
    private String nome;
    private List<Livro> livros;

    public Autor(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome;
    }
}
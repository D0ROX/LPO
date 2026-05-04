package src.LPO2.Atividades.A03_JDBC.EX06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AutorDAO {

    private List<Autor> autores = new ArrayList<>();

    public void inserirAutor(Autor autor) {
        autores.add(autor);
    }

    public List<Autor> listarAutores() {
        Collections.sort(autores, new ComparadorAutor());
        return autores;
    }

    public Autor buscarAutorPorId(int id) {
        for (Autor autor : autores) {
            if (autor.getId() == id) {
                return autor;
            }
        }

        return null;
    }
}
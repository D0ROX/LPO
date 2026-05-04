package src.LPO2.Atividades.A03_JDBC.EX06;

import java.util.Comparator;

public class ComparadorAutor implements Comparator<Autor> {

    @Override
    public int compare(Autor a1, Autor a2) {
        return a1.getNome().compareToIgnoreCase(a2.getNome());
    }
}

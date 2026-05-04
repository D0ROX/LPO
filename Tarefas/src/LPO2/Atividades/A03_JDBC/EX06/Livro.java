package src.LPO2.Atividades.A03_JDBC.EX06;

public class Livro {

    private int id;
    private String titulo;

    public Livro(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Título: " + titulo;
    }
}
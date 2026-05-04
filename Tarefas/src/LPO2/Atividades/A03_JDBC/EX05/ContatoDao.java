package src.LPO2.Atividades.A03_JDBC.EX05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDao {

    private Connection connection;

    public ContatoDao() {
        this.connection = ConnectionFactory.getConnection();
    }

    public void insere(Contato contato) {
        String sql = "INSERT INTO contatos (nome, email, telefone) VALUES (?, ?, ?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getTelefone());

            stmt.execute();
            stmt.close();

            System.out.println("Contato inserido com sucesso!");

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir contato!", e);
        }
    }

    public void altera(Contato contato) {
        String sql = "UPDATE contatos SET nome = ?, email = ?, telefone = ? WHERE id = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getTelefone());
            stmt.setInt(4, contato.getId());

            stmt.executeUpdate();
            stmt.close();

            System.out.println("Contato alterado com sucesso!");

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao alterar contato!", e);
        }
    }

    public void remove(Contato contato) {
        String sql = "DELETE FROM contatos WHERE id = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setInt(1, contato.getId());

            stmt.executeUpdate();
            stmt.close();

            System.out.println("Contato deletado com sucesso!");

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar contato!", e);
        }
    }

    public List<Contato> lista() {
        String sql = "SELECT * FROM contatos";

        List<Contato> contatos = new ArrayList<>();

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Contato contato = new Contato();

                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setEmail(rs.getString("email"));
                contato.setTelefone(rs.getString("telefone"));

                contatos.add(contato);
            }

            rs.close();
            stmt.close();

            return contatos;

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar contatos!", e);
        }
    }
}
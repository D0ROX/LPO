package src.LPO2.Atividades.A03_JDBC.EX05;

import java.util.List;

public class TestaContatoDao {

    public static void main(String[] args) {

        ContatoDao dao = new ContatoDao();

        // Inserir contato
        Contato contato1 = new Contato();
        contato1.setNome("João Silva");
        contato1.setEmail("joao@email.com");
        contato1.setTelefone("99999-9999");

        dao.insere(contato1);

        // Listar contatos
        System.out.println("Lista de contatos:");
        List<Contato> contatos = dao.lista();

        for (Contato contato : contatos) {
            System.out.println("ID: " + contato.getId());
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Email: " + contato.getEmail());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println("----------------------");
        }

        // Alterar contato com ID 1
        Contato contatoAlterado = new Contato();
        contatoAlterado.setId(1);
        contatoAlterado.setNome("João Atualizado");
        contatoAlterado.setEmail("joao.atualizado@email.com");
        contatoAlterado.setTelefone("98888-8888");

        dao.altera(contatoAlterado);

        // Remover contato com ID 1
        Contato contatoRemover = new Contato();
        contatoRemover.setId(1);

        dao.remove(contatoRemover);
    }
}
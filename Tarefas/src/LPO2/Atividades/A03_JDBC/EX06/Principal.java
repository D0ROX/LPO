package src.LPO2.Atividades.A03_JDBC.EX06;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AutorDAO autorDAO = new AutorDAO();
        LivroDAO livroDAO = new LivroDAO();

        int opcao;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1 - Cadastrar autor");
            System.out.println("2 - Cadastrar livro");
            System.out.println("3 - Listar autores");
            System.out.println("4 - Listar livros");
            System.out.println("5 - Listar livros de determinado autor");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("\n--- Cadastrar Autor ---");

                    System.out.print("Digite o ID do autor: ");
                    int idAutor = Integer.parseInt(scanner.nextLine());

                    System.out.print("Digite o nome do autor: ");
                    String nomeAutor = scanner.nextLine();

                    Autor autor = new Autor(idAutor, nomeAutor);

                    if (livroDAO.listarLivros().isEmpty()) {
                        System.out.println("Nenhum livro cadastrado ainda.");
                        System.out.println("Autor cadastrado sem livros.");
                    } else {
                        String resposta;

                        do {
                            System.out.println("\nLivros cadastrados:");

                            for (Livro livroAtual : livroDAO.listarLivros()) {
                                System.out.println(livroAtual);
                            }

                            System.out.print("Digite o ID do livro que deseja vincular ao autor: ");
                            int idLivro = Integer.parseInt(scanner.nextLine());

                            Livro livroEncontrado = livroDAO.buscarLivroPorId(idLivro);

                            if (livroEncontrado != null) {
                                autor.adicionarLivro(livroEncontrado);
                                System.out.println("Livro vinculado ao autor com sucesso!");
                            } else {
                                System.out.println("Livro não encontrado.");
                            }

                            System.out.print("Deseja vincular outro livro a esse autor? (s/n): ");
                            resposta = scanner.nextLine();

                        } while (resposta.equalsIgnoreCase("s"));
                    }

                    autorDAO.inserirAutor(autor);

                    System.out.println("Autor cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Cadastrar Livro ---");

                    System.out.print("Digite o ID do livro: ");
                    int idLivro = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();

                    Livro livro = new Livro(idLivro, titulo);
                    livroDAO.inserirLivro(livro);

                    System.out.println("Livro cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n--- Lista de Autores ---");

                    if (autorDAO.listarAutores().isEmpty()) {
                        System.out.println("Nenhum autor cadastrado.");
                    } else {
                        for (Autor autorAtual : autorDAO.listarAutores()) {
                            System.out.println(autorAtual);
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n--- Lista de Livros ---");

                    if (livroDAO.listarLivros().isEmpty()) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        for (Livro livroAtual : livroDAO.listarLivros()) {
                            System.out.println(livroAtual);
                        }
                    }
                    break;

                case 5:
                    System.out.println("\n--- Listar livros de determinado autor ---");

                    System.out.print("Digite o ID do autor: ");
                    int idBusca = scanner.nextInt();
                    scanner.nextLine();

                    Autor autorBuscado = autorDAO.buscarAutorPorId(idBusca);

                    if (autorBuscado == null) {
                        System.out.println("Autor não encontrado.");
                    } else {
                        System.out.println("Autor: " + autorBuscado.getNome());

                        if (autorBuscado.getLivros().isEmpty()) {
                            System.out.println("Esse autor não possui livros cadastrados.");
                        } else {
                            System.out.println("Livros desse autor:");

                            for (Livro livroAtual : autorBuscado.getLivros()) {
                                System.out.println(livroAtual);
                            }
                        }
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 6);

        scanner.close();
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Material> materiais = new ArrayList<>();
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE BIBLIOTECA =====");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Cadastrar Funcionário");
            System.out.println("3 - Listar Pessoas");
            System.out.println("4 - Cadastrar Livro");
            System.out.println("5 - Cadastrar Revista");
            System.out.println("6 - Listar Materiais");
            System.out.println("7 - Registrar Empréstimo");
            System.out.println("8 - Listar Empréstimos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeU = sc.nextLine();
                    System.out.print("Email: ");
                    String emailU = sc.nextLine();
                    System.out.print("Matrícula: ");
                    int matricula = sc.nextInt();
                    sc.nextLine();
                    pessoas.add(new Usuario(nomeU, emailU, matricula));
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeF = sc.nextLine();
                    System.out.print("Email: ");
                    String emailF = sc.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();
                    pessoas.add(new Funcionario(nomeF, emailF, cargo));
                    break;

                case 3:
                    for (Pessoa p : pessoas) {
                        p.exibirInfo();
                        System.out.println("-------------------");
                    }
                    break;

                case 4:
                    System.out.print("Título: ");
                    String tituloL = sc.nextLine();
                    System.out.print("Ano de Publicação: ");
                    int anoL = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    materiais.add(new Livro(tituloL, anoL, autor));
                    break;

                case 5:
                    System.out.print("Título: ");
                    String tituloR = sc.nextLine();
                    System.out.print("Ano de Publicação: ");
                    int anoR = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Edição: ");
                    String edicao = sc.nextLine();
                    materiais.add(new Revista(tituloR, anoR, edicao));
                    break;

                case 6:
                    for (Material m : materiais) {
                        m.descricao();
                        System.out.println("-------------------");
                    }
                    break;

                case 7:
                    System.out.println("Escolha o número da pessoa:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println(i + " - " + pessoas.get(i).getNome());
                    }
                    int idxPessoa = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Escolha o número do material:");
                    for (int i = 0; i < materiais.size(); i++) {
                        System.out.println(i + " - " + materiais.get(i).getTitulo());
                    }
                    int idxMaterial = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Data do Empréstimo: ");
                    String dataE = sc.nextLine();
                    System.out.print("Data de Devolução: ");
                    String dataD = sc.nextLine();

                    emprestimos.add(new Emprestimo(pessoas.get(idxPessoa), materiais.get(idxMaterial), dataE, dataD));
                    break;

                case 8:
                    for (Emprestimo e : emprestimos) {
                        e.exibirDetalhes();
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}

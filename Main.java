public class Main {
    public static void main(String[] args) {
       
        Usuario usuario = new Usuario("João da Silva", "joao.silva@email.com", 12345);

        Funcionario funcionario = new Funcionario("Maria Oliveira", "maria.oliveira@email.com", "Bibliotecária");

        Livro livro = new Livro("O Senhor dos Anéis", 1954, "J.R.R. Tolkien");

        Revista revista = new Revista("Revista Ciência Hoje", 2022, "Edição 125");

        Emprestimo emprestimo1 = new Emprestimo(usuario, livro, "01/10/2025", "15/10/2025");

        Emprestimo emprestimo2 = new Emprestimo(funcionario, revista, "05/10/2025", "20/10/2025");

        System.out.println("===== Empréstimo 1 =====");
        emprestimo1.exibirDetalhes();

        System.out.println("\n===== Empréstimo 2 =====");
        emprestimo2.exibirDetalhes();
    }
}

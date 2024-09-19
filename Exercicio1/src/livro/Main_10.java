package livro;

public class Main_10 {
    public static void main(String[] args) {
        // Criação do livro
        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 223);
        Livro livro2 = new Livro("Harry Potter e a Câmara Secreta", "J.K. Rowling", 251);

        // Gerenciamento de empréstimos
        GerenciadorDeEmprestimos gerenciador = new GerenciadorDeEmprestimos();
        
        // Operações de empréstimo e devolução
        gerenciador.emprestarLivro(livro1.getTitulo());
        gerenciador.devolverLivro(livro2.getTitulo());
        
        // Verificar histórico
        gerenciador.verificarHistorico();
    }
}

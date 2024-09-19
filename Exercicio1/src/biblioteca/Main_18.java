package biblioteca;

public class Main_18 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrarLivro("O Senhor dos Anéis");
        biblioteca.verificarDisponibilidade("O Senhor dos Anéis");
        biblioteca.emprestarLivro("O Senhor dos Anéis");
        biblioteca.verificarDisponibilidade("O Senhor dos Anéis");
        biblioteca.devolverLivro("O Senhor dos Anéis");
        biblioteca.verificarDisponibilidade("O Senhor dos Anéis");
    }
}

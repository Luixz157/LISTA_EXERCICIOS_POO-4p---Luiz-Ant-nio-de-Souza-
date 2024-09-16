import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private Map<String, Boolean> livros;

    public Biblioteca() {
        livros = new HashMap<>();
    }

    public void cadastrarLivro(String titulo) {
        livros.put(titulo, true);
        System.out.println("Livro " + titulo + " cadastrado.");
    }

    public void emprestarLivro(String titulo) {
        if (livros.containsKey(titulo) && livros.get(titulo)) {
            livros.put(titulo, false);
            System.out.println("Livro " + titulo + " emprestado.");
        } else {
            System.out.println("Livro indisponível ou não encontrado.");
        }
    }

    public void devolverLivro(String titulo) {
        if (livros.containsKey(titulo)) {
            livros.put(titulo, true);
            System.out.println("Livro " + titulo + " devolvido.");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public void verificarDisponibilidade(String titulo) {
        if (livros.containsKey(titulo)) {
            System.out.println("Disponibilidade do livro " + titulo + ": " + (livros.get(titulo) ? "Disponível" : "Indisponível"));
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

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

package biblioteca;

import biblioteca.interfaces.GerenciadorDeLivros;
import java.util.HashMap;
import java.util.Map;

public class Biblioteca implements GerenciadorDeLivros {
    private Map<String, Livro> livros;

    public Biblioteca() {
        livros = new HashMap<>();
    }

    @Override
    public void cadastrarLivro(String titulo) {
        if (livros.containsKey(titulo)) {
            System.out.println("Livro " + titulo + " já está cadastrado.");
            return;
        }
        Livro novoLivro = new Livro(titulo);
        livros.put(titulo, novoLivro);
        System.out.println("Livro " + titulo + " cadastrado.");
    }

    @Override
    public void emprestarLivro(String titulo) {
        Livro livro = livros.get(titulo);
        if (livro != null && livro.isDisponivel()) {
            livro.emprestar();
            System.out.println("Livro " + titulo + " emprestado.");
        } else {
            System.out.println("Livro indisponível ou não encontrado.");
        }
    }

    @Override
    public void devolverLivro(String titulo) {
        Livro livro = livros.get(titulo);
        if (livro != null) {
            livro.devolver();
            System.out.println("Livro " + titulo + " devolvido.");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    @Override
    public void verificarDisponibilidade(String titulo) {
        Livro livro = livros.get(titulo);
        if (livro != null) {
            System.out.println("Disponibilidade do livro " + titulo + ": " + (livro.isDisponivel() ? "Disponível" : "Indisponível"));
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}

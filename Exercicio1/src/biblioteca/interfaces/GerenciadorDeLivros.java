package biblioteca.interfaces;

public interface GerenciadorDeLivros {
    void cadastrarLivro(String titulo);
    void emprestarLivro(String titulo);
    void devolverLivro(String titulo);
    void verificarDisponibilidade(String titulo);
}

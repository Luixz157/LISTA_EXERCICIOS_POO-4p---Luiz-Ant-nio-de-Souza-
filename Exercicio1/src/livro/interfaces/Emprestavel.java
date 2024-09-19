package livro.interfaces;

public interface Emprestavel {
    void emprestarLivro(String titulo);
    void devolverLivro(String titulo);
    void verificarHistorico();
}

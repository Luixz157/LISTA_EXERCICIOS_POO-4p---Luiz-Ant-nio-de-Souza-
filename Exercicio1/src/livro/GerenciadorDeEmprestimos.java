package livro;

import livro.interfaces.Emprestavel;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeEmprestimos implements Emprestavel {
    private List<String> historicoEmprestimos;

    public GerenciadorDeEmprestimos() {
        this.historicoEmprestimos = new ArrayList<>();
    }

    @Override
    public void emprestarLivro(String titulo) {
        historicoEmprestimos.add("Empréstimo: " + titulo);
        System.out.println("Livro emprestado: " + titulo);
    }

    @Override
    public void devolverLivro(String titulo) {
        historicoEmprestimos.add("Devolução: " + titulo);
        System.out.println("Livro devolvido: " + titulo);
    }

    @Override
    public void verificarHistorico() {
        System.out.println("Histórico de empréstimos:");
        if (historicoEmprestimos.isEmpty()) {
            System.out.println("Não há registros de empréstimos ou devoluções.");
        } else {
            for (String registro : historicoEmprestimos) {
                System.out.println(registro);
            }
        }
    }
}

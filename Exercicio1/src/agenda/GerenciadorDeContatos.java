package agenda;

import agenda.interfaces.IAdicionarContato;
import agenda.interfaces.IEditarContato;
import agenda.interfaces.IRemoverContato;
import agenda.interfaces.IBuscarContato;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeContatos implements IAdicionarContato, IEditarContato, IRemoverContato, IBuscarContato {
    private List<Contato> contatos;

    public GerenciadorDeContatos() {
        contatos = new ArrayList<>();
    }

    @Override
    public void adicionarContato(String nome, String telefone) {
        Contato contato = new Contato(nome, telefone);
        contatos.add(contato);
        System.out.println("Contato " + nome + " adicionado com sucesso.");
    }

    @Override
    public void editarContato(String nome, String novoNome, String novoTelefone) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNome(novoNome);
                contato.setTelefone(novoTelefone);
                System.out.println("Contato " + nome + " editado com sucesso.");
                return;
            }
        }
        System.out.println("Contato " + nome + " não encontrado.");
    }

    @Override
    public void removerContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatos.remove(contato);
                System.out.println("Contato " + nome + " removido com sucesso.");
                return;
            }
        }
        System.out.println("Contato " + nome + " não encontrado.");
    }

    @Override
    public void buscarContatoPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Contato encontrado: " + contato.getNome() + " - " + contato.getTelefone());
                return;
            }
        }
        System.out.println("Contato " + nome + " não encontrado.");
    }

    @Override
    public void buscarContatoPorTelefone(String telefone) {
        for (Contato contato : contatos) {
            if (contato.getTelefone().equals(telefone)) {
                System.out.println("Contato encontrado: " + contato.getNome() + " - " + contato.getTelefone());
                return;
            }
        }
        System.out.println("Contato com telefone " + telefone + " não encontrado.");
    }
}

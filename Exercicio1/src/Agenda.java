import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private class Contato {
        private String nome;
        private String telefone;

        public Contato(String nome, String telefone) {
            this.nome = nome;
            this.telefone = telefone;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
    }

    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone) {
        Contato contato = new Contato(nome, telefone);
        contatos.add(contato);
        System.out.println("Contato " + nome + " adicionado com sucesso.");
    }

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

    public void buscarContatoPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Contato encontrado: " + contato.getNome() + " - " + contato.getTelefone());
                return;
            }
        }
        System.out.println("Contato " + nome + " não encontrado.");
    }

    public void buscarContatoPorTelefone(String telefone) {
        for (Contato contato : contatos) {
            if (contato.getTelefone().equals(telefone)) {
                System.out.println("Contato encontrado: " + contato.getNome() + " - " + contato.getTelefone());
                return;
            }
        }
        System.out.println("Contato com telefone " + telefone + " não encontrado.");
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarContato("João Silva", "123456789");
        agenda.adicionarContato("Maria Oliveira", "987654321");

        agenda.buscarContatoPorNome("João Silva");
        agenda.buscarContatoPorTelefone("987654321");

        agenda.editarContato("João Silva", "João Santos", "111222333");

        agenda.removerContato("Maria Oliveira");
    }
}

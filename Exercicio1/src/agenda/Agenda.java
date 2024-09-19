package agenda;

public class Agenda {
    private GerenciadorDeContatos gerenciadorDeContatos;

    public Agenda() {
        gerenciadorDeContatos = new GerenciadorDeContatos();
    }

    public void adicionarContato(String nome, String telefone) {
        gerenciadorDeContatos.adicionarContato(nome, telefone);
    }

    public void editarContato(String nome, String novoNome, String novoTelefone) {
        gerenciadorDeContatos.editarContato(nome, novoNome, novoTelefone);
    }

    public void removerContato(String nome) {
        gerenciadorDeContatos.removerContato(nome);
    }

    public void buscarContatoPorNome(String nome) {
        gerenciadorDeContatos.buscarContatoPorNome(nome);
    }

    public void buscarContatoPorTelefone(String telefone) {
        gerenciadorDeContatos.buscarContatoPorTelefone(telefone);
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

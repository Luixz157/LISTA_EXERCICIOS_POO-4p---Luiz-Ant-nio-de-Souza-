package agenda;

public class Main_14 {
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


import java.util.ArrayList;

public class Paciente {

    private String nome;
    private int idade;
    private ArrayList<String> historicoConsultas;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.historicoConsultas = new ArrayList<>();
    }

    public void adicionarConsulta(String consulta) {
        historicoConsultas.add(consulta);
        System.out.println("Consulta adicionada: " + consulta);
    }

    public void exibirHistoricoConsultas() {
        System.out.println("Histórico de consultas do paciente " + nome + ":");
        if (historicoConsultas.isEmpty()) {
            System.out.println("Nenhuma consulta realizada.");
        } else {
            for (String consulta : historicoConsultas) {
                System.out.println(consulta);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public static void main(String[] args) {
        Paciente paciente = new Paciente("João Silva", 35);

        // Adicionando consultas ao histórico
        paciente.adicionarConsulta("Consulta de rotina - 01/09/2024");
        paciente.adicionarConsulta("Consulta cardiológica - 15/09/2024");

        // Exibindo o histórico de consultas
        paciente.exibirHistoricoConsultas();
    }
}

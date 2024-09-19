package paciente;

public class Main_9 {
    public static void main(String[] args) {
        // Criando o histórico de consultas
        HistoricoDeConsultas historico = new HistoricoDeConsultas();

        // Criando o paciente e associando o histórico
        Paciente paciente = new Paciente("João Silva", 35, historico);

        // Adicionando consultas ao histórico
        paciente.adicionarConsulta("Consulta de rotina - 01/09/2024");
        paciente.adicionarConsulta("Consulta cardiológica - 15/09/2024");

        // Exibindo o histórico de consultas
        paciente.exibirHistoricoConsultas();
    }
}

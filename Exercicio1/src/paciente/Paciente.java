package paciente;

import paciente.interfaces.HistoricoConsultasInterface;

public class Paciente {
    private String nome;
    private int idade;
    private HistoricoConsultasInterface historicoConsultas;

    public Paciente(String nome, int idade, HistoricoConsultasInterface historicoConsultas) {
        this.nome = nome;
        this.idade = idade;
        this.historicoConsultas = historicoConsultas;
    }

    public void adicionarConsulta(String consulta) {
        historicoConsultas.adicionarConsulta(consulta);
    }

    public void exibirHistoricoConsultas() {
        System.out.println("Histórico de consultas do paciente " + nome + ":");
        historicoConsultas.exibirHistorico();
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

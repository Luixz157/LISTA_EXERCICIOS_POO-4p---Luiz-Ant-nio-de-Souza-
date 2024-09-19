package paciente;

import paciente.interfaces.HistoricoConsultasInterface;
import java.util.ArrayList;
import java.util.List;

public class HistoricoDeConsultas implements HistoricoConsultasInterface {
    private List<String> historicoConsultas;

    public HistoricoDeConsultas() {
        historicoConsultas = new ArrayList<>();
    }

    @Override
    public void adicionarConsulta(String consulta) {
        historicoConsultas.add(consulta);
        System.out.println("Consulta adicionada: " + consulta);
    }

    @Override
    public void exibirHistorico() {
        System.out.println("Histórico de consultas:");
        if (historicoConsultas.isEmpty()) {
            System.out.println("Nenhuma consulta realizada.");
        } else {
            for (String consulta : historicoConsultas) {
                System.out.println(consulta);
            }
        }
    }
}

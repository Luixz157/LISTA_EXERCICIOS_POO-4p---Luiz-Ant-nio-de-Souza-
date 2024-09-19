package funcionario;

import funcionario.interfaces.CalculavelSalario;

public class CalculoSalario implements CalculavelSalario {
    private Funcionario funcionario;

    public CalculoSalario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public double calcularSalarioLiquido() {
        double descontoTotal = funcionario.getSalario() * (funcionario.getDesconto() / 100) + funcionario.getDescontoExtra();
        return funcionario.getSalario() - descontoTotal;
    }
}

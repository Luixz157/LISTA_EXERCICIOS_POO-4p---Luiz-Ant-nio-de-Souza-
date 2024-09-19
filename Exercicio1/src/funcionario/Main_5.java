package funcionario;

public class Main_5 {
    public static void main(String[] args) {
        // Coleta de dados do funcionário
        Funcionario funcionario = FuncionarioInput.criarFuncionario();
        FuncionarioInput.definirDescontos(funcionario);

        // Cálculo do salário líquido
        CalculoSalario calculoSalario = new CalculoSalario(funcionario);
        double salarioLiquido = calculoSalario.calcularSalarioLiquido();

        System.out.println("Desconto líquido: " + salarioLiquido);
    }
}

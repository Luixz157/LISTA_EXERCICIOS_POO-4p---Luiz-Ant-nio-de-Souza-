package funcionario;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;
    private double desconto;
    private double descontoExtra;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getDescontoExtra() {
        return descontoExtra;
    }

    public void setDescontoExtra(double descontoExtra) {
        this.descontoExtra = descontoExtra;
    }
}

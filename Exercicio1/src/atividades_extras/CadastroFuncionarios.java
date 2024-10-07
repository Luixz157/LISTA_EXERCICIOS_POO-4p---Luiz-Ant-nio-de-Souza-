//Classe CadastroFuncionarios
//Crie uma classe CadastroFuncionarios que armazene informações de vários funcionários de uma empresa. Implemente métodos para adicionar funcionários, listar todos, e calcular a folha de pagamento total.


package atividades_extras;

import java.util.ArrayList;
import java.util.List;

public class CadastroFuncionarios {
    // Atributos
    private List<Funcionario> funcionarios;

    // Construtor
    public CadastroFuncionarios() {
        funcionarios = new ArrayList<>();
    }

    // Método para adicionar funcionários
    public void adicionarFuncionario(String nome, double salario) {
        funcionarios.add(new Funcionario(nome, salario));
    }

    // Método para listar todos os funcionários
    public void listarFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome() + ", Salário: " + f.getSalario());
        }
    }

    // Método para calcular a folha de pagamento total
    public double calcularFolhaPagamento() {
        double total = 0.0;
        for (Funcionario f : funcionarios) {
            total += f.getSalario();
        }
        return total;
    }

    // Classe interna Funcionario
    class Funcionario {
        private String nome;
        private double salario;

        public Funcionario(String nome, double salario) {
            this.nome = nome;
            this.salario = salario;
        }

        public String getNome() {
            return nome;
        }

        public double getSalario() {
            return salario;
        }
    }

    // Método principal (main)
    public static void main(String[] args) {
        CadastroFuncionarios cadastro = new CadastroFuncionarios();
        cadastro.adicionarFuncionario("João", 3000.0);
        cadastro.adicionarFuncionario("Maria", 4000.0);

        cadastro.listarFuncionarios();
        System.out.println("Total da folha de pagamento: R$" + cadastro.calcularFolhaPagamento());
    }

    /*
     * Comentário sobre SOLID:
     * - O SRP é parcialmente respeitado, já que a classe está lidando com o cadastro de funcionários.
     * - No entanto, o método "main" não deveria estar nesta classe. Ele deveria ser movido para outra classe
     *   que fosse responsável por executar o programa.
     */
}


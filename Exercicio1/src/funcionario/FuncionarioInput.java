package funcionario;

import java.util.Scanner;

public class FuncionarioInput {
    public static Funcionario criarFuncionario() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual seu nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Qual seu salário: ");
        double salario = sc.nextDouble();
        sc.nextLine(); // Limpa o buffer do nextDouble()

        System.out.println("Qual seu cargo: ");
        String cargo = sc.nextLine();

        return new Funcionario(nome, salario, cargo);
    }

    public static void definirDescontos(Funcionario funcionario) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu desconto (%): ");
        double desconto = sc.nextDouble();

        System.out.println("Qual o desconto extra: ");
        double descontoExtra = sc.nextDouble();

        funcionario.setDesconto(desconto);
        funcionario.setDescontoExtra(descontoExtra);
    }
}

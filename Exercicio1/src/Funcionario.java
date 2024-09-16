import java.util.Scanner;

public class Funcionario {
    String nome;
    Double salario;
    String Cargo;
    Double Desc;
    Double DescExtra;

    Scanner sc = new Scanner(System.in);
    
    public void Input() {

        System.out.println("Qual seu nome: ");
        nome = sc.nextLine();

        System.out.println("Qual seu salario ");
        salario = sc.nextDouble();
        sc.nextLine();

        System.out.println("Qual seu Cargo: ");
        Cargo = sc.nextLine();
    }

    public void DescontoBeneficio() {
        System.out.println("Qual seu Desconto: (%)");
        Desc = sc.nextDouble();

        System.out.println("Qual o Desconto Extra: ");
        DescExtra = sc.nextDouble();
    }

    public Double CalcularSalarioLiquido() {
        Double descontoTotal = salario * (Desc / 100) + DescExtra;
        return salario - descontoTotal;
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.Input();
        funcionario.DescontoBeneficio();

        System.out.println("Desconto Liquido: "+funcionario.CalcularSalarioLiquido());
    }

}

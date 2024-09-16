import java.util.Scanner;

public class ContaBancaria {

    private int NumeroDaConta;
    private String NomeDoTitular;
    private float Saldo;

    public void ArmazenarInfos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o Número da Conta?");
        NumeroDaConta = sc.nextInt();

        System.out.println("Qual o Nome do Titular?");
        sc.nextLine();  // Limpa o buffer do nextInt()
        NomeDoTitular = sc.nextLine();

        System.out.println("Qual o Saldo Inicial?");
        Saldo = sc.nextFloat();
    }

    public void Depositar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Deposite a quantidade desejada:");
        float valorDepositado = sc.nextFloat();
        Saldo += valorDepositado;

        System.out.println("Sua quantidade total agora é de: "+Saldo);
    }

    public void Sacar() {
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Digite o valor que deseja sacar:");
        float valorSaque = sc4.nextFloat();

        if(valorSaque <= Saldo) {
            Saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso. Saldo Atual: "+ Saldo);
        } else {
            System.out.println("Saldo Insuficiente. Saldo Atual: "+Saldo);
        }
    }

    public static void main(String[] args) {
        ContaBancaria contabancaria = new ContaBancaria();

        contabancaria.ArmazenarInfos();

        int result;

        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha 1 - Para Depositar ou 2 - Para Sacar");
        result = scan.nextInt();
        if (result == 1) {
            contabancaria.Depositar();
        } else if (result == 2) {
            contabancaria.Sacar();
        } else if (result == 3) {
            System.out.println("Programa Fechado");
        } else {
            System.out.println("Valor Invalido");
        }

        
    }
}

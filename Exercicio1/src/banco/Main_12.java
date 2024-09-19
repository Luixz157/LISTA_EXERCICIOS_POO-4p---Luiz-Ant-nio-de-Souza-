package banco;

import java.util.Scanner;

public class Main_12 {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("=== Bem-vindo ao Banco ===");

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Abrir Conta");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Transferir");
            System.out.println("6. Listar Clientes e Contas");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o CPF do cliente: ");
                    String cpf = scanner.nextLine();
                    banco.cadastrarCliente(nome, cpf);
                    break;

                case 2:
                    System.out.print("Digite o CPF do cliente para abrir a conta: ");
                    String cpfConta = scanner.nextLine();
                    banco.abrirConta(cpfConta);
                    break;

                case 3:
                    System.out.print("Digite o número da conta para depósito: ");
                    int contaDeposito = scanner.nextInt();
                    System.out.print("Digite o valor a depositar: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    banco.depositar(contaDeposito, valorDeposito);
                    break;

                case 4:
                    System.out.print("Digite o número da conta para saque: ");
                    int contaSaque = scanner.nextInt();
                    System.out.print("Digite o valor a sacar: R$ ");
                    double valorSaque = scanner.nextDouble();
                    banco.sacar(contaSaque, valorSaque);
                    break;

                case 5:
                    System.out.print("Digite o número da conta de origem: ");
                    int contaOrigem = scanner.nextInt();
                    System.out.print("Digite o número da conta de destino: ");
                    int contaDestino = scanner.nextInt();
                    System.out.print("Digite o valor a transferir: R$ ");
                    double valorTransferencia = scanner.nextDouble();
                    banco.transferir(contaOrigem, contaDestino, valorTransferencia);
                    break;

                case 6:
                    banco.listarClientesEContas();
                    break;

                case 0:
                    System.out.println("Encerrando o sistema. Obrigado!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}

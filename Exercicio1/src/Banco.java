import java.util.ArrayList;
import java.util.Scanner;

public class Banco {

    // Classe interna para representar um Cliente
    private class Cliente {
        private String nome;
        private String cpf;

        public Cliente(String nome, String cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }

        public String getNome() {
            return nome;
        }

        public String getCpf() {
            return cpf;
        }
    }

    // Classe interna para representar uma Conta Bancária
    private class ContaBancaria {
        private static int contadorContas = 1000; 
        private int numeroConta;
        private double saldo;
        private Cliente cliente;

        public ContaBancaria(Cliente cliente) {
            this.cliente = cliente;
            this.numeroConta = contadorContas++;
            this.saldo = 0.0;
        }

        public int getNumeroConta() {
            return numeroConta;
        }

        public double getSaldo() {
            return saldo;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public boolean sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                return true;
            }
            return false;
        }

        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
            }
        }


        public boolean transferir(ContaBancaria contaDestino, double valor) {
            if (sacar(valor)) {
                contaDestino.depositar(valor);
                return true;
            }
            return false;
        }
    }

    private ArrayList<Cliente> clientes;
    private ArrayList<ContaBancaria> contas;

 
    public Banco() {
        clientes = new ArrayList<>();
        contas = new ArrayList<>();
    }


    public void cadastrarCliente(String nome, String cpf) {

        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                System.out.println("CPF já cadastrado para o cliente: " + c.getNome());
                return;
            }
        }
        Cliente novoCliente = new Cliente(nome, cpf);
        clientes.add(novoCliente);
        System.out.println("Cliente " + nome + " cadastrado com sucesso.");
    }


    public void abrirConta(String cpf) {
        Cliente cliente = encontrarClientePorCPF(cpf);
        if (cliente == null) {
            System.out.println("Cliente com CPF " + cpf + " não encontrado.");
            return;
        }
        ContaBancaria novaConta = new ContaBancaria(cliente);
        contas.add(novaConta);
        System.out.println("Conta número " + novaConta.getNumeroConta() + " aberta para o cliente " + cliente.getNome());
    }

    public void depositar(int numeroConta, double valor) {
        ContaBancaria conta = encontrarConta(numeroConta);
        if (conta != null) {
            conta.depositar(valor);
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso na conta " + numeroConta);
        } else {
            System.out.println("Conta " + numeroConta + " não encontrada.");
        }
    }

    public void sacar(int numeroConta, double valor) {
        ContaBancaria conta = encontrarConta(numeroConta);
        if (conta != null) {
            if (conta.sacar(valor)) {
                System.out.println("Saque de R$ " + valor + " realizado com sucesso da conta " + numeroConta);
            } else {
                System.out.println("Saldo insuficiente na conta " + numeroConta);
            }
        } else {
            System.out.println("Conta " + numeroConta + " não encontrada.");
        }
    }

    public void transferir(int numeroContaOrigem, int numeroContaDestino, double valor) {
        ContaBancaria contaOrigem = encontrarConta(numeroContaOrigem);
        ContaBancaria contaDestino = encontrarConta(numeroContaDestino);

        if (contaOrigem == null) {
            System.out.println("Conta de origem " + numeroContaOrigem + " não encontrada.");
            return;
        }

        if (contaDestino == null) {
            System.out.println("Conta de destino " + numeroContaDestino + " não encontrada.");
            return;
        }

        if (contaOrigem.transferir(contaDestino, valor)) {
            System.out.println("Transferência de R$ " + valor + " da conta " + numeroContaOrigem + " para a conta " + numeroContaDestino + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente na conta " + numeroContaOrigem + " para realizar a transferência.");
        }
    }


    public void listarClientesEContas() {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada no banco.");
            return;
        }
        System.out.println("Clientes e suas contas no banco:");
        for (ContaBancaria conta : contas) {
            System.out.println("Cliente: " + conta.getCliente().getNome() + ", CPF: " + conta.getCliente().getCpf() +
                    ", Conta: " + conta.getNumeroConta() + ", Saldo: R$ " + String.format("%.2f", conta.getSaldo()));
        }
    }

    private Cliente encontrarClientePorCPF(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    private ContaBancaria encontrarConta(int numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

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

package banco;

import java.util.ArrayList;

public class Banco {
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
}

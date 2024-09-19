package banco;

import banco.interfaces.OperacoesConta;

public class ContaBancaria implements OperacoesConta {
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

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public boolean transferir(OperacoesConta contaDestino, double valor) {
        if (sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }
}

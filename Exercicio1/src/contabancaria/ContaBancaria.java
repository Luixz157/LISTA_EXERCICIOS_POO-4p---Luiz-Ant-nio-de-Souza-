package contabancaria;

import contabancaria.interfaces.OperacoesConta;

public class ContaBancaria implements OperacoesConta {
    private int numeroDaConta;
    private String nomeDoTitular;
    private float saldo;

    public ContaBancaria(int numeroDaConta, String nomeDoTitular, float saldoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    @Override
    public void sacar(float valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido. Saldo atual: " + saldo);
        }
    }

    // Getters e setters
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public float getSaldo() {
        return saldo;
    }
}

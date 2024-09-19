package contabancaria;

import java.util.Scanner;

public class ContaBancariaInput {
    public static ContaBancaria criarConta() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o Número da Conta?");
        int numeroDaConta = sc.nextInt();

        sc.nextLine(); // Limpa o buffer do nextInt()
        System.out.println("Qual o Nome do Titular?");
        String nomeDoTitular = sc.nextLine();

        System.out.println("Qual o Saldo Inicial?");
        float saldoInicial = sc.nextFloat();

        return new ContaBancaria(numeroDaConta, nomeDoTitular, saldoInicial);
    }

    public static float lerValor(String operacao) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor para " + operacao + ":");
        return sc.nextFloat();
    }
}

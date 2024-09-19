package contabancaria;

import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        // Criando a conta através da entrada de dados
        ContaBancaria contaBancaria = ContaBancariaInput.criarConta();

        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção: 1 - Depositar, 2 - Sacar, 3 - Sair");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    float valorDeposito = ContaBancariaInput.lerValor("depositar");
                    contaBancaria.depositar(valorDeposito);
                    break;

                case 2:
                    float valorSaque = ContaBancariaInput.lerValor("sacar");
                    contaBancaria.sacar(valorSaque);
                    break;

                case 3:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scan.close();
    }
}

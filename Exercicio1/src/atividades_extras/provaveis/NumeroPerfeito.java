package atividades_extras.provaveis;

import java.util.Scanner;

public class NumeroPerfeito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita um número para verificar se é perfeito
        System.out.println("Digite um número para verificar se é perfeito:");
        int numero = scanner.nextInt();
        int somaDivisores = 0;

        // Encontra os divisores do número (excluindo ele mesmo) e soma
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        // Verifica se a soma dos divisores é igual ao número
        if (somaDivisores == numero) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }
    }
}


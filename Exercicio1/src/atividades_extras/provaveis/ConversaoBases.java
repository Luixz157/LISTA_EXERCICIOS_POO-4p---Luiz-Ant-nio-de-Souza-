package atividades_extras.provaveis;

import java.util.Scanner;

public class ConversaoBases {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número decimal
        System.out.println("Digite um número decimal:");
        int decimal = scanner.nextInt();

        // Converte o número para binário e hexadecimal
        String binario = Integer.toBinaryString(decimal);
        String hexadecimal = Integer.toHexString(decimal);

        // Exibe as conversões
        System.out.println("O número em binário é: " + binario);
        System.out.println("O número em hexadecimal é: " + hexadecimal);
    }
}


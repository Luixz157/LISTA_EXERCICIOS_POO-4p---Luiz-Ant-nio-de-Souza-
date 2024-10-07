package atividades_extras.provaveis;

import java.util.Scanner;

public class DecimalParaHexadecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número decimal
        System.out.println("Digite um número decimal:");
        int decimal = scanner.nextInt();

        // Converte o número decimal para hexadecimal
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();

        // Exibe o resultado
        System.out.println("O número " + decimal + " em hexadecimal é: " + hexadecimal);
    }
}


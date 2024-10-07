package atividades_extras.provaveis;

import java.util.Scanner;

public class BinarioParaDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número binário como uma string
        System.out.println("Digite um número binário:");
        String binario = scanner.nextLine();

        // Converte o número binário para decimal
        int decimal = Integer.parseInt(binario, 2);

        // Exibe o número convertido
        System.out.println("O número binário " + binario + " em decimal é " + decimal);
    }
}

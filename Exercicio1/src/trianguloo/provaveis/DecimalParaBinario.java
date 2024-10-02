package trianguloo.provaveis;

import java.util.Scanner;

public class DecimalParaBinario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número decimal
        System.out.println("Digite um número decimal:");
        int decimal = scanner.nextInt();

        // Converte o número decimal para binário
        String binario = Integer.toBinaryString(decimal);

        // Exibe o resultado
        System.out.println("O número " + decimal + " em binário é: " + binario);
    }
}


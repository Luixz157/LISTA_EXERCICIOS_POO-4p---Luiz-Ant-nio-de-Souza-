package atividades_extras.provaveis;

import java.util.Scanner;

public class ContarLetras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a string
        System.out.println("Digite uma string:");
        String string = scanner.nextLine();

        int contadorLetras = 0;

        // Conta apenas as letras (ignorando espaços e caracteres especiais)
        for (char c : string.toCharArray()) {
            if (Character.isLetter(c)) {
                contadorLetras++;
            }
        }

        // Exibe a contagem de letras
        System.out.println("Número de letras na string: " + contadorLetras);
    }
}


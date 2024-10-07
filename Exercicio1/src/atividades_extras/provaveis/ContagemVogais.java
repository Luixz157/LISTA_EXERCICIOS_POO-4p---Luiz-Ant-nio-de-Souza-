package atividades_extras.provaveis;

import java.util.Scanner;

public class ContagemVogais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a string
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine().toLowerCase();

        int contagemVogais = 0;

        // Conta o número de vogais
        for (char c : frase.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contagemVogais++;
            }
        }

        // Exibe o resultado
        System.out.println("Número de vogais: " + contagemVogais);
    }
}


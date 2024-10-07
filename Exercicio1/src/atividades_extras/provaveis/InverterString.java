package atividades_extras.provaveis;

import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a string
        System.out.println("Digite uma string:");
        String original = scanner.nextLine();

        // Inverte a string
        String invertida = new StringBuilder(original).reverse().toString();

        // Exibe a string invertida
        System.out.println("String invertida: " + invertida);
    }
}


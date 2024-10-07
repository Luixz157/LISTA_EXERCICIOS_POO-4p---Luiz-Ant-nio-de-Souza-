package atividades_extras.provaveis;

import java.util.Scanner;

public class CompararStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as duas strings
        System.out.println("Digite a primeira string:");
        String string1 = scanner.nextLine();
        System.out.println("Digite a segunda string:");
        String string2 = scanner.nextLine();

        // Compara as strings e exibe se são iguais ou diferentes
        if (string1.equals(string2)) {
            System.out.println("As strings são iguais.");
        } else {
            System.out.println("As strings são diferentes.");
        }
    }
}


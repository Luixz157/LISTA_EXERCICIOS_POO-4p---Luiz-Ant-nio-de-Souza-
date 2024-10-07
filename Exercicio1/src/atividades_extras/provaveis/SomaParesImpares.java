package atividades_extras.provaveis;

import java.util.Scanner;

public class SomaParesImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a quantidade de números
        System.out.println("Quantos números você deseja inserir?");
        int n = scanner.nextInt();
        int somaPares = 0, somaImpares = 0;

        // Recebe os números e soma separadamente os pares e ímpares
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                somaPares += num;  // Soma números pares
            } else {
                somaImpares += num;  // Soma números ímpares
            }
        }

        // Exibe as somas
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);
    }
}


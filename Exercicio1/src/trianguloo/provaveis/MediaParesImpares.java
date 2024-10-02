package trianguloo.provaveis;

import java.util.Scanner;

public class MediaParesImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a quantidade de números
        System.out.println("Quantos números você deseja inserir?");
        int n = scanner.nextInt();
        int somaPares = 0, somaImpares = 0, contagemPares = 0, contagemImpares = 0;

        // Recebe os números e soma separadamente os pares e ímpares
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                somaPares += num;
                contagemPares++;
            } else {
                somaImpares += num;
                contagemImpares++;
            }
        }

        // Calcula e exibe as médias
        if (contagemPares > 0) {
            System.out.println("Média dos números pares: " + (somaPares / contagemPares));
        } else {
            System.out.println("Nenhum número par foi inserido.");
        }

        if (contagemImpares > 0) {
            System.out.println("Média dos números ímpares: " + (somaImpares / contagemImpares));
        } else {
            System.out.println("Nenhum número ímpar foi inserido.");
        }
    }
}

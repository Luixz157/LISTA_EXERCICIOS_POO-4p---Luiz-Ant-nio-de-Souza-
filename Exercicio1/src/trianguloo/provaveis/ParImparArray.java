package trianguloo.provaveis;

import java.util.Scanner;

public class ParImparArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o tamanho do array
        System.out.println("Quantos números você deseja inserir no array?");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        int pares = 0, impares = 0;

        // Recebe os números e conta quantos são pares e quantos são ímpares
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;  // Incrementa a contagem de pares
            } else {
                impares++;  // Incrementa a contagem de ímpares
            }
        }

        // Exibe o total de números pares e ímpares
        System.out.println("Total de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);
    }
}


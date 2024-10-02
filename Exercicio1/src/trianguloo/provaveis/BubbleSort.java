package trianguloo.provaveis;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a quantidade de números a serem ordenados
        System.out.println("Quantos números você deseja ordenar?");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        // Recebe os números do usuário
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        // Implementação do algoritmo de ordenação Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Troca os números se estiverem fora de ordem
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Exibe os números ordenados
        System.out.println("Números ordenados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}


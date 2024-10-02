package trianguloo.provaveis;

import java.util.Scanner;
import java.util.Arrays;

public class BuscaBinaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número de elementos no array
        System.out.println("Quantos números você deseja inserir?");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        // Recebe os números e armazena no array
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        // Ordena o array para usar a busca binária
        Arrays.sort(numeros);

        // Solicita o número que o usuário deseja buscar
        System.out.println("Digite o número que deseja buscar:");
        int chave = scanner.nextInt();

        // Implementa a busca binária
        int resultado = Arrays.binarySearch(numeros, chave);

        // Exibe o resultado da busca
        if (resultado >= 0) {
            System.out.println("Número encontrado na posição " + resultado);
        } else {
            System.out.println("Número não encontrado.");
        }
    }
}


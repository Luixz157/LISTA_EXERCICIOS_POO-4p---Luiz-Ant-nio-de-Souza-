package trianguloo.provaveis;

import java.util.Scanner;

public class SomaMatrizes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário as dimensões da matriz
        System.out.println("Digite o número de linhas da matriz:");
        int linhas = scanner.nextInt();
        System.out.println("Digite o número de colunas da matriz:");
        int colunas = scanner.nextInt();

        int[][] matrizA = new int[linhas][colunas];
        int[][] matrizB = new int[linhas][colunas];
        int[][] matrizSoma = new int[linhas][colunas];

        // Preenche a matriz A
        System.out.println("Digite os elementos da Matriz A:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Preenche a matriz B
        System.out.println("Digite os elementos da Matriz B:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Soma as matrizes A e B
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Exibe a matriz resultante da soma
        System.out.println("Matriz resultante da soma:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matrizSoma[i][j] + " ");
            }
            System.out.println();
        }
    }
}


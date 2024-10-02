package trianguloo.provaveis;

import java.util.Scanner;

public class MultiplicacaoMatrizes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as dimensões das matrizes
        System.out.println("Digite o número de linhas da matriz A:");
        int linhasA = scanner.nextInt();
        System.out.println("Digite o número de colunas da matriz A (e linhas da matriz B):");
        int colunasA = scanner.nextInt();
        System.out.println("Digite o número de colunas da matriz B:");
        int colunasB = scanner.nextInt();

        int[][] matrizA = new int[linhasA][colunasA];
        int[][] matrizB = new int[colunasA][colunasB];
        int[][] matrizResultado = new int[linhasA][colunasB];

        // Preenche a matriz A
        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Preenche a matriz B
        System.out.println("Digite os elementos da matriz B:");
        for (int i = 0; i < colunasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Multiplica as matrizes A e B
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    matrizResultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Exibe a matriz resultante
        System.out.println("Resultado da multiplicação:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}


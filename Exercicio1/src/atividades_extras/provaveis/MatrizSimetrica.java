package atividades_extras.provaveis;

import java.util.Scanner;

public class MatrizSimetrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a ordem da matriz quadrada
        System.out.println("Digite a ordem da matriz quadrada:");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        // Preenche a matriz
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Verifica se a matriz é simétrica
        boolean simetrica = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {  // Verifica apenas a metade inferior
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }

        // Exibe o resultado
        if (simetrica) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }
    }
}

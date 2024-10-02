package trianguloo.provaveis;

import java.util.Scanner;

public class SomaMatriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o tamanho da matriz
        System.out.println("Digite o número de linhas:");
        int linhas = scanner.nextInt();
        System.out.println("Digite o número de colunas:");
        int colunas = scanner.nextInt();
        int[][] matriz = new int[linhas][colunas];
        int soma = 0;

        // Preenche a matriz e calcula a soma
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
        }

        // Exibe a soma dos elementos
        System.out.println("A soma de todos os elementos da matriz é: " + soma);
    }
}


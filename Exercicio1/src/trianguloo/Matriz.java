//Classe Matriz
//Implemente uma classe chamada Matriz que permita a criação de matrizes 2D. Adicione métodos para preencher a matriz, calcular a soma de seus elementos e exibir a matriz.


package trianguloo;

import java.util.Scanner;

public class Matriz {
    // Atributo da matriz 2D
    private int[][] matriz;

    // Construtor
    public Matriz(int linhas, int colunas) {
        matriz = new int[linhas][colunas];
    }

    // Método para preencher a matriz
    public void preencherMatriz() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite o valor para [" + i + "][" + j + "]:");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para calcular a soma dos elementos
    public int calcularSoma() {
        int soma = 0;
        for (int[] linha : matriz) {
            for (int valor : linha) {
                soma += valor;
            }
        }
        return soma;
    }

    // Método para exibir a matriz
    public void exibirMatriz() {
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    // Método principal (main)
    public static void main(String[] args) {
        Matriz matriz = new Matriz(2, 3);  // Exemplo: matriz 2x3
        matriz.preencherMatriz();
        matriz.exibirMatriz();
        System.out.println("Soma dos elementos: " + matriz.calcularSoma());
    }

    /*
     * Comentário sobre SOLID:
     * - A lógica está adequada para a manipulação de matrizes.
     * - O método "main" não deveria estar nesta classe, pois não é responsabilidade dela
     *   gerenciar a execução do código. Para seguir o SRP, ele deve ser separado.
     */
}


package trianguloo.provaveis;

import java.util.Scanner;

public class VerificaSudoku {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] sudoku = new int[9][9];

        // Solicita ao usuário os números do tabuleiro de Sudoku
        System.out.println("Digite o tabuleiro de Sudoku:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = scanner.nextInt();
            }
        }

        // Verifica se as linhas, colunas e blocos 3x3 são válidos
        if (verificaLinhas(sudoku) && verificaColunas(sudoku) && verificaBlocos(sudoku)) {
            System.out.println("Sudoku válido.");
        } else {
            System.out.println("Sudoku inválido.");
        }
    }

    // Verifica se todas as linhas são válidas
    public static boolean verificaLinhas(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            boolean[] visto = new boolean[9];
            for (int j = 0; j < 9; j++) {
                int num = sudoku[i][j] - 1;
                if (num < 0 || visto[num]) {
                    return false;
                }
                visto[num] = true;
            }
        }
        return true;
    }

    // Verifica se todas as colunas são válidas
    public static boolean verificaColunas(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            boolean[] visto = new boolean[9];
            for (int j = 0; j < 9; j++) {
                int num = sudoku[j][i] - 1;
                if (num < 0 || visto[num]) {
                    return false;
                }
                visto[num] = true;
            }
        }
        return true;
    }

    // Verifica se todos os blocos 3x3 são válidos
    public static boolean verificaBlocos(int[][] sudoku) {
        for (int linha = 0; linha < 9; linha += 3) {
            for (int coluna = 0; coluna < 9; coluna += 3) {
                boolean[] visto = new boolean[9];
                for (int i = linha; i < linha + 3; i++) {
                    for (int j = coluna; j < coluna + 3; j++) {
                        int num = sudoku[i][j] - 1;
                        if (num < 0 || visto[num]) {
                            return false;
                        }
                        visto[num] = true;
                    }
                }
            }
        }
        return true;
    }
}

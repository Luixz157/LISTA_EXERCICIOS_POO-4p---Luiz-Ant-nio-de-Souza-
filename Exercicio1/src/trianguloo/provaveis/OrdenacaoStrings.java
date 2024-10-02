package trianguloo.provaveis;

import java.util.Scanner;
import java.util.Arrays;

public class OrdenacaoStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de strings
        System.out.println("Quantas palavras você deseja ordenar?");
        int n = scanner.nextInt();
        scanner.nextLine();  // Limpa o buffer

        String[] palavras = new String[n];

        // Recebe as strings do usuário
        for (int i = 0; i < n; i++) {
            System.out.println("Digite a palavra " + (i + 1) + ":");
            palavras[i] = scanner.nextLine();
        }

        // Ordena as strings em ordem alfabética
        Arrays.sort(palavras);

        // Exibe as strings ordenadas
        System.out.println("Palavras ordenadas:");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}


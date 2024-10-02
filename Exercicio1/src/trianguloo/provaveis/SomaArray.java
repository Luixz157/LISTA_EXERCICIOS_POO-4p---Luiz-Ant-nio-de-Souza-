package trianguloo.provaveis;

import java.util.Scanner;

public class SomaArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o tamanho do array
        System.out.println("Quantos números você deseja inserir no array?");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        int soma = 0;

        // Recebe os números do usuário e calcula a soma
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];  // Soma cada número ao total
        }

        // Exibe a soma dos elementos
        System.out.println("A soma dos números no array é: " + soma);
    }
}


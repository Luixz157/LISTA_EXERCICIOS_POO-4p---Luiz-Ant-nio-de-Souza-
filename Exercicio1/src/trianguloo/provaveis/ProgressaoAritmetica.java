package trianguloo.provaveis;

import java.util.Scanner;

public class ProgressaoAritmetica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o primeiro termo, a razão e o número de termos da PA
        System.out.println("Digite o primeiro termo da PA:");
        int primeiroTermo = scanner.nextInt();
        System.out.println("Digite a razão da PA:");
        int razao = scanner.nextInt();
        System.out.println("Digite o número de termos da PA:");
        int n = scanner.nextInt();

        // Calcula e exibe os termos da PA
        System.out.println("Progressão Aritmética:");
        for (int i = 0; i < n; i++) {
            System.out.print(primeiroTermo + (i * razao) + " ");
        }
    }
}


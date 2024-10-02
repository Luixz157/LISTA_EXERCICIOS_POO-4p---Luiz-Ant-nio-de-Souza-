package trianguloo.provaveis;

import java.util.Scanner;

public class NumeroTriangular {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número
        System.out.println("Digite um número para verificar se é triangular:");
        int numero = scanner.nextInt();

        int soma = 0;
        int n = 1;

        // Calcula a soma dos primeiros números naturais
        while (soma < numero) {
            soma += n;
            n++;
        }

        // Verifica se o número é triangular
        if (soma == numero) {
            System.out.println(numero + " é um número triangular.");
        } else {
            System.out.println(numero + " não é um número triangular.");
        }
    }
}


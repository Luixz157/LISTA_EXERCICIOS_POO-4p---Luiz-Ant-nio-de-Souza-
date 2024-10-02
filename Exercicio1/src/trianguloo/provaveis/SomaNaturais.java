package trianguloo.provaveis;

import java.util.Scanner;

public class SomaNaturais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o valor de N
        System.out.println("Digite um número N:");
        int n = scanner.nextInt();
        int soma = 0;

        // Calcula a soma dos números de 1 até N
        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        // Exibe o resultado
        System.out.println("A soma dos números naturais até " + n + " é: " + soma);
    }
}


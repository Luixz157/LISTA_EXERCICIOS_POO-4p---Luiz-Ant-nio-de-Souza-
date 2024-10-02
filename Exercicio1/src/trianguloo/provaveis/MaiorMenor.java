package trianguloo.provaveis;

import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a quantidade de números
        System.out.println("Quantos números você deseja inserir?");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        // Recebe os números do usuário
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        // Inicializa maior e menor com o primeiro número do array
        int maior = numeros[0];
        int menor = numeros[0];

        // Percorre o array para encontrar o maior e o menor número
        for (int i = 1; i < n; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Exibe o maior e o menor número
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}


package trianguloo.provaveis;

import java.util.Scanner;

public class ListaOrdenada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o tamanho da lista
        System.out.println("Quantos números você deseja inserir?");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        // Recebe os números do usuário
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        // Verifica se a lista está ordenada em ordem crescente
        boolean estaOrdenada = true;
        for (int i = 0; i < n - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                estaOrdenada = false;
                break;
            }
        }

        // Exibe o resultado
        if (estaOrdenada) {
            System.out.println("A lista está ordenada.");
        } else {
            System.out.println("A lista não está ordenada.");
        }
    }
}


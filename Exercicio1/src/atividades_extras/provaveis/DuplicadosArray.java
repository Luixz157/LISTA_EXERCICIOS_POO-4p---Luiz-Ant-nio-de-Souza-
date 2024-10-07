package atividades_extras.provaveis;

import java.util.Scanner;
import java.util.HashSet;

public class DuplicadosArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número de elementos no array
        System.out.println("Quantos números você deseja inserir?");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        // Recebe os números e armazena no array
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        // Usa um HashSet para verificar duplicatas
        HashSet<Integer> conjunto = new HashSet<>();
        boolean duplicado = false;

        // Verifica se há duplicados no array
        for (int num : numeros) {
            if (!conjunto.add(num)) {
                System.out.println("Número duplicado encontrado: " + num);
                duplicado = true;
            }
        }

        // Se não houver duplicados, exibe uma mensagem
        if (!duplicado) {
            System.out.println("Nenhum número duplicado encontrado.");
        }
    }
}


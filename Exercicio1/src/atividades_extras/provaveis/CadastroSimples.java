package atividades_extras.provaveis;

import java.util.Scanner;

public class CadastroSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];  // Lista simples para armazenar 5 nomes

        // Recebe os nomes para cadastro
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            nomes[i] = scanner.nextLine();
        }

        // Exibe os nomes cadastrados
        System.out.println("Nomes cadastrados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}


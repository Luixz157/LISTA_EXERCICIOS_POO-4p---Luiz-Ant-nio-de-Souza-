package atividades_extras.provaveis;

import java.util.Scanner;

public class MediaNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos números você deseja inserir?");
        int n = scanner.nextInt();
        double soma = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número " + (i+1) + ":");
            double num = scanner.nextDouble();
            soma += num;
        }
        
        double media = soma / n;
        System.out.println("A média dos números é: " + media);
    }
}


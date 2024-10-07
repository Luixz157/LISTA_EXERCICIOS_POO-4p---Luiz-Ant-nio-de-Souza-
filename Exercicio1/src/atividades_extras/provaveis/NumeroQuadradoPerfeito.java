package atividades_extras.provaveis;

import java.util.Scanner;

public class NumeroQuadradoPerfeito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número
        System.out.println("Digite um número para verificar se é um quadrado perfeito:");
        int numero = scanner.nextInt();

        // Verifica se o número é um quadrado perfeito
        int raizQuadrada = (int) Math.sqrt(numero);
        if (raizQuadrada * raizQuadrada == numero) {
            System.out.println(numero + " é um quadrado perfeito.");
        } else {
            System.out.println(numero + " não é um quadrado perfeito.");
        }
    }
}

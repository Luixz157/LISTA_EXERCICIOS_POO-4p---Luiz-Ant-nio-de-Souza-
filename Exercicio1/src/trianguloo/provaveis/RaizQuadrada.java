package trianguloo.provaveis;

import java.util.Scanner;

public class RaizQuadrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número para calcular a raiz quadrada
        System.out.println("Digite um número para calcular a raiz quadrada:");
        double numero = scanner.nextDouble();
        double raiz = numero;
        double erro = 0.00001;  // Precisão desejada

        // Usa o método de Newton para aproximar a raiz quadrada
        while ((raiz - numero / raiz) > erro) {
            raiz = (raiz + numero / raiz) / 2;
        }

        // Exibe o resultado
        System.out.println("A raiz quadrada de " + numero + " é aproximadamente: " + raiz);
    }
}


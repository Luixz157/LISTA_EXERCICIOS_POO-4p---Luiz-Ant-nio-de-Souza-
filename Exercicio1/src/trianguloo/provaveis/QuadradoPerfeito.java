package trianguloo.provaveis;

import java.util.Scanner;

public class QuadradoPerfeito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        // Calcula a raiz quadrada do número
        int raiz = (int) Math.sqrt(numero);

        // Verifica se o número é um quadrado perfeito
        if (raiz * raiz == numero) {
            System.out.println(numero + " é um quadrado perfeito.");
        } else {
            System.out.println(numero + " não é um quadrado perfeito.");
        }
    }
}

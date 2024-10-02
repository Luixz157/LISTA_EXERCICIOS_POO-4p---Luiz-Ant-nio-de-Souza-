package trianguloo.provaveis;

import java.util.Scanner;

public class ConversorMoedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taxas de conversão
        double taxaDolarParaReal = 5.40;
        double taxaEuroParaReal = 6.35;

        System.out.println("Escolha a moeda de origem: 1 - Dólar, 2 - Euro");
        int escolha = scanner.nextInt();

        System.out.println("Digite o valor a ser convertido:");
        double valor = scanner.nextDouble();
        double convertido = 0;

        // Realiza a conversão
        if (escolha == 1) {
            convertido = valor * taxaDolarParaReal;
            System.out.println(valor + " dólares é equivalente a " + convertido + " reais.");
        } else if (escolha == 2) {
            convertido = valor * taxaEuroParaReal;
            System.out.println(valor + " euros é equivalente a " + convertido + " reais.");
        } else {
            System.out.println("Escolha inválida.");
        }
    }
}


package trianguloo.provaveis;

import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a temperatura em Celsius
        System.out.println("Digite a temperatura em Celsius:");
        double celsius = scanner.nextDouble();

        // Converte para Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Exibe o resultado da conversão
        System.out.println(celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit.");
    }
}


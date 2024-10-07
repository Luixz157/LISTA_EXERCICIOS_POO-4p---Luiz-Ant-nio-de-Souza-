package atividades_extras.provaveis;

import java.util.Scanner;

public class ConversaoTemperaturaAvancada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a temperatura em Celsius
        System.out.println("Digite a temperatura em Celsius:");
        double celsius = scanner.nextDouble();

        // Converte para Fahrenheit e Kelvin
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Exibe as conversões
        System.out.println(celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit.");
        System.out.println(celsius + " graus Celsius equivalem a " + kelvin + " graus Kelvin.");
    }
}


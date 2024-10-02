package trianguloo.provaveis;

import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário peso e altura
        System.out.println("Digite o seu peso (kg):");
        double peso = scanner.nextDouble();
        System.out.println("Digite a sua altura (metros):");
        double altura = scanner.nextDouble();

        // Calcula o IMC
        double imc = peso / (altura * altura);

        // Exibe o IMC e a classificação
        System.out.println("Seu IMC é: " + imc);
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }
    }
}


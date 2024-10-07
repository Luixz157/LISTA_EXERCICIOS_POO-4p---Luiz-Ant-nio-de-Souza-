package atividades_extras.provaveis;

import java.util.Scanner;

public class JurosCompostos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os valores ao usuário
        System.out.println("Digite o valor principal (P):");
        double principal = scanner.nextDouble();
        System.out.println("Digite a taxa de juros (r) em porcentagem:");
        double taxa = scanner.nextDouble() / 100;
        System.out.println("Digite o número de períodos (n):");
        int periodos = scanner.nextInt();

        // Calcula o montante final usando a fórmula de juros compostos
        double montante = principal * Math.pow((1 + taxa), periodos);

        // Exibe o montante final
        System.out.println("O montante final após " + periodos + " períodos é: R$" + montante);
    }
}


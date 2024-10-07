package atividades_extras.provaveis;

import java.util.Scanner;

public class ContagemRegressiva {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor inicial da contagem regressiva
        System.out.println("Digite o número inicial da contagem regressiva:");
        int numero = scanner.nextInt();

        // Realiza a contagem regressiva
        while (numero > 0) {
            System.out.println(numero);
            Thread.sleep(1000);  // Pausa de 1 segundo
            numero--;
        }

        // Exibe mensagem ao final
        System.out.println("Fim da contagem regressiva!");
    }
}


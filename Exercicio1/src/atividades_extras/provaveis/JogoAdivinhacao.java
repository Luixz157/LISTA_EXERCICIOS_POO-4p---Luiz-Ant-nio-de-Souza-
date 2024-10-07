package atividades_extras.provaveis;

import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gera um número aleatório entre 1 e 100
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite = 0;

        System.out.println("Adivinhe o número secreto (entre 1 e 100):");

        // O jogo continua até o usuário acertar o número secreto
        while (palpite != numeroSecreto) {
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O número é maior!");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número é menor!");
            }
        }

        // Informa o número de tentativas que o usuário fez até acertar
        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
    }
}


package atividades_extras.provaveis;

import java.util.Scanner;
import java.util.Random;

public class PedraPapelTesoura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        // Solicita ao usuário sua escolha
        System.out.println("Escolha: 0 - Pedra, 1 - Papel, 2 - Tesoura");
        int escolhaUsuario = scanner.nextInt();

        // Gera a escolha do computador
        int escolhaComputador = random.nextInt(3);

        // Exibe as escolhas
        System.out.println("Você escolheu: " + opcoes[escolhaUsuario]);
        System.out.println("Computador escolheu: " + opcoes[escolhaComputador]);

        // Determina o resultado
        if (escolhaUsuario == escolhaComputador) {
            System.out.println("Empate!");
        } else if ((escolhaUsuario == 0 && escolhaComputador == 2) || 
                   (escolhaUsuario == 1 && escolhaComputador == 0) || 
                   (escolhaUsuario == 2 && escolhaComputador == 1)) {
            System.out.println("Você ganhou!");
        } else {
            System.out.println("Você perdeu!");
        }
    }
}


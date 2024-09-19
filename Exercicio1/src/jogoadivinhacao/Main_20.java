package jogoadivinhacao;

import java.util.Scanner;

public class Main_20 {
    public static void main(String[] args) {
        JogoAdivinhacao jogo = new JogoAdivinhacao();
        Scanner scanner = new Scanner(System.in);
        int palpite;

        System.out.println("Bem-vindo ao Jogo de Adivinhação! Tente adivinhar o número entre 1 e 100.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            jogo.fazerPalpite(palpite);
        } while (!jogo.isPalpiteCorreto(palpite));

        scanner.close();
    }
}

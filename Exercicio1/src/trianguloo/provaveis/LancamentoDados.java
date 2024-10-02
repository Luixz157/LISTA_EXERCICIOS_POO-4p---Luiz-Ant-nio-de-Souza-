package trianguloo.provaveis;

import java.util.Random;

public class LancamentoDados {

    public static void main(String[] args) {
        Random random = new Random();

        // Simula o lançamento de dois dados
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;

        // Exibe os resultados dos dois dados
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Soma: " + (dado1 + dado2));
    }
}


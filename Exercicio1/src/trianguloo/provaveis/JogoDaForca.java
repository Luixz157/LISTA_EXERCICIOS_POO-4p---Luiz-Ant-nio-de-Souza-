package trianguloo.provaveis;

import java.util.Scanner;

public class JogoDaForca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define a palavra secreta
        String palavraSecreta = "java";
        char[] palavraOculta = new char[palavraSecreta.length()];

        // Inicializa a palavra oculta com sublinhados
        for (int i = 0; i < palavraSecreta.length(); i++) {
            palavraOculta[i] = '_';
        }

        int tentativasRestantes = 6;
        boolean palavraAdivinhada = false;

        // Inicia o jogo
        while (tentativasRestantes > 0 && !palavraAdivinhada) {
            System.out.println("Palavra: " + String.valueOf(palavraOculta));
            System.out.println("Tentativas restantes: " + tentativasRestantes);
            System.out.println("Digite uma letra:");

            char palpite = scanner.next().charAt(0);
            boolean acerto = false;

            // Verifica se a letra está na palavra secreta
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == palpite) {
                    palavraOculta[i] = palpite;
                    acerto = true;
                }
            }

            if (!acerto) {
                tentativasRestantes--;
            }

            // Verifica se a palavra foi completamente adivinhada
            palavraAdivinhada = String.valueOf(palavraOculta).equals(palavraSecreta);
        }

        // Resultado final
        if (palavraAdivinhada) {
            System.out.println("Parabéns! Você adivinhou a palavra: " + palavraSecreta);
        } else {
            System.out.println("Você perdeu! A palavra era: " + palavraSecreta);
        }
    }
}


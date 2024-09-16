import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    private int numeroSecreto;
    private Random random;
    public int tentativa = 0;

    public JogoAdivinhacao() {
        random = new Random();
        numeroSecreto = random.nextInt(100) + 1; // Número entre 1 e 100
    }

    public void fazerPalpite(int palpite) {
        if (palpite == numeroSecreto) {
            System.out.println("Parabéns! Você acertou o número.");
            System.out.println("Quantidade de Tentativas: "+ tentativa);
        } else if (palpite < numeroSecreto) {
            System.out.println("O número é maior.");
        } else {
            System.out.println("O número é menor.");
        }
    }

    public static void main(String[] args) {
        JogoAdivinhacao jogo = new JogoAdivinhacao();
        Scanner scanner = new Scanner(System.in);
        int palpite;

        System.out.println("Bem-vindo ao Jogo de Adivinhação! Tente adivinhar o número entre 1 e 100.");

        do {
            jogo.tentativa = jogo.tentativa + 1;
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            jogo.fazerPalpite(palpite);
        } while (palpite != jogo.numeroSecreto);

        scanner.close();
    }
}

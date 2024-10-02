package trianguloo.provaveis;

import java.util.Random;
import java.util.Scanner;

public class GerarAleatorios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Solicita os limites do intervalo
        System.out.println("Digite o limite inferior do intervalo:");
        int limiteInferior = scanner.nextInt();
        System.out.println("Digite o limite superior do intervalo:");
        int limiteSuperior = scanner.nextInt();

        // Gera um número aleatório dentro do intervalo
        int numeroAleatorio = random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;

        // Exibe o número aleatório gerado
        System.out.println("Número aleatório gerado: " + numeroAleatorio);
    }
}


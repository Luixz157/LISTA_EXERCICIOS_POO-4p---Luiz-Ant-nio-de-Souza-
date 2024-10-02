package trianguloo.provaveis;

import java.util.Scanner;

public class DistanciaManhattan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as coordenadas dos dois pontos
        System.out.println("Digite as coordenadas do primeiro ponto (x1, y1):");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Digite as coordenadas do segundo ponto (x2, y2):");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // Calcula a distância de Manhattan
        int distancia = Math.abs(x1 - x2) + Math.abs(y1 - y2);

        // Exibe o resultado
        System.out.println("A distância de Manhattan entre os pontos é: " + distancia);
    }
}


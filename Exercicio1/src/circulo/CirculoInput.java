package circulo;

import java.util.Scanner;

public class CirculoInput {
    public static float lerRaio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor do raio?");
        float raio = sc.nextFloat();
        sc.close(); // Fechar o Scanner
        return raio;
    }
}

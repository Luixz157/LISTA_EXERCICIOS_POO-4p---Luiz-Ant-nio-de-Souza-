package triangulo;

import java.util.Scanner;

public class Main_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do lado A: ");
        int valorA = scan.nextInt();
        
        System.out.println("Informe o valor do lado B: ");
        int valorB = scan.nextInt();

        System.out.println("Informe o valor do lado C: ");
        int valorC = scan.nextInt();

        // Criando o objeto Triangulo
        Triangulo triangulo = new Triangulo(valorA, valorB, valorC);

        // Verificando se é um triângulo e qual tipo
        System.out.println(triangulo.getTipoTriangulo());

        scan.close();
    }
}

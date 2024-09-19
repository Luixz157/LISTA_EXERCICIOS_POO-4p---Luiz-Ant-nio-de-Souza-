package retangulo;

import java.util.Scanner;

public class Main_3 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor da Largura: ");
        float largura = scan.nextFloat();

        System.out.println("Qual o valor da Altura: ");
        float altura = scan.nextFloat();

        // Criando um objeto Retangulo
        Retangulo retangulo = new Retangulo(largura, altura);

        // Calculando e exibindo os resultados
        System.out.println("O cálculo da área do retângulo com altura " + retangulo.getAltura() + " e largura " + retangulo.getLargura() + " = " + retangulo.calcularArea());
        System.out.println("O cálculo do perímetro do retângulo com altura " + retangulo.getAltura() + " e largura " + retangulo.getLargura() + " = " + retangulo.calcularPerimetro());
        
        scan.close();
    }
}

import java.util.Scanner;

public class Retangulo {
    float largura;
    float altura;

    public void ArmazenarRectangle() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual o valor da Largura: ");
        largura = scan.nextFloat();

        System.out.println("Qual o valor da altura: ");
        altura = scan.nextFloat();
    }

    public float CalcularAreaRetangulo() {
        return largura * altura;
    }

    public float CalcularPerimetroRetangulo() {
        return 2 * (altura + largura);
    }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.ArmazenarRectangle();

        System.out.println("O calculo da Area do Retangulo de "+ retangulo.altura + " e " + retangulo.largura + " = " + retangulo.CalcularAreaRetangulo());
        System.out.println("O calculo da Area do Retangulo de "+ retangulo.altura + " e " + retangulo.largura + " = " + retangulo.CalcularPerimetroRetangulo());
    }
}

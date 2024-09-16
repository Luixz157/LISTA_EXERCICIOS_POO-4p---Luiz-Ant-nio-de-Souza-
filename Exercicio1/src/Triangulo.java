import java.util.Scanner;

public class Triangulo {
    int valorA;
    int valorB;
    int valorC;

    Scanner scan = new Scanner(System.in);
    public void InputArmazenar() {
        System.out.println("Qual valorA: ");
        valorA = scan.nextInt();
        System.out.println("Qual valorB: ");
        valorB = scan.nextInt();
        System.out.println("Qual valorC: ");
        valorC = scan.nextInt();
    }

    public void VerificarTriangulo(int val1, int val2, int val3) {
        int test1 = val1 + val2;
        int test2 = val1 + val3;
        int test3 = val2 + val3;
        if (test1 < val3) {
            System.out.println("ÉH Triangulo");
        } else if (test2 < val2) {
            System.out.println("ÉH Triangulo");
        } else if (test3 < val1) {
            System.out.println("ÉH Triangulo");
        } else {
            System.out.println("NÃO TRIANGULO");
        }
    }

    public static void main(String[] args) {
        Triangulo triangle = new Triangulo();

        triangle.InputArmazenar();
        triangle.VerificarTriangulo(triangle.valorA, triangle.valorB, triangle.valorC);
    }
}

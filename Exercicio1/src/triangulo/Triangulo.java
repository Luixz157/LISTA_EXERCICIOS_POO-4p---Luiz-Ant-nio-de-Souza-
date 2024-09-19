package triangulo;

public class Triangulo {
    private int valorA;
    private int valorB;
    private int valorC;

    public Triangulo(int valorA, int valorB, int valorC) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.valorC = valorC;
    }

    public boolean isTriangulo() {
        return (valorA + valorB > valorC) && (valorA + valorC > valorB) && (valorB + valorC > valorA);
    }

    public String getTipoTriangulo() {
        if (!isTriangulo()) {
            return "Não é um triângulo";
        } else if (valorA == valorB && valorB == valorC) {
            return "Triângulo Equilátero";
        } else if (valorA == valorB || valorA == valorC || valorB == valorC) {
            return "Triângulo Isósceles";
        } else {
            return "Triângulo Escaleno";
        }
    }
}

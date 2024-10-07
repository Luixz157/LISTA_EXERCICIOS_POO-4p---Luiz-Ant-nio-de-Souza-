//Classe Calculadora
//Crie uma classe chamada Calculadora que possua métodos para realizar as operações básicas (soma, subtração, multiplicação, divisão). Adicione também um método para calcular a raiz quadrada e um para calcular a potência de dois números.

package atividades_extras;

public class Calculadora {
    // Métodos para operações básicas
    public double soma(double a, double b) {
        return a + b;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double divisao(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida.");
        }
        return a / b;
    }

    // Método para raiz quadrada
    public double raizQuadrada(double a) {
        return Math.sqrt(a);
    }

    // Método para potência
    public double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    // Método principal para testar
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double soma = calc.soma(10, 5);
        double subtracao = calc.subtracao(10, 5);
        double multiplicacao = calc.multiplicacao(10, 5);
        double divisao = calc.divisao(10, 5);
        double raiz = calc.raizQuadrada(25);
        double potencia = calc.potencia(2, 3);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Raiz Quadrada: " + raiz);
        System.out.println("Potência: " + potencia);
    }

    /*
     * Comentário sobre SOLID:
     * - O princípio da responsabilidade única (SRP) está sendo violado, pois a classe "Calculadora" está
     *   fazendo a lógica de cálculo e também sendo usada para testes (no método "main"). 
     * - Para respeitar o SRP, a lógica de cálculo deveria estar em uma classe "Calculadora", e o método 
     *   "main" deveria ser movido para uma classe separada que seria responsável por realizar os testes
     *   ou executar a aplicação.
     */
}

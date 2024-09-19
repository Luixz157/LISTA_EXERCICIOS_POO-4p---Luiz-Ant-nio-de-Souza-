package circulo;

public class Main_1 {
    public static void main(String[] args) {
        // Entrada do raio usando a classe CirculoInput
        float raio = CirculoInput.lerRaio();

        // Criando o objeto Circulo com o raio informado
        Circulo circulo = new Circulo(raio);

        // Calculando e exibindo a área e o perímetro
        System.out.println("A área do círculo é: " + circulo.calcularArea());
        System.out.println("O perímetro do círculo é: " + circulo.calcularPerimetro());
    }
}

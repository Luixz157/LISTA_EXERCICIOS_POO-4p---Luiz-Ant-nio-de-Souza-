//Classe Veiculo
//Crie uma classe Veiculo que possua atributos como marca, modelo, ano e velocidade máxima. Implemente um método para calcular o tempo necessário para percorrer uma determinada distância com base na velocidade máxima.


package trianguloo;

public class Veiculo {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeMaxima;

    // Construtor
    public Veiculo(String marca, String modelo, int ano, double velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Método para calcular o tempo necessário para percorrer uma distância
    public double calcularTempo(double distancia) {
        return distancia / velocidadeMaxima;
    }

    // Método principal (main)
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("Toyota", "Corolla", 2020, 180.0);
        double tempo = carro.calcularTempo(360);  // Exemplo: 360 km de distância
        System.out.println("Tempo necessário: " + tempo + " horas");
    }

    /*
     * Comentário sobre SOLID:
     * - A classe está seguindo bem o princípio da responsabilidade única (SRP), pois se foca
     *   em armazenar atributos e realizar cálculos relacionados ao veículo.
     * - No entanto, o método "main" está fora de escopo da responsabilidade da classe. O cálculo e execução 
     *   devem ser feitos em outra classe dedicada, para seguir o SRP adequadamente.
     */
}


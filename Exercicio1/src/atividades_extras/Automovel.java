//Classe Automovel
//Implemente uma classe Automovel que tenha atributos como tipo de combustível, consumo por km e capacidade do tanque. Adicione métodos para calcular quantos quilômetros o automóvel pode percorrer com o tanque cheio.


package atividades_extras;

public class Automovel {
    private String tipoCombustivel;
    private double consumoPorKm;
    private double capacidadeTanque;

    public Automovel(String tipoCombustivel, double consumoPorKm, double capacidadeTanque) {
        this.tipoCombustivel = tipoCombustivel;
        this.consumoPorKm = consumoPorKm;
        this.capacidadeTanque = capacidadeTanque;
    }

    // Método para calcular quantos quilômetros o carro pode percorrer com o tanque cheio
    public double calcularAutonomia() {
        return capacidadeTanque * consumoPorKm;
    }

    // Método principal (main)
    public static void main(String[] args) {
        Automovel carro = new Automovel("Gasolina", 12.5, 50);
        System.out.println("Autonomia do carro: " + carro.calcularAutonomia() + " km");
    }

    /*
     * Comentário sobre SOLID:
     * - A classe segue o SRP, pois está apenas lidando com a lógica relacionada ao automóvel.
     * - O método "main" deve ser movido para uma classe separada para manter o SRP.
     */
}


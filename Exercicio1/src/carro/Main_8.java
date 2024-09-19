package carro;

public class Main_8 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla");
        Carro carro2 = new Carro("Ferrari", "Spider");

        // Acelerando e freando carros
        carro1.acelerar(20);
        carro1.frear(10);
        carro1.frear(10);

        carro2.acelerar(30);
        carro2.frear(60);
    }
}

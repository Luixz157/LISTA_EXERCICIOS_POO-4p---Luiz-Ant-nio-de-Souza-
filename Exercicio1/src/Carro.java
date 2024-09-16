public class Carro {
    String marca;
    String modelo;
    int velocidAtual;

    public Carro(String marca, String modelo, int velocidAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidAtual = velocidAtual;
    }

    public void AcelerarFrear() {
        Carro car = new Carro(marca, modelo, velocidAtual);

        if (velocidAtual > 0) {
            System.out.println(car.marca);
            System.out.println("Acelerando...");
        } else {
            System.out.println(car.marca);
            System.out.println("Freando ou Parado");
        }
    }

    public static void main(String[] str) {
        Carro carro = new Carro("Toyota", "Corolla", 10);
        Carro carro1 = new Carro("Ferrari", "Ferrari", 0);

        carro.AcelerarFrear();
        carro1.AcelerarFrear();
    }
}

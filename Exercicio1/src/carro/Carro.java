package carro;

import carro.interfaces.Aceleravel;
import carro.interfaces.Freavel;

public class Carro implements Aceleravel, Freavel {
    private String marca;
    private String modelo;
    private int velocidadeAtual;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0; // Inicia com a velocidade 0
    }

    @Override
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
            System.out.println(marca + " " + modelo + " está acelerando. Velocidade atual: " + velocidadeAtual + " km/h.");
        } else {
            System.out.println("O valor de incremento precisa ser maior que 0.");
        }
    }

    @Override
    public void frear(int decremento) {
        if (decremento > 0 && velocidadeAtual >= decremento) {
            velocidadeAtual -= decremento;
            System.out.println(marca + " " + modelo + " está freando. Velocidade atual: " + velocidadeAtual + " km/h.");
        } else {
            System.out.println("Não é possível frear. O valor de decremento é inválido ou a velocidade atual é insuficiente.");
        }

        if (velocidadeAtual == 0) {
            System.out.println(marca + " " + modelo + " está parado.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}

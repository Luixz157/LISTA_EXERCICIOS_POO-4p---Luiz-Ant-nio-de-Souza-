package circulo;

import circulo.interfaces.Calculavel;

public class Circulo implements Calculavel {
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        return 3.14f * raio * raio; // A = pi * r^2
    }

    @Override
    public float calcularPerimetro() {
        return 2 * 3.14f * raio; // C = 2 * pi * r
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}

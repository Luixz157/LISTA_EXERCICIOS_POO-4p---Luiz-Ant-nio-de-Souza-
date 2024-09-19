package jogoadivinhacao;

import java.util.Random;

public class NumeroSecreto {
    private int numeroSecreto;

    public NumeroSecreto() {
        Random random = new Random();
        numeroSecreto = random.nextInt(100) + 1; // Número entre 1 e 100
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }
}

package jogocartas;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private List<String> cartas;

    public Jogador() {
        cartas = new ArrayList<>();
    }

    public void receberCartas(List<String> cartasRecebidas) {
        cartas.addAll(cartasRecebidas);
    }

    public List<String> getCartas() {
        return cartas;
    }
}

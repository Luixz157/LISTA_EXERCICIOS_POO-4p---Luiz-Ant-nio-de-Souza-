package jogocartas.interfaces;

import java.util.List;

public interface BaralhoInterface {
    void embaralhar();
    List<String> distribuirCartas(int numCartas);
}

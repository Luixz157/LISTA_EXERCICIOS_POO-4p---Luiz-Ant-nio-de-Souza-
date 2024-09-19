package jogocartas;

import jogocartas.interfaces.BaralhoInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho implements BaralhoInterface {
    private List<String> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        inicializarCartas();
    }

    private void inicializarCartas() {
        String[] cores = {"Vermelho", "Amarelo", "Verde", "Azul"};
        for (String cor : cores) {
            for (int i = 0; i < 10; i++) {
                cartas.add(cor + " " + i);
            }
        }
    }

    @Override
    public void embaralhar() {
        Collections.shuffle(cartas);
        System.out.println("Cartas embaralhadas.");
    }

    @Override
    public List<String> distribuirCartas(int numCartas) {
        List<String> cartasDistribuidas = new ArrayList<>();
        for (int i = 0; i < numCartas; i++) {
            if (!cartas.isEmpty()) {
                cartasDistribuidas.add(cartas.remove(0));
            }
        }
        return cartasDistribuidas;
    }
}

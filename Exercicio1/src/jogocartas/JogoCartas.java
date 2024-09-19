package jogocartas;

import jogocartas.interfaces.BaralhoInterface;

import java.util.ArrayList;
import java.util.List;

public class JogoCartas {
    private BaralhoInterface baralho;
    private List<Jogador> jogadores;

    public JogoCartas(int numJogadores, BaralhoInterface baralho) {
        this.baralho = baralho;
        jogadores = new ArrayList<>();
        for (int i = 0; i < numJogadores; i++) {
            jogadores.add(new Jogador());
        }
    }

    public void distribuirCartas(int numCartas) {
        for (Jogador jogador : jogadores) {
            List<String> cartasRecebidas = baralho.distribuirCartas(numCartas);
            jogador.receberCartas(cartasRecebidas);
        }
        System.out.println("Cartas distribuídas aos jogadores.");
    }

    public void exibirCartasJogador(int indiceJogador) {
        if (indiceJogador < jogadores.size()) {
            System.out.println("Cartas do jogador " + (indiceJogador + 1) + ": " + jogadores.get(indiceJogador).getCartas());
        } else {
            System.out.println("Jogador inválido.");
        }
    }
}

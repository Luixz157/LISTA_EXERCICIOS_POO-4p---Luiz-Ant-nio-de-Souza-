import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JogoCartas {
    private List<String> cartas;
    private List<List<String>> jogadores;

    public JogoCartas(int numJogadores) {
        cartas = new ArrayList<>();
        jogadores = new ArrayList<>();

        for (int i = 0; i < numJogadores; i++) {
            jogadores.add(new ArrayList<>());
        }

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

    public void embaralharCartas() {
        Collections.shuffle(cartas);
        System.out.println("Cartas embaralhadas.");
    }

    public void distribuirCartas(int numCartas) {
        for (int i = 0; i < numCartas; i++) {
            for (List<String> jogador : jogadores) {
                if (!cartas.isEmpty()) {
                    jogador.add(cartas.remove(0));
                }
            }
        }
        System.out.println("Cartas distribuídas aos jogadores.");
    }

    public void exibirCartasJogador(int indiceJogador) {
        if (indiceJogador < jogadores.size()) {
            System.out.println("Cartas do jogador " + (indiceJogador + 1) + ": " + jogadores.get(indiceJogador));
        } else {
            System.out.println("Jogador inválido.");
        }
    }

    public static void main(String[] args) {
        JogoCartas jogo = new JogoCartas(2);
        jogo.embaralharCartas();
        jogo.distribuirCartas(5);
        jogo.exibirCartasJogador(0);
        jogo.exibirCartasJogador(1);
    }
}

package jogocartas;

public class Main_16 {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        JogoCartas jogo = new JogoCartas(2, baralho);
        
        baralho.embaralhar();
        jogo.distribuirCartas(5);
        jogo.exibirCartasJogador(0);
        jogo.exibirCartasJogador(1);
    }
}

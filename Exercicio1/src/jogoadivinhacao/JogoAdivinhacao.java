package jogoadivinhacao;

import jogoadivinhacao.interfaces.ValidacaoPalpite;

public class JogoAdivinhacao implements ValidacaoPalpite {
    private NumeroSecreto numeroSecreto;
    private int tentativa;

    public JogoAdivinhacao() {
        numeroSecreto = new NumeroSecreto();
        tentativa = 0;
    }

    @Override
    public void fazerPalpite(int palpite) {
        tentativa++;
        if (palpite == numeroSecreto.getNumeroSecreto()) {
            System.out.println("Parabéns! Você acertou o número.");
            System.out.println("Quantidade de Tentativas: " + tentativa);
        } else if (palpite < numeroSecreto.getNumeroSecreto()) {
            System.out.println("O número é maior.");
        } else {
            System.out.println("O número é menor.");
        }
    }

    public boolean isPalpiteCorreto(int palpite) {
        return palpite == numeroSecreto.getNumeroSecreto();
    }
}

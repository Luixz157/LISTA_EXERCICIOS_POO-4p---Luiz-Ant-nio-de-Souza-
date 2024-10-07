//Classe Televisao
//Crie uma classe Televisao com atributos como volume e canal. Adicione métodos para aumentar/diminuir o volume, trocar de canal, e exibir as informações da televisão.


package atividades_extras;

public class Televisao {
    // Atributos
    private int volume;
    private int canal;

    // Construtor
    public Televisao() {
        this.volume = 10;  // Volume padrão
        this.canal = 1;    // Canal padrão
    }

    // Método para aumentar o volume
    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    // Método para diminuir o volume
    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    // Método para trocar de canal
    public void trocarCanal(int novoCanal) {
        if (novoCanal > 0) {
            canal = novoCanal;
        }
    }

    // Método para exibir informações da televisão
    public void exibirInformacoes() {
        System.out.println("Volume atual: " + volume);
        System.out.println("Canal atual: " + canal);
    }

    // Método principal (main)
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.aumentarVolume();
        tv.trocarCanal(5);
        tv.exibirInformacoes();
    }

    /*
     * Comentário sobre SOLID:
     * - A classe segue o SRP, pois ela apenas lida com os estados e ações relacionadas à TV.
     * - O método "main" não deveria estar aqui, pois não faz parte da responsabilidade da classe.
     *   Ele deveria ser separado para uma classe que apenas executa o programa.
     */
}

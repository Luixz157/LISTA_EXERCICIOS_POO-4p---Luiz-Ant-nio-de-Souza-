//Classe Lampada
//Crie uma classe chamada Lampada que simule uma lâmpada. A lâmpada pode estar ligada ou desligada. Adicione métodos para ligar, desligar e verificar o estado da lâmpada.


package atividades_extras;

public class Lampada {
    // Atributo para o estado da lâmpada
    private boolean ligada;

    // Método para ligar a lâmpada
    public void ligar() {
        ligada = true;
    }

    // Método para desligar a lâmpada
    public void desligar() {
        ligada = false;
    }

    // Método para verificar o estado da lâmpada
    public boolean isLigada() {
        return ligada;
    }

    // Método principal (main)
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.ligar();
        System.out.println("Lâmpada está ligada? " + lampada.isLigada());

        lampada.desligar();
        System.out.println("Lâmpada está ligada? " + lampada.isLigada());
    }

    /*
     * Comentário sobre SOLID:
     * - A lógica está bem dividida entre métodos que lidam com o estado da lâmpada.
     * - O método "main" está fora do escopo da responsabilidade da classe "Lampada", pois
     *   sua função é mudar e exibir estados da lâmpada, não testar a aplicação. Para aderir ao SRP,
     *   esse teste deveria estar em outra classe separada.
     */
}


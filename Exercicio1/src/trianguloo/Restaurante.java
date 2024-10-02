//Classe Restaurante
//Crie uma classe Restaurante que possua um cardápio e métodos para registrar pedidos, calcular a conta final, e emitir uma nota fiscal.


package trianguloo;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    // Atributos
    private List<String> cardapio;
    private List<String> pedidos;
    private double totalConta;

    // Construtor
    public Restaurante() {
        cardapio = new ArrayList<>();
        pedidos = new ArrayList<>();
        totalConta = 0.0;
        adicionarItensCardapio();
    }

    // Método para adicionar itens ao cardápio
    private void adicionarItensCardapio() {
        cardapio.add("Pizza - R$30.0");
        cardapio.add("Hambúrguer - R$20.0");
        cardapio.add("Salada - R$15.0");
    }

    // Método para registrar um pedido
    public void registrarPedido(String item, double preco) {
        pedidos.add(item);
        totalConta += preco;
    }

    // Método para calcular o total da conta
    public double calcularContaFinal() {
        return totalConta;
    }

    // Método para exibir o cardápio
    public void exibirCardapio() {
        System.out.println("Cardápio:");
        for (String item : cardapio) {
            System.out.println(item);
        }
    }

    // Método principal (main)
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        restaurante.exibirCardapio();

        // Registrar alguns pedidos
        restaurante.registrarPedido("Pizza", 30.0);
        restaurante.registrarPedido("Salada", 15.0);

        // Exibir total da conta
        System.out.println("Total da conta: R$" + restaurante.calcularContaFinal());
    }

    /*
     * Comentário sobre SOLID:
     * - A classe "Restaurante" está lidando com várias responsabilidades (armazenar cardápio, pedidos e cálculo da conta).
     * - O método "main" deveria ser separado, uma vez que não é responsabilidade da classe "Restaurante" lidar com a execução.
     * - Seria melhor separar a lógica de cardápio, pedidos e cálculos em classes distintas.
     */
}


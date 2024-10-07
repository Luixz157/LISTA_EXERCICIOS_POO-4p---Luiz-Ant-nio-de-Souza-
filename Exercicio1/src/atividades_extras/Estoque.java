//Classe Estoque
//Implemente uma classe chamada Estoque que tenha atributos para o nome do produto, quantidade disponível e preço. Adicione métodos para atualizar o estoque (entrada e saída de produtos) e calcular o valor total em estoque.


package atividades_extras;

public class Estoque {
    // Atributos
    private String nomeProduto;
    private int quantidade;
    private double precoUnitario;

    // Construtor
    public Estoque(String nomeProduto, int quantidade, double precoUnitario) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    // Método para adicionar estoque
    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    // Método para remover estoque
    public void removerEstoque(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    // Método para calcular o valor total em estoque
    public double calcularValorTotal() {
        return quantidade * precoUnitario;
    }

    // Método principal (main)
    public static void main(String[] args) {
        Estoque estoque = new Estoque("Notebook", 50, 2000.0);
        estoque.adicionarEstoque(10);
        estoque.removerEstoque(5);
        System.out.println("Valor total em estoque: " + estoque.calcularValorTotal());
    }

    /*
     * Comentário sobre SOLID:
     * - A classe está bem organizada e respeita o SRP, pois a lógica relacionada ao estoque está
     *   dentro da classe.
     * - O método "main" não deveria estar aqui, pois sua responsabilidade é testar ou rodar o programa.
     *   Para respeitar o SRP, esse código deveria ser movido para uma classe separada de execução.
     */
}

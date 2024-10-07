//Classe ProdutoDigital
//Crie uma classe ProdutoDigital que herda da classe Produto (do exercício anterior) e adicione métodos para calcular o tamanho em MB e verificar se o produto está disponível para download.


package atividades_extras;


// Classe ProdutoDigital que herda de Produto
public class ProdutoDigital extends Produto {
    private double tamanhoEmMB;

    public ProdutoDigital(String nome, double preco, double tamanhoEmMB) {
        super(nome, preco);
        this.tamanhoEmMB = tamanhoEmMB;
    }

    // Método para calcular o tamanho em MB
    public double getTamanhoEmMB() {
        return tamanhoEmMB;
    }

    // Método para verificar se está disponível para download
    public boolean verificarDisponibilidade() {
        return true; // Simulando que o produto está sempre disponível
    }

    // Método principal (main)
    public static void main(String[] args) {
        ProdutoDigital produto = new ProdutoDigital("Livro Digital", 29.90, 50.0);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Tamanho: " + produto.getTamanhoEmMB() + " MB");
        System.out.println("Disponível para download? " + produto.verificarDisponibilidade());
    }

    /*
     * Comentário sobre SOLID:
     * - A herança está bem utilizada, e o SRP é respeitado dentro da classe "ProdutoDigital".
     * - O método "main" deve ser movido para uma classe de execução separada.
     */
}


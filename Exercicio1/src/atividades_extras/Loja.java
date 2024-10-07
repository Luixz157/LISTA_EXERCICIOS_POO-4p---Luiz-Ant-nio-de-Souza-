//Classe Loja
//Crie uma classe Loja com métodos para cadastrar produtos, realizar vendas, aplicar descontos e calcular o valor total da venda. O sistema deve permitir que o cliente finalize a compra com diferentes formas de pagamento (dinheiro, cartão, etc.).

package atividades_extras;

import java.util.HashMap;
import java.util.Scanner;

public class Loja {
    // Atributo para armazenar produtos e seus preços
    private HashMap<String, Double> produtos;
    private double totalCompra;

    // Construtor
    public Loja() {
        produtos = new HashMap<>();
        totalCompra = 0.0;
        cadastrarProdutos();
    }

    // Método para cadastrar produtos
    private void cadastrarProdutos() {
        produtos.put("Camiseta", 50.0);
        produtos.put("Calça", 100.0);
        produtos.put("Tênis", 150.0);
    }

    // Método para realizar vendas
    public void realizarVenda(String produto) {
        if (produtos.containsKey(produto)) {
            totalCompra += produtos.get(produto);
            System.out.println("Produto adicionado: " + produto + " - R$" + produtos.get(produto));
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    // Método para aplicar descontos
    public void aplicarDesconto(double percentual) {
        totalCompra -= totalCompra * (percentual / 100);
    }

    // Método para exibir o valor total da compra
    public void exibirTotalCompra() {
        System.out.println("Total da compra: R$" + totalCompra);
    }

    // Método principal (main)
    public static void main(String[] args) {
        Loja loja = new Loja();
        Scanner scanner = new Scanner(System.in);

        // Exibir produtos
        System.out.println("Produtos disponíveis: Camiseta, Calça, Tênis");
        System.out.println("Digite o produto que deseja comprar:");
        String produto = scanner.nextLine();
        loja.realizarVenda(produto);

        // Aplicar desconto
        System.out.println("Digite o percentual de desconto:");
        double desconto = scanner.nextDouble();
        loja.aplicarDesconto(desconto);

        // Exibir total
        loja.exibirTotalCompra();
    }

    /*
     * Comentário sobre SOLID:
     * - A lógica de cadastro e venda de produtos está bem organizada, respeitando o SRP.
     * - O método "main" deve ser movido para outra classe, separando a responsabilidade de execução do código.
     */
}


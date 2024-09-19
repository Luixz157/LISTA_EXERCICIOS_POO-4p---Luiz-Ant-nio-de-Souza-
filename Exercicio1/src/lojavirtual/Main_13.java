package lojavirtual;

import lojavirtual.interfaces.Desconto;

public class Main_13 {
    public static void main(String[] args) {
        // Criando a loja e cadastrando produtos
        LojaVirtual loja = new LojaVirtual();
        loja.cadastrarProduto("Camiseta", 50.00);
        loja.cadastrarProduto("Calça Jeans", 120.00);
        loja.cadastrarProduto("Tênis", 200.00);

        // Criando o carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando produtos ao carrinho
        Produto produto1 = loja.buscarProduto("Camiseta");
        Produto produto2 = loja.buscarProduto("Tênis");

        if (produto1 != null) carrinho.adicionarProduto(produto1);
        if (produto2 != null) carrinho.adicionarProduto(produto2);

        // Aplicando um desconto
        Desconto desconto = new DescontoPercentual(10);
        carrinho.aplicarDesconto(desconto);

        // Finalizando a compra
        double total = carrinho.calcularValorTotal();
        System.out.println("Valor total da compra: R$ " + String.format("%.2f", total));
        carrinho.limparCarrinho();
    }
}

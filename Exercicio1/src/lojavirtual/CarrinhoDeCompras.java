package lojavirtual;

import lojavirtual.interfaces.Desconto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;
    private Desconto desconto;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
        desconto = null;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto " + produto.getNome() + " adicionado ao carrinho.");
    }

    public void aplicarDesconto(Desconto desconto) {
        this.desconto = desconto;
        System.out.println("Desconto aplicado.");
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        if (desconto != null) {
            total = desconto.aplicarDesconto(total);
        }
        return total;
    }

    public void limparCarrinho() {
        produtos.clear();
        desconto = null;
    }
}

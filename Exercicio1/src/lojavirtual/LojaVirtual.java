package lojavirtual;

import java.util.ArrayList;
import java.util.List;

public class LojaVirtual {
    private List<Produto> produtos;

    public LojaVirtual() {
        produtos = new ArrayList<>();
    }

    public void cadastrarProduto(String nome, double preco) {
        Produto produto = new Produto(nome, preco);
        produtos.add(produto);
        System.out.println("Produto " + nome + " cadastrado com sucesso.");
    }

    public Produto buscarProduto(String nomeProduto) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                return produto;
            }
        }
        return null;
    }
}

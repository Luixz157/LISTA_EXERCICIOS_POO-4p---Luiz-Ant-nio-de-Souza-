import java.util.ArrayList;
import java.util.List;

public class LojaVirtual {
    private class Produto {
        private String nome;
        private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }
    }

    private List<Produto> produtos;
    private List<Produto> carrinho;
    private double desconto;

    public LojaVirtual() {
        produtos = new ArrayList<>();
        carrinho = new ArrayList<>();
        desconto = 0.0;
    }

    public void cadastrarProduto(String nome, double preco) {
        Produto produto = new Produto(nome, preco);
        produtos.add(produto);
        System.out.println("Produto " + nome + " cadastrado com sucesso.");
    }

    public void adicionarAoCarrinho(String nomeProduto) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                carrinho.add(produto);
                System.out.println("Produto " + nomeProduto + " adicionado ao carrinho.");
                return;
            }
        }
        System.out.println("Produto " + nomeProduto + " não encontrado.");
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            desconto = percentual;
            System.out.println("Desconto de " + percentual + "% aplicado.");
        } else {
            System.out.println("Percentual de desconto inválido.");
        }
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (Produto produto : carrinho) {
            total += produto.getPreco();
        }
        if (desconto > 0) {
            total -= total * (desconto / 100);
        }
        return total;
    }

    public void finalizarCompra() {
        double total = calcularValorTotal();
        System.out.println("Valor total da compra: R$ " + String.format("%.2f", total));
        carrinho.clear();
        desconto = 0.0;
    }

    public static void main(String[] args) {
        LojaVirtual loja = new LojaVirtual();
        loja.cadastrarProduto("Camiseta", 50.00);
        loja.cadastrarProduto("Calça Jeans", 120.00);
        loja.cadastrarProduto("Tênis", 200.00);

        loja.adicionarAoCarrinho("Camiseta");
        loja.adicionarAoCarrinho("Tênis");

        loja.aplicarDesconto(10);

        loja.finalizarCompra();
    }
}

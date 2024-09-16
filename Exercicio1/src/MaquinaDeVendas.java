import java.util.ArrayList;
import java.util.List;

public class MaquinaDeVendas {
    private class Produto {
        private String nome;
        private double preco;
        private int quantidade;

        public Produto(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
    }

    private List<Produto> produtos;
    private double saldo;

    public MaquinaDeVendas() {
        produtos = new ArrayList<>();
        saldo = 0.0;
    }

    public void cadastrarProduto(String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);
        System.out.println("Produto " + nome + " cadastrado com sucesso.");
    }

    public void exibirEstoque() {
        System.out.println("Estoque disponível:");
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + " | Preço: R$ " + String.format("%.2f", produto.getPreco()) + " | Quantidade: " + produto.getQuantidade());
        }
    }

    public void inserirDinheiro(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Dinheiro inserido: R$ " + String.format("%.2f", valor));
            System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
        } else {
            System.out.println("Valor inválido. Por favor, insira um valor positivo.");
        }
    }

    public void selecionarProduto(String nomeProduto) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                if (produto.getQuantidade() > 0) {
                    if (saldo >= produto.getPreco()) {
                        saldo -= produto.getPreco();
                        produto.setQuantidade(produto.getQuantidade() - 1);
                        System.out.println("Produto " + nomeProduto + " adquirido com sucesso.");
                        System.out.println("Saldo restante: R$ " + String.format("%.2f", saldo));
                    } else {
                        System.out.println("Saldo insuficiente. Insira mais dinheiro.");
                    }
                } else {
                    System.out.println("Produto " + nomeProduto + " está fora de estoque.");
                }
                return;
            }
        }
        System.out.println("Produto " + nomeProduto + " não encontrado.");
    }

    public void retornarTroco() {
        System.out.println("Retornando troco: R$ " + String.format("%.2f", saldo));
        saldo = 0.0;
    }

    public static void main(String[] args) {
        MaquinaDeVendas maquina = new MaquinaDeVendas();

        maquina.cadastrarProduto("Refrigerante", 5.00, 10);
        maquina.cadastrarProduto("Chips", 3.50, 5);
        maquina.cadastrarProduto("Chocolate", 4.25, 8);

        maquina.exibirEstoque();

        maquina.inserirDinheiro(10.00);
        maquina.selecionarProduto("Chocolate");
        maquina.selecionarProduto("Chips");

        maquina.retornarTroco();
        maquina.exibirEstoque();
    }
}

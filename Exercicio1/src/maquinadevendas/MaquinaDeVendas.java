package maquinadevendas;

public class MaquinaDeVendas {
    private Estoque estoque;
    private double saldo;

    public MaquinaDeVendas(Estoque estoque) {
        this.estoque = estoque;
        this.saldo = 0.0;
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
        Produto produto = estoque.buscarProduto(nomeProduto);
        if (produto != null) {
            if (produto.getQuantidade() > 0) {
                if (saldo >= produto.getPreco()) {
                    saldo -= produto.getPreco();
                    produto.decrementarQuantidade();
                    System.out.println("Produto " + nomeProduto + " adquirido com sucesso.");
                    System.out.println("Saldo restante: R$ " + String.format("%.2f", saldo));
                } else {
                    System.out.println("Saldo insuficiente. Insira mais dinheiro.");
                }
            } else {
                System.out.println("Produto " + nomeProduto + " está fora de estoque.");
            }
        } else {
            System.out.println("Produto " + nomeProduto + " não encontrado.");
        }
    }

    public void retornarTroco() {
        System.out.println("Retornando troco: R$ " + String.format("%.2f", saldo));
        saldo = 0.0;
    }
}

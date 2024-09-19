package produto;

public class Produto {
    private String nome;
    private float valor;
    private int quantidadeEstoque;

    public Produto(String nome, float valor, int quantidadeEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public float calcularValorTotalNoEstoque() {
        return valor * quantidadeEstoque;
    }

    public boolean isDisponivel() {
        return quantidadeEstoque > 0;
    }
}

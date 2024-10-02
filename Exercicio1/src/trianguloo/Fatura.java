//Classe Fatura
//Implemente uma classe chamada Fatura que possua atributos para armazenar o número da fatura, descrição do produto, quantidade comprada e preço unitário. Adicione métodos para calcular o valor total da fatura e exibir os detalhes.


package trianguloo;

public class Fatura {
    // Atributos da fatura
    private String numeroFatura;
    private String descricaoProduto;
    private int quantidadeComprada;
    private double precoUnitario;

    // Construtor
    public Fatura(String numeroFatura, String descricaoProduto, int quantidadeComprada, double precoUnitario) {
        this.numeroFatura = numeroFatura;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeComprada = quantidadeComprada;
        this.precoUnitario = precoUnitario;
    }

    // Método para calcular o valor total
    public double calcularValorTotal() {
        return quantidadeComprada * precoUnitario;
    }

    // Método para exibir detalhes da fatura
    public void exibirDetalhes() {
        System.out.println("Número da Fatura: " + numeroFatura);
        System.out.println("Descrição: " + descricaoProduto);
        System.out.println("Quantidade Comprada: " + quantidadeComprada);
        System.out.println("Preço Unitário: " + precoUnitario);
        System.out.println("Valor Total: " + calcularValorTotal());
    }

    // Método principal (main)
    public static void main(String[] args) {
        Fatura fatura = new Fatura("1234", "Smartphone", 2, 1500.0);
        fatura.exibirDetalhes();
    }

    /*
     * Comentário sobre SOLID:
     * - Esta classe não está violando o SRP porque está separada logicamente para
     *   tratar apenas da lógica da fatura (armazenar dados e calcular o valor).
     * - No entanto, o método "main" não deveria estar aqui, já que testar ou rodar
     *   a aplicação não é responsabilidade da classe "Fatura". Deveria haver uma classe separada
     *   que executa esses testes.
     */
}

package maquinadevendas;

public class Main_15 {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(new Produto("Refrigerante", 5.00, 10));
        estoque.adicionarProduto(new Produto("Chips", 3.50, 5));
        estoque.adicionarProduto(new Produto("Chocolate", 4.25, 8));

        MaquinaDeVendas maquina = new MaquinaDeVendas(estoque);
        estoque.exibirEstoque();

        maquina.inserirDinheiro(10.00);
        maquina.selecionarProduto("Chocolate");
        maquina.selecionarProduto("Chips");

        maquina.retornarTroco();
        estoque.exibirEstoque();
    }
}

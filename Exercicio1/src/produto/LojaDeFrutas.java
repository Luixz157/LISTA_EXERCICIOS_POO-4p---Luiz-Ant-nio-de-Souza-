package produto;

import java.util.Scanner;

public class LojaDeFrutas {
    private Scanner scan;

    public LojaDeFrutas() {
        scan = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("Escolha qual produto deseja ver: ");
        System.out.println("1 - Banana ");
        System.out.println("2 - Maçã ");
        System.out.println("3 - Melancia ");
        int menu = scan.nextInt();

        Produto produtoEscolhido = escolherProduto(menu);

        if (produtoEscolhido != null) {
            exibirDetalhesProduto(produtoEscolhido);
        } else {
            System.out.println("Opção inválida.");
        }
    }

    private Produto escolherProduto(int menu) {
        switch (menu) {
            case 1:
                return new Produto("Banana", 1.5f, 100);
            case 2:
                return new Produto("Maçã", 2.0f, 50);
            case 3:
                return new Produto("Melancia", 5.0f, 20);
            default:
                return null;
        }
    }

    private void exibirDetalhesProduto(Produto produto) {
        System.out.println("Produto escolhido: " + produto.getNome());
        System.out.println("Valor unitário: R$ " + produto.getValor());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());

        float valorTotal = produto.calcularValorTotalNoEstoque();
        System.out.println("Valor total no estoque: R$ " + valorTotal);

        if (produto.isDisponivel()) {
            System.out.println("Produto disponível em estoque.");
        } else {
            System.out.println("Produto indisponível.");
        }
    }
}

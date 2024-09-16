
import java.util.Scanner;

public class Produto {
    
    String nome;
    float valor;
    int quantidadeEstoque;
    
    /* Obs: Como não temos um produto Certo colocarei 3 tipos de Produto para o usuario escolher, Será uma Loja de Frutas
     * 1 - Banana
     * 2 - Maça
     * 3 - Melancia
     */
        Scanner scan = new Scanner(System.in);
    
        public Produto(String nome, float valor, int quantidadeEstoque) {
            this.nome = nome;
            this.valor = valor;
            this.quantidadeEstoque = quantidadeEstoque;
        }

        public void InputPergunta() {
            System.out.println("Escolha entre qual Produto deseja ver: ");
            System.out.println("1 - Banana ");
            System.out.println("2 - Maçã ");
            System.out.println("3 - Melancia ");
            int menu = scan.nextInt();
    
            Produto produtoEscolhido = null;
    
            switch (menu) {
                case 1:
                    produtoEscolhido = new Produto("Banana", 1.5f, 100); // Exemplo de valores
                    break;
                case 2:
                    produtoEscolhido = new Produto("Maçã", 2.0f, 50); // Exemplo de valores
                    break;
                case 3:
                    produtoEscolhido = new Produto("Melancia", 5.0f, 20); // Exemplo de valores
                    break;
                default:
                    System.out.println("Opção inválida.");
                    return;
            }

            System.out.println("Produto escolhido: " + produtoEscolhido.nome);
            System.out.println("Valor unitário: R$ " + produtoEscolhido.valor);
            System.out.println("Quantidade em estoque: " + produtoEscolhido.quantidadeEstoque);

            produtoEscolhido.CalcularValorTotalNoEstoque();

            produtoEscolhido.VerificarDisponibilidade();
        }

        public void CalcularValorTotalNoEstoque() {
            float valorTotal = valor * quantidadeEstoque;
            System.out.println("Valor total no estoque: R$ " + valorTotal);
        }

        public void VerificarDisponibilidade() {
            if (quantidadeEstoque > 0) {
                System.out.println("Produto disponível em estoque.");
            } else {
                System.out.println("Produto indisponível.");
            }
        }
    
        public static void main(String[] args) {
            Produto lojaDeFrutas = new Produto("", 0, 0);
            lojaDeFrutas.InputPergunta();
        }
    }
    
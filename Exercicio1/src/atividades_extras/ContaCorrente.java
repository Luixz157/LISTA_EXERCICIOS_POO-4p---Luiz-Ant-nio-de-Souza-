//Classe ContaCorrente
//Implemente uma classe chamada ContaCorrente que herda da ContaBancária do exercício anterior e tenha um limite especial de saque. Implemente o método para verificar se o saldo mais o limite permitem a operação de saque.


package atividades_extras;

public class ContaCorrente {
    // Atributos
    private double saldo;
    private double limite;

    // Construtor
    public ContaCorrente(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    // Método para saque, verificando se o limite permite
    public boolean sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    // Método para verificar o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método principal (main)
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1000, 500);
        boolean saqueRealizado = conta.sacar(1200);
        System.out.println("Saque realizado: " + saqueRealizado);
        System.out.println("Saldo atual: " + conta.getSaldo());
    }

    /*
     * Comentário sobre SOLID:
     * - O método "sacar" está dentro do escopo da responsabilidade da classe, seguindo o SRP.
     * - Entretanto, o método "main" deve ser movido para outra classe para não violar o princípio.
     */
}


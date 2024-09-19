package banco.interfaces;

public interface OperacoesConta {
    boolean sacar(double valor);
    void depositar(double valor);
    boolean transferir(OperacoesConta contaDestino, double valor);
}

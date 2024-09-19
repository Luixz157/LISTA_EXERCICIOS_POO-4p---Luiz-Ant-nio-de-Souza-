package lojavirtual;

import lojavirtual.interfaces.Desconto;

public class DescontoPercentual implements Desconto {
    private double percentual;

    public DescontoPercentual(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual de desconto inválido.");
        }
        this.percentual = percentual;
    }

    @Override
    public double aplicarDesconto(double valor) {
        return valor - (valor * (percentual / 100));
    }
}

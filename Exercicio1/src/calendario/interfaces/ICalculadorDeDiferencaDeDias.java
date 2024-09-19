package calendario.interfaces;

import java.time.LocalDate;

public interface ICalculadorDeDiferencaDeDias {
    long calcularDiferencaDias(LocalDate data1, LocalDate data2);
}

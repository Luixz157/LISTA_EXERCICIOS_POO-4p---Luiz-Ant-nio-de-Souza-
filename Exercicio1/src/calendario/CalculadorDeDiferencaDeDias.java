package calendario;

import calendario.interfaces.ICalculadorDeDiferencaDeDias;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculadorDeDiferencaDeDias implements ICalculadorDeDiferencaDeDias {
    @Override
    public long calcularDiferencaDias(LocalDate data1, LocalDate data2) {
        return ChronoUnit.DAYS.between(data1, data2);
    }
}

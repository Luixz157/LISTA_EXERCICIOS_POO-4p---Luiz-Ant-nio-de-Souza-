package calendario;

import calendario.interfaces.IVerificadorDeFeriado;
import java.time.LocalDate;
import java.time.Month;

public class VerificadorDeFeriado implements IVerificadorDeFeriado {
    @Override
    public boolean verificarFeriado(LocalDate data) {
        LocalDate natal = LocalDate.of(data.getYear(), Month.DECEMBER, 25);
        return data.equals(natal);
    }
}

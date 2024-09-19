package calendario.interfaces;

import java.time.LocalDate;

public interface IVerificadorDeFeriado {
    boolean verificarFeriado(LocalDate data);
}

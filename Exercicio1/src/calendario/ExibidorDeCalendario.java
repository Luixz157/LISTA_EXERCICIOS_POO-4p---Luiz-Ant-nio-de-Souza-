package calendario;

import calendario.interfaces.IExibidorDeCalendario;
import java.time.LocalDate;
import java.time.Month;

public class ExibidorDeCalendario implements IExibidorDeCalendario {
    @Override
    public void exibirMes(int ano, Month mes) {
        System.out.println(mes + " " + ano);
        for (int day = 1; day <= mes.length(LocalDate.of(ano, mes, 1).isLeapYear()); day++) {
            System.out.println(day);
        }
    }
}

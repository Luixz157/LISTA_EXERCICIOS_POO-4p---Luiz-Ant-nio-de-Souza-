import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Calendario {
    public void exibirMes(int ano, Month mes) {
        System.out.println(mes + " " + ano);
        for (int day = 1; day <= mes.length(LocalDate.of(ano, mes, 1).isLeapYear()); day++) {
            System.out.println(day);
        }
    }

    public boolean verificarFeriado(LocalDate data) {
        LocalDate natal = LocalDate.of(data.getYear(), Month.DECEMBER, 25);
        return data.equals(natal);
    }

    public long calcularDiferencaDias(LocalDate data1, LocalDate data2) {
        return ChronoUnit.DAYS.between(data1, data2);
    }

    public static void main(String[] args) {
        Calendario calendario = new Calendario();
        calendario.exibirMes(2024, Month.FEBRUARY);

        LocalDate data = LocalDate.of(2024, Month.DECEMBER, 25);
        System.out.println("É feriado? " + calendario.verificarFeriado(data));

        LocalDate data1 = LocalDate.of(2024, Month.JANUARY, 1);
        LocalDate data2 = LocalDate.of(2024, Month.DECEMBER, 31);
        System.out.println("Diferença em dias: " + calendario.calcularDiferencaDias(data1, data2));
    }
}

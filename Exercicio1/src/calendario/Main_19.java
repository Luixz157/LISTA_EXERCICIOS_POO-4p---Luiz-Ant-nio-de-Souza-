package calendario;

import java.time.LocalDate;
import java.time.Month;

import calendario.interfaces.ICalculadorDeDiferencaDeDias;
import calendario.interfaces.IExibidorDeCalendario;
import calendario.interfaces.IVerificadorDeFeriado;

public class Main_19 {
    public static void main(String[] args) {
        IExibidorDeCalendario exibidor = new ExibidorDeCalendario();
        IVerificadorDeFeriado verificador = new VerificadorDeFeriado();
        ICalculadorDeDiferencaDeDias calculador = new CalculadorDeDiferencaDeDias();

        Calendario calendario = new Calendario(exibidor, verificador, calculador);
        
        calendario.exibirMes(2024, Month.FEBRUARY);

        LocalDate data = LocalDate.of(2024, Month.DECEMBER, 25);
        System.out.println("É feriado? " + calendario.verificarFeriado(data));

        LocalDate data1 = LocalDate.of(2024, Month.JANUARY, 1);
        LocalDate data2 = LocalDate.of(2024, Month.DECEMBER, 31);
        System.out.println("Diferença em dias: " + calendario.calcularDiferencaDias(data1, data2));
    }
}

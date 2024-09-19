package calendario;

import calendario.interfaces.IExibidorDeCalendario;
import calendario.interfaces.IVerificadorDeFeriado;
import calendario.interfaces.ICalculadorDeDiferencaDeDias;
import java.time.LocalDate;
import java.time.Month;

public class Calendario {
    private IExibidorDeCalendario exibidorDeCalendario;
    private IVerificadorDeFeriado verificadorDeFeriado;
    private ICalculadorDeDiferencaDeDias calculadorDeDiferencaDeDias;

    public Calendario(IExibidorDeCalendario exibidor, IVerificadorDeFeriado verificador, ICalculadorDeDiferencaDeDias calculador) {
        this.exibidorDeCalendario = exibidor;
        this.verificadorDeFeriado = verificador;
        this.calculadorDeDiferencaDeDias = calculador;
    }

    public void exibirMes(int ano, Month mes) {
        exibidorDeCalendario.exibirMes(ano, mes);
    }

    public boolean verificarFeriado(LocalDate data) {
        return verificadorDeFeriado.verificarFeriado(data);
    }

    public long calcularDiferencaDias(LocalDate data1, LocalDate data2) {
        return calculadorDeDiferencaDeDias.calcularDiferencaDias(data1, data2);
    }

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

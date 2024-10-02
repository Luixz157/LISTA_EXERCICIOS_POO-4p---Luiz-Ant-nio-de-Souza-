//Classe ConversorTemperatura
//Crie uma classe chamada ConversorTemperatura com métodos para converter temperaturas entre Celsius, Fahrenheit e Kelvin.


package trianguloo;

public class ConversorTemperatura {
    // Métodos para conversão de temperatura
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double kelvinParaCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Método principal (main)
    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperatura();

        double celsius = 25;
        System.out.println(celsius + "ºC em Fahrenheit: " + conversor.celsiusParaFahrenheit(celsius));
        System.out.println(celsius + "ºC em Kelvin: " + conversor.celsiusParaKelvin(celsius));
    }

    /*
     * Comentário sobre SOLID:
     * - A responsabilidade única está sendo respeitada, pois a classe só realiza conversões de temperatura.
     * - O método "main" deve ser movido para outra classe que seja responsável por executar os testes.
     */
}


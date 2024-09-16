import java.util.Scanner;

public class Circulo {
    //Atributo para armazenar o raio
    private float raio;


    //Armazenar o valor do raio
    public void AmazenarRaio() {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Qual o Valor do Raio?");
        raio = sc.nextFloat();
    }

    //Metodo para calcular a área do círculo
    public float CalcularArea() {
        return 3.14f * raio * raio; // A = pi * r^2
    }

    //Metodo para calcular o perimetro do circulo
    public float calcularPerimetro() {
        return 2 * 3.14f * raio; // C = 2 * pi * r
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        //Armazenamento o raio
        circulo.AmazenarRaio();

        //Calculanmdo e exibindo a área e o perímetro
        System.out.println("A area do circulo é: "+circulo.CalcularArea());
        System.out.println("O perimetro do círculo é: "+circulo.calcularPerimetro());
    }
}

/* Atributo raio: Foi declarado como uma variável de instância (private float raio;), o que permite que ela seja
 * acessada pelos métodos da classe.
 * 
 * Método armazenarRaio: Utiliza o Scanner para ler o valor do raio do teclado.
 * 
 * Método calcularArea: Calcula a área do círculo usando a fórmula 𝜋𝑟2πr 2.
 * 
 * Método calcularPerimetro: Calcula o perímetro usando a fórmula 𝜋𝑟2πr 2.
 * 
 * Main method: No método main, um objeto da classe Circulo é criado, o raio é armazenado, e em seguida, a área e o perímetro
 * são calculados e exibidos.
 */

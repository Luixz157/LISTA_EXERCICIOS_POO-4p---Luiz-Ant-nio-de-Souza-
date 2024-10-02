//Classe PessoaIMC
//Crie uma classe PessoaIMC que herda da classe Pessoa (do exercício anterior) e adicione métodos para calcular o índice de massa corporal (IMC) e verificar se a pessoa está no peso ideal.


package trianguloo;

// Classe Pessoa (do exercício anterior)
class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getNome() {
        return nome;
    }
}

// Classe PessoaIMC que herda de Pessoa
public class PessoaIMC extends Pessoa {

    public PessoaIMC(String nome, int idade, double altura, double peso) {
        super(nome, idade, altura, peso);
    }

    // Método para calcular o IMC
    public double calcularIMC() {
        return getPeso() / (getAltura() * getAltura());
    }

    // Método para verificar se está no peso ideal
    public String verificarPesoIdeal() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    // Método principal (main)
    public static void main(String[] args) {
        PessoaIMC pessoa = new PessoaIMC("João", 30, 1.75, 70);
        System.out.println("IMC de " + pessoa.getNome() + ": " + pessoa.calcularIMC());
        System.out.println("Situação: " + pessoa.verificarPesoIdeal());
    }

    /*
     * Comentário sobre SOLID:
     * - A classe "PessoaIMC" respeita o princípio da responsabilidade única (SRP).
     * - O método "main" deve ser movido para outra classe responsável pela execução do programa.
     */
}

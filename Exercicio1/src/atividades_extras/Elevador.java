//Classe Elevador
//Crie uma classe chamada Elevador que simule um elevador de um prédio. O elevador deve ter capacidade máxima, andar atual, e métodos para subir, descer, e adicionar ou remover pessoas.


package atividades_extras;

public class Elevador {
    // Atributos
    private int andarAtual;
    private int capacidadeMaxima;
    private int pessoasNoElevador;

    // Construtor
    public Elevador(int capacidadeMaxima) {
        this.andarAtual = 0; // Térreo
        this.capacidadeMaxima = capacidadeMaxima;
        this.pessoasNoElevador = 0;
    }

    // Método para subir andar
    public void subir() {
        andarAtual++;
    }

    // Método para descer andar
    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
        }
    }

    // Método para adicionar pessoas
    public void entrar(int quantidade) {
        if (pessoasNoElevador + quantidade <= capacidadeMaxima) {
            pessoasNoElevador += quantidade;
        } else {
            System.out.println("Capacidade máxima excedida!");
        }
    }

    // Método para remover pessoas
    public void sair(int quantidade) {
        if (pessoasNoElevador - quantidade >= 0) {
            pessoasNoElevador -= quantidade;
        } else {
            System.out.println("Número de pessoas para sair inválido.");
        }
    }

    // Método principal (main)
    public static void main(String[] args) {
        Elevador elevador = new Elevador(5);  // Capacidade de 5 pessoas
        elevador.entrar(3);
        elevador.subir();
        elevador.descer();
        elevador.sair(1);
        System.out.println("Andar atual: " + elevador.andarAtual);
        System.out.println("Pessoas no elevador: " + elevador.pessoasNoElevador);
    }

    /*
     * Comentário sobre SOLID:
     * - A responsabilidade de cada método está clara e respeita o SRP, pois cada método lida
     *   com o controle de andar e quantidade de pessoas.
     * - O método "main" novamente está violando o SRP, pois não faz parte da responsabilidade
     *   da classe "Elevador". Ele deveria ser removido para uma classe separada.
     */
}


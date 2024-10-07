//Classe HerançaAnimais
//Crie uma hierarquia de classes Animal, Mamifero, Ave e Peixe. A classe Animal deve ter métodos para comer e dormir, e as subclasses devem implementar características específicas.


package atividades_extras;

// Classe base Animal
class Animal {
    public void comer() {
        System.out.println("Animal está comendo...");
    }

    public void dormir() {
        System.out.println("Animal está dormindo...");
    }
}

// Classe Mamifero
class Mamifero extends Animal {
    public void amamentar() {
        System.out.println("Mamífero está amamentando...");
    }
}

// Classe Ave
class Ave extends Animal {
    public void voar() {
        System.out.println("Ave está voando...");
    }
}

// Classe Peixe
class Peixe extends Animal {
    public void nadar() {
        System.out.println("Peixe está nadando...");
    }
}

// Método principal (main) para testar as classes
public class HerancaAnimais {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Ave ave = new Ave();
        Peixe peixe = new Peixe();

        mamifero.comer();
        mamifero.amamentar();

        ave.comer();
        ave.voar();

        peixe.comer();
        peixe.nadar();
    }

    /*
     * Comentário sobre SOLID:
     * - A hierarquia de classes respeita o princípio da substituição de Liskov (LSP) e o SRP.
     * - O método "main" deve ser movido para outra classe que se encarregue da execução.
     */
}


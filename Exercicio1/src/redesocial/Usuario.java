package redesocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<String> amigos;

    public Usuario(String nome) {
        this.nome = nome;
        this.amigos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<String> getAmigos() {
        return amigos;
    }

    public void adicionarAmigo(String amigo) {
        amigos.add(amigo);
        System.out.println(amigo + " foi adicionado como amigo de " + nome + ".");
    }
}

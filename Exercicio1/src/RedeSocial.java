import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RedeSocial {
    private Map<String, List<String>> amigos;
    private List<String> posts;

    public RedeSocial() {
        amigos = new HashMap<>();
        posts = new ArrayList<>();
    }

    public void adicionarAmigo(String usuario, String amigo) {
        amigos.putIfAbsent(usuario, new ArrayList<>());
        amigos.get(usuario).add(amigo);
        System.out.println(amigo + " foi adicionado como amigo de " + usuario + ".");
    }

    public void publicarMensagem(String usuario, String mensagem) {
        String post = usuario + ": " + mensagem;
        posts.add(post);
        System.out.println(usuario + " publicou: " + mensagem);
    }

    public void comentarPost(int indicePost, String comentario) {
        if (indicePost >= 0 && indicePost < posts.size()) {
            posts.set(indicePost, posts.get(indicePost) + " | Comentário: " + comentario);
            System.out.println("Comentário adicionado ao post.");
        } else {
            System.out.println("Post não encontrado.");
        }
    }

    public void buscarUsuario(String usuario) {
        if (amigos.containsKey(usuario)) {
            System.out.println("Usuário: " + usuario);
            System.out.println("Amigos: " + amigos.get(usuario));
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }

    public static void main(String[] args) {
        RedeSocial rede = new RedeSocial();
        rede.adicionarAmigo("Alice", "Bob");
        rede.publicarMensagem("Alice", "Olá, mundo!");
        rede.comentarPost(0, "Bem-vindo!");
        rede.buscarUsuario("Alice");
    }
}

package redesocial;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPosts {
    private List<String> posts;

    public GerenciadorPosts() {
        posts = new ArrayList<>();
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

    public void exibirPosts() {
        for (int i = 0; i < posts.size(); i++) {
            System.out.println(i + ": " + posts.get(i));
        }
    }
}

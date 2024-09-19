package redesocial;

public class RedeSocial {
    private GerenciadorAmigos gerenciadorAmigos;
    private GerenciadorPosts gerenciadorPosts;

    public RedeSocial() {
        this.gerenciadorAmigos = new GerenciadorAmigos();
        this.gerenciadorPosts = new GerenciadorPosts();
    }

    public Usuario criarUsuario(String nome) {
        return gerenciadorAmigos.criarUsuario(nome);
    }

    public void adicionarAmigo(String usuario, String amigo) {
        Usuario user = gerenciadorAmigos.buscarUsuario(usuario);
        if (user != null) {
            user.adicionarAmigo(amigo);
        } else {
            System.out.println("Usuário " + usuario + " não encontrado.");
        }
    }

    public void publicarMensagem(String usuario, String mensagem) {
        gerenciadorPosts.publicarMensagem(usuario, mensagem);
    }

    public void comentarPost(int indicePost, String comentario) {
        gerenciadorPosts.comentarPost(indicePost, comentario);
    }

    public void exibirPosts() {
        gerenciadorPosts.exibirPosts();
    }

    public void buscarUsuario(String nome) {
        Usuario usuarioEncontrado = gerenciadorAmigos.buscarUsuario(nome);
        if (usuarioEncontrado != null) {
            System.out.println("Usuário: " + usuarioEncontrado.getNome());
            System.out.println("Amigos: " + usuarioEncontrado.getAmigos());
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
}

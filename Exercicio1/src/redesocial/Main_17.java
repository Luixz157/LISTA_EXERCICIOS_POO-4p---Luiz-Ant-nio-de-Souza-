package redesocial;

public class Main_17 {
    public static void main(String[] args) {
        RedeSocial redeSocial = new RedeSocial();

        // Criando usuários e adicionando amigos
        redeSocial.criarUsuario("Alice");
        redeSocial.adicionarAmigo("Alice", "Bob");

        // Publicando e comentando posts
        redeSocial.publicarMensagem("Alice", "Olá, mundo!");
        redeSocial.comentarPost(0, "Bem-vindo!");

        // Exibindo posts
        redeSocial.exibirPosts();

        // Buscar usuário e exibir amigos
        redeSocial.buscarUsuario("Alice");
    }
}

package redesocial;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorAmigos {
    private Map<String, Usuario> usuarios;

    public GerenciadorAmigos() {
        usuarios = new HashMap<>();
    }

    public Usuario criarUsuario(String nome) {
        Usuario usuario = new Usuario(nome);
        usuarios.put(nome, usuario);
        return usuario;
    }

    public Usuario buscarUsuario(String nome) {
        return usuarios.get(nome);
    }
}

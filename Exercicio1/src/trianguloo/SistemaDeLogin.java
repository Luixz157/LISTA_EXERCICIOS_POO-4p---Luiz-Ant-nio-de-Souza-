//Classe SistemaDeLogin
//Implemente uma classe chamada SistemaDeLogin que gerencie os logins dos usuários em um sistema. O sistema deve armazenar o nome de usuário e senha, além de ter métodos para registrar, autenticar e remover usuários.


package trianguloo;

import java.util.HashMap;
import java.util.Scanner;

public class SistemaDeLogin {
    // Atributo para armazenar usuários
    private HashMap<String, String> usuarios;

    // Construtor
    public SistemaDeLogin() {
        usuarios = new HashMap<>();
    }

    // Método para registrar um usuário
    public void registrarUsuario(String nome, String senha) {
        if (!usuarios.containsKey(nome)) {
            usuarios.put(nome, senha);
            System.out.println("Usuário registrado com sucesso.");
        } else {
            System.out.println("Usuário já existe.");
        }
    }

    // Método para autenticar um usuário
    public boolean autenticarUsuario(String nome, String senha) {
        if (usuarios.containsKey(nome) && usuarios.get(nome).equals(senha)) {
            System.out.println("Login bem-sucedido.");
            return true;
        } else {
            System.out.println("Nome de usuário ou senha incorretos.");
            return false;
        }
    }

    // Método principal (main)
    public static void main(String[] args) {
        SistemaDeLogin sistema = new SistemaDeLogin();
        Scanner scanner = new Scanner(System.in);

        // Exemplo de registro e login
        System.out.println("Digite o nome do usuário para registro:");
        String nome = scanner.nextLine();
        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();
        sistema.registrarUsuario(nome, senha);

        // Tentativa de login
        System.out.println("Digite o nome do usuário para login:");
        nome = scanner.nextLine();
        System.out.println("Digite a senha:");
        senha = scanner.nextLine();
        sistema.autenticarUsuario(nome, senha);
    }

    /*
     * Comentário sobre SOLID:
     * - A classe respeita o SRP, pois apenas cuida do registro e autenticação de usuários.
     * - O método "main" deve ser movido para uma classe separada, seguindo o princípio de responsabilidade única.
     */
}

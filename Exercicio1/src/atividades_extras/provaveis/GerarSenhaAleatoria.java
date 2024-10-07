package atividades_extras.provaveis;

import java.util.Random;

public class GerarSenhaAleatoria {

    public static void main(String[] args) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        Random random = new Random();
        StringBuilder senha = new StringBuilder();

        // Gera uma senha de 8 caracteres aleatórios
        for (int i = 0; i < 8; i++) {
            int indice = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }

        // Exibe a senha gerada
        System.out.println("Senha gerada: " + senha);
    }
}


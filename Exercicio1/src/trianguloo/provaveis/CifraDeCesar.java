package trianguloo.provaveis;

import java.util.Scanner;

public class CifraDeCesar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a mensagem e o deslocamento da cifra
        System.out.println("Digite a mensagem a ser criptografada:");
        String mensagem = scanner.nextLine();
        System.out.println("Digite o valor do deslocamento:");
        int deslocamento = scanner.nextInt();

        // Criptografa a mensagem usando a Cifra de César
        StringBuilder mensagemCriptografada = new StringBuilder();
        for (char c : mensagem.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + deslocamento) % 26 + base);
            }
            mensagemCriptografada.append(c);
        }

        // Exibe a mensagem criptografada
        System.out.println("Mensagem criptografada: " + mensagemCriptografada);
    }
}


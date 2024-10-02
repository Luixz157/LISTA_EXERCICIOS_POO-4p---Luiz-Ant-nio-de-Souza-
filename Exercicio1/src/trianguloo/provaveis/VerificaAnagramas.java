package trianguloo.provaveis;

import java.util.Scanner;
import java.util.Arrays;

public class VerificaAnagramas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário as duas palavras
        System.out.println("Digite a primeira palavra:");
        String palavra1 = scanner.nextLine();
        System.out.println("Digite a segunda palavra:");
        String palavra2 = scanner.nextLine();

        // Remove espaços em branco e converte para letras minúsculas
        palavra1 = palavra1.replaceAll("\\s+", "").toLowerCase();
        palavra2 = palavra2.replaceAll("\\s+", "").toLowerCase();

        // Verifica se têm o mesmo comprimento
        if (palavra1.length() != palavra2.length()) {
            System.out.println("Não são anagramas.");
            return;
        }

        // Converte as palavras em arrays de caracteres
        char[] array1 = palavra1.toCharArray();
        char[] array2 = palavra2.toCharArray();

        // Ordena os arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Verifica se os arrays são iguais
        if (Arrays.equals(array1, array2)) {
            System.out.println("As palavras são anagramas.");
        } else {
            System.out.println("As palavras não são anagramas.");
        }
    }
}

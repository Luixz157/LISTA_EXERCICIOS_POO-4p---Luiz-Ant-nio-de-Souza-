package atividades_extras.provaveis;

import java.util.Scanner;

public class ContagemVogaisConsoantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma palavra ou frase:");
        String texto = scanner.nextLine().toLowerCase();
        
        int vogais = 0, consoantes = 0;
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }
        
        System.out.println("Número de vogais: " + vogais);
        System.out.println("Número de consoantes: " + consoantes);
    }
}


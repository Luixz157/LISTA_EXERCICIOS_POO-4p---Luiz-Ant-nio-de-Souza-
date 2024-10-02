package trianguloo.provaveis;

import java.util.Scanner;

public class VerificaPalindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma palavra ou número:");
        String original = scanner.nextLine();
        
        String invertida = new StringBuilder(original).reverse().toString();
        
        if (original.equals(invertida)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }
}


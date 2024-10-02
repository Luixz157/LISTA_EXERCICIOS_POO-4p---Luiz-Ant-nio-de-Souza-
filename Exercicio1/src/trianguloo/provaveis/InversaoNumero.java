package trianguloo.provaveis;

import java.util.Scanner;

public class InversaoNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        int invertido = 0;
        
        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }
        
        System.out.println("O número invertido é: " + invertido);
    }
}


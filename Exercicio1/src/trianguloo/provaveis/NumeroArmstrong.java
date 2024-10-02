package trianguloo.provaveis;

import java.util.Scanner;

public class NumeroArmstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número
        System.out.println("Digite um número para verificar se é Armstrong:");
        int numero = scanner.nextInt();
        int soma = 0, temp = numero;
        int digitos = String.valueOf(numero).length();

        // Calcula a soma dos dígitos elevados ao número de dígitos
        while (temp != 0) {
            int digito = temp % 10;
            soma += Math.pow(digito, digitos);
            temp /= 10;
        }

        // Verifica se a soma é igual ao número original
        if (soma == numero) {
            System.out.println(numero + " é um número Armstrong.");
        } else {
            System.out.println(numero + " não é um número Armstrong.");
        }
    }
}

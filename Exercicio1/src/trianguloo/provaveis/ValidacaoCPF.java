package trianguloo.provaveis;

import java.util.Scanner;

public class ValidacaoCPF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o CPF do usuário
        System.out.println("Digite o CPF (apenas números):");
        String cpf = scanner.nextLine();

        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            System.out.println("CPF inválido.");
            return;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito >= 10) {
            primeiroDigito = 0;
        }

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito >= 10) {
            segundoDigito = 0;
        }

        // Verifica os dígitos verificadores
        if (primeiroDigito == (cpf.charAt(9) - '0') && segundoDigito == (cpf.charAt(10) - '0')) {
            System.out.println("CPF válido.");
        } else {
            System.out.println("CPF inválido.");
        }
    }
}


package atividades_extras.provaveis;

import java.util.Scanner;
import java.util.Stack;

public class ValidacaoExpressao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a expressão matemática
        System.out.println("Digite uma expressão matemática:");
        String expressao = scanner.nextLine();

        // Verifica se a expressão está balanceada
        if (verificaBalanceamento(expressao)) {
            System.out.println("A expressão está balanceada.");
        } else {
            System.out.println("A expressão não está balanceada.");
        }
    }

    // Função que verifica o balanceamento de parênteses, colchetes e chaves
    public static boolean verificaBalanceamento(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (char c : expressao.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                pilha.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (pilha.isEmpty()) {
                    return false;
                }
                char topo = pilha.pop();
                if ((c == ')' && topo != '(') || (c == '}' && topo != '{') || (c == ']' && topo != '[')) {
                    return false;
                }
            }
        }
        return pilha.isEmpty();
    }
}


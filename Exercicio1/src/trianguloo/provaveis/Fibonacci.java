package trianguloo.provaveis;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos termos da sequência de Fibonacci você deseja?");
        int n = scanner.nextInt();
        
        int num1 = 0, num2 = 1;
        System.out.print("Sequência de Fibonacci: " + num1 + " " + num2);
        
        for (int i = 2; i < n; i++) {
            int prox = num1 + num2;
            System.out.print(" " + prox);
            num1 = num2;
            num2 = prox;
        }
    }
}


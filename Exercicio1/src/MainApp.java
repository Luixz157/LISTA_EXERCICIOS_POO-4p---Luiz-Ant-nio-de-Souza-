
import circulo.Main_1;
import contabancaria.Main_2;
import retangulo.Main_3;
import aluno.Main_4;
import funcionario.Main_5;
import produto.Main_6;
import triangulo.Main_7;
import carro.Main_8;
import paciente.Main_9;
import livro.Main_10;
import pessoa.Main_11;
import banco.Main_12;
import lojavirtual.Main_13;
import agenda.Main_14;
import maquinadevendas.Main_15;
import jogocartas.Main_16;
import redesocial.Main_17;
import biblioteca.Main_18;
import calendario.Main_19;
import jogoadivinhacao.Main_20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha o programa que deseja executar:");
            System.out.println("1. Círculo");
            System.out.println("2. ContaBancária");
            System.out.println("3. Retângulo");
            System.out.println("4. Aluno");
            System.out.println("5. Funcionário");
            System.out.println("6. Produto");
            System.out.println("7. Triângulo");
            System.out.println("8. Carro");
            System.out.println("9. Paciente");
            System.out.println("10. Livro");
            System.out.println("11. Pessoa");
            System.out.println("12. Banco");
            System.out.println("13. LojaVirtual");
            System.out.println("14. Agenda");
            System.out.println("15. MáquinaDeVendas");
            System.out.println("16. JogoCartas");
            System.out.println("17. RedeSocial");
            System.out.println("18. Biblioteca");
            System.out.println("19. Calendario");
            System.out.println("20. JogoAdivinhacao");
            System.out.println("0. Sair");

            int opcao = -1;
            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, insira um número.");
                scanner.next(); // Clear the invalid input
                continue;
            }

            switch (opcao) {
                case 1:
                    circulo.Main_1.main(args);                   
                    break;
                case 2:
                    contabancaria.Main_2.main(args);                    
                    break;
                case 3:
                    retangulo.Main_3.main(args);                   
                    break;
                case 4:
                    aluno.Main_4.main(args);                   
                    break;
                case 5:
                    funcionario.Main_5.main(args);                  
                    break;
                case 6:
                    produto.Main_6.main(args);
                    break;
                case 7:
                    triangulo.Main_7.main(args);
                    break;
                case 8:
                    carro.Main_8.main(args);
                    break;
                case 9:
                    paciente.Main_9.main(args);                  
                    break;
                case 10:
                    livro.Main_10.main(args);                    
                    break;
                case 11:
                    pessoa.Main_11.main(args);
                    break;
                case 12:
                    banco.Main_12.main(args);                    
                    break;
                case 13:
                    lojavirtual.Main_13.main(args);
                    break;
                case 14:
                    agenda.Main_14.main(args);                   
                    break;
                case 15:
                    maquinadevendas.Main_15.main(args);                   
                    break;
                case 16:
                    jogocartas.Main_16.main(args);
                    break;
                case 17:
                    redesocial.Main_17.main(args);                    
                    break;
                case 18:
                    biblioteca.Main_18.main(args);
                    break;
                case 19:
                    calendario.Main_19.main(args);                   
                    break;
                case 20:
                    jogoadivinhacao.Main_20.main(args);                    
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}

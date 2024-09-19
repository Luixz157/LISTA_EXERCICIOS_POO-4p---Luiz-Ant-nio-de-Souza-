package pessoa;

import pessoa.util.AnoUtil;

public class Main_11 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Luiz Antônio Souza", 20, "Programador");

        // Exibir informações da pessoa
        pessoa.exibirInformacoesPessoa();

        // Calcular e exibir se um ano é bissexto
        int ano = 2024;
        if (AnoUtil.isBissexto(ano)) {
            System.out.println(ano + " é um ano BISSEXTO.");
        } else {
            System.out.println(ano + " não é um ano BISSEXTO.");
        }
    }
}

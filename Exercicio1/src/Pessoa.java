public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade ;
        this.profissao = profissao;
    }

    public void CalcularBissextos(int ano) {
        if ((ano % 4 == 0 && ano % 100 != 0 ) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano BISSEXTO.");
        } else {
            System.out.println(ano + " não é um ano BISSEXTO.");
        }
    }

    public void ExibirInformacoesPessoa() {
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissão: " + profissao);
    }

    public static void main(String[] str) {
        Pessoa pessoa = new Pessoa("Luiz Antônio Souza", 20, "Programador");

        pessoa.ExibirInformacoesPessoa();

        pessoa.CalcularBissextos(2024);
    }
}

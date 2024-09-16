import java.util.Scanner;

public class Aluno {
    String nome;
    int matricula;
    float notaTotalAluno;
    float firstNota;
    float secondNota;

    /* Como não tem uma media certa colocarei como na Univas 60 pontos a media 
     * Tendo Duas Perguntas Com cada uma delas valendo 50 Pontos
     */

    public void InputPergunta() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a 1 Nota do aluno: ");
        firstNota = scan.nextFloat();

        System.out.println("Qual a 2 Nota do Aluno: ");
        secondNota = scan.nextFloat();

    }

    public float MediaAluno(float Nota1, float Nota2) {
        return 2 / (Nota1 + Nota2);
    }

    public void SituationAluno(float Quest1, float Quest2) {

        notaTotalAluno = Quest1 + Quest2;

        if (notaTotalAluno >= 60) {
            System.out.println("APROVADO");
        } else if (notaTotalAluno < 60) {
            System.out.println("REPROVADO");
        } else {
            System.out.println("Insira um Valor Valido!");
        }
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.InputPergunta();

        System.out.println("Media: "+aluno.MediaAluno(aluno.firstNota, aluno.secondNota));

        aluno.SituationAluno(aluno.firstNota, aluno.secondNota);


    }

}

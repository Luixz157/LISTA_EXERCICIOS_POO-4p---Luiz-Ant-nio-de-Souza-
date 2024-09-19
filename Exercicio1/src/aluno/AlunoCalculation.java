package aluno;

import aluno.interfaces.Calculation;

public class AlunoCalculation implements Calculation {
    @Override
    public float calculateAverage(float nota1, float nota2) {
        return (nota1 + nota2) / 2;
    }

    @Override
    public String determineSituation(float nota1, float nota2) {
        float notaTotalAluno = nota1 + nota2;

        if (notaTotalAluno >= 60) {
            return "APROVADO";
        } else if (notaTotalAluno < 60) {
            return "REPROVADO";
        } else {
            return "Valor inválido!";
        }
    }
}

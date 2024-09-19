package aluno;

import aluno.interfaces.Calculation;
import aluno.interfaces.InputData;

public class Main_4 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        InputData inputData = new AlunoInput(aluno);
        inputData.getInput();

        Calculation calculation = new AlunoCalculation();
        float media = calculation.calculateAverage(aluno.getFirstNota(), aluno.getSecondNota());

        System.out.println("Média: " + media);
        System.out.println(calculation.determineSituation(aluno.getFirstNota(), aluno.getSecondNota()));
    }
}

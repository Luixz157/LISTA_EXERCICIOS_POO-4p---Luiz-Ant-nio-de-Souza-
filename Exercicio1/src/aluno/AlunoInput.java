package aluno;

import aluno.interfaces.InputData;
import java.util.Scanner;

public class AlunoInput implements InputData {
    private Aluno aluno;

    public AlunoInput(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public void getInput() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual a 1ª nota do aluno: ");
        aluno.setFirstNota(scan.nextFloat());

        System.out.println("Qual a 2ª nota do aluno: ");
        aluno.setSecondNota(scan.nextFloat());

        scan.close();
    }
}

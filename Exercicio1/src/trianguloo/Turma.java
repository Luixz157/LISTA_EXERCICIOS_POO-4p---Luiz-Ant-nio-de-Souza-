//Classe Turma
//Implemente uma classe chamada Turma que possua uma lista de alunos. Adicione métodos para calcular a média da turma, listar os alunos aprovados, e verificar quantos alunos foram reprovados.



package trianguloo;

import java.util.ArrayList;
import java.util.List;

class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }
}

public class Turma {
    private List<Aluno> alunos;

    public Turma() {
        alunos = new ArrayList<>();
    }

    // Método para adicionar alunos
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Método para calcular a média da turma
    public double calcularMedia() {
        double soma = 0.0;
        for (Aluno aluno : alunos) {
            soma += aluno.getNota();
        }
        return soma / alunos.size();
    }

    // Método para listar alunos aprovados
    public void listarAprovados() {
        System.out.println("Alunos aprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.getNota() >= 6.0) {
                System.out.println(aluno.getNome() + " - Nota: " + aluno.getNota());
            }
        }
    }

    // Método principal (main)
    public static void main(String[] args) {
        Turma turma = new Turma();
        turma.adicionarAluno(new Aluno("João", 7.5));
        turma.adicionarAluno(new Aluno("Maria", 5.5));
        turma.adicionarAluno(new Aluno("Pedro", 9.0));

        System.out.println("Média da turma: " + turma.calcularMedia());
        turma.listarAprovados();
    }

    /*
     * Comentário sobre SOLID:
     * - A classe "Turma" respeita o SRP, pois cuida apenas da lógica relacionada aos alunos da turma.
     * - O método "main" deve ser movido para uma classe separada para manter o SRP.
     */
}


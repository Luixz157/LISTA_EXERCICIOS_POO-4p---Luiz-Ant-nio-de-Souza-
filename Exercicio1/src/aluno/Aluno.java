package aluno;

public class Aluno {
    private String nome;
    private int matricula;
    private float firstNota;
    private float secondNota;

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getFirstNota() {
        return firstNota;
    }

    public void setFirstNota(float firstNota) {
        this.firstNota = firstNota;
    }

    public float getSecondNota() {
        return secondNota;
    }

    public void setSecondNota(float secondNota) {
        this.secondNota = secondNota;
    }
}

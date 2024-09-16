import java.util.ArrayList;

public class Livro {

    private String titulo;
    private String autor;
    private int numPage;


    private ArrayList<String> historicoLivros;

    public Livro() {
        this.historicoLivros = new ArrayList<>();
    }

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPage = numeroPaginas;
        this.historicoLivros = new ArrayList<>();
    }

    public void EmprestarLivro(String Livro) {
        this.historicoLivros.add(Livro);
        System.out.println("Livro Emprestado: "+ Livro);
    }

    public void DevolverLivro(String Livro) {
        this.historicoLivros.add(Livro);
        System.out.println("Livro Devolvido: "+ Livro);

    }

    public void VerificarDisponibilidade() {
        System.out.println("Historico de Disponibilidade: ");
        if (historicoLivros.isEmpty()) {
            System.out.println("Não há Disponibilidades");
        } else {
            for (String book : historicoLivros) {
                System.out.println(book);
            }
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPage() {
        return numPage;
    }

    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }


    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.EmprestarLivro("Harry Potter e a Pedra Filosofal ");
        livro.DevolverLivro("Harry Potter e a Câmara Secreta");

        livro.VerificarDisponibilidade();
    } 



}

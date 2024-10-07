package atividades_extras;

import java.util.ArrayList;
import java.util.List;
public class TesteC {
    public List<String> lista;
    public TesteC() {
        lista = new ArrayList<>();
    }
    public static void main(String[] args) {   
        TesteC test = new TesteC();
        test.lista.add("Aluno");
        test.lista.add("Aluno2");
        System.out.println(test.lista);
    }
}


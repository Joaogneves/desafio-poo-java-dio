import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", "Curso de java para iniciantes...", 8);
        Curso curso2 = new Curso("Kotlin", "Curso de kotlin para iniciantes...", 8);

        Mentoria mentoria = new Mentoria("Mentoria de java", "mentoria java...", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
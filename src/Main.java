import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de java");
        curso1.setDescricao("curso java...");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Kotlin");
        curso2.setDescricao("curso de kotlin...");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("mentoria java...");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverbootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("XP:" + devJoao.calcTotalXp() );
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("XP:" + devJoao.calcTotalXp() );

        System.out.println(" ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(" ");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverbootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("XP:" + devCamila.calcTotalXp() );devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("XP:" + devCamila.calcTotalXp() );devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("XP:" + devCamila.calcTotalXp() );
    }
}
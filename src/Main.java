import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Curso cursoA = new Curso();
        cursoA.setTitulo("Curso A");
        cursoA.setDescricao("Descricao do curso A");
        cursoA.setCargaHoraria(12);
        Curso cursoB = new Curso();
        cursoA.setTitulo("Curso B");
        cursoA.setDescricao("Descricao do curso B");
        cursoA.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria A");
        mentoria.setDescricao("Grupo mentoria A");
        mentoria.setData(LocalDate.now());
        mentoria.setTitulo("Mentoria B");
        mentoria.setDescricao("Grupo mentoria B");
        mentoria.setData(LocalDate.now().plusMonths(1));

        //Conteudo conteudo = new Curso();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao about java developer");
        bootcamp.getConteudos().add(cursoA);
        bootcamp.getConteudos().add(cursoB);
        bootcamp.getConteudos().add(mentoria);

        Dev devChristian = new Dev();
        devChristian.setNome("Christian S Barbosa");
        devChristian.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos, Christian: " + devChristian.getConteudosInscritos());
        devChristian.progredir();
        System.out.println("Conteudos inscritos, Christian: " + devChristian.getConteudosInscritos());
        System.out.println("Conteudos concluidos, Christian: " + devChristian.getConteudosConluidos());
        System.out.println("XP: " + devChristian.calcularXp());

        Dev devJoao = new Dev();
        devJoao.setNome("Joao jan");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos, Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos inscritos, Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos, Joao: " + devJoao.getConteudosConluidos());
        System.out.println("XP: " + devJoao.calcularXp());

        System.out.println(cursoA);
        System.out.println(cursoB);
    }
}
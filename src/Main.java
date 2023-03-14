import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        System.out.println(cursoA);
        System.out.println(cursoB);
    }
}
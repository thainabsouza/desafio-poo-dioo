import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();

    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Descricao curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();

    curso2.setTitulo("Curso JS");
    curso2.setDescricao("Descricao curso J?S");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria Java");
    mentoria.setDescricao("Descricao mentoria Java");
    mentoria.setData(LocalDate.now());


    System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
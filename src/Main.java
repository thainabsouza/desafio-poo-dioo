import br.com.dio.desafio.dominio.*;

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

    Conteudo conteudo = new Curso();
    Conteudo conteudo2 = new Curso();




    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria Java");
    mentoria.setDescricao("Descricao mentoria Java");
    mentoria.setData(LocalDate.now());


    /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThaina = new Dev();
        devThaina.setNome("Thaina");
        devThaina.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Thaina" + devThaina.getConteudosInscritos());
        devThaina.progredir();
        devThaina.progredir();
        System.out.println("Conteudos Inscritos Thaina" + devThaina.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Thaina" + devThaina.getConteudosConcluidos());
        System.out.println("XP:"+ devThaina.CalcularTotalXp() );

        System.out.println("-------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP:"+ devJoao.CalcularTotalXp() );





    }
}
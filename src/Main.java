import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Dev;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria  = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHerbert = new Dev();
        devHerbert.setNome("Herbert");
        System.out.println("Conteúdos Inscritos Herbert:" + devHerbert.getconteudoInscritos());
        devHerbert.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Herbert:" + devHerbert.getconteudoInscritos());
        System.out.println("Conteúdos Concluídos Herbert:" + devHerbert.getconteudosConcluidos());
        System.out.println("XP:" + devHerbert.calcularTotalXp());

        System.out.println("------");


        Dev devJose = new Dev();
        devJose.setNome("Jose");
        System.out.println("Conteúdos Inscritos" +  devJose.getconteudoInscritos());
        devJose.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos" +  devJose.getconteudoInscritos());
        System.out.println("Conteúdos Concluídos João" + devJose.getconteudosConcluidos);
        System.out.println("XP:" + devJose.calcularTotalXp());
    }
}
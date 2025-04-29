package desafio;
import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

    Mentoria mentoria1 = new Mentoria();

    mentoria1.setTitulo(" mentoria java");
    mentoria1.setDescricao(" Descricao mentoria java");
    mentoria1.setData(LocalDate.now());
    
    Curso curso1 = new Curso();
    curso1.setTitulo(" java ");
    curso1.setDescricao(" descricao ");
    curso1.setCargaHoraria(80);
    
    Curso curso2 = new Curso();
    curso2.setTitulo(" C++ ");
    curso2.setDescricao(" descricao ");
    curso2.setCargaHoraria(100);
    
    Bootcamp bootcamp1 = new Bootcamp();
    bootcamp1.setNome(" java ");
    bootcamp1.setDescricao(" descricao ");
    bootcamp1.getConteudos().add(curso1);
    bootcamp1.getConteudos().add(curso2);
    bootcamp1.getConteudos().add(mentoria1);

    Dev dev1 = new Dev();
    dev1.setNome("Camila");
        dev1.increverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos luis:" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos luis:" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos luis:" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("---------------------------------------------");



    Dev dev2 = new Dev();
    dev2.setNome("joao");
    dev2.increverBootcamp(bootcamp1);
        System.out.println(" Conteudos Inscritos = " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos Inscritos = " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos = " + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());
    
    // Conteudo conteudo = new Curso(); <---- exemplo polimorfismo
   
    }
    
}

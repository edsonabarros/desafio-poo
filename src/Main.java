import online.edsonabarros.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao(" Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        // polimorfismo - instanciar com mais de uma forma.
        Conteudo conteudo = new Curso();
//
//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEdson = new Dev();
        devEdson.setNome("Edson");
        devEdson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Edson"+ devEdson.getConteudoInscritos());
        devEdson.progredir();
        devEdson.progredir();
        System.out.println("Conteúdos inscritos Edson"+ devEdson.getConteudoInscritos());
        System.out.println("Conteúdos concluidos Edson"+ devEdson.getConteudoConcluidos());
        System.out.println("XP: "+ devEdson.calcularTotalXp());

        System.out.println("-----------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João"+ devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos inscritos João"+ devJoao.getConteudoInscritos());
        System.out.println("Conteúdos concluidos João"+ devJoao.getConteudoConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());



    }
}
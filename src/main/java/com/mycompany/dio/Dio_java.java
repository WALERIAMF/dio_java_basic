/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.dio;

import java.time.LocalDate;
import model.Bootcamp;
import model.Curso;
import model.Dev;
import model.Mentoria;

/**
 *
 * @author waler
 */
public class Dio_java {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Edição programa");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso JS");
        curso1.setDescricao("Edição programa JS");
        curso1.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao(" mentoria para projetos Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Curso para programação Java");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);
        
        
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscrito " + devCamila.getNome() + " : " + devCamila.getConteudoInscrito());
        devCamila.progredir();
        System.out.println("--");
        System.out.println("Conteúdo Inscrito " + devCamila.getNome() + " : " + devCamila.getConteudoInscrito());
        System.out.println("Conteúdo Concluído " + devCamila.getNome() + " : " + devCamila.getConteudoConcluido());
        System.out.println("XP: " + devCamila.calculaTotalXp());
        
        System.out.println("-----------------------------");
        
        Dev devValeria = new Dev();
        devValeria.setNome("Valéria");
        devValeria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscrito " + devValeria.getNome() + " : " + devValeria.getConteudoInscrito());
        devValeria.progredir();

        System.out.println("Conteúdo Inscrito " + devCamila.getNome() + " : " + devCamila.getConteudoInscrito());
        System.out.println("Conteúdo Concluído " + devValeria.getNome() + " : " + devValeria.getConteudoConcluido());
        System.out.println("XP: " + devValeria.calculaTotalXp());

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/**
 *
 * @author waler
 */
public class Dev {

    private String nome;

    private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();//LinkedHashSet quando é uma lista que não haverá repetição
    private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudoConcluido.addAll(bootcamp.getConteudo());
        bootcamp.getDevInscricoes().add(this);
    }

    public Set<Conteudo> getConteudoInscrito() {
        return conteudoInscrito;
    }

    public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
        this.conteudoInscrito = conteudoInscrito;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudoConcluido = conteudoConcluido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudoInscrito.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudoConcluido.add(conteudo.get());
            this.conteudoInscrito.remove(conteudo.get());
        } else {
            System.err.print("Você não está matriculado em nenhum conteúdo!");
        }

    }

    public double calculaTotalXp() {

        return this.conteudoConcluido.stream()
                .mapToDouble(conteudo -> conteudo.calcularXP())
                .sum();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nome);
        hash = 83 * hash + Objects.hashCode(this.conteudoInscrito);
        hash = 83 * hash + Objects.hashCode(this.conteudoConcluido);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dev other = (Dev) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.conteudoInscrito, other.conteudoInscrito)) {
            return false;
        }
        return Objects.equals(this.conteudoConcluido, other.conteudoConcluido);
    }

}

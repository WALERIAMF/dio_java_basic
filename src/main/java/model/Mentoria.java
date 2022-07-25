/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author waler
 */
public class Mentoria extends Conteudo{
    
    private LocalDate data;


    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }
    
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

  @Override
  public String toString(){
      return "Mentoria{" +
              "titulo = '" +getTitulo() + '\''+ 
              ", descrição='" +getDescricao() + '\'' +
      ", data = " + data +
              '}';
  }
  
}

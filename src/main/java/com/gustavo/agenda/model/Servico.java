package com.gustavo.agenda.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_servico")
public class  Servico {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

   @NotBlank(message = "o nome do servico é obrigatorio")
   private  String nome;

   @Positive(message = "o preco deve ser um valor positivo")
   private double preco;

   @Positive(message = "a duracao deve ser um valor positivo")
   private int duracaoMinutos;
   

   public Servico () {

   }

   public String getNome() {
    return this.nome;
   }

   public double getPreco() {
    return this.preco;
   }

   public int getDuracaoMinutos() {
    return this.duracaoMinutos;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public void setNome(String nome) {
    this.nome = nome;
   } 
   public void setPreco(double preco) {
    this.preco = preco;
   }
   public void setDuracacao(int duracaoMinutos) {
    this.duracaoMinutos = duracaoMinutos;
   }

   @Override
   public String toString() {
    return "Servico{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", duracaoMinutos=" + duracaoMinutos +
                '}';
   }

    
}

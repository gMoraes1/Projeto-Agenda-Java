package com.gustavo.agenda.model;

public class Servico {
   private  String nome;
   private double preco;
   private int duracaoMinutos;
   private int id;

   public Servico (String nome, double preco, int duracaoMinutos) {
    this.nome = nome;
    this.preco = preco;
    this.duracaoMinutos = duracaoMinutos;
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

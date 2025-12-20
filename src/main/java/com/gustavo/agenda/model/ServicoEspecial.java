package com.gustavo.agenda.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("ESPECIAL")
public class ServicoEspecial extends Servico {

    private double taxaExtra;

    public ServicoEspecial(){
        
    }
    
    public double getTaxaExtra() {
        return this.taxaExtra;
    }

    public void setTaxaExtra(double taxaExtra) {
        this.taxaExtra = taxaExtra;
    }


    @Override
    public double getPreco() {
        return super.getPreco() + this.taxaExtra;
    }

    @Override 
    public String toString() {
        return "ServicoEspecial{" +
                "nome='" + getNome() + '\'' +
                ", precoFinal=" + getPreco() +
                ", duracaoMinutos=" + getDuracaoMinutos() +
                ", taxaExtra=" + taxaExtra +
                '}';
    }


    
}

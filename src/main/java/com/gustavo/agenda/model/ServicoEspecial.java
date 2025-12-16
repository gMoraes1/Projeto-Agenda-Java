package model;

public class ServicoEspecial extends Servico {

    private double taxaExtra;

    public ServicoEspecial(String nome, double preco, int duracaoMinutos, double taxaExtra){
        super(nome, preco, duracaoMinutos);
        this.taxaExtra = taxaExtra;
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

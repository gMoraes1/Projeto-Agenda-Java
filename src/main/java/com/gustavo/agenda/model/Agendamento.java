package model;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Agendamento {
    private Cliente cliente;
    private Servico servico;
    private LocalDateTime dataHora;

    public Agendamento (Cliente cliente, Servico servico, LocalDateTime dataHora) {
        this.cliente = cliente;
        this.servico = servico;
        this.dataHora = dataHora;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Servico getServico() {
        return this.servico;
    }

    public LocalDateTime getDataHora() {
        return this.dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "cliente=" + cliente.getNome() +
                ", servico=" + servico.getNome() +
                ", dataHora=" + dataHora +
                '}';
    }
    
}

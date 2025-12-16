import model.Cliente;
import model.Agendamento;
import model.Servico;
import model.ServicoEspecial;
import service.AgendaService;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        AgendaService agendaService = new AgendaService();

        Cliente cliente1 = new Cliente("João Silva", "1199999-9999", "joao@email.com");
        Cliente cliente2 = new Cliente("Maria Souza", "1188888-8888", "maria@email.com");

        Servico servicoSimples = new Servico("Consulta Básica", 100.0, 60);

        Servico servicoEspecial = new ServicoEspecial("Consulta premiu", 150.0, 60, 50.0);

        LocalDateTime horario1 = LocalDateTime.of(2025, 1, 10, 10, 0);
        LocalDateTime horario2 = LocalDateTime.of(2025,1, 10, 11, 0);
        LocalDateTime horarioConflito = LocalDateTime.of(2025, 1, 10, 10, 0);

        agendaService.criarAgendamento(cliente1, servicoSimples, horario1);
        agendaService.criarAgendamento(cliente2, servicoEspecial, horario2);

        agendaService.criarAgendamento(cliente2, servicoEspecial, horarioConflito);

        System.out.println("\n Lista de agendamentos: ");
        agendaService.listarAgendamentos().forEach(System.out::println);
    }
}

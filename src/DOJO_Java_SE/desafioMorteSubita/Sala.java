package DOJO_Java_SE.desafioMorteSubita;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Sala {

    private String nome;
    private int capacidade;
    private List<Reserva> reservas;

    public Sala(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.reservas = new ArrayList<>();
    }

    public boolean verificarDisponibilidade(Reserva novaReserva){
        for(Reserva reservada : reservas){
            if(reservada.getData().equals(novaReserva.getData())){
                if(novaReserva.getHoraInicio().isBefore(reservada.getHoraFim())
                        && novaReserva.getHoraFim().isAfter(reservada.getHoraInicio())){
                    return false;
                }
            }
        }
        return true;
    }

    public void adicionarReserva(Reserva reserva) {
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        String dataFormatada = reserva.getData().format(formatoData);
        String horaInicioFormatada = reserva.getHoraInicio().format(formatoHora);
        String horaFimFormatada = reserva.getHoraFim().format(formatoHora);

        if (verificarDisponibilidade(reserva)) {
            this.reservas.add(reserva);
            System.out.printf(
                    "%s, sua reserva foi registrada com sucesso! Dia %s das %s às %s\n",
                    reserva.getResponsavel(), dataFormatada, horaInicioFormatada, horaFimFormatada
            );
        } else {
            System.out.printf(
                    "%s, esse horário não está disponível.\n",
                    reserva.getResponsavel(), dataFormatada, horaInicioFormatada, horaFimFormatada
            );
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}

package DOJO_Java_SE.desafioMorteSubita;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Reserva {

    private LocalDate data;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private String responsavel;

    public Reserva(LocalDate data, LocalTime horaInicio, LocalTime horaFim, String responsavel) {
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.responsavel = responsavel;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String getDataFormatada() {
        return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getHoraInicioFormatada() {
        return horaInicio.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    public String getHoraFimFormatada() {
        return horaFim.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

}
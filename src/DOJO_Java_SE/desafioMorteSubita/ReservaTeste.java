package DOJO_Java_SE.desafioMorteSubita;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservaTeste {
    public static void main(String[] args) {
        Sala sala101 = new Sala("Sala 101", 10);

        LocalDate data = LocalDate.of(2024, 9, 10);
        // Realizar uma reserva para a "Sala 101" no dia 10/09/2024, das 09:00 às 11:00, com o responsável "João"
        Reserva reservaJoao = new Reserva(data, LocalTime.of(9, 0), LocalTime.of(11, 0), "João");
        sala101.adicionarReserva(reservaJoao);

        // Tentar realizar uma nova reserva para a "Sala 101" no mesmo dia, das 10:00 às 12:00, com o responsável "Maria"
        Reserva reservaMaria = new Reserva(data, LocalTime.of(10, 0), LocalTime.of(12, 0), "Maria");
        sala101.adicionarReserva(reservaMaria);

        Reserva reservaTeste = new Reserva(data, LocalTime.of(11, 0), LocalTime.of(12, 0), "Teste");


        System.out.printf(
                "Dia %s das %s às %s\n",
                reservaTeste.getDataFormatada(),
                reservaTeste.getHoraInicioFormatada(),
                reservaTeste.getHoraFimFormatada()
        );
    }
}
package lista3.Exercicio2;

public class Relogio {

    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public static void main(String[] args) {
        try{
            Relogio relogio = new Relogio(23, 59, 59);

            System.out.println("• Hora inicial •");
            relogio.horaAtual();

            // Incrementando segundos
            System.out.println("\nIncrementando segundos...");
            relogio.incrementarSegundo();
            relogio.horaAtual();

            relogio.incrementarSegundo();
            relogio.horaAtual();

            // Incrementando minutos
            System.out.println("\nIncrementando minutos...");
            relogio.incrementarMinuto();
            relogio.horaAtual();

            relogio.incrementarMinuto();
            relogio.horaAtual();

            // Incrementando horas
            System.out.println("\nIncrementando horas...");
            relogio.incrementarHora();
            relogio.horaAtual();

            relogio.incrementarHora();
            relogio.horaAtual();

            // Acertar horas
            System.out.println("\nAcertando horas...");
            relogio.acertarRelogio(12, 30, 45);
            relogio.horaAtual();

        }
        catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }

    }

    public void acertarRelogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void horaAtual() {
        String horas = String.format("%02d:%02d:%02d", hora, minuto, segundo);
        System.out.println("Hora atual: " + horas);
    }

    public void incrementarSegundo(){
        if(segundo < 59){
            segundo++;
        }
        else{
            segundo = 0;
            incrementarMinuto();
        }
    }

    public void incrementarMinuto(){

        if(minuto < 59){
            minuto++;
        }
        else{
            minuto = 0;
            incrementarHora();
        }
    }

    public void incrementarHora(){
        if(hora < 23){
            hora++;
        }else{
            hora = 0;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora >= 0 && hora <= 23) this.hora = hora;
        else{
            throw new IllegalArgumentException("A hora deve ser um número positivo entre 0 e 23");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if(minuto >= 0 && minuto <= 59) this.minuto = minuto;
        else{
            throw new IllegalArgumentException("O minuto deve ser um número positivo entre 0 e 59");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if(segundo >= 0 && segundo <= 59) this.segundo = segundo;
        else{
            throw new IllegalArgumentException("O segundo deve ser um número positivo entre 0 e 59");
        }
    }
}

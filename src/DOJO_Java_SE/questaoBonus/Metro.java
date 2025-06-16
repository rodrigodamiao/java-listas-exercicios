package DOJO_Java_SE.questaoBonus;

public class Metro extends Veiculo {
    private double consumoKWhPorDia;
    private double precoPorKWh;

    public Metro(int capacidadeMaxima, double consumoKWhPorDia, double precoPorKWh) {
        super(capacidadeMaxima);
        this.consumoKWhPorDia = consumoKWhPorDia;
        this.precoPorKWh = precoPorKWh;
    }

    @Override
    public double custoOperacional() {
        return consumoKWhPorDia * precoPorKWh;
    }
}

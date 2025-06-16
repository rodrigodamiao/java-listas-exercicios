package DOJO_Java_SE.questaoBonus;

public class Onibus extends Veiculo {
    private double preco1LCombustivel;
    private double kmPorLitroCombustivel;
    private double kmPorDia;

    public Onibus(int capacidadeMaxima, double preco1LCombustivel, double kmPorLitroCombustivel, double kmPorDia) {
        super(capacidadeMaxima);
        this.preco1LCombustivel = preco1LCombustivel;
        this.kmPorLitroCombustivel = kmPorLitroCombustivel;
        this.kmPorDia = kmPorDia;
    }

    @Override
    public double custoOperacional() {
        return (kmPorDia/kmPorLitroCombustivel) * preco1LCombustivel;
    }
}

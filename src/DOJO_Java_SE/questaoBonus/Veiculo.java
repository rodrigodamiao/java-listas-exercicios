package DOJO_Java_SE.questaoBonus;

public abstract class Veiculo {
    private int capacidadeMaxima;
    private double velocidadeAtual = 0;

    public Veiculo(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public abstract double custoOperacional();

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}


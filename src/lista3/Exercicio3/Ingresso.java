package lista3.Exercicio3;

public class Ingresso {

    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("Ingresso comum - Valor: R$ %.2f", valor);
    }
}

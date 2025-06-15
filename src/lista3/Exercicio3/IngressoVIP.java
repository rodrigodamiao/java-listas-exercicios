package lista3.Exercicio3;

public class IngressoVIP extends Ingresso{

    private double valorAdicional;

    public IngressoVIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        return String.format("Ingresso VIP - Valor total: R$ %.2f", (valor + valorAdicional));
    }
}

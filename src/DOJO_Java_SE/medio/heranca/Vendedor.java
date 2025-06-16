package DOJO_Java_SE.medio.heranca;

public class Vendedor extends Funcionario{

    private final double bonusComissao = 0.05;
    private double valorVendas;

    public Vendedor(String nome, double salarioBase, double valorVendas) {
        super(nome, salarioBase);
        this.valorVendas = valorVendas;
    }

    public double valorComissao(){
        return bonusComissao * valorVendas;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + valorComissao();
    }

    @Override
    public String toString() {
        return String.format("Vendedor: %s | Salário base: R$%.2f | Vendas: R$%.2f | Comissão(%.0f%%): R$%.2f | Salário com comissão: R$%.2f",
                getNome(), getSalarioBase(), valorVendas, bonusComissao * 100, valorComissao(), calcularSalario());
    }
}

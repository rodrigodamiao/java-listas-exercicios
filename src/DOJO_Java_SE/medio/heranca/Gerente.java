package DOJO_Java_SE.medio.heranca;

public class Gerente extends Funcionario{

    private final double bonusFixo = 0.2;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public double getSalairoBonus(){
        return (getSalarioBase() * bonusFixo);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + getSalairoBonus();
    }

    @Override
    public String toString() {
        return String.format("Gerente: %s | Salário base: R$%.2f | Bônus(%.0f%%): R$%.2f | Salário com bônus: R$%.2f",
                getNome(), getSalarioBase(), bonusFixo * 100, getSalairoBonus(), calcularSalario());
    }
}

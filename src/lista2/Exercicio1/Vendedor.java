package lista2.Exercicio1;

public class Vendedor extends Funcionario{
    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.25);
    }
}

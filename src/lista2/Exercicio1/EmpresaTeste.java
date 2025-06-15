package lista2.Exercicio1;

public class EmpresaTeste {

    public static void main(String[] args) {
        Funcionario gerente = new Gerente();
        Funcionario telefonista = new Telefonista();
        Funcionario vendedor = new Vendedor();

        System.out.printf("Salário do Gerente: R$%.2f\n", gerente.calcularSalario());
        System.out.printf("Salário da Telefonista: R$%.2f\n", telefonista.calcularSalario());
        System.out.printf("Salário do Vendedor: R$%.2f\n", vendedor.calcularSalario());
    }
}

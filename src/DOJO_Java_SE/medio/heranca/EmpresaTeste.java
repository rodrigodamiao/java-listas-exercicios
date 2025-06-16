package DOJO_Java_SE.medio.heranca;

public class EmpresaTeste {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gerente", 5000);
        Vendedor vendedor = new Vendedor("Vendedor", 2000, 10000);

        System.out.printf("%s: R$%.2f\n", gerente.getNome(), gerente.calcularSalario());
        System.out.printf("%s: R$%.2f\n", vendedor.getNome(), vendedor.calcularSalario());

        System.out.println(gerente);
        System.out.println(vendedor);

    }
}

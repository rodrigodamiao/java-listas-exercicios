package DOJO_Java_SE.facil.Encapsulamento;

public class BancoTeste {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(1, 500, "Rodrigo");

        contaBancaria.consultarSaldo();
        contaBancaria.depositar(50);
        contaBancaria.consultarSaldo();
        contaBancaria.depositar(500);
        contaBancaria.consultarSaldo();
        contaBancaria.sacar(500);
        contaBancaria.consultarSaldo();
    }
}

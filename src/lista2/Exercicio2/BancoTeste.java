package lista2.Exercicio2;

public class BancoTeste {


    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente(123, "Rodrigo", true);
        ContaPoupanca poupanca = new ContaPoupanca(456, "Maria");

        corrente.depositarDinheiro(500);
        corrente.sacarDinheiro(100);
        corrente.verificarSaldoAtual();

        System.out.println();

        poupanca.depositarDinheiro(1000);
        poupanca.aplicarRendimento();
        poupanca.verificarSaldoAtual();
    }
}

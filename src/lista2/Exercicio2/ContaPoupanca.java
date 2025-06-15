package lista2.Exercicio2;

public class ContaPoupanca extends Conta{

    private double taxaDeRendimento = 0.05; // 5%

    public ContaPoupanca(int numero, String cliente){
        this.numeroDaConta = numero;
        this.nomeDoCliente = cliente;
        this.saldoAtual = 0;
    }

    public double aplicarRendimento(){
        double rendimento = saldoAtual * taxaDeRendimento;
        saldoAtual += rendimento;
        System.out.printf("Rendimento de R$%.2f aplicado! Novo saldo: R$%.2f\n", rendimento, saldoAtual);

        return rendimento;
    }

    public double getRendimento() {
        return taxaDeRendimento;
    }

    public void setRendimento(double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }
}

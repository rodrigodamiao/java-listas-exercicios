package lista2.Exercicio2;

public class Conta {

    protected int numeroDaConta;
    protected String nomeDoCliente;
    protected double saldoAtual;

    public void sacarDinheiro(double valorParaSacar){
        double saldoAnterior = saldoAtual;
        if(saldoAtual >= valorParaSacar){
            saldoAtual -= valorParaSacar;
            System.out.printf("Saque concluído! R$%.2f foram sacados da sua conta.\n", valorParaSacar);
            System.out.printf("Saldo anterior: R$%.2f / Saldo atual: R$%.2f\n", saldoAnterior, saldoAtual);
        }else{
            System.out.printf("Valor de saque acima do saldo atual (R$%.2f)\n", saldoAtual);
        }
    }

    public void depositarDinheiro(double valorParaDepositar){
        saldoAtual += valorParaDepositar;
        System.out.printf("Depósito concluído! R$%.2f foram adicionas a sua conta.\n", valorParaDepositar);
    }

    public void verificarSaldoAtual(){
        System.out.printf("O saldo atual é: R$%.2f\n",saldoAtual);
    }
}

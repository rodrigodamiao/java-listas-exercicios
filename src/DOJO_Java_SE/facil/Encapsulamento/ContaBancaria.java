package DOJO_Java_SE.facil.Encapsulamento;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    private String nomeTitular;

    public ContaBancaria(int numeroConta, double saldo, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.printf("R$%.2f foram depositados na sua conta.\n", valor);
    }

    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.printf("R$%.2f foram sacados da sua conta.\n", valor);
        }else{
            System.out.printf("Saque de R$%.2f falhou, saldo insuficiente.\n", valor);
        }
    }

    public void consultarSaldo(){
        System.out.println();
        System.out.println("==========================");
        System.out.printf("Seu saldo é: R$%.2f\n", this.saldo);
        System.out.println("==========================");
        System.out.println();
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
}

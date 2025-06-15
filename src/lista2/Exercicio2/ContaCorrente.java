package lista2.Exercicio2;

public class ContaCorrente extends Conta{

    private boolean usaCheque;

    public ContaCorrente(int numero, String cliente, boolean usaCheque){
        this.numeroDaConta = numero;
        this.nomeDoCliente = cliente;
        this.saldoAtual = 0;
        this.usaCheque = usaCheque;
    }

    public boolean isUsaCheque() {
        return usaCheque;
    }

    public void setUsaCheque(boolean usaCheque) {
        this.usaCheque = usaCheque;
    }
}

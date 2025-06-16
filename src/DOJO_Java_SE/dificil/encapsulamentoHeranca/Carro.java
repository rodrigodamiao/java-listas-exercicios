package DOJO_Java_SE.dificil.encapsulamentoHeranca;

public class Carro extends Veiculo{

    @Override
    protected int limiteVelocidade() {
        return 50;
    }

    public Carro(String marca, String modelo, String ano) {
        super(marca, modelo, ano);
    }
}

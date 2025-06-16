package DOJO_Java_SE.dificil.encapsulamentoHeranca;

public class Moto extends Veiculo{

    @Override
    protected int limiteVelocidade() {
        return 40;
    }

    public Moto(String marca, String modelo, String ano) {
        super(marca, modelo, ano);
    }
}

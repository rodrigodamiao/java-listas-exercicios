package DOJO_Java_SE.dificil.encapsulamentoHeranca;

public class VeiculoTeste {
    public static void main(String[] args) {
        Carro carro = new Carro("Honda", "Civic", "1997");
        Moto moto = new Moto("Honda", "CG 160 Start", "2020");

        for (int i = 0; i <= 55; i++){
            carro.acelerar();
        }
        for (int i = 0; i <= 45; i++){
            moto.acelerar();
        }
    }
}

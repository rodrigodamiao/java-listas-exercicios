package DOJO_Java_SE.dificil.encapsulamentoHeranca;

public abstract class Veiculo {

    private String marca;
    private String modelo;
    private String ano;

    private int velocidade;

    protected abstract int limiteVelocidade();

    public Veiculo(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar(){
        if(velocidade < limiteVelocidade()){
            velocidade++;
            System.out.println(getClass().getSimpleName() + " acelerando..." + velocidade + "km/h");
        }
        else{
            System.out.println(getClass().getSimpleName() + " já está no limite de velocidade...");
        }
    }

    public void frear(){
        if(velocidade > 0){
            velocidade--;
            System.out.println(getClass().getSimpleName() + " freando... " + velocidade + "km/h");
        }else{
            System.out.println(getClass().getSimpleName() + " já está parado...");
        }
    }

    public void mostrarVelocidadeAtual(){
        System.out.println(getClass().getSimpleName() + ": " + velocidade + "km/h");
    }

    public int getVelocidade() {
        return velocidade;
    }
}

package DOJO_Java_SE.medio.matematica;

public class Circulo {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularCircunferencia(){
        return 2 * Math.PI * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return String.format("Raio: %.2f | Área: %.2f | Circunferência: %.2f",
                raio, calcularArea(), calcularCircunferencia());
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(20);

        System.out.println(circulo);
    }
}

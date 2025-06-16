package DOJO_Java_SE.dificil.matematicaPolimorfismo;

public class Circulo extends FormaGeometrica{

    private double raio;

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio,2);
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo (raio: " + raio + ")";
    }
}

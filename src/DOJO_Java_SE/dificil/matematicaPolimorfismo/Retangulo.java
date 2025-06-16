package DOJO_Java_SE.dificil.matematicaPolimorfismo;

public class Retangulo extends FormaGeometrica{

    private double base;
    private double altura;

    @Override
    public double calcularArea() {
        return base * altura;
    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Retangulo (base: " + base + " | altura: " + altura + ")";
    }
}

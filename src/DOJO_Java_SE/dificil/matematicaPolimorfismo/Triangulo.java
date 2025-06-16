package DOJO_Java_SE.dificil.matematicaPolimorfismo;

public class Triangulo extends FormaGeometrica{

    private double base;
    private double altura;

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo (base: " + base + " | altura: " + altura + ")";
    }
}

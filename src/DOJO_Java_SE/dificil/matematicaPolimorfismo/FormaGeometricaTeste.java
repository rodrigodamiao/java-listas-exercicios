package DOJO_Java_SE.dificil.matematicaPolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class FormaGeometricaTeste {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10,5);
        Triangulo triangulo = new Triangulo(7,8);
        Circulo circulo = new Circulo(20);

        List<FormaGeometrica> formasGeometricas = new ArrayList<>();

        formasGeometricas.add(retangulo);
        formasGeometricas.add(triangulo);
        formasGeometricas.add(circulo);

        for (FormaGeometrica formaGeometrica : formasGeometricas){
            System.out.printf("A área do %s é: %.2f\n",formaGeometrica, formaGeometrica.calcularArea());
        }
    }
}

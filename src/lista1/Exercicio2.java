package lista1;

public class Exercicio2 {
    public static double calculoSalarioFinal(double salarioBase, double gratificacao, double imposto){
        double salarioFinal = salarioBase + (salarioBase * gratificacao) - (salarioBase * imposto);
        return salarioFinal;
    }

    public static void main(String[] args){
        System.out.println(Exercicio2.calculoSalarioFinal(100,0.05,0.07));
    }
}

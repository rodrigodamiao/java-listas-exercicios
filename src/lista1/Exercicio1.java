package lista1;

public class Exercicio1 {
    public static double mediaPonderada(int nota1, int nota2, int nota3, int peso1, int peso2, int peso3){
        double media = ((double)(nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
        return media;
    }

    public static void main(String[] args){
        System.out.printf("%.2f\n",mediaPonderada(10,8,6,4,3,2));
    }
}

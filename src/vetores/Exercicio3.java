package vetores;

import java.util.Arrays;

public class Exercicio3 {
    int[] numbers = {10,15,12,19,20};

    public void printNumbers(){
        Arrays.stream(numbers).forEach(System.out::println);
    }

    public int maiorNumber(){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    public int menorNumber(){
        Arrays.sort(numbers);
        return numbers[0];
    }

    public double mediaNumber(){
        return (double) Arrays.stream(numbers).reduce(0, Integer::sum) /numbers.length;
    }

    public static void main(String[] args) {
        Exercicio3 exercicio3 = new Exercicio3();
        exercicio3.printNumbers();
        System.out.println("Maior número: " + exercicio3.maiorNumber());
        System.out.println("Menor número: " + exercicio3.menorNumber());
        System.out.println("Média dos números: " + exercicio3.mediaNumber());
    }
}

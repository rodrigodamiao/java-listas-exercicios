package vetores;

import java.util.Arrays;

public class Exercicio2 {
    int[] numbers = {10,5,15,8,13};

    public void printNumbers(){
        System.out.println("----- Lista normal -----");
        Arrays.stream(numbers).forEach(System.out::println);
        System.out.println("------------------------");
        System.out.println();
    }

    public void reversedPrintNumbers(){
        System.out.println("----- Lista invertida -----");
        for(int i = numbers.length -1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
        System.out.println("------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        Exercicio2 exercicio2 = new Exercicio2();
        exercicio2.printNumbers();
        exercicio2.reversedPrintNumbers();
    }
}

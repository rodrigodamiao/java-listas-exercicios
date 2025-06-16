package vetores;

import java.util.Arrays;

public class Exercicio9 {

    public static void main(String[] args) {
        int[] v1 = {40,37,12,42,25};

        System.out.println(Arrays.toString(ordenarElementos(v1)));

    }
    public static int[] ordenarElementos(int[] v1){
        int[] v1Sorted = Arrays.copyOf(v1, v1.length);
        Arrays.sort(v1Sorted);
        return v1Sorted;
    }
}

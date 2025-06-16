package vetores;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Exercicio8 {

    public static void main(String[] args) {
        int[] numbers1 = {9,18,54,32,7};
        int[] numbers2 = {5,12,39,42,25};

        Exercicio8 exercicio8 = new Exercicio8();

        exercicio8.juntarVetores(numbers1,numbers2);

        System.out.println("---------------------------------------------");

        exercicio8.juntarVetores2(numbers1,numbers2);
    }

    public void juntarVetores(int[] v1, int[] v2) {
        int[] v3 = IntStream.concat(Arrays.stream(v1), Arrays.stream(v2)).toArray();

        System.out.println("V1: " + Arrays.toString(v1));
        System.out.println("V2: " + Arrays.toString(v2));
        System.out.println("V3: " + Arrays.toString(v3));
    }


    public void juntarVetores2(int[] v1, int[] v2){
        int[] v3 = new int[v1.length + v2.length];

        System.arraycopy(v1, 0, v3, 0, v1.length);
        System.arraycopy(v2, 0, v3, v1.length, v2.length);

        System.out.println("V1: " + Arrays.toString(v1));
        System.out.println("V2: " + Arrays.toString(v2));
        System.out.println("V3: " + Arrays.toString(v3));
    }
}

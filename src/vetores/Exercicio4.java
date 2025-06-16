package vetores;

import java.util.Arrays;

public class Exercicio4 {
    int[] vetor1 = {5,7,23,2,9};
    int[] vetor2 = {8,4,19,20,5};
    int[] vetorSoma = new int[5];

    public void somarVetores(){
        for(int i = 0; i < vetorSoma.length; i++){
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }
        System.out.println("Vetor 1: " + Arrays.toString(vetor1));
        System.out.println("Vetor 2: " + Arrays.toString(vetor2));
        System.out.println("Vetor Soma: " + Arrays.toString(vetorSoma));
    }

    public static void main(String[] args) {
        Exercicio4 exercicio4 = new Exercicio4();

        exercicio4.somarVetores();
    }
}

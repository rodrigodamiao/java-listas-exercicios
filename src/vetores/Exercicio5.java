package vetores;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio5 {
    Scanner scanner = new Scanner(System.in);
    int[] vetor1 = new int[5];

    public static void main(String[] args) {
        Exercicio5 exercicio5 = new Exercicio5();

        exercicio5.gerarNumeros();
        System.out.println(Arrays.toString(exercicio5.gerarVetorTriplo()));
    }

    public void gerarNumeros(){
        int count = 0;
        while(count < 5){
            try{
                System.out.println("Digite um número:");
                vetor1[count] = scanner.nextInt();
                count++;
            }catch (InputMismatchException exception){
                System.out.println("Forma inválida! Digite um número.");
                scanner.nextLine();
            }
        }
    }

    public int[] gerarVetorTriplo(){
        return Arrays.stream(vetor1).map(n -> n * 3).toArray();
    }
}

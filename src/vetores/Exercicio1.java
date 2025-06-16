package vetores;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio1 {
    private int[] numeros = new int[7];
    private Scanner scanner = new Scanner(System.in);

    public void pedirNumeros(){
        int count = 0;

        while(count < numeros.length){
            try{
                System.out.println("Digite um número:");
                numeros[count] = scanner.nextInt();
                count++;
            }catch (InputMismatchException  exception){
                System.out.println("Formato inválido! Digite um número.");
                scanner.nextLine();
            }
        }

        System.out.println("----------------------------------");
        System.out.println("Todos os arrays foram preenchidos!");
        System.out.println();
    }

    public void listarNumeros(){
        List<Integer> numbers = Arrays.stream(numeros).boxed().collect(Collectors.toList());
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        Exercicio1 exercicio1 = new Exercicio1();
        exercicio1.pedirNumeros();
        exercicio1.listarNumeros();
    }
}

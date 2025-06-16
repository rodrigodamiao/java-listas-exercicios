package vetores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio7 {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[5];

    public static void main(String[] args) {
        Exercicio7 exercicio7 = new Exercicio7();

        exercicio7.pedirNumeros();
        exercicio7.procurarNumeroNegativo();
    }

    public void pedirNumeros(){
        int count = 0;

        while(count < 5){
            try{
                System.out.println("Digite um número:");
                numbers[count] = scanner.nextInt();
                count++;
            }catch (InputMismatchException exception){
                System.out.println("Formato inválido! Digite um número.");
                scanner.nextLine();
            }
        }
    }

    public void procurarNumeroNegativo(){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < 0){
                System.out.printf("O índice do primeiro número negativo (%s) é: %s\n", numbers[i], i);
                return;
            }
        }
        System.out.println("Nenhum número negativo encontrado...");
    }
}

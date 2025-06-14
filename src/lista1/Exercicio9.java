package lista1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio9 {

    Scanner scanner = new Scanner(System.in);

    public void digitarNumerosEnquantoPositivos(){
        while(true){
            try{
                System.out.println("Digite um número inteiro:");
                int numero = scanner.nextInt();
                if(numero < 0){
                    System.out.println("Você digitou um número negativo, então o processo será encerrado...");
                    break;
                }
            }catch (InputMismatchException exception){
                System.out.println("Formato inválido! Digite um número inteiro.");
                scanner.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        Exercicio9 exercicio9 = new Exercicio9();
        exercicio9.digitarNumerosEnquantoPositivos();
    }
}

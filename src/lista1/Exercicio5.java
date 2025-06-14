package lista1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio5 {

    Scanner scanner = new Scanner(System.in);

    public double operacaoMatematica(){
        double n1 = 0;
        double n2 = 0;
        double result = 0;
        int escolha = 0;

        while(true){
            try{
                System.out.println("Escolha um número:");
                n1 = scanner.nextDouble();

                System.out.println("Escolha mais um número:");
                n2 = scanner.nextDouble();

                System.out.println("Escolha a operação matemática desejada:");
                System.out.println("1 - SOMA");
                System.out.println("2 - SUBTRAÇÃO");
                System.out.println("3 - MULTIPLICAÇÃO");
                System.out.println("4 - DIVISÃO");
                escolha = scanner.nextInt();

                if (escolha < 1 || escolha > 4) {
                    System.out.println("Operação inválida! Escolha um número entre 1 e 4.");
                    continue;
                }

                if (escolha == 4 && n2 == 0) {
                    System.out.println("Não é possível dividir por zero. Tente novamente.");
                    continue;
                }
                break;
            }catch (InputMismatchException exception){
                System.out.println("Formato inválido! Tente novamente:");
                scanner.nextLine();
            }
        }

        switch (escolha){
            case 1: result = n1 + n2;
                System.out.printf("Você escolheu SOMA: %s + %s = %s", n1, n2, result);
                break;
            case 2: result = n1 - n2;
                System.out.printf("Você escolheu SUBTRAÇÃO: %s - %s = %s", n1, n2, result);
                break;
            case 3: result = n1 * n2;
                System.out.printf("Você escolheu MULTIPLICAÇÃO: %s * %s = %s", n1, n2, result);
                break;
            case 4: result = n1 / n2;
                System.out.printf("Você escolheu DIVISÃO: %s + %s = %s", n1, n2, result);
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        Exercicio5 exercicio5 = new Exercicio5();
        exercicio5.operacaoMatematica();
    }
}

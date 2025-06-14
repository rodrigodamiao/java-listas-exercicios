package lista1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 {

    private Scanner scanner = new Scanner(System.in);

    public String exibirMesDoAno(){
        String message = "";
        int n = 0;

        while (true) {
            try {
                System.out.print("Digite um número de 1 a 12: ");
                n = scanner.nextInt();
                if (n >= 1 && n <= 12) {
                    break;
                } else {
                    System.out.println("Número inválido! Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                scanner.nextLine();
            }
        }
        if(n == 1) message = "Janeiro";
        else if(n == 2) message = "Fevereiro";
        else if(n == 3) message = "Março";
        else if(n == 4) message = "Abril";
        else if(n == 5) message = "Maio";
        else if(n == 6) message = "Junho";
        else if(n == 7) message = "Julho";
        else if(n == 8) message = "Agosto";
        else if(n == 9) message = "Setembro";
        else if(n == 10) message = "Outubro";
        else if(n == 11) message = "Novembro";
        else if(n == 12) message = "Dezembro";

        return message;
    }

    public static void main(String[] args) {
        Exercicio4 exercicio4 = new Exercicio4();
        System.out.println(exercicio4.exibirMesDoAno());
    }
}

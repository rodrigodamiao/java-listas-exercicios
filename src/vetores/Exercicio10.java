package vetores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio10 {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] v1 = {40,37,12,42,25};

        Exercicio10 exercicio10 = new Exercicio10();
        exercicio10.isNumberPresent(v1);
    }

    public void isNumberPresent(int[] v1){
        int count = 3;

        System.out.println("Tente encontrar um número que está presente no Array!");
        while(count > 0){
            try{
                System.out.println("Digite um número:");
                int number = scanner.nextInt();
                count--;
                
                for(int i = 0; i < v1.length; i++){
                    if(number == v1[i]){
                        System.out.printf("Muito bem! Você encontrou o número %s que estava escondido na posição %s.\n", number, i);
                        return;
                    }
                }
                if(count > 1) System.out.printf("Elemento não encontrado, tente novamente... Você ainda tem %s chances.\n", count);
                else if(count == 1) System.out.printf("Elemento não encontrado, tente novamente... Você ainda tem %s chance.\n", count);
                else System.out.println("Suas chances acabaram... Mais sorte na próxima.");
            }catch (InputMismatchException exception){
                System.out.println("Formato inválido! Digite um número.");
                scanner.nextLine();
            }
        }
    }
}

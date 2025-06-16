package vetores;

import java.util.Arrays;

public class Exercicio6 {
    int[] numbers = {65,57,94,52,42,37,34,28,17,40};

    public static void main(String[] args) {
        Exercicio6 exercicio6 = new Exercicio6();

        exercicio6.diferencaMaiorMenor();
        System.out.println("--------------------------------------------------------------");
        exercicio6.diferencaNumerosSemSort();
    }

    public void diferencaMaiorMenor(){
        System.out.println("Numbers original: " + Arrays.toString(numbers));
        int[] sortedNumbers = Arrays.stream(numbers).sorted().toArray();
        System.out.println("Numbers sort: " + Arrays.toString(sortedNumbers));

        int menorNumero = sortedNumbers[0];
        int maiorNumero = sortedNumbers[sortedNumbers.length-1];
        int posicaoMenorNumero = 0;
        int posicaoMaiorNumero = sortedNumbers.length-1;

        System.out.println("A diferença entre o maior e o menor número do array é: " + (maiorNumero - menorNumero));
        System.out.printf("A posição do menor número é %s e a posição do maior número é %s\n", posicaoMenorNumero, posicaoMaiorNumero);
    }

    public void diferencaNumerosSemSort(){
        int menorNumero = Integer.MAX_VALUE;
        int maiorNumero = Integer.MIN_VALUE;
        int posicaoMenorNumero = 0;
        int posicaoMaiorNumero = 0;

        System.out.println("Numbers:" + Arrays.toString(numbers));


        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < menorNumero){
                menorNumero = numbers[i];
                posicaoMenorNumero = i;
            }
            if(numbers[i] > maiorNumero){
                maiorNumero = numbers[i];
                posicaoMaiorNumero = i;
            }
        }
        System.out.println("A diferença entre o maior e o menor número do array é: " + (maiorNumero - menorNumero));
        System.out.printf("A posição do menor número é %s e a posição do maior número é %s\n", posicaoMenorNumero, posicaoMaiorNumero);
    }
}

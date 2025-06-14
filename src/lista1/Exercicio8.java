package lista1;

public class Exercicio8 {

    public void imprimirNumerosImparesESomarTodos(){
        int soma = 0;

        for(int i = 251; i < 500; i+=2){
            soma += i;
            System.out.println(i + " / Soma: " + soma);
        }
    }

    public static void main(String[] args) {
        Exercicio8 exercicio8 = new Exercicio8();
        exercicio8.imprimirNumerosImparesESomarTodos();
    }
}

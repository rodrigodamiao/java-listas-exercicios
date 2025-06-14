package lista1;

public class Exercicio10 {

    public void imprimirNumerosParesESomarTodos(){
        int soma = 0;

        for(int i = 500; i >= 250; i-=2){
            soma += i;
            System.out.println(i + "/ Soma: "  + soma);
        }
    }

    public static void main(String[] args) {
        Exercicio10 exercicio10 = new Exercicio10();
        exercicio10.imprimirNumerosParesESomarTodos();
    }
}

package lista1;

public class Exercicio3 {
    public static String verificarMediaALunos(double media){
        String message = "";

        if(media < 7) message = "Você precisa estudar mais";
        else if(media == 7) message = "Você foi aprovado";
        else if(media > 7 && media < 8) message = "Parabéns, suas notas ficaram acima da média";
        else if(media >= 8 && media < 9) message = "Parabéns,sua média ficou próxima da nota máxima";
        else if(media >= 9) message = "Parabéns, você é um excelente aluno";

        return message;
    }

    public static void main(String[] args) {
        System.out.println(Exercicio3.verificarMediaALunos(9));
    }
}

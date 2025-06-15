package lista3.Exercicio3;

public class IngressoTeste {

    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(50);
        IngressoVIP ingressoVIP = new IngressoVIP(ingresso.getValor(),20);

        System.out.println(ingresso.toString());
        System.out.println(ingressoVIP.toString());
    }
}

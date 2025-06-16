package DOJO_Java_SE.questaoBonus;

public class VeiculoTeste {
    public static void main(String[] args) {
        Onibus onibus = new Onibus(50, 5.0, 8.0, 300);
        Trem trem = new Trem(200, 150, 0.80);
        Metro metro = new Metro(300, 100, 0.75);

        System.out.printf("Custo diário do ônibus: R$%.2f\n", onibus.custoOperacional());
        System.out.printf("Custo diário do trem: R$%.2f\n", trem.custoOperacional());
        System.out.printf("Custo diário do metrô: R$%.2f\n", metro.custoOperacional());
    }
}

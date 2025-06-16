package DOJO_Java_SE.facil.Objeto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Ração", 25, 2);
        System.out.printf("O valor total de %s %s é: R$%.2f\n", produto1.getQuantidade(), produto1.getNome(), produto1.calcularTotal());

        Produto produto2 = new Produto("Bolinha", 9.90, 1);
        System.out.printf("O valor total de %s %s é: R$%.2f\n", produto2.getQuantidade(), produto2.getNome(), produto2.calcularTotal());


    }
}

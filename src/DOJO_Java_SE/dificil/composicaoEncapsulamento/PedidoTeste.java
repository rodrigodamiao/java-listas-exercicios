package DOJO_Java_SE.dificil.composicaoEncapsulamento;

public class PedidoTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Shampoo", 15);
        Produto produto2 = new Produto("Condicionador", 20);
        Produto produto3 = new Produto("Sabonete", 7);

        Pedido pedido1 = new Pedido();
        pedido1.adicionarProduto(produto1);
        pedido1.adicionarProduto(produto2);
        pedido1.adicionarProduto(produto3);

        pedido1.mostrarProdutosNoPedido();

        System.out.printf("O valor total da lista de produtos é: R$%.2f", pedido1.calcularValorTotalDoPedido());

    }
}

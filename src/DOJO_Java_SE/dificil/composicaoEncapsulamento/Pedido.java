package DOJO_Java_SE.dificil.composicaoEncapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
        System.out.println(produto + " foi adicionado a lista de produtos.");
    }

    public double calcularValorTotalDoPedido(){
        double valorTotalDoPedido = 0;

        for(Produto produto : produtos){
            valorTotalDoPedido += produto.getValor();
        }

        return valorTotalDoPedido;
    }

    public void mostrarProdutosNoPedido(){
        System.out.println(produtos);
    }
}

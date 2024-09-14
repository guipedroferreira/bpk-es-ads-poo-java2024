package classDiagram;

import java.util.ArrayList;

public class ItensPedido {
    private int quantidade;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public ItensPedido(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produtos.add(produto);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco() * quantidade;
        }

        return total;
    }

    @Override
    public String toString() {
        return "Quantidade: " + quantidade + produtos;
    }
}

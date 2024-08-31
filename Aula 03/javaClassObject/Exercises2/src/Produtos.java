public class Produtos {
    private String nome;
    private float preco;
    private int quantidadeEstoque;

    public Produtos() {
    }

    public Produtos(String nome, float preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    void aumentarEstoque(int quantidadeEstoque) {
        int valor = 50;
        quantidadeEstoque += valor;
        System.out.printf("Aumentando estoque %d\n", quantidadeEstoque);
    }
    void diminuirEstoque(int quantidadeEstoque) {
        int valor = 50;
        quantidadeEstoque -= valor;
        System.out.printf("Diminuindo estoque %d\n", quantidadeEstoque);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nPreço: " + preco + "\nQuantidade: " + quantidadeEstoque;
    }
}

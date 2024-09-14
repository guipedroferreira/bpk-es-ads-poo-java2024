package classDiagram;

public class Produto {
    private String codProduto;
    private String nome;
    private double preco;

    public Produto() {
    }

    public Produto(String codProduto, String nome, float preco) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.preco = preco;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void atualizarPreco(float preco) {
        this.preco = preco;
        setPreco(preco);
    }

    @Override
    public String toString() {
        return "\nNome='" + nome + "\nPreço=" + preco;
    }
}

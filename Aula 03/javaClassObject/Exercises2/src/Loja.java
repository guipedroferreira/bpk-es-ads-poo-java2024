public class Loja {
    private String nome;
    private String endereco;
    private String telefone;

    public Loja() {
    }

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    void abrirLoja(String nome){
        System.out.println("Loja " + nome + " aberta");
    }

    void fecharLoja(String nome){
        System.out.println("Loja " + nome + " fechado");
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nEndereco: " + endereco + "\nTelefone: " + telefone;
    }
}



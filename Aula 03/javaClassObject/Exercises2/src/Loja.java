public class Loja {
    public String nome;
    public String endereco;
    public String telefone;

    public Loja() {
    }

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
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



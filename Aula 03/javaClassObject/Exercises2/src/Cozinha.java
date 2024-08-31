public class Cozinha {
    public String tipo;
    public int quantidadePessoas;
    public String cor;

    public Cozinha() {
    }

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    void cozinhar(){
        System.out.println("Cozinhando...");
    }

    void limpar(){
        System.out.println("Limpando...");
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + "\nQuantidade: " + quantidadePessoas + "\nCor: " + cor;
    }
}


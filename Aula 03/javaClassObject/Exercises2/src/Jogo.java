public class Jogo {
    public String nome;
    public String genero;
    public float preco;

    public Jogo() {
    }

    public Jogo(String nome, String genero, float preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    void iniciarJogo(){
        float time = 0;

        System.out.println("Iniciou: " + 0);
    }

    void pausarJogo(){
        int time = 10;
        int duracao = 120;

        System.out.println("Pausando: " + time + " / " + duracao);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nGenero: " + genero + "\nPreco: " + preco;
    }

    
}

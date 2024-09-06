public class Jogo {
    private String nome;
    private String genero;
    private float preco;

    public Jogo() {
    }

    public Jogo(String nome, String genero, float preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
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

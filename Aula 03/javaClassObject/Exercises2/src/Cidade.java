public class Cidade {
    private String nome;
    private float populacao;
    private String estado;

    public Cidade() {
    }

    public Cidade(String nome, float populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPopulacao() {
        return populacao;
    }

    public void setPopulacao(float populacao) {
        this.populacao = populacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    void aumentarPopulacao(float populacao){
        int valor = 100;

        this.populacao += valor;
        System.out.println("Populacao: " + this.populacao);
    }

    void diminuirPopulacao(float populacao){
        int valor = 100;
        this.populacao -= valor;
        System.out.println("Populacao: " + this.populacao);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nPopulacao: " + populacao + "\nEstado: " + estado;
    }
}

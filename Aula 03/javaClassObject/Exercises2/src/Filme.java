public class Filme {
    private String titulo;
    private String diretor;
    private float duracao;

    public Filme() {
    }

    public Filme(String titulo, String diretor, float duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    void iniciarFilme(){
        int inicio = 0;
        System.out.println("inicio do filme: " + inicio);
    }

    void pararFilme(float duracao){
        float assistidos = 20;
        float pause = duracao - assistidos;
        System.out.println("Parando filme: " + pause);
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nDiretor: " + diretor + "\nDuracao: " + duracao;
    }
}

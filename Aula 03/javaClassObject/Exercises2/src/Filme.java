public class Filme {
    public String titulo;
    public String diretor;
    public  float duracao;

    public Filme() {
    }

    public Filme(String titulo, String diretor, float duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
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

public class LivroDigital {
    public String titulo;
    public String autor;
    public float tamanhoArquivo;

    public LivroDigital() {
    }

    public LivroDigital(String titulo, String autor, float tamanhoArquivo){
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    void abrirLivro(){
        System.out.println("Livro " + titulo + " aberto.");
    }

    void fecharLivro(){
        System.out.println("Livro " + titulo + " fechado.");
    }

    @Override

    public String toString() {
        return  "Titulo: " + titulo + "\nAutor"  + autor + "\nTamanho Arquivo: " + tamanhoArquivo;
    }
}

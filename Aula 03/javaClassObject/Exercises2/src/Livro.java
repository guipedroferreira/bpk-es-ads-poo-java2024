class Livro {
    public String titulo;
    public String autor;
    public int numPaginas;

    public Livro() {
    }

    public static void abrir (){}
    public void ler (){}

    @Override

    public String toString() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nNumero de Paginas: " + numPaginas;
    }
}

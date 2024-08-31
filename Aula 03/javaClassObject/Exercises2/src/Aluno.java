public class Aluno {
    private String nome;
    private int matricula;
    private String curso;

    public Aluno() {
    }

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    void mediaNotas(int []vetorNotas){
        float soma = 0;

        for(int i = 0; i < vetorNotas.length; i++){
            soma += i;
        }

        float media = soma / vetorNotas.length;
        System.out.println("Média Notas: " + media);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nMatricula: " + matricula + "\nCurso: " + curso;
    }
}

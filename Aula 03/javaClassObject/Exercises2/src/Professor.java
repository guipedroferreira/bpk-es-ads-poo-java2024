public class Professor {
    private String nome;
    private String disciplina;
    private float salario;

    public Professor() {
    }

    public Professor(String nome, String disciplina, float salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    void darAula(String disciplina){
        System.out.printf("Dando aula: %s\n", disciplina);
    }

    void corrigirProvas(String disciplina){
        System.out.printf("Corrigindo provas: %s\n", disciplina);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nDisciplina: " + disciplina + "\nSalario: " + salario;
    }
}

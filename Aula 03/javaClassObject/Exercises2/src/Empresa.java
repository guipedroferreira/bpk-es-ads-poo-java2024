public class Empresa {
    public String nome;
    public float CNPJ;
    public int numeroFuncionarios;

    public Empresa() {
    }

    public Empresa(String nome, float CNPJ, int numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    void contratar(){
        int desejoFuncionarios = 10;
        numeroFuncionarios += desejoFuncionarios;
        System.out.println("Quantidade Atual de Funcionarios: " + numeroFuncionarios);
    }
    void demitir(){
        int desejoFuncionarios = 10;
        numeroFuncionarios -= desejoFuncionarios;
        System.out.println("Quantidade Atual de Funcionarios: " + numeroFuncionarios);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCNPJ: " + CNPJ + "\nNumero de Funcionarios: " + numeroFuncionarios;
    }
}

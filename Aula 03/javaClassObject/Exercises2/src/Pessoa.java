public class Pessoa {
    public String nome;
    public int idade;
    public double altura;

    public Pessoa() {
    }

    public void apresentacaoPessoa(Pessoa pessoa){
        System.out.printf("O(a) " + pessoa.nome + "possue " + pessoa.idade + "de idade, possuindo altura de " + pessoa.altura);
    }

    @Override

    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura;
    }

}
    
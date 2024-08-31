public class Cachorro {
    public String nome;
    public String raca;
    public int idade;

    public Cachorro() {
    }

    void latir(){
        System.out.println("Au! Au! Au! Au! Au! Au! Au!");
    }

    void correr(){
        System.out.println("'Correndo'");
    }

    @Override

    public String toString() {
        return "Nome Cachorro: " + nome + "\nRaça do cachorro: " + raca + "\nIdade do cachorro: " + idade;
    }
}



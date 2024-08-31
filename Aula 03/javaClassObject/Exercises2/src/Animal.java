public class Animal {
    public String especie;
    public float idade;
    public float peso;

    public Animal() {
    }

    public Animal(String especie, float idade, float peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    void alimentar(){
        System.out.println("Alimentando...");
    }

    void dormir(){
        System.out.println("Dormir...");
    }

    @Override
    public String toString() {
        return "Especie: " + especie + "\nIdade: " + idade + "\nPeso: " + peso;
    }
}

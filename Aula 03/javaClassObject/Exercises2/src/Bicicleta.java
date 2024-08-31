public class Bicicleta {
    public  String marca;
    public  String modelo;
    public float tamanhoRoda;

    public Bicicleta() {
    }

    public Bicicleta(String marca, String modelo, float tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    void pedalar(){
        System.out.println("Pedalando...");
    }
    void frear(){
        System.out.println("Freando...");
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nTamanho Roda: " + tamanhoRoda;
    }
}

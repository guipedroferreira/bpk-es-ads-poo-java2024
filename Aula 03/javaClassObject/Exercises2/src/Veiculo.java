public class Veiculo {
    private String tipo;
    private int placa;
    private String marca;

    public Veiculo() {
    }

    public Veiculo(String tipo, int placa, String marca) {
        this.tipo = tipo;
        this.placa = placa;
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    void abastecer(){
        System.out.printf("Abastecendo...");
    }

    void lavar(){
        System.out.printf("Lavando...");
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + "\nPlaca: " + placa + "\nMarca: " + marca;
    }
}

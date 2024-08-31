public class Celular {
    public String marca;
    public String modelo;
    public float capacidadeBateria;

    public Celular() {

    }

    public static void Ligar(){
        System.out.println("Ligou");
    }
    public static void Desligar(){
        System.out.println("Desligou");
    }

    @Override

    public String toString() {
        return "marca = " + marca + "\nmodelo = " + modelo + "\ncapacidadeBateria = " + capacidadeBateria;
    }

}

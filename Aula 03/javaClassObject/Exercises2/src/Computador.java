public class Computador {
    private String processador;
    private String memoriaRam;
    private String armazenamento;
    private boolean status;

    public Computador() {
    }

    public Computador(String processador, String memoriaRam, String armazenamento, boolean status) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.status = status;
    }

    public String getProcessador() {
        return processador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public boolean isStatus() {
        return status;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    void ligar(){
        status = true;
        System.out.println("Ligando");
    }

    void desligar(){
        status = false;
        System.out.println("Desligando");
    }

    void conferirStatus(){
        if (status == false){
            System.out.println("Desligado");
        } else {
            System.out.println("Ligado");
        }
    }

    @Override
    public String toString() {
        return "Processador: " + processador + "\nMemoriaRam: " + memoriaRam + "\nArmazenamento: " + armazenamento;
    }
}

public class Time {
    private String nome;
    private String tecnico;
    private int numDeJogadores;

    public Time() {
    }

    public Time(String nome, String tecnico, int numDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numDeJogadores = numDeJogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public int getNumDeJogadores() {
        return numDeJogadores;
    }

    public void setNumDeJogadores(int numDeJogadores) {
        this.numDeJogadores = numDeJogadores;
    }

    void adicionarJogadores(int numDeJogadores){
        int jogadores = 5;

        this.numDeJogadores += jogadores;
        System.out.println("Jogadores adicionado com sucesso!");
        System.out.println("Numero de jogadores atual: " + this.numDeJogadores);
        }

    void removerJogadores(int numDeJogadores){
        int jogadores = 5;

        this.numDeJogadores -= jogadores;
        System.out.println("Jogadores removidos com sucesso!");
        System.out.println("Numero de jogadores atual: " + this.numDeJogadores);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nTecnico: " + tecnico + "\nNumero de jogadores: " + numDeJogadores;
    }
}

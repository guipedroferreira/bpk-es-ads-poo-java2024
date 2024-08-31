public class Time {
    public String nome;
    public String tecnico;
    public int numDeJogadores;

    public Time() {
    }

    public Time(String nome, String tecnico, int numDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numDeJogadores = numDeJogadores;
    }

    void adicionarJogadores(int numDeJogadores){
        int jogadores = 5;

        numDeJogadores += jogadores;
        System.out.println("Jogadores adicionado com sucesso!");
        System.out.println("Numero de jogadores atual: " + numDeJogadores);
        }

    void removerJogadores(int numDeJogadores){
        int jogadores = 5;

        numDeJogadores -= jogadores;
        System.out.println("Jogadores removidos com sucesso!");
        System.out.println("Numero de jogadores atual: " + numDeJogadores);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "Tecnico: " + tecnico + "Numero de jogadores: " + numDeJogadores;
    }
}

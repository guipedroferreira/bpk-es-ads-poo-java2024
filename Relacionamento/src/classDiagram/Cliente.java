package classDiagram;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList <EnderecoCliente> enderecoClientes =  new ArrayList<>();

    public Cliente(String nome, String cpf, ArrayList<EnderecoCliente> enderecoClientes) {
        this.nome = nome;
        this.cpf = cpf;
        this.enderecoClientes = enderecoClientes;
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<EnderecoCliente> getEnderecoClientes() {
        return enderecoClientes;
    }

    public void setEnderecoClientes(EnderecoCliente enderecoClientes) {
        this.enderecoClientes.add(enderecoClientes);
    }

    public void cadastrarEnderecoCliente(EnderecoCliente enderecoCliente) {}

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nCPF: " + cpf + "\n" + enderecoClientes;
    }
}

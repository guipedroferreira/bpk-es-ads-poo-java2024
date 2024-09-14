package classDiagram;

public class EnderecoCliente {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    public boolean enderecoAtual;

    public EnderecoCliente() {
    }

    public EnderecoCliente(String logradouro, String numero, String complemento, String bairro, String cidade, String uf, String cep, boolean enderecoAtual) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.enderecoAtual = enderecoAtual;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public boolean isEnderecoAtual() {
        return enderecoAtual;
    }

    public void setEnderecoAtual(boolean enderecoAtual) {
        this.enderecoAtual = enderecoAtual;
    }

    @Override
    public String toString() {
        return "Endereço:\n" + "Logradouro: " + logradouro + "\nNúmero: " + numero + "\nComplemento: " + complemento + "\nBairro: " + bairro + "\nCidade: " + cidade + "\nUf: " + uf + "\nCep: " + cep + "\n";
    }
}

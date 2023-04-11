package br.edu.fesfafic.cliente.Model;

public class Endereco {
    public String cep;
    public String uf;
    public String cidade;
    public String logradouro;
    public String numCasa;
    public String bairro;
    public String complemento;

    public Endereco(){}
    public Endereco(String cep, String uf, String cidade, String logradouro,
                    String numCasa, String bairro, String complemento) {
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.numCasa = numCasa;
        this.bairro = bairro;
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(String numCasa) {
        this.numCasa = numCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", uf='" + uf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numCasa='" + numCasa + '\'' +
                ", bairro='" + bairro + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}

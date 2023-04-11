package br.edu.fesfafic.cliente.Model;

import java.time.format.DateTimeFormatter;

public class PessoaJuridica extends Cliente{
    public String razaoSocial;
    public String nomeFantasia;
    public String cnpj;

    public PessoaJuridica(String inscricaoEstadual, String inscricaoMunicipal, String iie, boolean clienteAtivo,
                          int diaCadastro, int mesCadastro, int anoCadastro, Endereco endereco, Contato contato,
                          String razaoSocial, String nomeFantasia, String cnpj) {
        super(true, false, inscricaoEstadual, inscricaoMunicipal, iie, clienteAtivo, diaCadastro,
                mesCadastro, anoCadastro, endereco, contato);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", id=" + id +
                ", pessoaJuridica=" + pessoaJuridica +
                ", pessoaFisica=" + pessoaFisica +
                ", inscricaoEstadual='" + inscricaoEstadual + '\'' +
                ", inscricaoMunicipal='" + inscricaoMunicipal + '\'' +
                ", iie='" + iie + '\'' +
                ", clienteAtivo=" + clienteAtivo +
                ", dataCadastro=" + dataCadastro.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", endereco=" + endereco +
                ", contato=" + contato +
                '}';
    }
}

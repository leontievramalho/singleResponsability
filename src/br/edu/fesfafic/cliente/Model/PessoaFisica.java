package br.edu.fesfafic.cliente.Model;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class PessoaFisica extends Cliente{
    public String nomeCompleto;
    public String apelido;
    private String cpf;
    private Rg rg;
    public String sexo;
    public LocalDate dataNascimento;



    public PessoaFisica(String inscricaoEstadual, String inscricaoMunicipal, String iie, boolean clienteAtivo,
                        int diaCadastro, int mesCadastro, int anoCadastro, Endereco endereco, Contato contato,
                        String nomeCompleto, String apelido, String cpf, Rg rg, String sexo,
                        int diaNascimento, int mesNascimento, int anoNascimento) {
        super(false, true, inscricaoEstadual, inscricaoMunicipal, iie, clienteAtivo,
                diaCadastro, mesCadastro, anoCadastro, endereco, contato);
        this.nomeCompleto = nomeCompleto;
        this.apelido = apelido;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.dataNascimento = LocalDate.of(anoNascimento, Month.of(mesNascimento), diaNascimento);
    }


    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    private String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private Rg getRg() {
        return rg;
    }

    public void setRg(Rg rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dia, int mes, int ano) {
        this.dataNascimento = LocalDate.of(ano, Month.of(mes), dia);
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", apelido='" + apelido + '\'' +
                ", sexo='" + sexo + '\'' +
                ", dataNascimento=" + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
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

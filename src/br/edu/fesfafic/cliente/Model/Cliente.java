package br.edu.fesfafic.cliente.Model;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public abstract class Cliente {
    public UUID id;
    public boolean pessoaJuridica;
    public boolean pessoaFisica;
    public String inscricaoEstadual;
    public String inscricaoMunicipal;
    public String iie;
    public boolean clienteAtivo;
    public LocalDate dataCadastro;
    public Endereco endereco;
    public Contato contato;

    public Cliente(boolean pessoaJuridica, boolean pessoaFisica, String inscricaoEstadual,
                   String inscricaoMunicipal, String iie, boolean clienteAtivo, int diaCadastro, int mesCadastro,
                   int anoCadastro, Endereco endereco, Contato contato) {
        this.id = UUID.randomUUID();
        this.pessoaJuridica = pessoaJuridica;
        this.pessoaFisica = pessoaFisica;
        this.inscricaoEstadual = inscricaoEstadual;
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.iie = iie;
        this.clienteAtivo = clienteAtivo;
        this.dataCadastro = LocalDate.of(anoCadastro, Month.of(mesCadastro), diaCadastro);
        this.endereco = endereco;
        this.contato = contato;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getIie() {
        return iie;
    }

    public void setIie(String iie) {
        this.iie = iie;
    }

    public boolean isClienteAtivo() {
        return clienteAtivo;
    }

    public void setClienteAtivo(boolean clienteAtivo) {
        this.clienteAtivo = clienteAtivo;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(int dia, int mes, int ano) {
        this.dataCadastro = LocalDate.of(ano, Month.of(mes), dia);
    }

    public UUID getId() {
        return id;
    }

    public boolean isPessoaJuridica() {
        return pessoaJuridica;
    }

    public boolean isPessoaFisica() {
        return pessoaFisica;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Contato getContato() {
        return contato;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
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

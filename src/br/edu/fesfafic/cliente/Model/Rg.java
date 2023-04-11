package br.edu.fesfafic.cliente.Model;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Rg {
    public String numero;
    public String orgaoEmissor;
    public LocalDate dataEmissao;

    public Rg(){}

    public Rg(String numero, String orgaoEmissor, int diaEmissao, int mes, int ano) {
        this.numero = numero;
        this.orgaoEmissor = orgaoEmissor;
        this.dataEmissao = LocalDate.of(ano, Month.of(mes), diaEmissao);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(int diaEmissao, int mes, int ano) {
        this.dataEmissao = LocalDate.of(ano, Month.of(mes), diaEmissao);
    }

    @Override
    public String toString() {
        return "Rg{" +
                "numero='" + numero + '\'' +
                ", orgaoEmissor='" + orgaoEmissor + '\'' +
                ", dataEmissao=" + dataEmissao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                '}';
    }
}

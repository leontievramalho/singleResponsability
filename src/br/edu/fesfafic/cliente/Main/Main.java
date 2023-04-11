package br.edu.fesfafic.cliente.Main;

import br.edu.fesfafic.cliente.Model.*;

public class Main {
    public static void main(String[] args){
        Rg rg = new Rg("8239382", "SSDS", 11,4,2023);
        System.out.println(rg);
        System.out.println(rg.getDataEmissao());

        Endereco endereco = new Endereco("58925000", "PB", "Santa Helena",
                "Travessa Noemia Ana de Morais", "30", "Centro",
                "Assembleia de Deus");

        Contato contato = new Contato("83996510467", "leontievramalho@gmail.com");

        PessoaFisica leontiev = new PessoaFisica("12154664", "1214546", Iie.CONTRIBUINTE,
                true, 11, 4, 2023, endereco, contato,
                "Leontiev Ramalho Diniz Quirino", "Leon", "38298372", rg, Sexo.MASCULINO,
                4, 12, 1995);

        PessoaJuridica lalalabesouro = new PessoaJuridica("12154544", "12123546", Iie.CONTRIBUINTE,
                true, 11, 4, 2023, endereco, contato,
                "Lalala Besouro Catedral LTDA", "Lalala Besouro", "38298372");

        System.out.println(leontiev);
        System.out.println(lalalabesouro);
    }

}

package br.edu.infnet.testes;

import br.edu.infnet.dao.InformaticaDao;
import br.edu.infnet.model.Informatica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InformaticaTeste {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Informe a Descrição: ");
        String descricao = in.next();

        System.out.println("Informe o Valor: ");
        Float valor = in.nextFloat();

        System.out.println("Informe o Peso: ");
        Float peso = in.nextFloat();

        System.out.println("Informe a Data de Vencimento: ");
        LocalDate dataValidade = LocalDate.parse(in.next(), form);

        System.out.println("Informe a marca: ");
        String marca = in.next();

        System.out.println("O Produto é uma peça de Hardware?");
        boolean hardware = in.nextBoolean();

        Informatica informatica = new Informatica(
                descricao,
                valor,
                peso,
                dataValidade,
                marca,
                hardware
        );

        InformaticaDao.incluir(informatica);

        System.out.println("Produto: ");
        for(Informatica item : InformaticaDao.obterLista()){
            item.imprimir();
        }

        in.close();
    }
}

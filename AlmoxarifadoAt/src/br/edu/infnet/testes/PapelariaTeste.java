package br.edu.infnet.testes;


import br.edu.infnet.dao.PapelariaDao;
import br.edu.infnet.model.Papelaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PapelariaTeste {

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

        System.out.println("Informe a Cor: ");
        String cor = in.next();

        System.out.println("O Produto é Reutilizavel?");
        boolean reutilizavel = in.nextBoolean();

        Papelaria papelaria = new Papelaria(
                descricao,
                valor,
                peso,
                dataValidade,
                cor,
                reutilizavel
        );

        PapelariaDao.incluir(papelaria);

        System.out.println("Produto: ");
        for(Papelaria item : PapelariaDao.obterLista()){
            item.imprimir();
        }

        in.close();
    }
}

package br.edu.infnet.testes;

import br.edu.infnet.dao.ManutencaoDao;
import br.edu.infnet.model.Manutencao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ManutencaoTeste {

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

        System.out.println("Informe a Utilidade: ");
        String utilidade = in.next();

        System.out.println("O Produto é toxico?");
        boolean toxico = in.nextBoolean();

        Manutencao manutencao = new Manutencao(
                descricao,
                valor,
                peso,
                dataValidade,
                utilidade,
                toxico
        );

        ManutencaoDao.incluir(manutencao);

        System.out.println("Produto: ");
        for(Manutencao item : ManutencaoDao.obterLista()){
            item.imprimir();
        }

        in.close();
    }
}

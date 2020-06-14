package br.edu.infnet.testes;

import br.edu.infnet.dao.SolicitacaoDao;
import br.edu.infnet.model.Funcionario;
import br.edu.infnet.model.Informatica;
import br.edu.infnet.model.Produto;
import br.edu.infnet.model.Solicitacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolicitacaoTeste {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Informe a Data e hora da Solicitacao: ");
        LocalDateTime dataSolicitacao = LocalDateTime.parse(in.nextLine(), form);

        System.out.println("Informe a Quantidade do produto que necessita: ");
        int quantidade = in.nextInt();

        Solicitacao solicitacao = new Solicitacao();
        solicitacao.setDataCreate(dataSolicitacao);
        solicitacao.setQuantidade(quantidade);

        System.out.println("Informe o nome do Solicitante: ");
        String nome = in.next();

        System.out.println("Informe o email do Solicitante: ");
        String email = in.next();

        System.out.println("O Solicitante é Gestor?");
        boolean gestor = in.nextBoolean();

        Funcionario funcionario = new Funcionario(nome, email, gestor);

        solicitacao.setFuncionario(funcionario);

        DateTimeFormatter formProd = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Informe a Descrição do Produto: ");
        String descricao = in.next();

        System.out.println("Informe o Valor do Produto: ");
        Float valor = in.nextFloat();

        System.out.println("Informe o Peso do Produto: ");
        Float peso = in.nextFloat();

        System.out.println("Informe a Data de Vencimento do Produto: ");
        LocalDate dataValidade = LocalDate.parse(in.next(), formProd);

        System.out.println("Informe a marca do Produto: ");
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

        List<Produto> lista = new ArrayList<Produto>();
        lista.add(informatica);

        solicitacao.setProdutos(lista);

        SolicitacaoDao.incluir(solicitacao);

        SolicitacaoDao.obter().imprimir();

        in.close();
    }
}

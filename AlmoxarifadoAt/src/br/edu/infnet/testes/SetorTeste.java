package br.edu.infnet.testes;

import br.edu.infnet.dao.SetorDao;
import br.edu.infnet.model.Funcionario;
import br.edu.infnet.model.Setor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetorTeste {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Informe o nome do Setor: ");
        String nomeSetor = in.next();

        System.out.println("Informe a Descrição do Setor: ");
        String descricaoSetor = in.next();

        System.out.println("Informe o nome do Gestor: ");
        String nomeGestor = in.next();

        System.out.println("Informe o email do Gestor: ");
        String emailGestor = in.next();

        System.out.println("O Funcionário é Gestor?");
        boolean gestorGestor = in.nextBoolean();

        Funcionario funcionarioGestor = new Funcionario(nomeGestor, emailGestor, gestorGestor);

        System.out.println("Informe o nome do Funcionario: ");
        String nomeFuncionario = in.next();

        System.out.println("Informe o email do Funcionario: ");
        String emailFuncionario = in.next();

        System.out.println("O Funcionário é Gestor?");
        boolean gestorFuncionario = in.nextBoolean();

        Funcionario funcionarioFuncionario = new Funcionario(
                nomeFuncionario,
                emailFuncionario,
                gestorFuncionario);


        List<Funcionario> lista = new ArrayList<Funcionario>();
        lista.add(funcionarioFuncionario);

        Setor setor = new Setor(nomeSetor, descricaoSetor, funcionarioGestor, lista);

        SetorDao.incluir(setor);

        SetorDao.obter().imprimir();

        in.close();
    }
}

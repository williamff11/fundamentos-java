package br.edu.infnet.testes;

import br.edu.infnet.dao.FuncionarioDao;
import br.edu.infnet.model.Funcionario;

import java.util.Scanner;

public class FuncionarioTeste {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nome = in.next();

        System.out.println("Informe o email: ");
        String email = in.next();

        System.out.println("O Funcionário é Gestor?");
        boolean gestor = in.nextBoolean();

        Funcionario funcionario = new Funcionario(nome, email, gestor);

        FuncionarioDao.incluir(funcionario);

        System.out.println("Funcionarios: ");
        for(Funcionario item : FuncionarioDao.obterLista()){
            item.imprimir();
        }

        in.close();
    }
}

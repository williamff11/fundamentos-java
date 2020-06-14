package br.edu.infnet.testes;

import br.edu.infnet.dao.FuncionarioDao;
import br.edu.infnet.dao.SetorDao;
import br.edu.infnet.model.Funcionario;
import br.edu.infnet.model.Setor;

import java.util.Scanner;

public class SetorTeste {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate dataValidade = LocalDate.parse(in.next(),form);
        System.out.println("Informe o nome: ");
        String nome = in.next();

        System.out.println("Informe o email: ");
        String email = in.next();

        System.out.println("O Funcionário é Gestor?");
        boolean gestor = in.nextBoolean();

         FuncionarioDao.obterLista();


//        Setor funcionario = new Setor(nome, item, gestor);

//        SetorDao.incluir(funcionario);

        System.out.println("Funcionarios: ");
        for(Funcionario item : FuncionarioDao.obterLista()){
            item.imprimir();
        }

        in.close();
    }
}

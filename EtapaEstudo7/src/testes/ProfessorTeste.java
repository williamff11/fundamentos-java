package testes;

import dao.ProfessorDao;
import model.Professor;

import java.util.Scanner;

public class ProfessorTeste {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ProfessorDao dao = new ProfessorDao();

        for (int i = 0; i <3; i++) {
            Professor p = new Professor();
            System.out.println("Matricula: ");
            p.matricula = in.nextInt();
            System.out.println("Nome: ");
            p.nome = in.next();
            System.out.println("Salario: ");
            p.salario = in.nextFloat();
            System.out.println("Mestre?");
            p.mestre = in.nextBoolean();
            System.out.println(p);

            if (dao.incluir(p)) {
                System.out.println("Incluido");
            } else {
                System.err.println("ERRROR");
            }
        }
        System.out.println("Lista de Professores: ");
        System.out.println(dao.obterLista());
        for (Professor professor : dao.obterLista()){
            System.out.println("Professor: " + professor);
        }

        in.close();
    }
}

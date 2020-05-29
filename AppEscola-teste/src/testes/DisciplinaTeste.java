package testes;

import negocio.Curso;
import negocio.Disciplina;
import negocio.Professor;

public class DisciplinaTeste {
    public static void main(String[] args) {

        Professor p = new Professor();
        p.nome = "Nestor";
        p.mestrado = true;

        Curso c = new Curso();
        c.nome = "Eng. de Software";

        Disciplina d1 = new Disciplina("Java");
        d1.setCargaHoraria(80);
        d1.setProfessor(p);
        d1.setCurso(c);

        System.out.println("Nome: " + d1.getDescricao());

        d1.imprimir(false);
    }
}

package testes;

import negocio.Aluno;
import negocio.Contato;
import negocio.Coordenador;
import negocio.Curso;

public class TesteApp {

    public static void main(String[] args) {

        Contato a1c = new Contato();
        a1c.email = "williamff11@gmail.com";

        Contato co1c = new Contato();
        co1c.email = "coordenador@gmail.com";

        Coordenador co1 = new Coordenador();
        co1.nome = "Carlos";
        co1.contato = co1c;

        Curso c1 = new Curso();
        c1.nome = "Computação";
        c1.coordenador = co1;

        Aluno a1 = new Aluno();
        a1.matricula = 123;
        a1.nome = "William";
        a1.contato = a1c;
        a1.curso = c1;


        a1.imprimir();
        // Caso 1: nome do coordenador do William
    }
}

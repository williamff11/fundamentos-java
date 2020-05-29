package negocio;

import java.util.Arrays;

public class Curso {

    public String nome;
    public Aluno[] alunos;
    public Coordenador coordenador;
    public Disciplina[] disciplinas;

    @Override
    public String toString() {
        return nome;
    }
}

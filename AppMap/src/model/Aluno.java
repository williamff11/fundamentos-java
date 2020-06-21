package model;

import java.util.Objects;

public class Aluno {

    public Integer id;
    public String nome;
    public Float salario;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, Float salario) {
        this(nome);
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return nome.equals(aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

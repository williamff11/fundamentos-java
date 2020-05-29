package negocio;

import java.util.Objects;

public abstract class Profissional {
    public String nome = "elberth";
    public int idade = 41;
    public float salario;
    public boolean professor = true;

    public abstract float obterValor();
    public abstract void imprimir();

    public float calcularSalario() {
        return salario + 1000;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profissional that = (Profissional) o;
        return idade == that.idade &&
                nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }
}

package model;

public class Professor {

    public int matricula;
    public String nome;
    public float salario;
    public boolean mestre;

    @Override
    public String toString() {
        return String.format("%d;%s;%.2f;%s",
                matricula,
                nome,
                salario,
                mestre ? "S" : "N"
        );
    }
}

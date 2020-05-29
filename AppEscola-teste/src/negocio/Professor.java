package negocio;

import modelo.Funcionario;

public class Professor extends Funcionario {

    public boolean mestrado;
    public Disciplina[] disciplinas;

    public Professor() {
        nome = "Desconhecido";
    };

    @Override
    public String toString() {
        return String.format("Nome: %s; Mestrado: %s",
                nome,
                mestrado ? "sim" : "não"
        );
       /* "nome='" + nome + '\'' +
                ", mestrado=" + mestrado;*/
    }
}

package negocio;

public class Aluno {

    public int matricula;
    public String nome;
    public Curso curso;
    public Contato contato;

    public void imprimir() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Contato: " + contato.email);
        System.out.println("Curso: " + curso.nome);
    }
}
